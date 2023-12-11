/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complexnumber.operations;

import complexnumber.ComplexNumber;
import complexnumber.Stack;
import exceptions.SystemErrorException;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

/**
 *
 * @author utente
 */
public class MathOperation extends Operation{

    
    public MathOperation(String operator, Stack stack){
        super(operator, stack);
    }
    
    
    @Override
    public void solveOperation() {
        if(this.operator.matches("(\\+\\-|sqrt)")){
            try {
                this.unary();
            } catch (SystemErrorException ex) {
                Alert dialog = new Alert(Alert.AlertType.INFORMATION, ex.getMessage(), ButtonType.OK);
                dialog.setTitle("Stack pieno"); dialog.showAndWait();
            }
        }else{
            try {
                this.notUnary();
            } catch (SystemErrorException ex) {
                Alert dialog = new Alert(Alert.AlertType.INFORMATION, ex.getMessage(), ButtonType.OK);
                dialog.setTitle("Stack pieno"); dialog.showAndWait();
            }
        }
        
    }
    
    public void unary() throws SystemErrorException{
        
        ComplexNumber n = super.getStack().pop();

        if(this.operator.equals("+-")){
            super.getStack().push(n.signChange());
        }else{
            ComplexNumber[] array= n.squareRoot();
            super.getStack().push(array[0]);
            super.getStack().push(array[1]);
           
        }
        
    }
    
    public void notUnary() throws SystemErrorException{
        
        ComplexNumber n1 = super.getStack().pop();
        ComplexNumber n2 = super.getStack().pop();
        
        if(this.operator.equals("+")){
            super.getStack().push(n1.sum(n2));            
        }else if(this.operator.equals("-")){
            super.getStack().push(n1.sub(n2));
        }else if(this.operator.equals("*")){
            super.getStack().push(n1.multiply(n2));
        }else if(this.operator.equals("/")){
            super.getStack().push(n1.divide(n2));
        }
        
    }
    
    
    
    
}
