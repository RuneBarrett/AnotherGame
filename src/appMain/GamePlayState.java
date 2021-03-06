package appMain;

import com.jme3.app.Application;
import com.jme3.app.state.AbstractAppState;
import com.jme3.app.state.AppStateManager;
import gameControl.SceneState;

/**
 *
 * @author Rune Barrett
 */
public class GamePlayState extends AbstractAppState {

    private SceneState sceneState;

    @Override
    public void initialize(AppStateManager stateManager, Application app) {
        super.initialize(stateManager, app);
        sceneState = new SceneState();
        stateManager.attach(sceneState);

        //TODO: initialize your AppState, e.g. attach spatials to rootNode
        //this is called on the OpenGL thread after the AppState has been attached
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
