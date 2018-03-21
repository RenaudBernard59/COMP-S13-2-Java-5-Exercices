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
    public Sapin(int hauteur) {
        this.hauteur = hauteur;
       
        System.out.println("Sapin Coller");
               for (int i = 1; i <= (hauteur /2) ; i++) {
            preLine = preLine + " ";
        }//END for
        System.out.println(preFixe + preLine + ligne);
        for (int i = 1; i < hauteur ; i++) {
            preLine = "";
            for (int j = 1; j <= ((hauteur-(i)) /2) ; j++) {
            preLine = preLine + " ";
            }//END for
            ligne = ligne + "**";
            
            System.out.println(preFixe +preLine + ligne);
        }//END FOR
        
        
        
        System.out.println("Sapin ouvert");
        //Preliner

//        for (int i = 1; i <= (hauteur /2) ; i++) {
//            preLine = preLine + " ";
//        }//END for
//        System.out.println(preFixe + preLine + ligne);
//        for (int i = 1; i < hauteur ; i++) {
//            preLine = "";
//            for (int j = 1; j <= ((hauteur-(i*2)) /2) ; j++) {
//            preLine = preLine + " ";
//            }//END for
//                       
//            ligne = ligne + " *";
//            System.out.println(preFixe +preLine + ligne);
//        }//END FOR
                
    }//END Construct

    public int getHauteur() {
        return hauteur;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }
    
    
    
    
    
    
    
    
    
}
