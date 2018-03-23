/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.conceptforge.exercicespoo.Exercice05;

import java.util.Scanner;

/**
 *
 * @author renob
 */
public class Exercice05 {
    public static void main(String[] args) {
        int age;
        int taille;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entez un entier entre 0 et 100 à deviner: ");
        age = sc.nextInt();
        taille = sc.nextInt();
        PersonneDescription partie = new PersonneDescription(age, taille);
    }
}
