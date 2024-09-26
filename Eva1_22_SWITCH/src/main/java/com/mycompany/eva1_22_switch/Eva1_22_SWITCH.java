/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_22_switch;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Eva1_22_SWITCH {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        
        int day; 
        Scanner captu = new Scanner (System.in); 
       
        System.out.println("Captura el numero del dia, del 1 al 7: "); 
        day = captu.nextInt(); 
        captu.nextLine(); 
        
        //ELEGIR ENTRE MULTIPLES ALTERNATIVAS
        switch(day){
            case 1: 
                System.out.println("Domingo"); 
                break; //INTERRUMPE EL SWITCH (LO TERMINA) 
            case 2: 
                System.out.println("Lunes"); 
                break; //INTERRUMPE EL SWITCH (LO TERMINA)    
            case 3: 
                System.out.println("Martes"); 
                break; //INTERRUMPE EL SWITCH (LO TERMINA)
            case 4: 
                System.out.println("Miercoles"); 
                break; //INTERRUMPE EL SWITCH (LO TERMINA)
            case 5: 
                System.out.println("Jueves"); 
                break; //INTERRUMPE EL SWITCH (LO TERMINA)
            case 6: 
                System.out.println("Viernes"); 
                break; //INTERRUMPE EL SWITCH (LO TERMINA)
            case 7: 
                System.out.println("Sabado"); 
                break; //INTERRUMPE EL SWITCH (LO TERMINA)
            default: //opcional, se ejecuta cuando no existe una opcion 
                // no tiene break y es la ultima instruccion del SWITCH 
                System.out.println("Numero no valido"); 
        }
    }
}
