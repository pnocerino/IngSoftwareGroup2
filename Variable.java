/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementazione1;

/**
 *
 * @author pierl
 */
public class Variable extends ComplexNumber{
    
    private char name;

    public Variable(char name, String value) {
        super(value);
        this.name = name;
    }
    
    public Variable(char name, double realPart, double imPart) {
        super(realPart,imPart);
        this.name = name;
    }

    public char getName() {
        return name;
    }
    
    
    
    
    
}
