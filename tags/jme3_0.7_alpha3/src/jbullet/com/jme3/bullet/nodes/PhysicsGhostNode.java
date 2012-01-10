/*
 * Copyright (c) 2009-2010 jMonkeyEngine
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *
 * * Redistributions of source code must retain the above copyright
 *   notice, this list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer in the
 *   documentation and/or other materials provided with the distribution.
 *
 * * Neither the name of 'jMonkeyEngine' nor the names of its contributors
 *   may be used to endorse or promote products derived from this software
 *   without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED
 * TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.jme3.bullet.nodes;

import com.bulletphysics.collision.dispatch.CollisionFlags;
import com.bulletphysics.collision.dispatch.GhostObject;
import com.bulletphysics.collision.dispatch.PairCachingGhostObject;
import com.bulletphysics.linearmath.Transform;
import com.jme3.math.Matrix3f;
import com.jme3.math.Quaternion;
import com.jme3.math.Vector3f;
import com.jme3.scene.Spatial;
import com.jme3.bullet.collision.PhysicsCollisionObject;
import com.jme3.bullet.collision.shapes.BoxCollisionShape;
import com.jme3.bullet.collision.shapes.CollisionShape;
import com.jme3.bullet.collision.shapes.SphereCollisionShape;
import com.jme3.bullet.util.Converter;
import com.jme3.export.InputCapsule;
import com.jme3.export.JmeExporter;
import com.jme3.export.JmeImporter;
import com.jme3.export.OutputCapsule;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * <i>From Bullet manual:</i><br>
 * GhostObject can keep track of all objects that are overlapping.
 * By default, this overlap is based on the AABB.
 * This is useful for creating a character controller,
 * collision sensors/triggers, explosions etc.<br>
 * @author normenhansen
 */
public class PhysicsGhostNode extends PhysicsCollisionObject {

    protected PairCachingGhostObject gObject;
    protected boolean locationDirty = false;
    //TEMP VARIABLES
    protected final Quaternion tmp_inverseWorldRotation = new Quaternion();
    protected Transform tempTrans = new Transform(Converter.convert(new Matrix3f()));
    protected com.jme3.math.Transform jmeTrans = new com.jme3.math.Transform();
    protected javax.vecmath.Quat4f tempRot = new javax.vecmath.Quat4f();
    // Linked list should be fine, because it won't grow big and Arraylist would acquire a new array each update
    // For detached multithreading this list should be thread safe -- normen 07.21.2010
    private List<PhysicsCollisionObject> overlappingObjects = new LinkedList<PhysicsCollisionObject>();

    public PhysicsGhostNode() {
    }

    public PhysicsGhostNode(CollisionShape shape) {
        collisionShape = shape;
        buildObject();
    }

    public PhysicsGhostNode(Spatial child, CollisionShape shape) {
        this.attachChild(child);
        collisionShape = shape;
        buildObject();
    }

    protected void buildObject() {
        if (gObject == null) {
            gObject = new PairCachingGhostObject();
            gObject.setCollisionFlags(gObject.getCollisionFlags() | CollisionFlags.NO_CONTACT_RESPONSE);
        }
        gObject.setCollisionShape(collisionShape.getCShape());
        gObject.setUserPointer(this);
    }

    @Override
    public void setCollisionShape(CollisionShape collisionShape) {
        super.setCollisionShape(collisionShape);
        buildObject();
    }

    @Override
    protected void setTransformRefresh() {
        super.setTransformRefresh();
        refreshFlags |= RF_PHYSICS;
    }
    
    @Override
    public void updateGeometricState() {
        if ((refreshFlags & RF_LIGHTLIST) != 0) {
            updateWorldLightList();
        }

        if ((refreshFlags & RF_TRANSFORM) != 0) {
            // combine with parent transforms- same for all spatial
            // subclasses.
            updateWorldTransforms();
            synchronized (jmeTrans) {
                jmeTrans.set(getWorldTransform());
                locationDirty = true;
                refreshFlags &= ~RF_PHYSICS;
            }
        } else if ((refreshFlags & RF_PHYSICS) != 0) {
            synchronized (jmeTrans) {
                jmeTrans.set(getWorldTransform());
                locationDirty = true;
                refreshFlags &= ~RF_PHYSICS;
            }
        } else {
            synchronized (jmeTrans) {
                setWorldTranslation(jmeTrans.getTranslation());
                setWorldRotation(jmeTrans.getRotation());
                setTransformRefresh();
                refreshFlags &= ~RF_PHYSICS;
            }
            updateWorldTransforms();
        }

        // the important part- make sure child geometric state is refreshed
        // first before updating own world bound. This saves
        // a round-trip later on.
        for (int i = 0, cSize = children.size(); i < cSize; i++) {
            Spatial child = children.get(i);
            child.updateGeometricState();

        }

        if ((refreshFlags & RF_BOUND) != 0) {
            updateWorldBound();
        }

        //only called to sync debug shapes in CollisionObject
        super.updateGeometricState();
    }

    @Override
    public void updatePhysicsState() {
        if (locationDirty) {
            synchronized (jmeTrans) {
                Converter.convert(jmeTrans.getTranslation(), tempTrans.origin);
                tempTrans.setRotation(Converter.convert(jmeTrans.getRotation(), tempRot));
                gObject.setWorldTransform(tempTrans);
                collisionShape.setScale(getWorldScale());
                locationDirty = false;
            }
        } else {
            synchronized (jmeTrans) {
                gObject.getWorldTransform(tempTrans);
                Converter.convert(tempTrans.origin, jmeTrans.getTranslation());
                Converter.convert(tempTrans.getRotation(tempRot), jmeTrans.getRotation());
            }
        }
    }

    /**
     * computes the local translation from the parameter translation and sets it as new
     * local translation<br>
     * This should only be called from the physics thread to update the jme spatial
     * @param translation new world translation of this spatial.
     * @return the computed local translation
     */
    protected Vector3f setWorldTranslation(Vector3f translation) {
        Vector3f localTranslation = this.getLocalTranslation();
        if (parent != null) {
            localTranslation.set(translation).subtractLocal(parent.getWorldTranslation());
            localTranslation.divideLocal(parent.getWorldScale());
            tmp_inverseWorldRotation.set(parent.getWorldRotation()).inverseLocal().multLocal(localTranslation);
        } else {
            localTranslation.set(translation);
        }
        return localTranslation;
    }

    /**
     * computes the local rotation from the parameter rot and sets it as new
     * local rotation<br>
     * This should only be called from the physics thread to update the jme spatial
     * @param rot new world rotation of this spatial.
     * @return the computed local rotation
     */
    protected Quaternion setWorldRotation(Quaternion rot) {
        Quaternion localRotation = getLocalRotation();
        if (parent != null) {
            tmp_inverseWorldRotation.set(parent.getWorldRotation()).inverseLocal().mult(rot, localRotation);
        } else {
            localRotation.set(rot);
        }
        return localRotation;
    }

    /**
     * used internally
     */
    public GhostObject getGhostObject() {
        return gObject;
    }

    /**
     * destroys this PhysicsGhostNode and removes it from memory
     */
    public void destroy() {
    }

    /**
     * Another Object is overlapping with this GhostNode,
     * if and if only there CollisionShapes overlaps.
     * They could be both regular PhysicsNodes or PhysicsGhostNode.
     * @return All CollisionObjects overlapping with this GhostNode.
     */
    public List<PhysicsCollisionObject> getOverlappingObjects() {
        return overlappingObjects;
    }

    /**
     *
     * @return With how many other CollisionObjects this GhostNode is currently overlapping.
     */
    public int getOverlappingCount() {
        return overlappingObjects.size();
    }

    /**
     *
     * @param index The index of the overlapping Node to retrieve.
     * @return The Overlapping CollisionObject at the given index.
     */
    public PhysicsCollisionObject getOverlapping(int index) {
        return overlappingObjects.get(index);
    }

    public void setCcdSweptSphereRadius(float radius) {
        gObject.setCcdSweptSphereRadius(radius);
    }

    public void setCcdMotionThreshold(float threshold) {
        gObject.setCcdMotionThreshold(threshold);
    }

    public float getCcdSweptSphereRadius() {
        return gObject.getCcdSweptSphereRadius();
    }

    public float getCcdMotionThreshold() {
        return gObject.getCcdMotionThreshold();
    }

    public float getCcdSquareMotionThreshold() {
        return gObject.getCcdSquareMotionThreshold();
    }

    @Override
    public void write(JmeExporter e) throws IOException {
        super.write(e);
        OutputCapsule capsule = e.getCapsule(this);
        capsule.write(collisionShape, "collisionShape", null);
    }

    @Override
    public void read(JmeImporter e) throws IOException {
        super.read(e);
        InputCapsule capsule = e.getCapsule(this);
        CollisionShape shape = (CollisionShape) capsule.readSavable("collisionShape", new SphereCollisionShape(1));
        collisionShape = shape;
        buildObject();
    }
}