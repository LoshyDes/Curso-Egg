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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un programa que dado un número determine si es par o impar.
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero entero");
        int num = leer.nextInt(); // Leer un entero
        
        if(num%2 == 0){
            
            System.out.println("El número es par");
        }else{
            
            System.out.println("Es impar");
            
        } 
    }
}
