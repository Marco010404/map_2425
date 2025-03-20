/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figura;

/**
 *
 * @author marcovillano
 */
public class Rettangolo extends FiguraComp{
    
    public Rettangolo(double dim1, double dim2){
        super(dim1, dim2);
            
            }
    
    
    
    @Override
    public double area(){
        return dim1 * dim2;
    }
    
    public String toString(){
        return "Rettangolo di dimensioni " + dim1 + ", " + dim2;
    }
}
