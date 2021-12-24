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
public class latihan4 {
public static void main(String[] args) {
int sisi1,sisi2,sisi3;
Scanner input = new Scanner(System.in);
System.out.print("Masukkan sisi pertama = ");
sisi1 = input.nextInt();
System.out.print("Masukkan sisi kedua = ");
sisi2 = input.nextInt();
System.out.print("Masukkan sisi ketiga = ");
sisi3 = input.nextInt();       
 
if(sisi1==sisi2&&sisi2==sisi3){
    System.out.println("Segitiga sama sisi");
}else if(sisi1==sisi2||sisi2==sisi3||sisi1==sisi3){
    System.out.println("Segitiga sama kaki");
}else{
    System.out.println("Semua sisi berbeda");
}
       








        
        
        
        
        
    }











    
}
