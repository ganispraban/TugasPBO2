/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspbo2;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Data {
    
    public static void main(String[] args) {
      double gaji = 0, hari = 0;
      
      Datadiri dd = new Datadiri();
      
      System.out.println(">> DATA PEGAWAI PT. SANTOSA JAYA <<");
      dd.setNama("Ganis Dwiarum Prabandari");
      dd.setJabatan("General Manager");
      dd.setIdkerja("123180106");
      
      System.out.println("Nama    = " + dd.getNama());
      System.out.println("NIM     = " + dd.getJabatan());
      System.out.println("Kelas   = " + dd.getIdkerja());
      
      String kembali = "y";
      while (kembali.equals("y"))
      {
      Scanner input = new Scanner(System.in);
      System.out.println(" ");
      System.out.println(">> KALKULATOR GAJI PEGAWAI PT. SANTOSA JAYA <<");
      
      System.out.println("PILIHAN MENU");
      System.out.println("1. Gaji Bersih");
      System.out.println("2. Bonus");
      System.out.println("3. Total Gaji Keseluruhan");
      System.out.print("Masukkan Pilihan : ");
      int pilih = input.nextInt();
      System.out.println(" ");

      switch (pilih) {
        case 1:{
            System.out.println("Total Gaji Bersih");
            System.out.print("Hari Kerja        = ");
            hari = input.nextDouble();
            System.out.print("Gaji per Hari     = ");
            gaji = input.nextDouble();    
            Gajinya gajinya = new Gajinya(gaji, hari);
            gajinya.totalgajibersih();
            System.out.println(" "); 
            break;
        }
        case 2: {
            System.out.println("Total Bonus Gaji");
            System.out.print("Hari Kerja    = ");
            hari = input.nextDouble();   
            Gajinya gajinya = new Gajinya(gaji, hari);
            gajinya.totalgajibonus();
            System.out.println(" "); 
            break;
        }
        case 3: {
            System.out.println("Total Keseluruhan Gaji");
            Gajinya gajinya = new Gajinya(gaji, hari);
            gajinya.totalgaji();   
        }  
      }
      System.out.print("Kembali ke menu (y/t)? ");
      kembali = input.next();
      }
    }
}
