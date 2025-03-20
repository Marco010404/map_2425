/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.figura;

/**
 *
 * @author marcovillano
 */

public interface Figura{
    
    //restituisce l'area della figura
    double area();
}



















/*

public class Rettangolo extends FiguraComp{
    public Rettangolo(double base, double altezza){
        super(base, altezza);
        }
    @Override
    public double area() {
        return dim1 * dim2;
    }

    @Override
    public String toString() {
        return "Rettangolo [base=" + dim1 + ", altezza=" + dim2 + ", area=" + area() + "]";
    }
    }

public class Triangolo extends FiguraComp{
    public Triangolo(double base, double altezza){
        super(base, altezza);
    }
    
    @Override
    public double area() {
        return dim1 * dim2 /2;
    }
    
    @Override
    public String toString() {
        return "Triangolo [base=" + dim1 + ", altezza=" + dim2 + ", area=" + area() + "]";
    }
}

public class Quadrato extends Rettangolo{
    public Quadrato(double lato){
        super(lato, lato);
    }
    
    @Override
    public String toString() {
        return "Quadrato [lato=" + dim1 + ", area=" + area() + "]";
    }
}
*/
