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
public class Ejercicio2 {

    /**
     * @param args
     */
    public static void main(String[] args) {
    /* 
     Escribir un programa que pida tu nombre, lo guarde en una variable y lo 
     muestre por pantalla.   
    */ 
        
    Scanner leer = new Scanner(System.in); // Creamos el Scanner
    
    System.out.println("Ingrese su nombre");
    String nombre; // Creamos la variable "nombre" y la leemos
    nombre = leer.nextLine();
    
    System.out.println("Nombre: " + nombre);  //Mostramos
    
    }
    
}
