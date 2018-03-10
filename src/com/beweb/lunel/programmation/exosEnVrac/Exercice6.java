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
public class Exercice6 {
    
        public static void launch(){
            
            System.out.println("\n" + "** Exercice 6 **");
            
            boolean[] tableau = new boolean[10];
            
            int i = 0;
            
            while(i < tableau.length){
                tableau[i] = true;
                i++;
            }
            
            i = 0;
            
            while(i < tableau.length){
                tableau[i] = false;
                i++;
            }
            
            i = 0;
            
            while(i < tableau.length){
                if(i == 0 || tableau[i-1] == true){
                    tableau[i] = false;
                }else{
                    tableau[i] = true;
                }
                i++;
            }
            
            String message = "tableau: ";
            
            i = 0;
            
            while(i < tableau.length){
                message += tableau[i] + ", ";
                i++;
            }
            
            System.out.println(message);
    }
}
