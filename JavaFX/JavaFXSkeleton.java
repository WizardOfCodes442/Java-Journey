// A JavaFX application skeleton

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.*;
public class JavaFXSkeleton {

    public static void main (String[] args) {
        System.out.println("Launching JavaFX application.");

        // Start the JavaFX application by caliing the launch method
        launch(args);
    }

    // Override the init() method
    public void init () {
        System.out.println("Inside the init () method.");
    }
    
    // Override the start() method
    public void start(Stage myStage) {
        System.out.println("Inside the start() method.");

        // Give the stage a title
        myStage.setTitle("JavaFX Skeleton");

        // create a root node . In this case, a flow layout pane
        // is used , but several alternatives exist
        FlowPane rootNode = new FlowPane();

        //create a scene
        Scene myScene = new Scene(rootNode, 300, 200);

        // set the scene on the stage
        myStage.setScene(myScene);

        // show the stage and its scene
        myStage.show();
    }

    // Override the stop() method
    public void stop() {
        System.out.println("Inside the stop() method")
    }
}