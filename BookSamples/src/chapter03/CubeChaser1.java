package chapter03;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.FastMath;
import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;

/**
 * This demo uses the simpleUpdate() loop to change the location 
 * of one white cube if the camera is close to it.
 */
public class CubeChaser1 extends SimpleApplication {

    private Geometry scaredCube;
 
    /** Fill space with random static cubes. */
    private void makeCubes(int number) {
        for (int i = 0; i < number; i++) {
            // randomize 3D coordinates
            Vector3f loc = new Vector3f(
                    FastMath.nextRandomInt(-20, 20),
                    FastMath.nextRandomInt(-20, 20),
                    FastMath.nextRandomInt(-20, 20));
            rootNode.attachChild(
                    myBox("Cube" + i, loc, ColorRGBA.randomColor()));
        }
    }

    public Geometry myBox(String name, Vector3f loc, ColorRGBA color) {
        Box mesh = new Box(Vector3f.ZERO, 1, 1, 1);
        Geometry geom = new Geometry(name, mesh);
        Material mat = new Material(assetManager,
                "Common/MatDefs/Misc/Unshaded.j3md");
        mat.setColor("Color", color);
        geom.setMaterial(mat);
        geom.setLocalTranslation(loc);
        return geom;
    }

    @Override
    /** initialize the scene here. */
    public void simpleInitApp() {
        flyCam.setMoveSpeed(100f);
        makeCubes(40);
        scaredCube = myBox("Scared Cube", Vector3f.ZERO, ColorRGBA.White);
        rootNode.attachChild(scaredCube);
    }

    @Override
    /** This update loop controls the game and moves the cube. */
    public void simpleUpdate(float tpf) {
        System.out.println("Distance: "+
            cam.getLocation().distance(scaredCube.getLocalTranslation()));
        // If camera is closer than 10 units to myCube...
        if (cam.getLocation().distance(scaredCube.getLocalTranslation()) < 10) {
            // ... then move myCube away, in the direction that camera is facing.
             scaredCube.move(cam.getDirection());
        }
    }

    /** Start the jMonkeyEngine application */
    public static void main(String[] args) {
        CubeChaser1 app = new CubeChaser1();
        app.start();

    }
}