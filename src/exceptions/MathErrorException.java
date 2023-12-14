
package exceptions;

public class MathErrorException extends RuntimeException {

    
    public MathErrorException() {
    }

    
    public MathErrorException(String msg) {
        super(msg);
    }
}
