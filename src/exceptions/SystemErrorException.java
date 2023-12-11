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
public class SystemErrorException extends Exception {

    /**
     * Creates a new instance of <code>SystemErrorException</code> without
     * detail message.
     */
    public SystemErrorException() {
    }

    public SystemErrorException(String msg) {
        super(msg);
    }
}
