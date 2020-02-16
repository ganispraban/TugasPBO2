/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspbo2;

/**
 *
 * @author ASUS
 */
public class Gaji {
    protected double gaji, hari;
    
    public Gaji(double g, double h) {
       gaji = g;
       hari = h;
    }
    protected double TotalGajiBersih(){
        return 0;
    }
    protected double TotalGajiBonus(){
        return 0;
    }
    protected double TotalGaji(){
        return 0;
    }
    public void totalgajibersih(){
        System.out.println("Gaji Bersih  = " + TotalGajiBersih());
    }
    public void totalgajibonus(){
        System.out.println("Gaji Bonus  = " + TotalGajiBonus());
    }
    public void totalgaji(){
        System.out.println("Gaji Keseluruhan  = " + TotalGaji());
   }
    
}
