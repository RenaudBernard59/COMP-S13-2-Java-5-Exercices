/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.conceptforge.exercicespoo.Exercice04;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author renob
 */
public class Randomizer {
    private int score = 1;
    private boolean gagner = true;
    private int reponse;
    private int monNombreAdeviner;
    static final Random random = new Random();
    private Scanner sc = new Scanner(System.in);
    private String next;
    
    public Randomizer(int reponse, String next) {
        monNombreAdeviner = random.nextInt(100) + 1;
        System.out.println("Entez un entier entre 0 et 100 à deviner: ");
             while (gagner) {
             if (reponse > monNombreAdeviner) {
                System.out.println("Le nombre est inférieur à çà.");
                score++;
                reponse = sc.nextInt();
             }else if (reponse < monNombreAdeviner) {
                System.out.println("Le nombre est supérieur à çà.");
                score++;
                reponse = sc.nextInt();

             } else {
                 System.out.println("Bravo tu as gagner ! \n Score : " + score);
                 gagner = false;
             }//END ifElse
        }//END while
        
    }//END Construct

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    
    
    public int getReponse() {
        return reponse;
    }

    public void setReponse(int reponse) {
        this.reponse = reponse;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
    
    
    
        
    
    
    
    
    
    
    

}
