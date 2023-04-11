/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guía_5;

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
        /**
         * Realizar un algoritmo que llene un vector de tamaño N con valores
         * aleatorios y le pida al usuario un número a buscar en el vector. El
         * programa mostrará dónde se encuentra el numero y si se encuentra
         * repetido
         */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector: ");
        System.out.print("Tamaño(N): ");
        int N = leer.nextInt();
        int[] vector = new int[N];
        
        //Rellenamos el vector
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random()*100);
        }
        //Mostramos el vector
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println(" ");
        
        //Buscamos un número
        System.out.println("¿Qué número desea buscar?");
        System.out.print("Número a buscar: ");
        int numero = leer.nextInt();
        //comparamos el número con el vector
        int contador = 0;
        for (int i = 0; i < vector.length; i++) {
           int primero = 0;
           //Comparamos el número con la condición de que sea la primera vez que lo encuentra
            if (numero == vector[i] && contador == 0) {
                contador++;
                primero = i;
                System.out.println("Se encontró el número en la posición: " + (i+1));
            }
            //Ahora si está repetido entra a este if debido a la condición de que sea distinto del primer valor
            if (numero == vector[i] && i != primero) {
                System.out.print("Y además se encuentra repetido en la posición: ");
                System.out.println(i+1);
            }
        }
    }
}
