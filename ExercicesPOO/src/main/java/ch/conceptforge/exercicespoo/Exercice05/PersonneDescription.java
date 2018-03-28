/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.conceptforge.exercicespoo.Exercice05;

/**
 *
 * @author renob
 */
public class PersonneDescription {
    private int age;
    private int taille;

    public PersonneDescription(int age, int taille) {
        if (age != 0) {
            if (age > 20 && taille < 100) {
                System.out.println("Vous êtes peut être un nain adulte?");
            } else if (age > 20 && taille > 200) {
                System.out.println("Vous êtes un géant adulte ");
            } else if ( age < 3 || taille < 50) {
                System.out.println("Vous êtes peut être un bébé ");
            } else if ((age >= 15 && age <= 18) && (taille >= 150 && taille <= 180)) {
                System.out.println("Vous êtes un ado !");
            } else {
                System.out.println("Vous êtes Normal quoi !");
            }
        }//END MegaIf
        
    }//END Construct

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }


    
    
}
