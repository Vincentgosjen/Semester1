/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2161014_vincentgosjen_tugasif1;

import java.util.Scanner;

/**
 *
 * @author Vincent
 */
public class no1tugas1if {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int angka;
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan angka = ");
    angka = input.nextInt();    
    if(angka%2==0)
    {
        System.out.println(angka + " adalah bilangan genap");
    }
    else
    {
        System.out.println(angka + " adalah bilangan ganjil");
    }


    
  }
}