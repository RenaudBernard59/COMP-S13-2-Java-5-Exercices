/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.conceptforge.exercicespoo.Exercice03;

/**
 *
 * @author renob
 */
public class Sapin {
    private int hauteur;
    String ligne = "*";
    
    public Sapin(int hauteur) {
        this.hauteur = hauteur;
        System.out.println(ligne);
        for (int i = 1; i <= hauteur ; i++) {
            ligne = ligne + " *";
            System.out.println(ligne);
        }//END FOR
                
    }//END Construct

    public int getHauteur() {
        return hauteur;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }
    
    
    
    
    
    
    
    
    
}
