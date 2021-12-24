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
public class latihan12 {
public static void main(String[] args) {
int makanan;
System.out.println("Toko Makanan" + " Silahkan input angka untuk makanan anda"
        + " 1. Nasi Kuning"+" 2. Nasi goreng"+" 3. Nasi Ikan");
Scanner input = new Scanner(System.in);
makanan = input.nextInt();
switch(makanan){
    case 1:
        System.out.println("Nasi Kuning Seharga Rp12.000");
    break;
    case 2:
        System.out.println("Nasi Goreng Seharga Rp14.000");
    break;
    case 3:
        System.out.println("Nasi Ikan Seharga Rp13.000");
    break;
    default:
        System.out.println("Inputan anda salah");
}
    


























}
   
}
