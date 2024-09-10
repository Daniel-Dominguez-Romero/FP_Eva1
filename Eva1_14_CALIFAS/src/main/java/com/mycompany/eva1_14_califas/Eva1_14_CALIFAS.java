/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_14_califas;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Eva1_14_CALIFAS {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        double califa;
        
        Scanner captu = new Scanner (System.in); 
        
        System.out.println("Captura tu calificacion: ");
        califa = captu.nextDouble(); 
        
        if (califa>=70) {
            System.out.println("Calificacion aprovatoria, felicidades");
        } else {
            
            System.out.println("No acreditado");
        }
        
                
        
        
        
    }
}
