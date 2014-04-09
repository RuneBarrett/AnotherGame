package appMain;

import com.jme3.app.SimpleApplication;
import com.jme3.renderer.RenderManager;
import gameControl.MenuAppState;
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

    @Override
    public void simpleInitApp() {
    menuState = new MenuAppState();
    playerState = new PlayerState();
    stateManager.attach(menuState);
    stateManager.attach(playerState);
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
