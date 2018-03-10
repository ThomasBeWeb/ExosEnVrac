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
public class Exercice8 {
    
    public static void launch(){
        
        System.out.println("\n" + "** Exercice 8 **");
        
        int value = 243;

        while(value >= 0){

            String message = ""+value;

            if(value%2 == 0 && value != 0){
                message += " paire";
            }

            if(value%5 == 0 && value != 0){
                message += " Multiple de 5";
            }

            if(value%10 == 0 && value != 0){
                message += " Multiple de 10";
            }

            System.out.println(message);

            value--;
        }
    }
}
