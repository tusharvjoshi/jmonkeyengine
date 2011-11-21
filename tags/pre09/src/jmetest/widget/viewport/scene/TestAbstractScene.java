/* 
* Copyright (c) 2004, jMonkeyEngine - Mojo Monkey Coding 
* All rights reserved. 
* 
* Redistribution and use in source and binary forms, with or without 
* modification, are permitted provided that the following conditions are met: 
* 
* Redistributions of source code must retain the above copyright notice, this 
* list of conditions and the following disclaimer. 
* 
* Redistributions in binary form must reproduce the above copyright notice, 
* this list of conditions and the following disclaimer in the documentation 
* and/or other materials provided with the distribution. 
* 
* Neither the name of the Mojo Monkey Coding, jME, jMonkey Engine, nor the 
* names of its contributors may be used to endorse or promote products derived 
* from this software without specific prior written permission. 
* 
* THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" 
* AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE 
* IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE 
* ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE 
* LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR 
* CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF 
* SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS 
* INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN 
* CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
* ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
* POSSIBILITY OF SUCH DAMAGE. 
* 
*/
package jmetest.widget.viewport.scene;

import com.jme.math.Vector3f;
import com.jme.renderer.Camera;
import com.jme.scene.Node;
import com.jme.system.DisplaySystem;
import com.jme.util.Timer;
import com.jme.widget.viewport.WidgetViewport;
import com.jme.widget.viewport.WidgetViewportCameraController;

/**
 * <code>TestAbstractScene</code>
 * @author Gregg Patton
 * @version $Id: TestAbstractScene.java,v 1.1 2004-02-14 22:19:55 ericthered Exp $
 */
public abstract class TestAbstractScene {

    protected WidgetViewportCameraController cameraController1;
    protected WidgetViewportCameraController cameraController2;
    protected WidgetViewportCameraController cameraController3;
    protected WidgetViewportCameraController cameraController4;
    
    protected Node scene;

    protected Timer timer;

    /**
     * 
     */
    public TestAbstractScene() {
        super();
        
        cameraController1 = initNewCameraController();
        cameraController2 = initNewCameraController();
        cameraController3 = initNewCameraController();
        cameraController4 = initNewCameraController();
    }

    public abstract void init(WidgetViewport vp, WidgetViewportCameraController cameraController);
    
    public abstract void initGui(WidgetViewport vp);

    public abstract void setFps(String fps);

    public abstract void update();
    
    protected WidgetViewportCameraController initNewCameraController() {
        Camera camera = DisplaySystem.getDisplaySystem().getRenderer().getCamera(1, 1);

        Vector3f loc = new Vector3f(4.0f, 0.0f, 0.0f);
        Vector3f left = new Vector3f(0.0f, -1.0f, 0.0f);
        Vector3f up = new Vector3f(0.0f, 0.0f, 1.0f);
        Vector3f dir = new Vector3f(-1.0f, 0f, 0.0f);
        camera.setFrame(loc, left, up, dir);

        WidgetViewportCameraController cameraController =
            new WidgetViewportCameraController(camera, null);
            
        return cameraController;
    }

    /**
     * <code>getCamera1</code>
     * @return
     */
    public WidgetViewportCameraController getCameraController1() {
        return cameraController1;
    }

    /**
     * <code>getCamera2</code>
     * @return
     */
    public WidgetViewportCameraController getCameraController2() {
        return cameraController2;
    }

    /**
     * <code>getCamera3</code>
     * @return
     */
    public WidgetViewportCameraController getCameraController3() {
        return cameraController3;
    }

    /**
     * <code>getCamera4</code>
     * @return
     */
    public WidgetViewportCameraController getCameraController4() {
        return cameraController4;
    }

    /**
     * <code>getScene</code>
     * @return
     */
    public Node getScene() {
        return scene;
    }

}