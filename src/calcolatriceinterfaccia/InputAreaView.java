/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcolatriceinterfaccia;

import javafx.geometry.Insets;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Background;
import javafx.scene.layout.VBox;

/**
 *
 * @author sherr
 */
public class InputAreaView extends VBox {
    
    KeyboardView keyboardRow;
    TextArea display;
    
    public InputAreaView() {
        super();
        keyboardRow = new KeyboardView();
        display = new TextArea();
        display.getStyleClass().add("display");
        keyboardRow.setPadding(new Insets(35, 0, 0, 0));
        this.getChildren().add(display);
        this.getChildren().add(keyboardRow);
    }
    
    
}
