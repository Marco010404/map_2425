/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figura;

/**
 *
 * @author marcovillano
 */
public abstract class FiguraComp implements Figura, Comparable{
    
    protected double dim1; //variabile d'istanza dim1
    
    protected double dim2; //variabile d'istanza dim2
    
    //costruttore che inizializza le variabili d'istanza
    public FiguraComp(double dim1, double dim2){
         
        this.dim1 = dim1;
        
        this.dim2 = dim2;
    }
    
    /*metodo che realizza il metodo astartto dell'interfaccia Comparable, confrontando due oggetti di tipo FiguraComp in base all'area
    un oggetto  precede un altro se ha area minore*/
    
    @Override
    public int compareTo(Object o){
        
        if(((Figura) o).area() == this.area()){
            return 0;
        } 
        
        else if (((Figura) o).area() < this.area()){
            return 1;
        } 
        
        else if (((Figura) o).area() > this.area()){
            return -1;
        }
        return 0;
    }
    
    
    //metodo equals
    @Override
    public boolean equals(Object o){
        if(o instanceof Figura){
            return(((Figura) o).area() == this.area());
        }
        
        else{
            return false;
        }
    
    }
    
    @Override
    public abstract double area();
}
