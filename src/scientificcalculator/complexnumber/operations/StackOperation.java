
package scientificcalculator.complexnumber.operations;

import scientificcalculator.complexnumber.ComplexNumber;
import scientificcalculator.complexnumber.Stack;
import exceptions.SyntaxErrorException;
import exceptions.SystemErrorException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.application.Platform.exit;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

public class StackOperation extends Operation {

    public StackOperation(String operator, Stack stack) {
        super(operator, stack);
    }

    @Override
    public void solveOperation() {

        if (this.operator.equals("clear")) {
            this.clear();
        } else if (this.operator.equals("drop")) {
            try {
                this.drop();
            } catch (SystemErrorException ex) {
                Alert dialog = new Alert(Alert.AlertType.ERROR, ex.getMessage(), ButtonType.OK);
                dialog.setTitle("Stack vuoto");
                dialog.showAndWait();
                exit();
            }
        } else if (this.operator.equals("dup")) {
            try {
                this.dup();
            } catch (SyntaxErrorException ex) {
                Alert dialog = new Alert(Alert.AlertType.ERROR, ex.getMessage(), ButtonType.OK);
                dialog.setTitle("Stack pieno");
                dialog.showAndWait();
                exit();
            }
        } else if (this.operator.equals("swap")) {
            this.swap();
        } else if (this.operator.equals("over")) {
            this.over();
        }

    }

    public void clear() {

        try {
            if (super.getStack().isEmpty()) {
                throw new SystemErrorException("Stack vuoto");
            }

            super.getStack().getStack().clear();
        } catch (SystemErrorException ex) {
            Alert dialog = new Alert(Alert.AlertType.INFORMATION, "Si è verificato un errore.\nLo stack è vuoto.", ButtonType.OK);
            dialog.setTitle("Stack vuoto");
            dialog.showAndWait();
        }

    }

    public void drop() throws SystemErrorException {
        try {
            super.getStack().pop();
        } catch (SyntaxErrorException ex) {
            throw new SystemErrorException("Si è verificato un errore.\nLo stack è vuoto.");
            
        }

    }

    public void dup() {
        try {
            super.getStack().push(super.getStack().peek());
        } catch (SyntaxErrorException | SystemErrorException ex) {
            if (ex instanceof SystemErrorException) {
                throw new SyntaxErrorException("Si è verificato un errore.\nLo stack è pieno.");
            } else {
                Alert dialog = new Alert(Alert.AlertType.ERROR, ex.getMessage(), ButtonType.OK);
                dialog.setTitle("Stack pieno");
                dialog.showAndWait();
                exit();
            }
        }
    }

    public void swap() {
        try {
            ComplexNumber top = super.getStack().pop();
            ComplexNumber bot = super.getStack().pop();
            super.getStack().push(top);
            super.getStack().push(bot);
        } catch (SyntaxErrorException | SystemErrorException ex) {
            if (ex instanceof SystemErrorException) {
                Alert dialog = new Alert(Alert.AlertType.ERROR, ex.getMessage(), ButtonType.OK);
                dialog.setTitle("Stack vuoto");
                dialog.showAndWait();
            } else {
                Alert dialog = new Alert(Alert.AlertType.ERROR, ex.getMessage(), ButtonType.OK);
                dialog.setTitle("Stack vuoto");
                dialog.showAndWait();
                exit();
            }
        }
    }

    public void over() {
        try {
            ComplexNumber n = super.getStack().pop();
            super.getStack().push(super.getStack().peek());
            super.getStack().push(n);
        } catch (SyntaxErrorException | SystemErrorException ex) {
            if (ex instanceof SystemErrorException) {
                throw new SyntaxErrorException("Si è verificato un' errore.\nLo stack è pieno.\n");
            } else {
                Alert dialog = new Alert(Alert.AlertType.ERROR, "Si è verificato un errore.\nLo stack non contiene abbastanza elementi.\n", ButtonType.OK);
                dialog.setTitle("Stack non sufficiente.");
                dialog.showAndWait();
                exit();
            }
        }

    }
}
