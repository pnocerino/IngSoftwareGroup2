/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcolatriceinterfaccia;

import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;

/**
 *
 * @author sherr
 */
public class InputAreaController {
    
    private InputAreaView view;
    private KeyboardView keys;
    
    public InputAreaController(InputAreaView view) {
        this.view = view;
        this.keys = this.view.keyboardRow;
        initButtonAction(); initBindings();
    }
    
    private void initButtonAction() {
        for(int i = 0; i < keys.DIGITS - 1; i++) {
            keys.numberKeys[i].setOnAction(e -> buttonPressed(e));
        }
        keys.numberKeys[keys.DIGITS].setOnAction(e -> buttonPressed(e));
        keys.numberKeys[keys.DIGITS + 1].setOnAction(e -> buttonPressed(e));
        keys.numberKeys[keys.DIGITS + 2].setOnAction(e -> buttonPressed(e));
        
        keys.operatorKeys[1].setOnAction(e -> view.display.setText(view.display.getText().substring(0, view.display.getText().length() - 1)));
        for(int i = 2; i < keys.OPERATORS - 2; i++) {
            keys.operatorKeys[i].setOnAction(e -> buttonPressed(e));
        }
        
        
        
    
    }
    
    private void initBindings() {
        keys.operatorKeys[0].disableProperty().bind(Bindings.equal("", view.display.textProperty()));
        keys.operatorKeys[1].disableProperty().bind(Bindings.equal("", view.display.textProperty()));
        //view.display.replaceText(view.display.getText().intindexOf(","), ".");
    }
    
    private void buttonPressed(ActionEvent e) {
        Button b = (Button) e.getSource();
        view.display.setText(view.display.getText() + b.getText());
    }
    
}
