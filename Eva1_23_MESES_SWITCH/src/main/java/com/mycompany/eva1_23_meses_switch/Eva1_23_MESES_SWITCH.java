/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_23_meses_switch;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Eva1_23_MESES_SWITCH {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        int mes; 
        Scanner captu = new Scanner (System.in); 
       
        System.out.println("Captura el numero del dia, del 1 al 12: "); 
        mes = captu.nextInt(); 
        captu.nextLine(); 
        
        //ELEGIR ENTRE MULTIPLES ALTERNATIVAS
        switch(mes){
            case 1: 
                System.out.println("Enero"); 
                break; //INTERRUMPE EL SWITCH (LO TERMINA) 
            case 2: 
                System.out.println("Febrero"); 
                break; //INTERRUMPE EL SWITCH (LO TERMINA)    
            case 3: 
                System.out.println("Marzo"); 
                break; //INTERRUMPE EL SWITCH (LO TERMINA)
            case 4: 
                System.out.println("Abril"); 
                break; //INTERRUMPE EL SWITCH (LO TERMINA)
            case 5: 
                System.out.println("Mayo"); 
                break; //INTERRUMPE EL SWITCH (LO TERMINA)
            case 6: 
                System.out.println("Junio"); 
                break; //INTERRUMPE EL SWITCH (LO TERMINA)
            case 7: 
                System.out.println("Julio"); 
                break; //INTERRUMPE EL SWITCH (LO TERMINA)
            case 8: 
                System.out.println("Agosto"); 
                break; //INTERRUMPE EL SWITCH (LO TERMINA) 
            case 9: 
                System.out.println("Septiembre"); 
                break; //INTERRUMPE EL SWITCH (LO TERMINA)    
            case 10: 
                System.out.println("Octubre"); 
                break; //INTERRUMPE EL SWITCH (LO TERMINA)
            case 11: 
                System.out.println("Noviembre"); 
                break; //INTERRUMPE EL SWITCH (LO TERMINA)
            case 12: 
                System.out.println("Diciembre"); 
                break; //INTERRUMPE EL SWITCH (LO TERMINA)
            default: //opcional, se ejecuta cuando no existe una opcion 
                // no tiene break y es la ultima instruccion del SWITCH 
                System.out.println("Mes no existente tontuelo"); 
        }
        
        
    }
}
