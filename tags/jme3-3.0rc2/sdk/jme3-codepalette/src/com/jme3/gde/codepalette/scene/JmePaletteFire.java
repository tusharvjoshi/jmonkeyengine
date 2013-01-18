/*
 *  Copyright (c) 2009-2010 jMonkeyEngine
 *  All rights reserved.
 * 
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions are
 *  met:
 * 
 *  * Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 * 
 *  * Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 * 
 *  * Neither the name of 'jMonkeyEngine' nor the names of its contributors
 *    may be used to endorse or promote products derived from this software
 *    without specific prior written permission.
 * 
 *  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 *  "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED
 *  TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 *  PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 *  CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 *  EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 *  PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 *  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 *  LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 *  NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 *  SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.jme3.gde.codepalette.scene;
import com.jme3.gde.codepalette.JmePaletteUtilities;
import javax.swing.text.BadLocationException;
import javax.swing.text.JTextComponent;
import org.openide.text.ActiveEditorDrop;

/**
 *
 * @author normenhansen, zathras
 */
public class JmePaletteFire implements ActiveEditorDrop {

    public JmePaletteFire() {
    }

    private String createBody() {

        String body = "    /** Uses Texture from jme3-test-data library! */\n    ParticleEmitter fire = new ParticleEmitter(\"Emitter\", ParticleMesh.Type.Triangle, 30);\n    Material mat_red = new Material(assetManager, \"Common/MatDefs/Misc/Particle.j3md\");\n    //mat_red.setTexture(\"Texture\", assetManager.loadTexture(\"Effects/Explosion/flame.png\"));\n    fire.setMaterial(mat_red);\n    fire.setImagesX(2); fire.setImagesY(2); // 2x2 texture animation\n    fire.setEndColor(  new ColorRGBA(1f, 0f, 0f, 1f));   // red\n    fire.setStartColor(new ColorRGBA(1f, 1f, 0f, 0.5f)); // yellow\n    fire.getParticleInfluencer().setInitialVelocity(new Vector3f(0, 2, 0));\n    fire.setStartSize(0.6f);\n    fire.setEndSize(0.1f);\n    fire.setGravity(0f,0f,0f);\n    fire.setLowLife(0.5f);\n    fire.setHighLife(3f);\n    fire.getParticleInfluencer().setVelocityVariation(0.3f);\n    rootNode.attachChild(fire);\n";
        return body;
    }

    public boolean handleTransfer(JTextComponent targetComponent) {
        String body = createBody();
        try {
            JmePaletteUtilities.insert(body, targetComponent);
        } catch (BadLocationException ble) {
            return false;
        }
        return true;
    }

}