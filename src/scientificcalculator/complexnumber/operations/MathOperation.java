
package scientificcalculator.complexnumber.operations;

import complexnumber.ComplexNumber;
import complexnumber.Stack;
import exceptions.SyntaxErrorException;
import exceptions.SystemErrorException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.application.Platform.exit;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

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
                Logger.getLogger(MathOperation.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }else {
            this.notUnary();
        }
        
    }
    
    public void unary() throws SystemErrorException{
        
        try {
            ComplexNumber n = super.getStack().pop();
            
            if(this.operator.equals("+-")){
                try {
                    super.getStack().push(n.signChange());
                } catch (SystemErrorException ex) {
                    Alert dialog = new Alert(Alert.AlertType.ERROR, "Si è verificato un errore.\nLo stack è pieno.", ButtonType.CLOSE);
                    dialog.setTitle("Stack pieno"); dialog.showAndWait(); exit();
                }
            }else{
                ComplexNumber[] array = n.squareRoot();
                try {
                    super.getStack().push(array[0]);
                    super.getStack().push(array[1]);
                } catch (SystemErrorException ex) {
                    Alert dialog = new Alert(Alert.AlertType.ERROR, "Si è verificato un errore.\nLo stack è pieno.", ButtonType.CLOSE);
                    dialog.setTitle("Stack pieno"); dialog.showAndWait(); exit();
                }
                
            }
        } catch (SyntaxErrorException ex) {
            Alert dialog = new Alert(Alert.AlertType.ERROR, ex.getMessage(), ButtonType.CLOSE);
            dialog.setTitle("Stack vuoto"); dialog.showAndWait(); exit(); 
        }  
    }
    
    public void notUnary() {
        
        try {
            ComplexNumber n1 = super.getStack().pop();
            ComplexNumber n2 = super.getStack().pop();
            
            if(this.operator.equals("+")){
                try {
                    super.getStack().push(n1.sum(n2));
                } catch (SystemErrorException ex) {
                    Alert dialog = new Alert(Alert.AlertType.ERROR, ex.getMessage(), ButtonType.CLOSE);
                    dialog.setTitle("Stack pieno"); dialog.showAndWait(); exit();
                }
            }else if(this.operator.equals("-")){
                try {
                    super.getStack().push(n1.sub(n2));
                } catch (SystemErrorException ex) {
                    Alert dialog = new Alert(Alert.AlertType.ERROR, ex.getMessage(), ButtonType.CLOSE);
                    dialog.setTitle("Stack pieno"); dialog.showAndWait(); exit();
                }
            }else if(this.operator.equals("*")){
                try {
                    super.getStack().push(n1.multiply(n2));
                } catch (SystemErrorException ex) {
                    Alert dialog = new Alert(Alert.AlertType.ERROR, ex.getMessage(), ButtonType.CLOSE);
                    dialog.setTitle("Stack pieno"); dialog.showAndWait(); exit();
                }
            }else if(this.operator.equals("/")){
                try {
                    super.getStack().push(n1.divide(n2));
                } catch (SystemErrorException ex) {
                    Alert dialog = new Alert(Alert.AlertType.ERROR, ex.getMessage(), ButtonType.CLOSE);
                    dialog.setTitle("Stack pieno"); dialog.showAndWait(); exit();
                }
            }
        } catch (SyntaxErrorException ex) {
            Alert dialog = new Alert(Alert.AlertType.ERROR, ex.getMessage(), ButtonType.CLOSE);
            dialog.setTitle("Stack vuoto"); dialog.showAndWait(); exit();
        }
        
    }
    
}
