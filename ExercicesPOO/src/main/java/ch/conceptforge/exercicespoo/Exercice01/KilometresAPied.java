/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.conceptforge.exercicespoo.Exercice01;

/**
 *
 * @author renob
 */
public class KilometresAPied {
//    1 kilomètre à pied, ça use, ça use,
//    1 kilomètre à pied ça use les souliers.
//    2 kilomètres à pied, ça use, ça use,
//    2 kilomètres à pied ça use les souliers. 
    private String kilom = " kilomètre à pied, ça use";
    private String kiloms = " kilomètres à pied, ça use";
    private String caUse = ", ça use,\n";
    private String souliers = " les souliers.\n";
    private int i;

    public KilometresAPied(int i) {
        this.i = i;
        for (i = 1; i <= 15 ; i++) {
            if (i == 1) {
            System.out.println(i + kilom + caUse + i + kilom + souliers);
            } else {
            System.out.println(i + kiloms + caUse + i + kiloms + souliers);
            }
        }//END For
               
    }//END Constructor

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}