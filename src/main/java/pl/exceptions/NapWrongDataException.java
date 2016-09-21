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
public class NapWrongDataException extends NapAppException
{

    public NapWrongDataException(String message) {
        super(message);
    }

    public NapWrongDataException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
