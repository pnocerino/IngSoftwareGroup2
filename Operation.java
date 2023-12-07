/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementazione1;

/**
 *
 * @author utente
 */
public abstract class Operation {
    
    protected final String operator;
    protected final Stack stack;
    
    public Operation(String operator, Stack stack){
        this.operator = operator;
        this.stack = stack;
    }

    public String getOperator() {
        return operator;
    }

    public Stack getStack() {
        return stack;
    }
    
    public abstract void solveOperation();
    
}
