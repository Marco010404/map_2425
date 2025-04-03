/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.negozio;

import java.util.Map;

/**
 *
 * @author marcovillano
 */
public class Ordine {
    
    private Utente utente;
    
    private double costoMerce;
            
    private double costoSpedizione;
    
    private Map<Articolo, Integer> articoli;
    
    public Ordine(Utente utente, Map<Articolo, Integer> articoli){
        
        this.utente = utente;
        
        this.articoli = articoli;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public double getCostoMerce() {
        return costoMerce;
    }

    public void setCostoMerce(double costoMerce) {
        this.costoMerce = costoMerce;
    }

    public double getCostoSpedizione() {
        return costoSpedizione;
    }

    public void setCostoSpedizione(double costoSpedizione) {
        this.costoSpedizione = costoSpedizione;
    }

    public Map<Articolo, Integer> getArticoli() {
        return articoli;
    }

    public void setArticoli(Map<Articolo, Integer> articoli) {
        this.articoli = articoli;
    }
    
     public void calcolaCostoMerce() {
        costoMerce = 0;
        for (Map.Entry<Articolo, Integer> e : articoli.entrySet()) {
            costoMerce += e.getKey().getCosto() * e.getValue();
        }
    }

    /**
     *
     * @return
     */
    public double getPeso() {
        double peso = 0;
        for (Map.Entry<Articolo, Integer> e : articoli.entrySet()) {
            peso += e.getKey().getPeso() * e.getValue();
        }
        return peso;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Utente=" + utente.getUsername() + ", " + costoMerce + ", " + costoSpedizione;
    }

   
}

