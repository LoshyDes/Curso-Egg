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
public class EjercicioExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si
         * se trata de una vocal. Caso contrario mostrar un mensaje. Nota:
         * investigar la función equals() de la clase String.
         *
         */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una Letra");
        String letra;

        do {
            letra = leer.nextLine();
            if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E")
                    || letra.equalsIgnoreCase("I")
                    || letra.equalsIgnoreCase("O")
                    || letra.equalsIgnoreCase("U")) {
                System.out.println("La letra es una vocal");
            } else {
                System.out.println("La letra no es una vocal");
            }

        } while (!letra.equalsIgnoreCase("0"));

    }

}
