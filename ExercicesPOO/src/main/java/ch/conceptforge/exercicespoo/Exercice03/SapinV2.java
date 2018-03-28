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
public class SapinV2 {
    private int hauteur;
    String ligne = "*";
    String preLine = "";
    String preFixe = "          ";
    int ligneLength;
    int bt = (hauteur*2)-1;
    int i;
    int bn = (i*2)-1;
    
    
         
    public SapinV2(int hauteur) {
        this.hauteur = hauteur;
        ////////////////////////////////////////////////////////
        System.out.println("Sapin Coller");
        System.out.println(preFixe + preLine + ligne);
        for (int i = 1; i <= hauteur ; i++) {
            
            for (int j = 1 ; j<=(bt-bn)/2 ; j++) {
                preLine = preLine + " ";

            }
            ligne = ligne + "**";
                    
            System.out.println(preFixe +preLine + ligne);
        }//END FOR
        ////////////////////////////////////////////////////////
        System.out.println("Sapin ouvert");
//        ligne = "*";
//        System.out.println(preFixe + preLine + ligne);
//        for (int i = 1; i < hauteur ; i++) {
//            preLine = "";
//            
//            ligne = ligne + " *";
//            System.out.println(preFixe +preLine + ligne);
//        }//END FOR
//        ////////////////////////////////////////////////////////
//        System.out.println("Sapin horizontal");
//        ligne = "";
//        for (int i = 1; i <= hauteur ; i++) {
//            preLine = "";
//            
//            ligne = ligne + "*";
//            System.out.println(preFixe +preLine + ligne);
//        }//END FOR
//        
//        for (int j = hauteur; j > 0 ; j--) {
//            preLine = "";
//            ligne = "";
//                for (int i = 1; i < j ; i++) {
//                ligne = ligne + "*";
//                }//END FOR
////            System.out.println(preFixe +preLine + ligne);
//        }//END FOR
    }//END Construct

    public int getHauteur() {
        return hauteur;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }
    
    
    
    
    
    
    
    
    
}
