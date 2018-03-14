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
public class Exercice13 {
    
    public static void launch() {
        
        //init tableau de String 2D
        String[][] damier = new String[8][8];
        
        for(int i = 0 ; i < damier.length ; i++){ //Pour chaque ligne
            
            for(int j = 0 ; j < damier[0].length ; j++){ //Pour chaque colonne
                
                //Remplissage tableau
                if(i%2 == 0 && j%2 == 0){
                    damier[i][j] = "X";
                }else if(i%2 == 0 && j%2 != 0){
                    damier[i][j] = " ";
                }else if(i%2 != 0 && j%2 == 0){
                    damier[i][j] = " ";
                }else{
                    damier[i][j] = "X";
                }
                
                //Affichage
                if(j == damier[i].length - 1){
                    System.out.println(damier[i][j]);
                }else{
                    System.out.print(damier[i][j]);
                }    
            }
        }
    }
}
    
