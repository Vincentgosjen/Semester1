/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2161014_vincentgosjen_quiz2praktikumalpro;

import java.util.Scanner;

/**
 *
 * @author Vincent
 */
public class No3Quiz2 {
    public static void main(String[] args) {
    int A,B,C;   
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan nilai B = ");
    B = input.nextInt();
    System.out.print("Masukkan nilai C = ");
    C = input.nextInt();    
    A = (B-C)*(B+C);
    System.out.println("Maka nilai A adalah = " +A);
        
             
    }
    
    
    
    
    
}
