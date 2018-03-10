/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beweb.lunel.programmation.exosEnVrac;

import java.util.ArrayList;

/**
 *
 * @author cantinelli
 */
public class Exercice9 {
    
    public static void launch(){
        
        System.out.println("\n" + "** Exercice 9 **");
        
        int value = 243;
        
        //Tableaux des valeurs paires de 243 à 0   
        ArrayList<Integer> nbPairs = new ArrayList<>();
        
        for(int i = value ; i >= 0 ; i--){
            if(i%2 == 0){
                nbPairs.add(i);
            }
        }
        
        int indexPair = 1;

        while(value >= 0){

            String message = ""+value;

            if(value%2 == 0){
                
                if(value == 0){
                    message += " paire";
                }else{
                    int valeurAAficher = nbPairs.get(indexPair) + value;
                
                    indexPair++;
                
                    message += " paire (" + valeurAAficher + ")";
                }

            }

            if(value%5 == 0 && value != 0){
                message += " Multiple de 5";
                if(value%3 == 0){
                    message += " VRAI";
                }
            }

            if(value%10 == 0 && value != 0){
                message += " Multiple de 10 (" + (value*2 + 1) + ")";
            }

            System.out.println(message);

            value--;
        }
    }
}
