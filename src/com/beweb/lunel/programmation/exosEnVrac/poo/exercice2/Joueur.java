/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beweb.lunel.programmation.exosEnVrac.poo.exercice2;

import java.util.ArrayList;

/**
 *
 * @author cantinelli
 */
public class Joueur {
    
    public String nom;
    public ArrayList<Integer> liste;
    
    Joueur(){
        
    }
    
    public Joueur(String nom){
        this.nom = nom;
        this.liste = new ArrayList<>();
    }
    
    
    public void jet(){
        this.liste.add((int)(Math.random()*100));
    }
    
}
