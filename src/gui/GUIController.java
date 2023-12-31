
package gui;

import static scientificcalculator.ScientificCalculator.currentVariable;
import scientificcalculator.complexnumber.Stack;
import exceptions.SyntaxErrorException;
import static javafx.application.Platform.exit;
import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextFormatter;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import scientificcalculator.complexnumber.Command;
import scientificcalculator.complexnumber.variables.Variables;

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
                Command command = new Command(view.display.getText());
                view.display.setText("");
                try {
                    command.executeCommand(stack, vars);
                } catch (SyntaxErrorException ex) {
                    Alert dialog = new Alert(AlertType.ERROR, ex.getMessage(), ButtonType.CLOSE);
                    dialog.showAndWait(); exit();
                } 
                ke.consume();
            }
        });
     
        keys.operatorKeys[0].setOnAction(e -> { 
                Command command = new Command(view.display.getText());
                view.display.setText("");
                try {
                    command.executeCommand(stack, vars);
                } catch (SyntaxErrorException ex) {
                    Alert dialog = new Alert(AlertType.ERROR, ex.getMessage(), ButtonType.CLOSE);
                    dialog.showAndWait(); exit();
                }
        } ); 
        keys.operatorKeys[1].setOnAction(e -> view.display.setText(view.display.getText().substring(0, view.display.getText().length() - 1)));
        
        keys.otherButton[0].setOnAction(e -> { view.display.setText(view.display.getText() + "clear"); } );
        keys.otherButton[1].setOnAction(e -> { view.display.setText(view.display.getText() + "drop"); } );
        keys.otherButton[2].setOnAction(e -> { view.display.setText(view.display.getText() + "dup"); } );
        keys.otherButton[3].setOnAction(e -> { view.display.setText(view.display.getText() + "over"); } );
        keys.otherButton[8].setOnAction(e -> { view.display.setText(view.display.getText() + "swap"); } );
        
        keys.otherButton[4].setOnAction(e -> { view.display.setText(view.display.getText() + ">" + currentVariable); } );
        keys.otherButton[5].setOnAction(e -> { view.display.setText(view.display.getText() + "<" + currentVariable); } );
        keys.otherButton[6].setOnAction(e -> { view.display.setText(view.display.getText() + "+" + currentVariable); } );
        keys.otherButton[7].setOnAction(e -> { view.display.setText(view.display.getText() + "-" + currentVariable); } );
        
        keys.operatorKeys[2].setOnAction(e -> buttonPressed(e));
        keys.operatorKeys[3].setOnAction(e -> buttonPressed(e));
        keys.operatorKeys[4].setOnAction(e -> { view.display.setText(view.display.getText() + "*"); });
        keys.operatorKeys[5].setOnAction(e -> buttonPressed(e) );
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
        keys.otherButton[1].disableProperty().bind(Bindings.isEmpty(stack.stack)); 
        
        keys.operatorKeys[0].disableProperty().bind(Bindings.equal("", view.display.textProperty()));
        keys.operatorKeys[1].disableProperty().bind(Bindings.equal("", view.display.textProperty()));
        for(int i = 4; i < 8; i++) {
            keys.otherButton[i].disableProperty().bind(keys.varMenu.valueProperty().isNull());
        }
        view.display.setTextFormatter(new TextFormatter<String>(change -> change.getControlNewText().length() <= 16 ? change : null));        
    }
    
    private void buttonPressed(ActionEvent e) {
        Button b = (Button) e.getSource();
        view.display.setText(view.display.getText() + b.getText());
    }
    
}
