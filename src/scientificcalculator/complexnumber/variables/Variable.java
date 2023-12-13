
package scientificcalculator.complexnumber.variables;

import complexnumber.ComplexNumber;

public class Variable extends ComplexNumber {
    
    private char name;

    public Variable(char name, String value) {
        super(value);
        this.name = name;
    }

    public char getName() {
        return name;
    }
}
