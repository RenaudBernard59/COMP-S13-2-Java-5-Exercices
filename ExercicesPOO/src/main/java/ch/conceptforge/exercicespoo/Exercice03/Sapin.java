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
    String preLine = "";
    String preFixe = "          ";
    int ligneLength;
    public Sapin(int hauteur) {
        this.hauteur = hauteur;
        ////////////////////////////////////////////////////////
        System.out.println("Sapin Coller");
        System.out.println(preFixe + preLine + ligne);
        for (int i = 1; i < hauteur ; i++) {
            ligne = ligne + "**";
            ligneLength = ligne.length()/2;
            System.out.println(preFixe +preLine + ligne);
        }//END FOR
        ////////////////////////////////////////////////////////
        System.out.println("Sapin ouvert");
        ligne = "*";
        System.out.println(preFixe + preLine + ligne);
        for (int i = 1; i < hauteur ; i++) {
            preLine = "";
            
            ligne = ligne + " *";
            System.out.println(preFixe +preLine + ligne);
        }//END FOR
        ////////////////////////////////////////////////////////
        System.out.println("Sapin horizontal");
        
        
        
        
        
        
    }//END Construct

    public int getHauteur() {
        return hauteur;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }
    
    
    
    
    
    
    
    
    
}
