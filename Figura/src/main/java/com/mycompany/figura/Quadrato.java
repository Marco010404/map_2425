/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figura;

/**
 *
 * @author marcovillano
 */
public class Quadrato extends Rettangolo {
    
    public Quadrato(double lato){
        super(lato, lato);
    } 
    
    @Override
    public String toString(){
        return "Quadrato di lato " + dim1;
    }
}

    


