/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_12_formulas;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Eva1_12_FORMULAS {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        //VALORES 
        double vel;
        double ace;
        double time;
        double dist; 
        //SCANNER
        Scanner captu = new Scanner (System.in);
        //CAPTURA
        System.out.println("Captura la velocidad inicial:");
        vel = captu.nextDouble(); 
        System.out.println("Captura la aceleracion:");
        ace = captu.nextDouble(); 
        System.out.println("Captura el tiempo:");
        time = captu.nextDouble(); 
        //FORMULA
        dist = (vel * time) + ((ace * time * time)/2); 
        //IMPRIME 
        System.out.println("La distancia es:" + " " + dist);
       
    }
}
