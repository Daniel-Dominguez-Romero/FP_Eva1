/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_24_califas;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Eva1_24_CALIFAS {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        int califa; 
        Scanner captu = new Scanner (System.in); 
       
        System.out.println("Captura el numero del dia, del 0 al 100: "); 
        califa = captu.nextInt(); 
        captu.nextLine();
        
        if (califa >= 0 && califa <= 59 ) {
            System.out.println("Tu calificacion es F"); 
            
        }else if (califa >= 60 && califa <= 69) { 
            System.out.println("Tu calificacion es D"); 
        } else if (califa >= 70 && califa <= 79) {
            System.out.println("Tu calificacion es C");
        } else if (califa >= 80 && califa <= 89) { 
            System.out.println("Tu calificacion es B");      
        } else if (califa >= 90 && califa <= 100) {
            System.out.println("Tu calificacion es A");
        } else if (califa > 100) {
            System.out.println("Calificacion no valida");
        } else if (califa < 0) { 
           System.out.println("Calificacion no valida");
        }
        
            
    }
}
