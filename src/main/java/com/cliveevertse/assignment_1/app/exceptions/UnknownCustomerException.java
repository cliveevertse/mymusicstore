/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.startup.musicstore.app.exceptions;

/**
 *
 * @author Sydwell
 */
public class UnknownCustomerException extends RuntimeException{

    public UnknownCustomerException(String message) {
        super(message);
    } 
}
