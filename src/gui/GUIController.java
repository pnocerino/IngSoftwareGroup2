/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import static calcolatriceinterfaccia.CalcolatriceInterfaccia.currentVariable;
import complexnumber.ComplexNumber;
import complexnumber.Stack;
import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

/**
 *
 * @author sherr
 */
public class GUIController {
    
    
    private InputAreaView view;
    private KeyboardView keys;
    private StackView stackView;
    private Stack stack;
    
    public GUIController(InputAreaView view, StackView stackView) {
        this.view = view;
        this.keys = this.view.keyboardRow;
        this.stackView = stackView;
        this.stack = stackView.stackClass;
        initButtonAction(); initBindings();
    }
    
    private void initButtonAction() {
        for(int i = 0; i < keys.DIGITS - 1; i++) {
            keys.numberKeys[i].setOnAction(e -> buttonPressed(e));
        }
        keys.numberKeys[keys.DIGITS].setOnAction(e -> buttonPressed(e));
        keys.numberKeys[keys.DIGITS + 1].setOnAction(e -> buttonPressed(e));
        keys.numberKeys[keys.DIGITS + 2].setOnAction(e -> buttonPressed(e));
        
        changeCurrentVariable();
        
        /*keys.otherButton[1].setOnAction(e -> {
            File file = new File("C:\\Users\\sherr\\Documents\\Progetto\\Ingegneria del Software\\Requirements Enginnering\\Tabella priorità.pdf");
            final Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
            if(desktop != null && desktop.isSupported(Desktop.Action.OPEN)) {
                try {
                    desktop.open(file);
                } catch (IOException ex) {
                    Logger.getLogger(GUIController.class.getName()).log(Level.SEVERE, null, ex);
                }
               }
        });*/
        
        keys.operatorKeys[0].setOnAction(e -> { stack.push(new ComplexNumber(view.display.getText())); view.display.setText(""); } );
        keys.operatorKeys[1].setOnAction(e -> view.display.setText(view.display.getText().substring(0, view.display.getText().length() - 1)));
        keys.otherButton[0].setOnAction(e -> { view.display.setText("");  stack.stack.clear(); } );
        for(int i = 2; i < keys.OPERATORS; i++) {
            keys.operatorKeys[i].setOnAction(e -> buttonPressed(e));
        }
    }
    
    private void changeCurrentVariable() {
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                currentVariable = (String)keys.varMenu.getValue();
                keys.otherButton[4].setText(">" + currentVariable);
                keys.otherButton[5].setText("<" + currentVariable);
                keys.otherButton[6].setText("+" + currentVariable);
                keys.otherButton[7].setText("-" + currentVariable);
            }
        };
        keys.varMenu.setOnAction(event);
    }
    
    private void initBindings() {
        keys.otherButton[0].disableProperty().bind(Bindings.isEmpty(stack.stack));
        keys.operatorKeys[0].disableProperty().bind(Bindings.equal("", view.display.textProperty()));
        keys.operatorKeys[1].disableProperty().bind(Bindings.equal("", view.display.textProperty()));
        
        
        
        /*UnaryOperator<Change> filter = change -> {
            String text = change.getText();

            if (text.matches("[^abcdefg,]*")) {
               return null;
            }

            return change;
        };
        TextFormatter<String> textFormatter = new TextFormatter<>(filter);
        view.display.setTextFormatter(textFormatter);*/
    }
    
    private void buttonPressed(ActionEvent e) {
        Button b = (Button) e.getSource();
        view.display.setText(view.display.getText() + b.getText());
    }
    
}
