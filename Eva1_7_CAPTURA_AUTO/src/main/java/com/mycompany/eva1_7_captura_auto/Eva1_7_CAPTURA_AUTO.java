/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_7_captura_auto;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Eva1_7_CAPTURA_AUTO {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        //Declarar Variables
        String marca; 
        String modelo; 
        int año;
        Double precio;
        //Crear nuevo scanner
        Scanner captu;
        captu = new Scanner(System.in);
        //Capturar
        System.out.println("Captura la marca del carro");
        marca = captu.nextLine();
        System.out.println("Captura el modelo del carro");
        modelo = captu.nextLine();
        System.out.println("Captura el año del carro");
        año = captu.nextInt();
        System.out.println("Captura el precio del carro");
        precio = captu.nextDouble();
        //Impresion
        System.out.println("SECCION DE IMPRESION DE DATOS:");
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(año);
        System.out.println(precio);
        
        
        
        
    }
}
