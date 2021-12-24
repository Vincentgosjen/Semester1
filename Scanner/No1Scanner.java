/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2161014_vincentgosjen_tugasscanner;

import java.util.Scanner;

/**
 *
 * @author Vincent
 */
public class No1Scanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int tahun, umur; 
    Scanner input = new Scanner (System.in);
    System.out.print("Masukkan Tahun lahir Anda = ");
    tahun = input.nextInt();
    
    umur = 2021 - tahun;
    System.out.println("Umur Anda = "+ umur + " tahun" );
        
    
    }
    
}
