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

//La valeur de la variable entière est -2 quand on commence l'alogoritme avec flag = true

public class Exercice4 {
    
    public static void launch(){
        
        //Si la variable flag est seulement déclarée et pas initialisée, il y aura un message d'erreur
        boolean flag = true;
        int tutu = 0;
        
        if(flag == false){
            tutu++;
        }
        
        if(flag == true){
            tutu--;
        }
        
        flag = !flag;
        
        if(flag == true){
            tutu++;
        }
        
        if(flag == false){
            tutu--;
        }
    }
    
}
