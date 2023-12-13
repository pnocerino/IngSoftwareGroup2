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
            try {
                this.dup();
            } catch (SystemErrorException ex) {
                Alert dialog = new Alert(Alert.AlertType.ERROR, ex.getMessage(), ButtonType.OK);
                dialog.setTitle("Stack vuoto");
                dialog.showAndWait();
                exit();
            }
        } else if (this.operator.equals("swap")) {
            try {
                this.swap();
            } catch (SystemErrorException ex) {
                Alert dialog = new Alert(Alert.AlertType.ERROR, ex.getMessage(), ButtonType.OK);
                dialog.setTitle("Stack vuoto");
                dialog.showAndWait();
                exit();
            }
        } else if (this.operator.equals("over")) {
            try {
                this.over();
            } catch (SystemErrorException ex) {
                Alert dialog = new Alert(Alert.AlertType.ERROR, ex.getMessage(), ButtonType.OK);
                dialog.setTitle("Stack vuoto");
                dialog.showAndWait();
                exit();
            }
        }

    }

    public void clear() {

        try {
            if (super.getStack().isEmpty()) {
                throw new SystemErrorException("Stack vuoto");
            }

            super.getStack().getStack().clear();
        } catch (SystemErrorException ex) {
            Alert dialog = new Alert(Alert.AlertType.ERROR, "Si è verificato un errore.\nLo stack è vuoto.", ButtonType.OK);
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

    public void dup() throws SystemErrorException {
        try {
            super.getStack().push(super.getStack().peek());
        } catch (SyntaxErrorException ex) {
            Alert dialog = new Alert(Alert.AlertType.ERROR, ex.getMessage(), ButtonType.OK);
            dialog.setTitle("Stack vuoto");
            dialog.showAndWait();
            exit();
        }
    }

    public void swap() throws SystemErrorException {
        try {
            ComplexNumber top = super.getStack().pop();
            ComplexNumber bot = super.getStack().pop();
            super.getStack().push(top);
            super.getStack().push(bot);
        } catch (SyntaxErrorException ex) {
            Alert dialog = new Alert(Alert.AlertType.ERROR, "Si è verificato un errore.\nLo stack non contiene abbastanza elementi.", ButtonType.OK);
            dialog.setTitle("Stack senza elementi necessari");
            dialog.showAndWait();
            exit();
        }
    }

    public void over() throws SystemErrorException {
        try {
            ComplexNumber n = super.getStack().pop();
            super.getStack().push(super.getStack().peek());
            super.getStack().push(n);
        } catch (SyntaxErrorException ex) {
            Alert dialog = new Alert(Alert.AlertType.ERROR, "Si è verificato un errore.\nLo stack non contiene abbastanza elementi.", ButtonType.OK);
            dialog.setTitle("Stack senza elementi necessari");
            dialog.showAndWait();
            exit();
        }

    }
}
