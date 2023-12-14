
package exceptions;

public class SyntaxErrorException extends RuntimeException {

    public SyntaxErrorException() {
    }

    public SyntaxErrorException(String msg) {
        super(msg);
    }
}
