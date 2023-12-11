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
            this.dup();
        }else if(this.operator.equals("swap")){
            this.swap();
        }else if(this.operator.equals("over")){
            this.over();
        }
    
    }
    
    public void clear(){
        super.getStack().getStack().clear();
    }
    
    public void drop(){
        super.getStack().pop();
    }
    
    public void dup(){
        super.getStack().push(super.getStack().peek());
    }
    
    public void swap(){
        ComplexNumber top = super.getStack().pop();
        ComplexNumber bot = super.getStack().pop();
        super.getStack().push(top);
        super.getStack().push(bot);
    }
    
    public void over(){
        ComplexNumber n = super.getStack().pop();
        super.getStack().push(super.getStack().peek());
        super.getStack().push(n);
        
    }
    
    
}
