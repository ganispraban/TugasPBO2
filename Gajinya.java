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
public class Gajinya extends Gaji {
    public Gajinya(double gaji, double hari) {
        super(gaji, hari);
    }
    @Override
    protected double TotalGajiBersih(){
      return (gaji*hari);
    }
    @Override
    protected double TotalGajiBonus(){
        return (hari*5000);
    }
    @Override
    protected double TotalGaji(){
        return ((gaji*hari)+(hari*5000));
    }  
}
