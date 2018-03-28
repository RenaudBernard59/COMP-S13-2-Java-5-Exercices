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
    public static void main(String[] args) {
        int reponse;
        String next = "N";
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Entez un entier entre 0 et 100 à deviner: ");
        reponse = scan.nextInt();
        Randomizer partie = new Randomizer(reponse, next);
       // String continue = scan.next();
        System.out.println("Rejouer Y|N");
        next = (String) scan.next();
        if (next == "Yes") {
            Randomizer Newpartie = new Randomizer(reponse, next);
        } else {
            System.out.println("merci d'avoir jouer");
        }
       
        }
}