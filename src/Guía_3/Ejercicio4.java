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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /**
     * Escriba un programa que pida una frase o palabra y valide si la primera 
     * letra de esa frase es una "A". Si la primera letra es una "A", se deberá
     * de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso 
     * contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
     * Substring y equals() de Java.
     */
    Scanner leer = new Scanner(System.in); // Creamos el Scanner
        
        System.out.println("Ingrese una cadena");
        String cadena = leer.nextLine(); // Leer una cadena
        
        if("a".equalsIgnoreCase(cadena.substring(0,1))){
            
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
        /*
        if(cadena.substring(0,1).equalsIgnoreCase("a")){
            
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
*/
    } 
}
