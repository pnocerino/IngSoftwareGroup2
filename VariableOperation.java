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
public class VariableOperation extends Operation{

    private final Variables vars;
    private final char name;
    
    public VariableOperation(String operator, Stack stack, Variables vars){
        
        super(operator.substring(0,1),stack);
        this.name = operator.charAt(1);
        this.vars = vars;
    
    }

    public char getName() {
        return name;
    }
    
    
    @Override
    public void solveOperation() {
        
        if(this.operator.equals(">")){
            
            ComplexNumber n = super.getStack().peek();
            Variable v = new Variable(this.name,n.getRealPart(),n.getImPart());
            vars.add(v);
                    
        }else if(this.operator.equals("<")){
            
            Variable v = vars.search(name);
            ComplexNumber n = new ComplexNumber(v.getRealPart(),v.getImPart());
            super.getStack().push(n);
           
        }else if(this.operator.equals("+")){
            
            ComplexNumber n = super.getStack().pop();
            Variable v = vars.search(name);
            v.sum(n);
            vars.add(v);
            
            
        }else if(this.operator.equals("-")){
            
            ComplexNumber n = super.getStack().pop();
            Variable v = vars.search(name);
            v.sub(n);
            vars.add(v);
            
        }
        
        
    }
    
}
