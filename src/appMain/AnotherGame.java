package appMain;

import com.jme3.app.SimpleApplication;
import com.jme3.app.state.AppState;
import com.jme3.bullet.BulletAppState;
import com.jme3.bullet.control.RigidBodyControl;
import com.jme3.renderer.RenderManager;
import com.jme3.scene.Spatial;
import gameControl.MenuAppState;
import gameControl.SceneState;
import player.PlayerState;

/**
 * @author Rune Barrett
 */
public class AnotherGame extends SimpleApplication {

    MenuAppState menuState;
    PlayerState playerState;

    public static void main(String[] args) {

        AnotherGame app = new AnotherGame();
        app.start();
    }
    private SceneState sceneState;
    private RigidBodyControl floorPhy;
    private BulletAppState bulletAppState;
    private GamePlayState gamePlayState;

    @Override
    public void simpleInitApp() {
        gamePlayState = new GamePlayState();
        stateManager.attach(gamePlayState);
        
        flyCam.setMoveSpeed(60f);
    }

    @Override
    public void simpleUpdate(float tpf) {
        //TODO: add update code
    }

    @Override
    public void simpleRender(RenderManager rm) {
        //TODO: add render code
    }
}
