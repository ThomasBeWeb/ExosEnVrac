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
public class Exercice14 {
    
    public static void launch() {
        
        //Liste des choix
        String[] choix = {"caillou", "papier", "ciseaux"};
        
        //Initialisation 2 joueurs 
        int player1 = 0;
        int player2 = 0;
        
        boolean victoire = false;
        String gagnant = "";
        
        while(victoire == false){
            
            player1 = ((int) Math.floor(Math.random() * 3)) + 1;
            player2 = ((int) Math.floor(Math.random() * 3)) + 1;
            
            if(player1 == 1){
                
                if(player2 == 2){
                    gagnant = "player2";
                    victoire = true;
                }else if(player2 == 3){
                    gagnant = "player1";
                    victoire = true;
                }
            }else if(player1 == 2){
                
                if(player2 == 1){
                    gagnant = "player2";
                    victoire = true;
                }else if(player2 == 3){
                    gagnant = "player1";
                    victoire = true;
                }
            }else if(player1 == 3){
                
                if(player2 == 1){
                    gagnant = "player2";
                    victoire = true;
                }else if(player2 == 2){
                    gagnant = "player1";
                    victoire = true;
                }
            }
        }
        
        System.out.println("Player1: " + choix[player1 - 1] + " VS Player2: " + choix[player2 - 1]);
        System.out.println("Le gagnant est " + gagnant);
    }
    
}
