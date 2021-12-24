/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2161014_vincentgosjen_tugasscanner;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Vincent
 */
public class No2Scanner {
    public static void main(String[] args) {
    int alas, tinggi; 
    double sisi,luas, keliling;
    Scanner input = new Scanner (System.in);
    System.out.print("Masukkan Alas = ");
    alas = input.nextInt();
    System.out.print("Masukkan Tinggi = ");
    tinggi = input.nextInt();
    //sqrt itu akar dan jangan lupa import static java.lang.Math.sqrt; 
    sisi = sqrt((alas*alas)+(tinggi*tinggi));   
    luas = (alas*tinggi)/2;
    keliling = alas+tinggi+sisi;
    System.out.println("Luas Segitiga = "+ luas);
    System.out.println("Keliling Segitiga = "+ keliling);
    
    }
}
