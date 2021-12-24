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
public class latihan6 {
public static void main(String[] args) {
String nama;
int umur;
Scanner input = new Scanner (System.in);
System.out.print("Masukkan nama anda = ");
nama = input.nextLine();
System.out.print("Masukkan umur anda = ");
umur = input.nextInt();
if(umur>=60){
    System.out.println("Tuan "+nama+", apakah anda sudah pensiun?");
}else if (umur<60 && umur>=25){
    System.out.println("Saudara "+nama+", apakah anda masih aktif bekerja?");
}else if (umur<25 && umur>0){
    System.out.println("Adik "+nama+", apakah anda masih sekolah?");
}else{
    System.out.println("Inputan anda salah");
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
   
}
