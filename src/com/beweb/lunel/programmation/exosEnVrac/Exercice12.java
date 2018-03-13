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
public class Exercice12 {
    
        public static void launch(){
            
            //Initialisation du tableau
            int[] tableau = new int[10];
            
            int somme = 0;
            int max = 0;
            int mini = 0;
            
            String message = "Les valeurs du tableau sont: ";
            
            //Creation de 10 int aleatoires ajoutés au tableau et calculs
            for(int i = 0 ; i < tableau.length ; i++){
                
                int value = (int) Math.floor(Math.random() * 100);
                
                tableau[i] = value;
                
                if(i == 0){
                    mini = value;
                }else if(value < mini){
                    mini = value;
                }
                
                somme += value;
                
                if(value > max){
                    max = value;
                }
                
                if(i == tableau.length - 1){
                    message += value;
                }else{
                    message += value + " | ";
                }
                 
            }
 
            //Calcul moyenne
            double moyenne = somme / tableau.length;
            
            //Affichage des valeurs
            System.out.println(message);
            System.out.println("La somme = " + somme);
            System.out.println("La moyenne = " + moyenne);
            System.out.println("La valeur max est: " + max);
            System.out.println("La valeur mini est: " + mini);
    }
}
