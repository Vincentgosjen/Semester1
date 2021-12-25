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
public class latihan10 {
public static void main(String[] args) {
String maskapai,tujuan;
int harga;
Scanner input = new Scanner (System.in);
System.out.println("Pilih Maskapai yang anda ingin (Garuda/Lion/Sriwijaya)");
maskapai = input.nextLine();
if(maskapai.equalsIgnoreCase("Garuda"))
{
    System.out.println("Pilih Tujuan anda(Jakarta/Surabaya/Bali)");
    tujuan = input.nextLine();
    if(tujuan.equalsIgnoreCase("Jakarta"))
    {
        harga = 1200000;
        System.out.println("Harga yang perlu anda bayar adalah = "+harga);
    }
    else if(tujuan.equalsIgnoreCase("Surabaya"))
    {
        harga = 600000;
        System.out.println("Harga yang perlu anda bayar adalah = "+harga);    
    }
    else if(tujuan.equalsIgnoreCase("Bali"))
    {
       harga = 800000;
       System.out.println("Harga yang perlu anda bayar adalah = "+harga); 
    }   
}
else if(maskapai.equalsIgnoreCase("Lion"))
{
    System.out.println("Pilih Tujuan anda(Jakarta/Surabaya/Bali)");
    tujuan = input.nextLine();
    if(tujuan.equalsIgnoreCase("Jakarta"))
    {
        harga = 800000;
        System.out.println("Harga yang perlu anda bayar adalah = "+harga);
    }
    else if(tujuan.equalsIgnoreCase("Surabaya"))
    {
        harga = 400000;
        System.out.println("Harga yang perlu anda bayar adalah = "+harga);    
    }
    else if(tujuan.equalsIgnoreCase("Bali"))
    {
       harga = 600000;
       System.out.println("Harga yang perlu anda bayar adalah = "+harga); 
    }       
}
else if(maskapai.equalsIgnoreCase("Sriwijaya"))
{
    System.out.println("Pilih Tujuan anda(Jakarta/Surabaya/Bali)");
    tujuan = input.nextLine();
    if(tujuan.equalsIgnoreCase("Jakarta"))
    {
        harga = 700000;
        System.out.println("Harga yang perlu anda bayar adalah = "+harga);
    }
    else if(tujuan.equalsIgnoreCase("Surabaya"))
    {
        harga = 420000;
        System.out.println("Harga yang perlu anda bayar adalah = "+harga);    
    }
    else if(tujuan.equalsIgnoreCase("Bali"))
    {
       harga = 550000;
       System.out.println("Harga yang perlu anda bayar adalah = "+harga); 
    }           
}
    

}
   
}
