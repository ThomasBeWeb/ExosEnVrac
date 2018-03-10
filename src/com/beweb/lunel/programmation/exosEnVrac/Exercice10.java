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
public class Exercice10 {
    
    public static void launch(){
        
        System.out.println("\n" + "** Exercice 10 **");
        
        long[] suite = new long[100];
        
        String message = "Suite de Fibonacci: 0, 1";
        
        suite[0] = 0;
        suite[1] = 1;
        
        for(int i = 2 ; i < suite.length ; i++){
            
            suite[i] = suite[i-2] + suite[i-1];
            
            message += ", " + suite[i];
        }
        
        System.out.println(message);
    }
    
}
