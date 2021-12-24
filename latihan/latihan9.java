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
public class latihan9 {
public static void main(String[] args) {
int harga1,harga2,harga3,harga4;
float total,totalFix,diskon;
Scanner input = new Scanner(System.in);
System.out.print("Masukkan Harga pertama = ");
harga1 = input.nextInt();
System.out.print("Masukkan Harga kedua = ");
harga2 = input.nextInt();
System.out.print("Masukkan Harga ketiga = ");
harga3 = input.nextInt();
System.out.print("Masukkan Harga keempat = ");
harga4 = input.nextInt();

total = harga1+harga2+harga3+harga4;
if(total>=500000){
    diskon = (30/100)*total;
    totalFix = total-diskon;
    System.out.println("anda mendapatkan diskon 30%");
    System.out.println("yang harus anda bayar adalah = "+totalFix);
}else if (total<500000&&total>=300000){
    diskon = (20/100)*total;
    totalFix = total-diskon;
    System.out.println("anda mendapatkan diskon 20%");
    System.out.println("yang harus anda bayar adalah = "+totalFix);
}else if (total<300000&&total>=150000){
    diskon = (10/100)*total;
    totalFix = total-diskon;
    System.out.println("anda mendapatkan diskon 10%");
    System.out.println("yang harus anda bayar adalah = "+totalFix);
}else{
    System.out.println("anda tidak mendapat potongan harga");
    System.out.println("yang harus anda bayar adalah = "+total);
}    
    
    














    
}
    
}
