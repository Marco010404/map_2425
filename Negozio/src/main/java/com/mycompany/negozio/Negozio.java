/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.negozio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author marcovillano
 */
public class Negozio {

    public final Magazzino magazzino;
    
    public final Set<Utente> utenti;
    
    public Negozio(Magazzino magazzino, Set<Utente> utenti){
        
        this.magazzino = magazzino;
        
        this.utenti = utenti;
    }

    public Magazzino getMagazzino() {
        return magazzino;
    }

    public Set<Utente> getUtenti() {
        return utenti;
    }
    
    public double acquista(Utente utente, Map<Articolo, Integer> carrello) throws NegozioException {
        // controllo disponibilità
        for (Articolo articolo : carrello.keySet()) {
            if (!magazzino.disponibile(articolo, carrello.get(articolo))) {
                throw new NegozioException("Articolo " + articolo.getId() + " non disponibile.");
            }
        }
        // rimuovi merce dal magazzino
        for (Articolo articolo : carrello.keySet()) {
            magazzino.remove(articolo, carrello.get(articolo));
        }
        // crea ordine
        Ordine ordine = new Ordine(utente, carrello);
        utente.calcolaOrdine(ordine);
        utente.getStoricoOrdini().add(ordine);
        return ordine.getCostoMerce() + ordine.getCostoSpedizione();
    }

    /**
     *
     * @param utente
     * @return
     */
    public List<Ordine> cercaStoricoUtente(Utente utente) {
        for (Utente u : utenti) {
            if (u.equals(utente)) {
                return u.getStoricoOrdini();
            }
        }
        return new ArrayList<>();
    }

    /**
     *
     * @return
     */
    public List<HolderQuantity<Articolo>> getTopVendite() {
        Map<Articolo, Integer> count = new HashMap<>();
        for (Utente u : utenti) {
            List<Ordine> ordini = u.getStoricoOrdini();
            for (Ordine o : ordini) {
                Map<Articolo, Integer> articoli = o.getArticoli();
                for (Articolo a : articoli.keySet()) {
                    Integer v = count.get(a);
                    if (v == null) {
                        count.put(a, articoli.get(a));
                    } else {
                        count.put(a, v + articoli.get(a));
                    }
                }
            }
        }
        List<HolderQuantity<Articolo>> l = new ArrayList<>();
        for (Map.Entry<Articolo, Integer> a : count.entrySet()) {
            l.add(new HolderQuantity<>(a.getKey(), a.getValue()));
        }
        Collections.sort(l, Collections.reverseOrder());
        if (l.size() < 5) {
            return l;
        } else {
            return l.subList(0, 5);
        }
    }
    
}
