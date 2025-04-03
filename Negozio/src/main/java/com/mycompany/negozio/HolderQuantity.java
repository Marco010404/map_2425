/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.negozio;

import java.util.Objects;

/**
 *
 * @author marcovillano
 * @param <T>
 */
public class HolderQuantity<T> implements Comparable<HolderQuantity<T>> {
    
    private T item;
    
    private int q;
    
    public HolderQuantity(T item, int q){
        
        this.item=item;
        
        this.q=q;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public int getQ() {
        return q;
    }

    public void setQ(int q) {
        this.q = q;
    }
    
    @Override
    public int hashCode(){
        int hash = 5;
        hash = 11 * hash + Objects.hashCode(this.item);
        return hash;
    }
    
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        
        if(this == null){
            return false;
        }
        
        if(getClass() != obj.getClass()){
            return false;
        }
        
        final HolderQuantity<?> other = (HolderQuantity<?>) obj;
        if(!Objects.equals(this.item, other.item)){
            return false;
        }
        return true;
    }
    
    @Override
    public int compareTo(HolderQuantity<T> o){
        return Integer.compare(q, o.q);
    }
    
}
