/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_8_pelicula;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Eva1_8_PELICULA {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        //Declarar variables: 
        String Nombre;
        String Genero; 
        int Duracion;
        String Protagonista;
        String Clasificacion;
        
        //Crear nuevo scanner: 
        Scanner captu;
        captu = new Scanner(System.in);
        
        //Capturar 
        System.out.println("Capturar el nombre de la pelicula");
        Nombre = captu.nextLine();
        System.out.println("Captura el genero de la pelicula");
        Genero = captu.nextLine();
        System.out.println("Captura la duracion de la pelicula en segundos");
        Duracion = captu.nextInt();
        captu.nextLine();
        System.out.println("Captura al protagonista");
        Protagonista = captu.nextLine(); 
        System.out.println("Captura la clasificacion de la pelicula");
        Clasificacion = captu.nextLine();
        
        //Impresion
        System.out.println("Impresion de datos");
        System.out.println(Nombre);
        System.out.println(Genero);
        System.out.println(Duracion);
        System.out.println(Protagonista);
        System.out.println(Clasificacion);
        
        
        
        
        
                
    }
}
