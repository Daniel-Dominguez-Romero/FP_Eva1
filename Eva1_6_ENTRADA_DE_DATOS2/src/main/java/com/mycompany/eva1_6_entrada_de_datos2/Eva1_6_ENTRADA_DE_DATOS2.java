/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_6_entrada_de_datos2;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Eva1_6_ENTRADA_DE_DATOS2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
       //DECLARAR VARIABLES 
       String nombre;
       String curp;
       int edad;
       double promedio;
       //CREAR NUEVO SCANNER 
       Scanner captu; 
       captu = new Scanner(System.in);
       
       //CAPTURAR 
       System.out.println("Captura tus datos completos:");
       nombre = captu.nextLine();
       System.out.println("Captura tu CURP:");
       curp = captu.nextLine();
       System.out.println("Captura la edad:");
       edad = captu.nextInt();
       System.out.println ("Captura el promedio:");
       promedio = captu.nextDouble();
       
       //IMPRESION 
       System.out.println("SECCION DE IMPRESION DE DATOS");
       System.out.println(nombre);
       System.out.println(curp);
       System.out.println(edad);
       System.out.println(promedio);
       
               
       
    }
}
