package gameControl;

import com.jme3.app.Application;
import com.jme3.app.SimpleApplication;
import com.jme3.app.state.AbstractAppState;
import com.jme3.app.state.AppStateManager;
import com.jme3.asset.AssetManager;
import com.jme3.asset.TextureKey;
import com.jme3.bullet.BulletAppState;
import com.jme3.bullet.control.RigidBodyControl;
import com.jme3.light.AmbientLight;
import com.jme3.light.DirectionalLight;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;
import com.jme3.scene.Node;
import com.jme3.scene.Spatial;

/**
 *
 * @author Rune Barrett
 */
public class SceneState extends AbstractAppState {

    private SimpleApplication app;
    private Node rootNode;
    private RigidBodyControl floorPhy;
    private BulletAppState bulletAppState;
    private AssetManager assetManager;
    DirectionalLight sun;
    private AmbientLight ambient;

    @Override
    public void initialize(AppStateManager stateManager, Application app) {
        super.initialize(stateManager, app);
        this.app = (SimpleApplication) app;
        rootNode = this.app.getRootNode();
        assetManager = this.app.getAssetManager();
        bulletAppState = new BulletAppState();
        

        sun = new DirectionalLight();
        sun.setDirection(new Vector3f(-0.5f, -0.5f, -0.5f));
        sun.setColor(ColorRGBA.White.mult(3));
        ambient = new AmbientLight();
        ambient.setColor(ColorRGBA.White.mult(3));
        
        
        Spatial floor = assetManager.loadModel("Scenes/AnotherGame.obj");
        //floor.setLocalTranslation(0, 0, -140f);
        floor.scale(4.4f);
        rootNode.attachChild(floor);
        rootNode.addLight(sun);
        rootNode.addLight(ambient);

//        floorPhy = new RigidBodyControl(0.0f);
//        floor.addControl(floorPhy);
//        bulletAppState.getPhysicsSpace().add(floorPhy);
        
    }

    @Override
    public void update(float tpf) {
        //TODO: implement behavior during runtime
    }

    @Override
    public void cleanup() {
        super.cleanup();
        //TODO: clean up what you initialized in the initialize method,
        //e.g. remove all spatials from rootNode
        //this is called on the OpenGL thread after the AppState has been detached
    }
}
