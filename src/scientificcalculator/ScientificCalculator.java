
package scientificcalculator;

import gui.ContainerView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class ScientificCalculator extends Application {
    
    public static char currentVariable = 'x';
    @Override
    public void start(Stage primaryStage) {
        ContainerView root = new ContainerView();
        
        Scene scene = new Scene(root, 1250, 700);
        scene.getStylesheets().add("style.css");
        
        
        primaryStage.setTitle("Calcolatrice scientifica con numeri complessi");
        primaryStage.setScene(scene);
        primaryStage.getIcons().add(new Image("icon.png"));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
