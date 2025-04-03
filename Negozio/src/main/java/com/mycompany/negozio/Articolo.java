/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.negozio;

/**
 *
 * @author marcovillano
 */
public class Articolo {
    
    private int id;
    
    private String descrizione;
    
    private double costo;
    
    private double peso;
    
    public Articolo(int id, String username, int costo, int par2){
        
        this.id = id;
        
        this.descrizione = descrizione;
        
        this.costo = costo;
        
        this.peso = peso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        
        if(obj == null){
            return false;
        }
        
        final Articolo other = (Articolo) obj;
        if(this.id != other.id){
            return false;
        }
        
        return true;
    }
    
    @Override
    public String toString(){
        return id + ", " + descrizione + ", prezzo = " + costo + ", peso = " + peso;
    }
}
