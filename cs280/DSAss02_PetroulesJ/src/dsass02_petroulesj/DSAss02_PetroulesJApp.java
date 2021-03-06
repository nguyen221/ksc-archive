/*
 * DSAss02_PetroulesJApp.java
 */

package dsass02_petroulesj;

import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;

/**
 * The main class of the application.
 */
public class DSAss02_PetroulesJApp extends SingleFrameApplication {

    /**
     * At startup create and show the main frame of the application.
     */
    @Override protected void startup() {
        show(new DSAss02_PetroulesJView(this));
    }

    /**
     * This method is to initialize the specified window by injecting resources.
     * Windows shown in our application come fully initialized from the GUI
     * builder, so this additional configuration is not needed.
     */
    @Override protected void configureWindow(java.awt.Window root) {
    }

    /**
     * A convenient static getter for the application instance.
     * @return the instance of DSAss02_PetroulesJApp
     */
    public static DSAss02_PetroulesJApp getApplication() {
        return Application.getInstance(DSAss02_PetroulesJApp.class);
    }

    /**
     * Main method launching the application.
     */
    public static void main(String[] args) {
        launch(DSAss02_PetroulesJApp.class, args);
    }
}
