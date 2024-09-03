/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_9_operaciones;

/**
 *
 * @author danie
 */
public class Eva1_9_OPERACIONES {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        
        //OPERACIONES ARITMETICAS 
        int x = 10; //declaracion y asignacion 
        int y = 5; 
        // si necesitas muchas variables:
        int suma, resta, mult, div, pot, raiz; 
        //suma y resta 
        suma = x + y; //operador de suma + 
        System.out.println("La suma de x + y:");
        System.out.println(suma); 
        
        resta = x - y; //operacion de resta - 
        System.out.println("La resta de x - y:");
        System.out.println(resta);
        
        //Multiplicacion 
        mult = x * y; //operador de multiplicacion *
        System.out.println("La multiplicacion de x * y:"); 
        System.out.println(mult); 
        
        //Division 
        //en java, las operaciones dependen del tipo de datos 
        //divides enteros, java da como resultado entero 
        div = x / y; //operador de division / 
        System.out.println("El resultado de la division x (10) / y (5)");
        System.out.println(div); 
        
        x = 5; 
        y = 2; 
        div = x / y; 
        System.out.println("Division de x (5) / y (2)");
        System.out.println(div); 
        
        //division con numero con punto flotante 
        double val1 = 5; 
        double val2 = 2; 
        double resu; 
        resu = val1 / val2 ;
        System.out.println("Division de val1 (5) / va12 (2)"); 
        System.out.println(resu); 
        
        
}

    }