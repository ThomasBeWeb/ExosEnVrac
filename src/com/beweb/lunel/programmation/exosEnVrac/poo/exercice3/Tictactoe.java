/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beweb.lunel.programmation.exosEnVrac.poo.exercice3;

import java.util.Scanner;

/**
 *
 * @author cantinelli
 */
public class Tictactoe {
    
    //Proprietes
    public String[][] tableau;
    public String joueur1;
    public String joueur2;
    
    //Constructeur
    public Tictactoe(){
        
        tableau = new String[3][3];
        joueur1 = "X";
        joueur2 = "O";
    }
    
    //Methodes
    
    public void afficherJeu(){
        System.out.println("");
        System.out.println("-----");
        
        for(int i = 0 ; i < this.tableau.length ; i++){
            for(int j = 0 ; j < this.tableau[i].length ; j++){
                
                String value = this.tableau[i][j];
                
                if(value == null){
                    value = " ";
                }
                
                if(j == 0){
                    System.out.print("|" + value);
                }
                else if(j == this.tableau[i].length - 1){
                    System.out.println(value + "|");
                }else{
                    System.out.print(value);
                }    
            }
        }
        
        System.out.println("-----");
    }
    
    public boolean insererCroix(int x, int y){
        
        boolean result = bonnePosition(x,y);
        
        if(result){
            this.tableau[x][y] = "X";
        }
        
        return result;
    }
    public boolean insererRond(int x,int y){
        
        boolean result = bonnePosition(x,y);
        
        if(result){
            this.tableau[x][y] = "O";
        }  
        
        return result;
    }
    
    public void randomInsert(String joueur){
        
        boolean flag = false;
        
        while(flag == false){
            
            int x = (int) (Math.random() * 3);
            int y = (int) (Math.random() * 3);
            
            flag = bonnePosition(x,y);
            
            if(flag && joueur == "X"){
                this.insererCroix(x,y);
            }else if(flag && joueur == "O"){
                this.insererRond(x,y);
            }
        }
        
    }
    
    private boolean bonnePosition(int x, int y){
        
        boolean result = true;
        
        if(x < 0 || x > 2 || y < 0 || y > 2 ){
            result = false;
        }else if(this.tableau[x][y] != null){
            result = false;
        }
        
        return result;
    }
    
    //Renvoi false si un joueur aligne 3 signes (index 0 du tableau) et vérifie si le tableau est plein (index 1)
    private boolean[] finDeLaPartie(){
        
        boolean[] finTableau = {true,true};
        
        //Verif ligne par ligne
        for(String[] ligne : this.tableau){
            
            if(ligne[0] == ligne[1] && ligne[1] == ligne[2] && ligne[0] != null){
                finTableau[0] = false;
            }
        }
        
        //Verif col par col
        for(int i = 0; i < this.tableau.length ; i++){
            if(this.tableau[0][i] == this.tableau[1][i] && this.tableau[1][i] == this.tableau[2][i] && this.tableau[0][i] != null){
                finTableau[0] = false;
            }
        }
        
        //Verif en diagonales
        if(this.tableau[0][0] == this.tableau[1][1] && this.tableau[1][1] == this.tableau[2][2] && this.tableau[0][0] != null){
            finTableau[0] = false;
        }
        
        if(this.tableau[0][2] == this.tableau[1][1] && this.tableau[1][1] == this.tableau[2][0] && this.tableau[0][2] != null){
            finTableau[0] = false;
        }
        
        //Verif si tableau est plein, en comptant le nombre de null
        int nbNull = 0;
        
        for(int i = 0 ; i < this.tableau.length ; i++){
            for(int j = 0 ; j < this.tableau[i].length ; j++){
                
                if(this.tableau[i][j] == null){
                    nbNull++;
                }
            }
        }
        
        if(nbNull == 0){
            finTableau[1] = false;
        }
 
        return finTableau;
    }
    
    //Déterminer qui commence
    private boolean pileOuFace(){
        
        boolean result = false;
        
        if(Math.random() > 0.5){
            result = true;
        }
        
        return result;
    }
    
    //Situation1: tableau des cases prédifini
    public void jeu1(){
        afficherJeu();
        
        boolean[] resultats = finDeLaPartie();
        
        if(resultats[0]){
            System.out.println("Il n'y a pas de gagnant");
        }else{
            System.out.println("Il y a un gagnant");
        }
    }
    
    //Situation 2: tirage aléatoire
    
    public void jeu2(){
        
        boolean flag = false;
        
        //Qui debute
        boolean tour = pileOuFace();
        
        while(flag == false){
            
            if(tour){ //Tour de joueur1   
                randomInsert(this.joueur1);
                tour = !tour;
            }else{
                randomInsert(this.joueur2);
                tour = !tour;
            }
            
            boolean[] resultats = finDeLaPartie();
        
            if(resultats[0] == false || resultats[1] == false){
                flag = true;
            }
        }
        
        afficherJeu();
        
    }
    
    //Situation 3: Choix de la position tour à tour
    public void jeu3(){

        Scanner scanner = new Scanner(System.in);

        boolean flag = false;

        //Qui debute
        boolean tour = pileOuFace();

        while(flag == false){

            int x = 0;
            int y = 0;

            boolean flag2 = false;

            while(flag2 == false){
                if(tour){
                    System.out.println("Joueur1, choisissez une position en x");
                }else{
                    System.out.println("Joueur2, choisissez une position en x");
                }

                if(scanner.hasNext()){
                    x = scanner.nextInt();
                }

                if(tour){
                    System.out.println("Joueur1, choisissez une position en y");
                }else{
                    System.out.println("Joueur2, choisissez une position en y");
                }

                if(scanner.hasNext()){
                    y = scanner.nextInt();
                }

                if(tour){ //Tour de joueur1   
                    flag2 = insererCroix(x,y);
                }else{
                    flag2 = insererRond(x,y);
                }

                if(flag2){
                    tour = !tour;
                }
            }

            afficherJeu();

            boolean[] resultats = finDeLaPartie();

            if(resultats[0] == false || resultats[1] == false){
                flag = true;
            }
        }
        
        scanner.close();
    }
}
