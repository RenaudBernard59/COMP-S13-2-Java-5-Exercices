/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.conceptforge.exercicespoo.Exercice04;

import java.util.Scanner;

/**
 *
 * @author renob
 */
public class Exercice04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entez un entier entre 0 et 100 à deviner: ");
        int valeur = sc.nextInt();
        int score = 1;
        boolean gagner = true;
        int reponse;
        while (gagner) {
            Randomizer monBeauSapin = new Randomizer();
            reponse = sc.nextInt();
                    
            score++;
        }
    
}
}