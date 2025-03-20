/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.figura;

/**
 *
 * @author marcovillano
 */
public class TestFigure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FiguraComp t = new Triangolo(3, 4);
        FiguraComp r = new Rettangolo(7, 5);
        FiguraComp q = new Quadrato(6);
        System.out.println(t.toString() + ", area=" + t.area());
        System.out.println(r.toString() + ", area=" + r.area());
        System.out.println(q.toString() + ", area=" + q.area());
        
        System.out.println(q.compareTo(t));
        System.out.println(t.compareTo(r));
        System.out.println(q.equals(r));
        
        FiguraComp rq = new Rettangolo(6, 6);
        System.out.println(q.equals(rq));
        System.out.println(q.compareTo(r));
    }
    
}
