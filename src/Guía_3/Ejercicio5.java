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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Escriba un programa en el cual se ingrese un valor límite positivo, y
         * a continuación solicite números al usuario hasta que la suma de los
         * números introducidos supere el límite inicial.
         */

        Scanner leer = new Scanner(System.in); // Creamos el Scanner

        System.out.println("Ingrese un valor límite positivo");
        int valor = leer.nextInt(); // Leer un entero
        int suma = 0;

        do {
            System.out.println("Ingrese un número");
            suma = suma + leer.nextInt(); // Leer un entero

        } while (suma <= valor);
        System.out.println("Usted superó el límite positivo");
    }

}
