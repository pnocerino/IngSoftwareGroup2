/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complexnumber.operations;

import complexnumber.ComplexNumber;
import complexnumber.Stack;
import exceptions.SyntaxErrorException;
import exceptions.SystemErrorException;
import static javafx.application.Platform.exit;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

/**
 *
 * @author utente
 */
public class StackOperation extends Operation {

    public StackOperation(String operator, Stack stack){
        super(operator, stack);
    }
    
    
    @Override
    public void solveOperation() {
    
        if(this.operator.equals("clear")){           
            this.clear();
        }else if(this.operator.equals("drop")){
            this.drop();
        }else if(this.operator.equals("dup")){
            try {
                this.dup();
            } catch (SystemErrorException ex) {
                Alert dialog = new Alert(Alert.AlertType.ERROR, ex.getMessage(), ButtonType.OK);
                dialog.setTitle("Stack vuoto"); dialog.showAndWait();
            }
        }else if(this.operator.equals("swap")){
            try {
                this.swap();
            } catch (SystemErrorException ex) {
                Alert dialog = new Alert(Alert.AlertType.ERROR, ex.getMessage(), ButtonType.OK);
                dialog.setTitle("Stack vuoto"); dialog.showAndWait();
            }
        } else if(this.operator.equals("over")){
            try {
                this.over();
            } catch (SystemErrorException ex) {
                Alert dialog = new Alert(Alert.AlertType.ERROR, ex.getMessage(), ButtonType.OK);
                dialog.setTitle("Stack vuoto"); dialog.showAndWait();
            }
        }
    
    }
    
    public void clear(){
        super.getStack().getStack().clear();
    }
    
    public void drop() {
        try {
            super.getStack().pop();
        } catch (SyntaxErrorException ex) {
            Alert dialog = new Alert(Alert.AlertType.ERROR, ex.getMessage(), ButtonType.OK);
            dialog.setTitle("Stack vuoto"); dialog.showAndWait(); exit();
        }
    }
    
    public void dup() throws SystemErrorException {
        try {
            super.getStack().push(super.getStack().peek());
        } catch (SyntaxErrorException ex) {
            Alert dialog = new Alert(Alert.AlertType.ERROR, ex.getMessage(), ButtonType.OK);
            dialog.setTitle("Stack vuoto"); dialog.showAndWait();
        }
    }
    
    public void swap() throws SystemErrorException{
        try {
            ComplexNumber top = super.getStack().pop();
            ComplexNumber bot = super.getStack().pop();
            super.getStack().push(top);
            super.getStack().push(bot);
        } catch (SyntaxErrorException ex) {
            Alert dialog = new Alert(Alert.AlertType.ERROR, "Si è verificato un errore.\nLo stack non contiene abbastanza elementi.", ButtonType.OK);
            dialog.setTitle("Stack senza elementi necessari"); dialog.showAndWait();
        }
    }
    
    public void over() throws SystemErrorException{
        try {
            ComplexNumber n = super.getStack().pop();
            super.getStack().push(super.getStack().peek());
            super.getStack().push(n);
        } catch (SyntaxErrorException ex) {
            Alert dialog = new Alert(Alert.AlertType.ERROR, "Si è verificato un errore.\nLo stack non contiene abbastanza elementi.", ButtonType.OK);
            dialog.setTitle("Stack senza elementi necessari"); dialog.showAndWait();
        }
        
    }
    
    
}
