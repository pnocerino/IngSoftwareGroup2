/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import static calcolatriceinterfaccia.CalcolatriceInterfaccia.currentVariable;
import complexnumber.Command;
import complexnumber.ComplexNumber;
import complexnumber.Stack;
import complexnumber.variables.Variable;
import complexnumber.variables.Variables;
import exceptions.SyntaxErrorException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.application.Platform.exit;
import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ListCell;
import javafx.scene.control.TextFormatter;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

/**
 *
 * @author sherr
 */
public class GUIController {
    
    
    private InputAreaView view;
    private KeyboardView keys;
    private StackView stackView;
    private Stack stack;
    private Variables vars;
    
    public GUIController(InputAreaView view, StackView stackView) {
        this.view = view;
        this.keys = this.view.keyboardRow;
        this.stackView = stackView;
        this.stack = stackView.stackClass;
        this.vars = new Variables();
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

        
        view.display.setOnKeyPressed((KeyEvent ke) -> {
            if(ke.getCode().equals(KeyCode.ENTER)) { 
                stack.push(new ComplexNumber(view.display.getText())); view.display.setText(""); ke.consume();
            }
            
    
        
        });
     
        keys.operatorKeys[0].setOnAction(e -> { 
                Command command = new Command(view.display.getText()); 
                view.display.setText("");
                //view.keyboardRow.list.set((int)(currentVariable - 97), currentVariable + " = " + vars.search(currentVariable).toString());
                try {
                    command.executeCommand(stack, vars);
                    view.keyboardRow.list.set((int)(currentVariable - 97), currentVariable + " = " + vars.search(currentVariable).toString());
                } catch (SyntaxErrorException ex) {
                    Alert dialog = new Alert(AlertType.ERROR, ex.getMessage(), ButtonType.CLOSE);
                    dialog.showAndWait(); exit();
                }
        } ); 
        keys.operatorKeys[1].setOnAction(e -> view.display.setText(view.display.getText().substring(0, view.display.getText().length() - 1)));
        keys.otherButton[0].setOnAction(e -> { try {
            view.display.setText(""); Command command = new Command("clear"); command.executeCommand(stack, vars);
            } catch (SyntaxErrorException ex) {
                Logger.getLogger(GUIController.class.getName()).log(Level.SEVERE, null, ex);
            }
} );
        keys.otherButton[1].setOnAction(e -> { try {
            Command command = new Command("drop"); command.executeCommand(stack, vars);
            } catch (SyntaxErrorException ex) {
                Alert dialog = new Alert(AlertType.ERROR, "Si è verificato un errore di sintassi.", ButtonType.CLOSE);
                dialog.showAndWait(); exit();
            }
} );
        keys.otherButton[2].setOnAction(e -> { try {
            Command command = new Command("dup"); command.executeCommand(stack, vars);
            } catch (SyntaxErrorException ex) {
                Alert dialog = new Alert(AlertType.ERROR, "Si è verificato un errore di sintassi.", ButtonType.CLOSE);
                dialog.showAndWait(); exit();
            }
} );
        keys.otherButton[3].setOnAction(e -> { try {
            Command command = new Command("over"); command.executeCommand(stack, vars);
            } catch (SyntaxErrorException ex) {
                Alert dialog = new Alert(AlertType.ERROR, "Si è verificato un errore di sintassi.", ButtonType.CLOSE);
                dialog.showAndWait(); exit();
            }
} );
        keys.otherButton[8].setOnAction(e -> { try {
            Command command = new Command("swap"); command.executeCommand(stack, vars);
            } catch (SyntaxErrorException ex) {
                Alert dialog = new Alert(AlertType.ERROR, "Si è verificato un errore di sintassi.", ButtonType.CLOSE);
                dialog.showAndWait(); exit();
            }
} );
        
        keys.otherButton[4].setOnAction(e -> { //try {
            view.display.setText(view.display.getText() + ">" + currentVariable);
            //Command command = new Command(">" + currentVariable); command.executeCommand(stack, vars);
            //view.keyboardRow.list.set((int)(currentVariable - 97), currentVariable + " = " + vars.search(currentVariable).toString());
            /*} catch (SyntaxErrorException ex) {
                Alert dialog = new Alert(AlertType.ERROR, "Si è verificato un errore di sintassi.", ButtonType.CLOSE);
                dialog.showAndWait(); exit();
            }*/
} );
        keys.otherButton[5].setOnAction(e -> { try {
            Command command = new Command("<" + currentVariable); command.executeCommand(stack, vars);
            } catch (SyntaxErrorException ex) {
                Alert dialog = new Alert(AlertType.ERROR, ex.getMessage(), ButtonType.CLOSE);
                dialog.showAndWait(); exit();
            }
} );
        keys.otherButton[6].setOnAction(e -> { try {
            Command command = new Command("+" + currentVariable); command.executeCommand(stack, vars);
            view.keyboardRow.list.set((int)(currentVariable - 97), currentVariable + " = " + vars.search(currentVariable).toString());
            } catch (SyntaxErrorException ex) {
                Alert dialog = new Alert(AlertType.ERROR, ex.getMessage(), ButtonType.CLOSE);
                dialog.showAndWait(); exit();
            }
} );
        keys.otherButton[7].setOnAction(e -> { try {
            Command command = new Command("-" + currentVariable); command.executeCommand(stack, vars);
            view.keyboardRow.list.set((int)(currentVariable - 97), currentVariable + " = " + vars.search(currentVariable).toString());
            } catch (SyntaxErrorException ex) {
                Alert dialog = new Alert(AlertType.ERROR, ex.getMessage(), ButtonType.CLOSE);
                dialog.showAndWait(); exit();
            }
} );
        
        keys.operatorKeys[2].setOnAction(e -> buttonPressed(e));
        keys.operatorKeys[3].setOnAction(e -> buttonPressed(e));
        keys.operatorKeys[4].setOnAction(e -> { view.display.setText(view.display.getText() + "*"); });
        keys.operatorKeys[5].setOnAction(e -> buttonPressed(e));
        keys.operatorKeys[6].setOnAction(e -> { view.display.setText(view.display.getText() + "sqrt"); });
        keys.operatorKeys[7].setOnAction(e -> { view.display.setText(view.display.getText() + "+-"); });
        
        
    }
    
    private void changeCurrentVariable() {
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                currentVariable = (char)(((String)keys.varMenu.getValue()).charAt(0));
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
        for(int i = 4; i < 8; i++) {
            keys.otherButton[i].disableProperty().bind(keys.varMenu.valueProperty().isNull());
        }
        //keys.otherButton[4].disableProperty().bind(vars.search(currentVariable) == null);
        
        view.display.setTextFormatter(new TextFormatter<String>(change -> 
            change.getControlNewText().length() <= 15 ? change : null));        
    }
    
    private void buttonPressed(ActionEvent e) {
        Button b = (Button) e.getSource();
        view.display.setText(view.display.getText() + b.getText());
    }
    
}
