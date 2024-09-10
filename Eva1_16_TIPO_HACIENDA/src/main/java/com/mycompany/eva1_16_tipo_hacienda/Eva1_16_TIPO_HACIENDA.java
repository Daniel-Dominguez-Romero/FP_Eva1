/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_16_tipo_hacienda;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Eva1_16_TIPO_HACIENDA {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        char tipo; 
        Scanner captu = new Scanner (System.in); 
      
        System.out.println("Tipo de persona F --> FISICA, M --> MORAL"); 
        tipo = captu.nextLine().charAt(0);
        
        //IMPRIMIR EL TIPO DE PERSONA 
        //"" -->CADENA DE TEXTO '' --> ES UN CARACTER 
        if (tipo == 'M') {
            System.out.println("Moral");
        } else {
            System.out.println("Fisica"); 
        }
    }
}
