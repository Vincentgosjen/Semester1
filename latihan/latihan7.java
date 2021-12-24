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
public class latihan7 {
public static void main(String[] args) {
//program mengecek tilang atau nda
String nama,sim,ktp;
System.out.println("Masukkan nama anda = ");
Scanner input = new Scanner (System.in);
nama = input.nextLine();
System.out.println("Apakah anda mempunytai SIM?(ya/tdk)");
sim = input.nextLine();
if (sim.equalsIgnoreCase("ya")){
    System.out.println("Apakah anda mempunyai KTP?(ya/tdk)");
    ktp = input.nextLine();
    if (ktp.equalsIgnoreCase("ya")){
        System.out.println("Silahkan");
    }else{
    System.out.println("Anda ditilang");
    }
    
}else{
    System.out.println("anda ditilang");
}

    
    
    
    
    
    
    
    
    
    
    
    
}
    
}
