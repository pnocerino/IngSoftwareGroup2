package scientificcalculator.complexnumber;

import scientificcalculator.complexnumber.ComplexNumber;
import scientificcalculator.complexnumber.Stack;
import static scientificcalculator.ScientificCalculator.currentVariable;
import exceptions.SyntaxErrorException;
import exceptions.SystemErrorException;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import scientificcalculator.complexnumber.operations.MathOperation;
import scientificcalculator.complexnumber.operations.Operation;
import scientificcalculator.complexnumber.operations.StackOperation;
import scientificcalculator.complexnumber.operations.VariableOperation;
import scientificcalculator.complexnumber.variables.Variables;

public class Command {
    
    private final String command;
    
    public Command(String command){
        
        this.command = command;
        
    }

    public String getCommand() {
        return command;
    }
    
    public boolean isOperand(){
        
        return command.matches(
        "[+-]?\\d+([.,]\\d+)?[+-](\\d+([.,]\\d+)?)?[ij]" //parte reale +- parte immaginaria i
        + "|"
        + "[+-]?\\d+([.,]\\d+)?[+-][ij]\\d+([.,]\\d+)?" //parte reale +- i parte immaginaria
        + "|"
        + "[+-]?(\\d+([.,]\\d+)?)?[ij][+-]\\d+([.,]\\d+)?" //parte immaginaria i +- parte reale
        + "|"
        + "[+-]?[ij]\\d+([.,]\\d+)?[+-]\\d+([.,]\\d+)?" //i parte immaginaria +- parte reale
        + "|"
        + "[+-]?\\d+([.,]\\d+)?" //parte reale
        + "|"
        + "[+-]?(\\d+([.,]\\d+)?)?[ij]" //parte immaginaria i
        + "|"
        + "[+-]?[ij]\\d+([.,]\\d+)?"); //i parte immaginaria
        
    }
    
    public boolean isOperator(){
        
        return this.isMathOperator() || this.isStackOperator() || this.isVariableOperator();
    }
    
    public boolean isMathOperator(){
        
        return command.matches(
            "\\+"
            + "|"
            + "\\-"
            + "|"
            + "\\*"
            + "|"
            + "/"
            + "|"
            + "sqrt"
            + "|"
            + "\\+\\-");
        
    }
    
    public boolean isStackOperator(){
        
        return command.matches(
            "clear"
            + "|"
            + "drop"
            + "|"
            + "dup"
            + "|"
            + "swap"
            + "|"
            + "over");
        
    }
    
    public boolean isVariableOperator(){
        
        return command.matches(
            "\\+[a-z]"
            + "|"
            + "\\-[a-z]"
            + "|"
            + ">[a-z]"
            + "|"
            + "<[a-z]"
        );
    }
    
    public void executeCommand(Stack stack, Variables vars) throws SyntaxErrorException {
        
        if(this.isOperand()){
            ComplexNumber n = new ComplexNumber(this.command);
            try {
                stack.push(n);
            } catch (SystemErrorException ex) {
                Alert dialog = new Alert(Alert.AlertType.INFORMATION, ex.getMessage(), ButtonType.OK);
                dialog.setTitle("Stack pieno"); dialog.showAndWait();
            }
        } else if(this.isOperator()) {
            Operation o;
            if(this.isMathOperator()){
                o = new MathOperation(this.command, stack);
                o.solveOperation();
            }else if(this.isStackOperator()){
                o = new StackOperation(this.command, stack);
                o.solveOperation();
            }else{
                currentVariable = this.command.charAt(this.command.length() - 1);
                o = new VariableOperation(this.command, stack, vars);
                o.solveOperation();
            }
        } else { 
            throw new SyntaxErrorException("Si è verificato un errore di sintassi.\nInserire un operatore o operando in un formato valido.\n\n"
                    + "Per inserire un numero complesso, utilizzare un formato del tipo \"a+bi\", es: \"2+2i\".\n\n"
                    + "Per inserire un operatore, utilizzare: \"+\", \"-\", \"*\", \"/\", \"sqrt\" o \"+-\".\n\n"
                    + "Per inserire un comando, utilizzare un formato del tipo \"clear\", \"dup\", o \">a\".");
        }
    } 
}
