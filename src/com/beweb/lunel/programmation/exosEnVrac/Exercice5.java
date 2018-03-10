/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beweb.lunel.programmation.exosEnVrac;

/**
 *
 * @author cantinelli
 */
public class Exercice5 {
    
    public static void launch(){
        
        System.out.println("\n" + "** Exercice 5 **");
        
        int compteur = 10;
        
        String message = "";
        
        while(compteur <= 100){
            
            if(compteur == 100){
                message += compteur;
            }else{
                message += compteur + ", ";
            }
            compteur++;
        }
        
        System.out.println(message);
    }
    
}
