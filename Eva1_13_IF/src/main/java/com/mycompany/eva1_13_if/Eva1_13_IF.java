/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_13_if;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Eva1_13_IF {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //Valores 
        int edad; 
        //Scanner 
        Scanner captu = new Scanner (System.in); 
        //Capturar
        System.out.println("Captura tu edad: "); 
        edad = captu.nextInt(); 
        //Condicion
        if (edad>=18) { 
            System.out.println("Eres bienvenido"); 
        } else {
            System.out.println("No eres mayor de edad");
        }
        //Impresion 
        System.out.println("Tu edad es: " + edad); 
        
        
        
        
    }
}
