/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complexnumber.operations;

import complexnumber.ComplexNumber;
import complexnumber.Stack;
import exceptions.SystemErrorException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

/**
 *
 * @author utente
 */
public class StackOperation extends Operation{

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
                Alert dialog = new Alert(Alert.AlertType.INFORMATION, ex.getMessage(), ButtonType.OK);
                dialog.setTitle("Stack pieno"); dialog.showAndWait();
            }
        }else if(this.operator.equals("swap")){
            try {
                this.swap();
            } catch (SystemErrorException ex) {
                Alert dialog = new Alert(Alert.AlertType.INFORMATION, ex.getMessage(), ButtonType.OK);
                dialog.setTitle("Stack pieno"); dialog.showAndWait();
            }
        }else if(this.operator.equals("over")){
            try {
                this.over();
            } catch (SystemErrorException ex) {
                Alert dialog = new Alert(Alert.AlertType.INFORMATION, ex.getMessage(), ButtonType.OK);
                dialog.setTitle("Stack pieno"); dialog.showAndWait();
            }
        }
    
    }
    
    public void clear(){
        super.getStack().getStack().clear();
    }
    
    public void drop(){
        super.getStack().pop();
    }
    
    public void dup() throws SystemErrorException{
        super.getStack().push(super.getStack().peek());
    }
    
    public void swap() throws SystemErrorException{
        ComplexNumber top = super.getStack().pop();
        ComplexNumber bot = super.getStack().pop();
        super.getStack().push(top);
        super.getStack().push(bot);
    }
    
    public void over() throws SystemErrorException{
        ComplexNumber n = super.getStack().pop();
        super.getStack().push(super.getStack().peek());
        super.getStack().push(n);
        
    }
    
    
}
