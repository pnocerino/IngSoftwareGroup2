/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementazione1;

import eccezioni.*;

/**
 *
 * @author utente
 */
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
    
    public void executeCommand(Stack stack, Variables vars){
        
        if(this.isOperand()){
            ComplexNumber n = new ComplexNumber(this.command);
            stack.push(n);
        }
        else if(this.isOperator()) {
            Operation o;
            if(this.isMathOperator()){
                o = new MathOperation(this.command,stack);
            }else if(this.isStackOperator()){
                o = new StackOperation(this.command,stack);
            }else{
                o = new VariableOperation(this.command,stack,vars);
            }
            o.solveOperation();
        }
        else{
            
            throw new SyntaxException("Syntax Error");
           
        }
        
        
    }
    
    
    
    
}
