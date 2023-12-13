
package gui;

import javafx.geometry.Insets;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;

public class InputAreaView extends VBox {
    
    public KeyboardView keyboardRow;
    public TextArea display;
    
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
