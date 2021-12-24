/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2161014_vincentgosjen_quiz1praktikumalpro;

import java.util.Scanner;

/**
 *
 * @author Vincent
 */
public class quizno2 {
public static void main (String [] args){
int panjang, lebar, Luas, Keliling;
Scanner input = new Scanner(System.in);
System.out.print("Masukkan panjang = ");
panjang = input.nextInt();
System.out.print("Masukkan lebar = ");
lebar = input.nextInt();

Luas = panjang * lebar;
Keliling = (2*panjang) + (2*lebar);

System.out.println("Luas persegi panjang adalah = "+ Luas);
System.out.println("Keliling persegi panjang adalah = "+ Keliling);

     
}
}
