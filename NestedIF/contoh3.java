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
public class latihan13 {
public static void main(String[] args) {
int angkatan,sks,total,muka,prak;
String jurusan;
System.out.print("Masukkan angkatan anda = ");
Scanner input = new Scanner(System.in);
angkatan = input.nextInt();

if(angkatan<=2018)
{
    System.out.println("Anda membayar Rp5.000.000 paketan 24 sks"); 
}
else if (angkatan>=2019)
{    
System.out.print("Masukkan Jurusan Anda(FTI/FT/FH/FE&FPSI)");
jurusan = input.next();    
    if(jurusan.equalsIgnoreCase("fti"))
    {
        System.out.print("Berapa sks tatap muka = ");
        muka = input.nextInt();
        System.out.print("Berapa sks tatap praktikum = ");
        prak = input.nextInt();
        if(muka+prak<=24)
        {
         total=(muka*100000)+(prak*150000)+2500000;
         System.out.println("Biaya yang anda bayar adalah "+total);           
        }
        else 
        {
            System.out.println("SKS anda melebihi 24");    
        }
    }
    else if(jurusan.equalsIgnoreCase("ft"))
    {
        System.out.print("Berapa sks tatap muka = ");
        muka = input.nextInt();
        System.out.print("Berapa sks tatap praktikum = ");
        prak = input.nextInt();
        if(muka+prak<=24)
        {
         total=(muka*100000)+(prak*150000)+2250000;
         System.out.println("Biaya yang anda bayar adalah "+total);           
        }
        else 
        {
            System.out.println("SKS anda melebihi 24");    
        }
    }
    else if(jurusan.equalsIgnoreCase("fh"))
    {
        System.out.print("Berapa sks tatap muka = ");
        muka = input.nextInt();
        if(muka<=24)
        {
         total=(muka*100000)+2275000;
         System.out.println("Biaya yang anda bayar adalah "+total);           
        }
        else 
        {
            System.out.println("SKS anda melebihi 24");    
        }        
    }
    else if((jurusan.equalsIgnoreCase("fe"))||(jurusan.equalsIgnoreCase("fpsi")))
    {
        System.out.print("Berapa sks tatap muka = ");
        muka = input.nextInt();
        if(muka<=24)
        {
         total=(muka*100000)+2150000;
         System.out.println("Biaya yang anda bayar adalah "+total);           
        }
        else 
        {
            System.out.println("SKS anda melebihi 24");    
        }                
    } 
      
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
    
}
