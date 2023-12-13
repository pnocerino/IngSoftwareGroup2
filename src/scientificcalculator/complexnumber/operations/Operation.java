
package scientificcalculator.complexnumber.operations;

import scientificcalculator.complexnumber.Stack;
import exceptions.SyntaxErrorException;

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
    
    public abstract void solveOperation() throws SyntaxErrorException;
    
}
