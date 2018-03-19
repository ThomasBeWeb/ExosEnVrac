/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beweb.lunel.programmation.exosEnVrac.poo;

import com.beweb.lunel.programmation.exosEnVrac.poo.exercice3.Tictactoe;
import java.util.ArrayList;

/**
 *
 * @author cantinelli
 */
public class ObjetsMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        //Exercice1
//        
//        Personne toto = new Personne("toto","Dupont","homme",25,1.85f,"Bleu","noir","En couple","facteur","0688899091");
//        Personne titi = new Personne("titi","Dupont","femme",26,1.75f,"vert","blond","En couple","Agent immobilier","0612131415");
//        
//        //Exercice2
//        
//        //creation des joueurs
//        Joueur joueur1 = new Joueur("Bali");
//        Joueur joueur2 = new Joueur("Balo");
//        
//        //Varaiables contenant la somme de chaque liste
//        int sum1 = 0;
//        int sum2 = 0;
//        
//        for(int i = 0 ; i < 10 ; i++){
//            joueur1.jet();
//            sum1 += joueur1.liste.get(i);
//            joueur2.jet();
//            sum2 += joueur2.liste.get(i);
//        }
//        
//        System.out.println("Le joueur " + joueur1.nom + " a tiré les valeurs: \n" + resultat(joueur1.liste));
//        System.out.println("Le joueur " + joueur2.nom + " a tiré les valeurs: \n" + resultat(joueur2.liste));
//        System.out.println(joueur1.nom + " (" + sum1 + " pts) VS " + joueur2.nom + " (" + sum2 + " pts)");
//        if(sum1 == sum2){
//            System.out.println("Match nul");
//        }else if(sum1 > sum2){
//            System.out.println(joueur1.nom + " a gagné");
//        }else{
//            System.out.println(joueur2.nom + " a gagné");
//        }
        
        //Exercice3
        
        //Situation 1:
//        Tictactoe partie1 = new Tictactoe();
        
//        String[][] listeDur = {{"X","O","X"},{"X","X","O"},{"O","X","X"}};
//        
//        for(int i = 0 ; i < listeDur.length ; i++){
//            for(int j = 0 ; j < listeDur[0].length ; j++){
//                partie1.tableau[i][j] = listeDur[i][j];
//            }
//        }
        
//        partie1.jeu1();
        
//        //Situation 2
//        
//        Tictactoe partie2 = new Tictactoe();
//        
//        partie2.jeu2();

        //Situation 3
        
        Tictactoe partie3 = new Tictactoe();
        
        partie3.jeu3();
    }
    
    public static String resultat(ArrayList<Integer> liste){
        
        String result = "";
        
        for(int i = 0 ; i < liste.size() ; i++){
            
            if(i == liste.size() - 1){  
                result += liste.get(i);
            }else{
                result += liste.get(i) + " | ";
            }
        }
        
        return result;
    }
    
}
