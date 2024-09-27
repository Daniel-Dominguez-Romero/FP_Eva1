/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_25_bisiesto;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Eva1_25_BISIESTO {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        
        int year; 
        
        Scanner captu = new Scanner (System.in); 
       
        System.out.println("Captura el año:"); 
        year = captu.nextInt(); 
        captu.nextLine();
        
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Tu año es bisiesto");
            
            
        } else { System.out.println("Tu año NO es bisiesto");
        }
        
        
    }
}
