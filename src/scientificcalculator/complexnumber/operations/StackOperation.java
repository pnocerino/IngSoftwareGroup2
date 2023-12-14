
package scientificcalculator.complexnumber.operations;

import scientificcalculator.complexnumber.ComplexNumber;
import scientificcalculator.complexnumber.Stack;
import exceptions.SyntaxErrorException;
import exceptions.SystemErrorException;
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
            this.drop();
        } else if (this.operator.equals("dup")) {
            this.dup();
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

    public void drop() {
        try {
            super.getStack().pop();
        } catch (SyntaxErrorException ex) {
            Alert dialog = new Alert(Alert.AlertType.ERROR, "Si è verificato un errore.\nLo stack è vuoto.", ButtonType.OK);
            dialog.setTitle("Stack vuoto");
            dialog.showAndWait();
        }

    }

    public void dup() {
        try {
            super.getStack().push(super.getStack().peek());
        } catch (SyntaxErrorException | SystemErrorException ex) {
            if (ex instanceof SystemErrorException) {
                Alert dialog = new Alert(Alert.AlertType.INFORMATION, ex.getMessage(), ButtonType.OK);
                dialog.setTitle("Stack vuoto");
                dialog.showAndWait();
            } else {
                Alert dialog = new Alert(Alert.AlertType.INFORMATION, ex.getMessage(), ButtonType.OK);
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
                Alert dialog = new Alert(Alert.AlertType.INFORMATION, ex.getMessage(), ButtonType.OK);
                dialog.setTitle("Stack vuoto");
                dialog.showAndWait();
            } else {
                Alert dialog = new Alert(Alert.AlertType.ERROR, ex.getMessage(), ButtonType.OK);
                dialog.setTitle("Stack pieno");
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
                Alert dialog = new Alert(Alert.AlertType.INFORMATION, ex.getMessage(), ButtonType.OK);
                dialog.setTitle("Stack vuoto");
                dialog.showAndWait();
            } else {
                Alert dialog = new Alert(Alert.AlertType.ERROR, ex.getMessage(), ButtonType.OK);
                dialog.setTitle("Stack pieno");
                dialog.showAndWait();
                exit();
            }
        }

    }
}
