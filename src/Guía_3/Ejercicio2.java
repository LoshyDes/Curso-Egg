/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guía_3;

import java.util.Scanner;

/**
 *
 * @author LogiC
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*
        Crear un programa que pida una frase y si esa frase es igual a “eureka” 
        el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de 
        Incorrecto. Nota: investigar la función equals() en Java.
    */
    Scanner leer = new Scanner(System.in); // Creamos el Scanner
        
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine(); // Leer una cadena
    
        if(frase.equals("eureka")){
            
            System.out.println("Correcto");
            
            
        }else{
            
            System.out.println("Incorrecto");
            
        }
    }  
}
