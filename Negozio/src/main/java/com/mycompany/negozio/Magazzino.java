/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.negozio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author marcovillano
 */
public class Magazzino {
    
    private final Map<Articolo, Integer> map;
    
    public Magazzino(){
        map = new HashMap<>();
    }
    
    public void add(Articolo articolo, int quantita) {
        Integer q = map.get(articolo);
        if (q == null) {
            map.put(articolo, quantita);
        } else {
            map.put(articolo, q + quantita);
        }
    }

    /**
     *
     * @param articolo
     * @param quantita
     * @throws NegozioException
     */
    public void remove(Articolo articolo, int quantita) throws NegozioException {
        Integer q = map.get(articolo);
        if (q == null || q < quantita) {
            throw new NegozioException("Quantità non disponibile");
        } else {
            map.put(articolo, q - quantita);
        }
    }

    /**
     *
     * @param articolo
     * @param quantita
     * @return
     */
    public boolean disponibile(Articolo articolo, int quantita) {
        Integer q = map.get(articolo);
        if (q == null || q < quantita) {
            return false;
        } else {
            return true;
        }
    }

    /**
     *
     * @param key
     * @return
     */
    public Set<Articolo> cerca(String key) {
        Set<Articolo> risultati = new HashSet<>();
        for (Articolo articolo : map.keySet()) {
            if (articolo.getDescrizione().contains(key)) {
                risultati.add(articolo);
            }
        }
        return risultati;
    }

    /**
     *
     * @param q
     * @return
     */
    public List<Articolo> cercaQuantita(int q) {
        List<Articolo> list = new ArrayList<>();
        for (Map.Entry<Articolo, Integer> e : map.entrySet()) {
            if (e.getValue() < q) {
                list.add(e.getKey());
            }
        }
        return list;
    }

    
}
