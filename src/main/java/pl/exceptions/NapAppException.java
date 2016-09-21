/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.exceptions;

/**
 *
 * @author k.skowronski
 */
public class NapAppException extends RuntimeException {

    public NapAppException(String message, Throwable cause) {
        super(message, cause);
    }

    public NapAppException(String message) {
        super(message);
    }

    public NapAppException(){
        super(); 
    }


}