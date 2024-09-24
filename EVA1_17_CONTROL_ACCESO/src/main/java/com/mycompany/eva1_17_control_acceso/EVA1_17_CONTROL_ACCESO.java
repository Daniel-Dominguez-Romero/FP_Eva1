/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_17_control_acceso;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class EVA1_17_CONTROL_ACCESO {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
       //Crear variables y capturar usuario y contraseña
       String contra;
       String user; 
       Scanner captu = new Scanner (System.in); 
       System.out.println("Ingrese su usuario: ");
       user = captu.nextLine(); 
       System.out.println("Ingrese su contraseña: ");
       contra = captu.nextLine(); 
       
       if (user.equals("Admin") && contra.equals("1234")){
           System.out.println("Bienvenido al sistema");
       }else{ 
           System.out.println("Acceso denegado");
           
       }
           
       
       
       
    }
}
