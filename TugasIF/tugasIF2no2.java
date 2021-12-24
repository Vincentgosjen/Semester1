/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2161014_vincentgosjen_tugasif2;

import java.util.Scanner;

/**
 *
 * @author Vincent
 */
public class tugasIF2no2 {
public static void main(String[] args) {
int perangko,surat;
Scanner input = new Scanner (System.in);
System.out.print("Masukkan jumlah lembar surat = ");
surat = input.nextInt();
if (surat>=0 && surat<5){
    System.out.println("Tidak ada perangko");
}else if (surat>=5 && surat<10){
    System.out.println("jumlah perangko = 1");
}else if (surat>=10 && surat<15){
    System.out.println("jumlah perangko = 2");
}else if (surat>=15 && surat<20){
    System.out.println("jumlah perangko = 3");
}else if (surat>=20 && surat<25){
    System.out.println("jumlah perangko = 4");
}else if (surat>=25 && surat<30){
    System.out.println("jumlah perangko = 5");
}else if (surat>=30 && surat<35){
    System.out.println("jumlah perangko = 6");
}else if (surat>=35 && surat<40){
    System.out.println("jumlah perangko = 7");
}else if (surat>=40 && surat<45){
    System.out.println("jumlah perangko = 8");
}else if (surat>=45 && surat<50){
    System.out.println("jumlah perangko = 9");
}else{
    System.out.println("jumlah perangko anda lebih dari 9");
}
    
    


    
    
    
    
    
    
    
    
    
    
    
    
    }
}
