
package scientificcalculator.complexnumber.operations;

import static gui.ContainerView.inputArea;
import static scientificcalculator.ScientificCalculator.currentVariable;
import complexnumber.ComplexNumber;
import complexnumber.Stack;
import exceptions.SyntaxErrorException;
import exceptions.SystemErrorException;
import static javafx.application.Platform.exit;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import scientificcalculator.complexnumber.variables.Variable;
import scientificcalculator.complexnumber.variables.Variables;

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
            try {
                ComplexNumber n = super.getStack().peek();
                Variable v = new Variable(this.name, n.toString());
                vars.add(v);
                inputArea.keyboardRow.list.set((int)(currentVariable - 97), currentVariable + " = " + vars.search(currentVariable).toString());
            } catch (SyntaxErrorException ex) {
                Alert dialog = new Alert(Alert.AlertType.ERROR, ex.getMessage(), ButtonType.CLOSE);
                dialog.setTitle("Stack vuoto"); dialog.showAndWait(); exit();
            }
        } 
        else if (this.operator.equals("<")) {
            try {
                Variable v = vars.search(name);
                ComplexNumber n = new ComplexNumber(v.toString());
                try {
                    super.getStack().push(n);
                } catch (SystemErrorException ex) {
                    Alert dialog = new Alert(Alert.AlertType.INFORMATION, ex.getMessage(), ButtonType.OK);
                    dialog.setTitle("Stack pieno"); dialog.showAndWait();
                }
            } catch (NullPointerException ex) {
                throw new SyntaxErrorException("Si è verificato un' errore.\nLa variabile richiesta non è stata allocata.");
            }
        } 
        else if (this.operator.equals("+")) {
            try {
                ComplexNumber n = super.getStack().pop();
                Variable v = vars.search(name);
                vars.remove(name);
                vars.add(new Variable(name, v.sum(n).toString()));
                
                inputArea.keyboardRow.list.set((int)(currentVariable - 97), currentVariable + " = " + vars.search(currentVariable).toString());
            } catch (NullPointerException ex) {
                throw new SyntaxErrorException("Si è verificato un' errore.\nLa variabile richiesta non è stata allocata.");
            }
        } 
        else if (this.operator.equals("-")) {
            try {
                ComplexNumber n = super.getStack().pop();
                Variable v = vars.search(name);
                vars.remove(name);
                vars.add(new Variable(name, v.sub(n).toString()));
                inputArea.keyboardRow.list.set((int)(currentVariable - 97), currentVariable + " = " + vars.search(currentVariable).toString());
            } catch (NullPointerException ex) {
                throw new SyntaxErrorException("Si è verificato un' errore.\nLa variabile richiesta non è stata allocata.");
            }

        }

    }

}
