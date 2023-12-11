/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complexnumber.operations;

import static calcolatriceinterfaccia.CalcolatriceInterfaccia.currentVariable;
import complexnumber.ComplexNumber;
import complexnumber.Stack;
import complexnumber.variables.Variable;
import complexnumber.variables.Variables;
import exceptions.SyntaxErrorException;

/**
 *
 * @author utente
 */
public class VariableOperation extends Operation {

    private Variables vars;
    private final char name;

    public VariableOperation(String operator, Stack stack, Variables vars) {

        super(operator.substring(0, 1), stack);
        this.name = operator.charAt(1);
        this.vars = vars;

    }

    public char getName() {
        return name;
    }

    @Override
    public void solveOperation() throws SyntaxErrorException {

        if (this.operator.equals(">")) {

            ComplexNumber n = super.getStack().peek();
            Variable v = new Variable(this.name, n.toString());
            System.out.println(n.toString());
            vars.add(v);
            //view.keyboardRow.list.set((int)(currentVariable - 97), currentVariable + " = " + vars.search(currentVariable).toString());

        } else if (this.operator.equals("<")) {
            try {
                Variable v = vars.search(name);
                ComplexNumber n = new ComplexNumber(v.toString());
                super.getStack().push(n);
            } catch (NullPointerException ex) {
                throw new SyntaxErrorException("Errore variabile.");
            }

        } else if (this.operator.equals("+")) {
            try {
                ComplexNumber n = super.getStack().pop();
                Variable v = vars.search(name);
                vars.remove(name);
                vars.add(new Variable(name, v.sum(n).toString()));
            } catch (NullPointerException ex) {
                throw new SyntaxErrorException("Errore variabile.");
            }

        } else if (this.operator.equals("-")) {
            try {
                ComplexNumber n = super.getStack().pop();
                Variable v = vars.search(name);
                vars.remove(name);
                vars.add(new Variable(name, v.sub(n).toString()));
            } catch (NullPointerException ex) {
                throw new SyntaxErrorException("Errore variabile.");
            }

        }

    }

}
