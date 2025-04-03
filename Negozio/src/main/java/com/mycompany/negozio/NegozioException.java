/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.negozio;

/**
 *
 * @author marcovillano
 */
public class NegozioException extends Exception{
    
    public NegozioException() {
    }

    /**
     *
     * @param message
     */
    public NegozioException(String message) {
        super(message);
    }
}
