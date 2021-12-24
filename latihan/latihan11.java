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
public class latihan11 {
public static void main(String[] args) {
String printer,ukuran;
int lembar,harga,total;
System.out.println("Selamat datang di toko kami");
Scanner input = new Scanner(System.in);
System.out.print("Ingin print hitam/warna/gambar? ");
printer = input.nextLine();
if (printer.equalsIgnoreCase("hitam"))
{
    System.out.print("Ingin ukuran berapa?(A4/F4) ");
    ukuran = input.nextLine();
    if (ukuran.equalsIgnoreCase("A4"))
    {
        System.out.print("Berapa lembar?? ");
        lembar = input.nextInt();
        if (lembar<=50)
        {
            harga = 1000;
            total = lembar*harga;
            System.out.println("yang perlu anda bayar adalah = "+total);
        }
        else if (lembar>50)
        {
        harga = 750;
        total = lembar*harga;
        System.out.println("yang perlu anda bayar adalah = "+total);
        }
    }
    else if (ukuran.equalsIgnoreCase("F4"))
    {
        System.out.print("Berapa lembar?? ");
        lembar = input.nextInt();
        if (lembar<=50)
        {
            harga = 1250;
            total = lembar*harga;
            System.out.println("yang perlu anda bayar adalah = "+total);
        }
        else if (lembar>50)
        {
        harga = 1000;
        total = lembar*harga;
        System.out.println("yang perlu anda bayar adalah = "+total);
        }    
    }        
}
else if (printer.equalsIgnoreCase("warna"))
{
    System.out.print("Ingin ukuran berapa?(A4/F4) ");
    ukuran = input.nextLine();
    if (ukuran.equalsIgnoreCase("A4"))
    {
        System.out.print("Berapa lembar?? ");
        lembar = input.nextInt();
        if (lembar<=30)
        {
            harga = 1500;
            total = lembar*harga;
            System.out.println("yang perlu anda bayar adalah = "+total);
        }
        else if (lembar>30)
        {
        harga = 1100;
        total = lembar*harga;
        System.out.println("yang perlu anda bayar adalah = "+total);
        }    
    }
    else if (ukuran.equalsIgnoreCase("F4"))
    {
    System.out.print("Berapa lembar?? ");
        lembar = input.nextInt();
        if (lembar<=30)
        {
            harga = 1750;
            total = lembar*harga;
            System.out.println("yang perlu anda bayar adalah = "+total);
        }
        else if (lembar>30)
        {
        harga = 1550;
        total = lembar*harga;
        System.out.println("yang perlu anda bayar adalah = "+total);
        }    
    }        
}
else if (printer.equalsIgnoreCase("gambar"))
{
    System.out.print("Ingin ukuran berapa?(A4/F4) ");
    ukuran = input.nextLine();
    if (ukuran.equalsIgnoreCase("A4"))
    {
        System.out.print("Berapa lembar?? ");
        lembar = input.nextInt();
        if (lembar<=20)
        {
            harga = 2000;
            total = lembar*harga;
            System.out.println("yang perlu anda bayar adalah = "+total);
        }
        else if (lembar>20)
        {
        harga = 1700;
        total = lembar*harga;
        System.out.println("yang perlu anda bayar adalah = "+total);
        }
    }
    else if (ukuran.equalsIgnoreCase("F4"))
    {
    System.out.print("Berapa lembar?? ");
        lembar = input.nextInt();
        if (lembar<=20)
        {
            harga = 2250;
            total = lembar*harga;
            System.out.println("yang perlu anda bayar adalah = "+total);
        }
        else if (lembar>20)
        {
        harga = 2100;
        total = lembar*harga;
        System.out.println("yang perlu anda bayar adalah = "+total);
        }    
    } 
}



}    
}
