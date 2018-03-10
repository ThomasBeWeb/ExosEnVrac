/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beweb.lunel.programmation.exosEnVrac.poo.exercice1;

/**
 *
 * @author cantinelli
 */
public class Personne {
    //Prenom
    String prenom;
    
    //Nom
    String nom;
    
    //Sexe
    String sexe;
    
    //Age
    int age;
    
    //Taille en m
    float taille;
    
    //Couleur yeux
    String eyesColor;
    
    //Couleur cheveux
    String hairColor;
    
    //Statut(en couple, célibataire,etc...)
    String statut;
    
    //Profession
    String metier;
    
    //Telephone
    String mobile;
    
    Personne(){
        
    }
    
    public Personne(String prenom, String nom, String sexe, int age, float taille, String eyesColor, String hairColor, String statut, String metier, String mobile){
        
        this.prenom = prenom;
        this.nom = nom;
        this.sexe = sexe;
        this.age = age;
        this.taille = taille;
        this.eyesColor = eyesColor;
        this.hairColor = hairColor;
        this.statut = statut;
        this.metier = metier;
        this.mobile = mobile;
    }
}
