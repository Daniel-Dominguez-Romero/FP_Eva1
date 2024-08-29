/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_5_entrada_de_datos;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class EVA1_5_ENTRADA_DE_DATOS {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        String Nombre; 
        
        //CAPTURA DE DATOS 
        //Scanner ----> herramineta (Clase) 
        //Scanner: es un tipo de dato 
        Scanner captu; //incorporar la herramienta (import) 
        //no existe, hay que crearla 
        captu = new Scanner(System.in);
        
        //DALE LA INSTRUCCION AL USUARIO 
        System.out.println("Introduce tu nombre completo: ");
        //capturar asignacion un valor a la variable)
        Nombre = captu.nextLine();//Capturamos todo el texto 
                                  //hasta que presiona "enter"
                                  
        //IMPRIMIR DATOS 
        System.out.println("<<<<<DATOS CAPTURADOS>>>>>");
        System.out.println(Nombre);
        
        
                
        
    }
}
