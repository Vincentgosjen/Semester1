/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2161014_vincentgosjen_tugasif1;

import java.util.Scanner;

/**
 *
 * @author Vincent
 */
public class no2tugas1if {
    public static void main(String[] args) {
    char huruf;
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan huruf : ");
    huruf = input.next().charAt(0);
    if (huruf=='A'||huruf=='I'||huruf=='U'||huruf=='E'||huruf=='O'||
    huruf=='a'||huruf=='i'||huruf=='u'||huruf=='e'||huruf=='o')
    {
        System.out.println(huruf + " adalah huruf vokal");
    }
    else
    {
        System.out.println(huruf + " adalah huruf konsonan");
    }    
        
        
            
    }
    
}
