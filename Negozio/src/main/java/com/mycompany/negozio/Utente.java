/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.negozio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marcovillano
 */
public class Utente {
    
    private int id;
    
    private String username;
    
    private List<Ordine> storicoOrdini;
    
    public Utente(int id, String username){
        
        this.id = id;
        
        this.username = username;
        
        this.storicoOrdini = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Ordine> getStoricoOrdini() {
        return storicoOrdini;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + this.id;
        return hash;
    }

    /**
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Utente other = (Utente) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    /**
     *
     * @param ordine
     */
    public void calcolaOrdine(Ordine ordine) {
        ordine.calcolaCostoMerce();
        double peso = ordine.getPeso();
        int kg = (int) Math.round(peso / 1000);
        if (kg < 1) {
            ordine.setCostoSpedizione(2);
        } else {
            ordine.setCostoSpedizione(2 * kg);
        }
    }

    
    
    
}
