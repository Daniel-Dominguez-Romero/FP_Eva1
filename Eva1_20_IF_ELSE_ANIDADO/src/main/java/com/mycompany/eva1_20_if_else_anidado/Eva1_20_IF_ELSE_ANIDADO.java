/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_20_if_else_anidado;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Eva1_20_IF_ELSE_ANIDADO {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        int day; 
        Scanner captu = new Scanner (System.in); 
       
        System.out.println("Captura el numero del dia, del 1 al 7: "); 
        day = captu.nextInt(); 
        captu.nextLine(); 
        
        if(day == 1){ 
            System.out.println("Domingo"); 
        } else if (day == 2){ 
            System.out.println("Lunes");
        } else if (day == 3){ 
            System.out.println("Martes");
        } else if (day == 4){ 
            System.out.println("Miercoles");
        } else if (day == 5){ 
            System.out.println("Jueves");
        } else if (day == 6){ 
            System.out.println("Viernes");
        } else if (day == 7){ 
            System.out.println("Sabado");
        } else if (day < 1){ 
            System.out.println("Dia no valido");
        } else if (day > 7){ 
            System.out.println("Dia no valido");
        }
     
        
        
        
        
        
        
        
    }
}
