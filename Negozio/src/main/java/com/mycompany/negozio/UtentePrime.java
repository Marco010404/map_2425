/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.negozio;

/**
 *
 * @author marcovillano
 */
public class UtentePrime extends Utente {
    
    public UtentePrime(int id, String username){
        
        super(id, username);
    } 
    
    @Override
    public void calcolaOrdine(Ordine ordine) {
        ordine.calcolaCostoMerce();
        ordine.setCostoSpedizione(1);
    }
}
