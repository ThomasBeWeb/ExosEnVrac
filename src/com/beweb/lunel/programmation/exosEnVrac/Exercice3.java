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
public class Exercice3 {
    
    public static void launch(){
        
        System.out.println("\n" + "** Exercice 3 **");
        
        //Si la variable flag est seulement déclarée et pas initialisée, il y aura un message d'erreur
        boolean flag = true;
        
        if(flag){
            System.out.println("Allumé");
        }else{
            System.out.println("Eteint");
        }
    }
    
}
