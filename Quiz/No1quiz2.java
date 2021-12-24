/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2161014_vincentgosjen_quiz2praktikumalpro;

import java.util.Scanner;



/**
 *
 * @author Vincent
 */
public class No1quiz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double rupiah,dolar,euro;
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan Rupiah = ");
    rupiah = input.nextDouble();
    dolar = rupiah/14508;
    euro = rupiah/17064;
    System.out.println("Hasil Kurs Dollar = "+ dolar);
    System.out.println("Hasil Kurs Euro = "+ euro);
    
    
    
    
 
    
    }
    
}
