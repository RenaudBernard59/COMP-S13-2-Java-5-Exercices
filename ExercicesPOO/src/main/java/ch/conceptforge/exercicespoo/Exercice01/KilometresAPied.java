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
    private String caUse = ", ça use,\n";
    private String souliers = " les souliers.\n";
    private int i;

    public KilometresAPied(int i) {
        this.i = i;
        for (i = 1; i <= 15 ; i++) {
            System.out.println(i + kilom + caUse + i + kilom + souliers);
        
        }//END For
    }
        

    public String getKilom() {
        return kilom;
    }

    public void setKilom(String kilom) {
        this.kilom = kilom;
    }

    public String getCaUse() {
        return caUse;
    }

    public void setCaUse(String caUse) {
        this.caUse = caUse;
    }

    public String getSouliers() {
        return souliers;
    }

    public void setSouliers(String souliers) {
        this.souliers = souliers;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
        
        
        
        
}
