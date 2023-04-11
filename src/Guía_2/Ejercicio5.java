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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*
        Escribir un programa que lea un número entero por teclado y muestre por 
        pantalla el doble, el triple y la raíz cuadrada de ese número. 
        */
    
    Scanner leer = new Scanner(System.in);
    
    int num;
    System.out.println("Ingrese un número enter: ");
    num = leer.nextInt();
    
    System.out.println("El doble del número ingresado es = " + (num * 2));
    System.out.println(" ");
    System.out.println("El triple del número ingresado es = " + (num * 3));
    System.out.println(" ");
    System.out.println("La raíz cuadrada del número ingresado es = " + Math.sqrt(num));
    }
    
}
