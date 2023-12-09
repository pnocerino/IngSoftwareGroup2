/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author sherr
 */
public class SyntaxErrorException extends Exception {

    /**
     * Creates a new instance of <code>SyntaxErrorException</code> without
     * detail message.
     */
    public SyntaxErrorException() {
    }

    /**
     * Constructs an instance of <code>SyntaxErrorException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public SyntaxErrorException(String msg) {
        super(msg);
    }
}
