/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complexnumber.operations;

import complexnumber.ComplexNumber;
import complexnumber.Stack;

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
            this.unary();
        }else{
            this.notUnary();
        }
        
    }
    
    public void unary(){
        
        ComplexNumber n = super.getStack().pop();

        if(this.operator.equals("\\+\\-")){
            super.getStack().push(n.signChange());
        }else{
            ComplexNumber[] array= n.squareRoot();
            super.getStack().push(array[0]);
            super.getStack().push(array[1]);
           
        }
        
    }
    
    public void notUnary(){
        
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
