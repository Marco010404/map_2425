/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figura;

/**
 *
 * @author marcovillano
 */
public class Triangolo extends FiguraComp {
    
    public Triangolo(double dim1, double dim2){
        
        super(dim1, dim2);
    }
    
    @Override
    public double area(){
        return dim1 * dim2 / 2;
    }
    
    @Override
    public String toString(){
        return "Triangolo con dimensioni " + dim1 + ", " + dim2;
    }
}
