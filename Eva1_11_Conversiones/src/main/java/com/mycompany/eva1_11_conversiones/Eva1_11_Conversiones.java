/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_11_conversiones;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Eva1_11_Conversiones {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        //CONVERSIONES DE TEMPEATURA 
        double fahr, cent, kel;
        Scanner captu = new Scanner(System.in); 
        
        System.out.println("Captura los Fahrenheit:"); 
        fahr = captu.nextDouble();
        cent = (fahr - 32) / 1.8; //expresion 
        System.out.println("°C = " + cent);
        
        //°C --> °F 
        System.out.println("Captura los Centigrados:");
        cent = captu.nextDouble();
        fahr = (cent * 1.8) + 32;  
        System.out.println("°F = " + fahr);
        
        //°C --> °K
        System.out.println("Capura en Centigrados:"); 
        cent = captu.nextDouble();
        kel = (cent + 273.15);
        System.out.println("°K = " + kel);
        
        
        
        
        
        
    }
}
