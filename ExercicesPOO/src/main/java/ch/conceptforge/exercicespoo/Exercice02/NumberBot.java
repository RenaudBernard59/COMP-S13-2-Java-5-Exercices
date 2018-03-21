/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.conceptforge.exercicespoo.Exercice02;

import java.util.Scanner;

/**
 *
 * @author renob
 */
public class NumberBot {
    private String askInt = "Entrez un Entier : ";
    private String askReal = "Entrez un Réel : ";
    private String saidSomme = "La somme est : ";
    private String saidMoy = "La moyenne est : ";
    private int unEntier;
    private float unReal;
    private float maSomme;
    private float maMoy;

    public NumberBot() {
        Scanner sc = new Scanner(System.in);
                        
        System.out.println(askInt);
        unEntier = sc.nextInt();
        System.out.println(askReal);
        unReal = sc.nextFloat();
        
        maSomme = unEntier + unReal;
        maMoy = maSomme / 2;
        
        
        System.out.println(saidSomme + maSomme +"\n"+ saidMoy + maMoy);
        
        
        
        
    }//END construct

    public float getMaSomme() {
        return maSomme;
    }

    public void setMaSomme(float maSomme) {
        this.maSomme = maSomme;
    }

    public float getMaMoy() {
        return maMoy;
    }

    public void setMaMoy(float maMoy) {
        this.maMoy = maMoy;
    }

    public int getUnEntier() {
        return unEntier;
    }

    public void setUnEntier(int unEntier) {
        this.unEntier = unEntier;
    }

    public float getUnReal() {
        return unReal;
    }

    public void setUnReal(float unReal) {
        this.unReal = unReal;
    }
            
      
            
}
