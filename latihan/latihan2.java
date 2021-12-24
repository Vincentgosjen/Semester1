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
public class latihan2 {
public static void main (String [] args){    
int a,b,c;
Scanner input = new Scanner(System.in);
System.out.print("Masukkan bilangan pertama = ");
a = input.nextInt();
System.out.print("Masukkan bilangan kedua = ");
b = input.nextInt();
System.out.print("Masukkan bilangan ketiga = ");  
c = input.nextInt();
  
if (a>b && a>c){
    System.out.println(a + " adalah bilangan terbesar");
}else if(b>a && b>c){
    System.out.println(b + " adalah bilangan terbesar");
}else {
    System.out.println(c + " adalah bilangan terbesar");
}        
        
        
        
        
        
   


















    }
       
}
