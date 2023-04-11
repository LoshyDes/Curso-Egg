/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guía_2;

import java.util.Scanner;

/**
 *
 * @author LogiC
 */
public class Ejercicio1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
    /*
     * Escribir un programa que pida dos números enteros por teclado y calcule 
     * la suma de los dos. El programa deberá después mostrar el resultado de la
     * suma
    */
        
    Scanner leer = new Scanner(System.in); // Creamos el Scanner
    
    System.out.println("Ingrese un numero entero");
    int num1, num2;                       // Creamos la variable num1, y num2
    num1 = leer.nextInt();                // Leer un entero 1
    
    System.out.println("Ingrese un nuevo numero entero");
    num2 = leer.nextInt();                // Leer un entero 2
    
    
    System.out.println("La suma de ambos números es: " + (num1+num2)); // Se imprime el entero
    }
    
}
