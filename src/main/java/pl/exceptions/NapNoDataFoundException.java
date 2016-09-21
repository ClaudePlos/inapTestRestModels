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
public class NapNoDataFoundException extends Exception {

    public NapNoDataFoundException(String message, Exception ex) {
        super(message, ex);
    }

    public NapNoDataFoundException(Exception ex) {
        super(ex);
    }

    public NapNoDataFoundException(String message) {
        super(message);
    }

    public NapNoDataFoundException() {
    }

   

}