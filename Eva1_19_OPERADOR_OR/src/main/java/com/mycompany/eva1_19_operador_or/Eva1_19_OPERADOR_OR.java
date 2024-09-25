/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_19_operador_or;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Eva1_19_OPERADOR_OR {

    public static void main(String[] args) {
        
        int kms, mss; 
        Scanner captu = new Scanner (System.in); 
        System.out.println("Ingresa cuantos Kilometros ha ganado tu carro desde el ultimo cambio de aceite: ");
        kms = captu.nextInt();     
        System.out.println("Ingresa hace cuantos meses cambiaste le aceite del carro: "); 
        mss = captu.nextInt();
        
        
        if (kms >= 5000 || mss >= 6) {
            System.out.println("Necesitas un cambio de aceite"); 
        } else { 
            System.out.println("Todo esta bien con tu carro"); 
            
            
        }
        
                
        
                
        
    }
}
