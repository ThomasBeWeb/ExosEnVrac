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
public class Exercice11 {
    
    public static void launch(){
        
        System.out.println("\n" + "** Exercice 11 **");
        
        long[] suite = new long[1000];
        
        suite[0] = 0;
        suite[1] = 1;
        
        for(int i = 2 ; i < suite.length ; i++){           
            suite[i] = suite[i-2] + suite[i-1];
        }
        
       long[] nombresPairs = new long[0];
       long[] nombresImpairs = new long[0];
       long[] multiplesDeCinq = new long[0];
       long[] multiplesDeTrois = new long[0];
       
       for(int i = 0 ; i < suite.length ; i++){
           
            if(suite[i]%2 == 0){
                nombresPairs = ajouteMoi(nombresPairs,suite[i]);
            }else{
                nombresImpairs = ajouteMoi(nombresImpairs,suite[i]);
            }
            
            if(suite[i]%5 == 0 && i != 0){
                multiplesDeCinq = ajouteMoi(multiplesDeCinq,suite[i]);
            }
            
            if(suite[i]%3 == 0 && i != 0){
                multiplesDeTrois = ajouteMoi(multiplesDeTrois,suite[i]);
            }
       }
       
        System.out.println("Tableau suite contient " + suite.length + " valeurs");
        System.out.println("Les valeurs sont: " + afficheMoi(suite));
        System.out.println("Tableau nombresPairs contient " + nombresPairs.length + " valeurs");
        System.out.println("Les valeurs sont: " + afficheMoi(nombresPairs));
        System.out.println("Tableau nombresImpairs contient " + nombresImpairs.length + " valeurs");
        System.out.println("Les valeurs sont: " + afficheMoi(nombresImpairs));
        System.out.println("Tableau multiplesDeCinq contient " + multiplesDeCinq.length + " valeurs");
        System.out.println("Les valeurs sont: " + afficheMoi(multiplesDeCinq));
        System.out.println("Tableau multiplesDeTrois contient " + multiplesDeTrois.length + " valeurs");
        System.out.println("Les valeurs sont: " + afficheMoi(multiplesDeTrois));

    }
    
    public static long[] ajouteMoi(long[] tableau, long valeur){
        
        int taille = tableau.length;
        
        long[] temp = new long[taille + 1];
        
        for(int i = 0 ; i < taille ; i++){
            temp[i] = tableau[i];
        }
        
        temp[taille] = valeur;
        
        return temp;
    }
    
    public static String afficheMoi(long[] tableau){
        
        String message = "";
        
        for(int i = 0 ; i < tableau.length ; i++){
            
            if(i == tableau.length - 1){
                message += tableau[i];
            }else{
                message += tableau[i] + ", ";
            } 
        }
        
        return message;
    }  
}
