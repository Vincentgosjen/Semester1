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
public class tugasIF2no1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int harga1,harga2,harga3,total;
    double diskon;
    Scanner input = new Scanner (System.in);
    System.out.print("Masukkan Harga-1 = ");
    harga1 = input.nextInt();
    System.out.print("Masukkan Harga-2 = ");
    harga2 = input.nextInt();
    System.out.print("Masukkan Harga-3 = ");
    harga3 = input.nextInt();
    total = harga1+harga2+harga3;
    System.out.println("Totalnya adalah = "+ total);
    if(total>=250000){
      diskon = total*0.15;
      System.out.println("Anda mendapatkan potongan harga sebesar = "+ diskon);
    }else{
        System.out.println("Anda tidak mendapatkan potongan harga");
    }        
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
    }
    
}
