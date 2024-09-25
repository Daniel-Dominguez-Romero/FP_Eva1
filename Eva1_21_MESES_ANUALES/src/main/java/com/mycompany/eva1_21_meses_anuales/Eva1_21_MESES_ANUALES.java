/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_21_meses_anuales;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Eva1_21_MESES_ANUALES {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        int mess; 
        Scanner captu = new Scanner (System.in); 
        
        System.out.println("Ingresa un numero del 1 al 12: ");
        mess = captu.nextInt(); 
        captu.nextLine();
        
        if(mess == 1){ 
            System.out.println("Enero"); 
        } else if (mess == 2){ 
            System.out.println("Febrero");
        } else if (mess == 3){ 
            System.out.println("Marzo");
        } else if (mess == 4){ 
            System.out.println("Abril");
        } else if (mess == 5){ 
            System.out.println("Mayo");
        } else if (mess == 6){ 
            System.out.println("Junio");
        } else if (mess == 7){ 
            System.out.println("Julio");
        } else if (mess == 8) { 
            System.out.println("Agosto");
        } else if (mess == 9) {
            System.out.println("Septiembre");
        } else if (mess == 10) {
            System.out.println("Octubre");
        } else if (mess == 11) { 
            System.out.println("Noviembre");
        } else if (mess == 12) { 
            System.out.println("Diciembre");
        // NUM NO VALIDOS                
        } else if (mess < 1){ 
            System.out.println("Mes no existente");
        } else if (mess > 12){ 
            System.out.println("Mes no existente");
        }
        
        
        
    }
}
