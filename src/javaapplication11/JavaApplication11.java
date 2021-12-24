/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;
import java.util.Scanner;
/**
 *
 * @author Vincent
 */
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //String nama;
    //int tahun;
    //Scanner input = new Scanner (System.in);  
    //System.out.print("Masukkan nama = ");
    //nama = input.nextLine();
    //System.out.print("Masukkan tahun = ");
    //tahun = input.nextInt();
    //System.out.println("======================");
    //System.out.println("Nama = "+ nama);
    //System.out.println("Umur = "+ tahun);
    
    Scanner input = new Scanner (System.in);
    String Nama, Nomorstambuk ;
    int Nilai;
    System.out.print("Masukkan Nama : ");
    Nama = input.nextLine();
    System.out.print("Masukkan Nomor Stambuk : ");
    Nomorstambuk = input.nextLine();
    System.out.print("Masukkan Nilai : ");
    Nilai = input.nextInt();
    if (Nilai>= 80 ){
        System.out.println("Lulus A");
    }else if (Nilai >= 70 ){
        System.out.println("Lulus B");   
    }else if (Nilai >= 60 ){
        System.out.println("Lulus C");
    }else
        System.out.println("Anda tdk lulus");
    System.out.println("==================");
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
