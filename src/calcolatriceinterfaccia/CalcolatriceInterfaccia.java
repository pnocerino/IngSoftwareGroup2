/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcolatriceinterfaccia;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author sherr
 */
public class CalcolatriceInterfaccia extends Application {
    
    public static String currentVariable = "x";
    @Override
    public void start(Stage primaryStage) {
        ContainerView root = new ContainerView(); //root.setStyle("-fx-background-color:darkgrey;");
        //KeyboardController controller = new KeyboardController(root);
        
        Scene scene = new Scene(root, 1250, 700);
        scene.getStylesheets().add("style.css");
        
        
        primaryStage.setTitle("Test Tastiera");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
