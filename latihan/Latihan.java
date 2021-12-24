/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

import java.util.Scanner;

/**
 *
 * @author Vincent
 */
public class Latihan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      float kelvin, farenheit, suhu;
      Scanner input = new Scanner(System.in);
      System.out.print("Masukkan suhu = ");
      suhu = input.nextFloat(); 
      
       kelvin = suhu + 273;
       System.out.println("kelvin = "+ kelvin);
       farenheit = (9/5f*suhu) + 32;
        System.out.println("Farenheit = " + farenheit);
        System.out.println("");
        System.out.println("");
        
    }
    
}
