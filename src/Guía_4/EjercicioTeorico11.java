/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guía_4;

import static Guía_4.EjercicioTeorico11.fraseCodificada;
import java.util.Scanner;

/**
 *
 * @author LogiC
 */
public class EjercicioTeorico11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Escribir un programa que procese una secuencia de caracteres
         * ingresada por teclado y terminada en punto, y luego codifique la
         * palabra o frase ingresada de la siguiente manera: cada vocal se
         * reemplaza por el carácter que se indica en la tabla y el resto de los
         * caracteres (incluyendo a las vocales acentuadas) se mantienen sin
         * cambios.
         */

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase y al final agregue un punto");
        System.out.print("Frase: ");
        String frase = leer.nextLine();

        int longitud = frase.length();

        if (frase.substring((longitud - 1), longitud).equals(".")) {
            System.out.println("Frase codificada: " + fraseCodificada(frase, longitud));
        } else {
            System.out.println("La frase no termina en punto");
        }

    }

    public static String fraseCodificada(String frase, int longitud) {
        String fraseCodificada = "";

        for (int i = 1; i < longitud; i++) {
            switch (frase.toLowerCase().substring(i - 1, i)) {
                case "a":
                    fraseCodificada = fraseCodificada.concat("@");
                    break;
                case "e":
                    fraseCodificada = fraseCodificada.concat("#");
                    break;
                case "i":
                    fraseCodificada = fraseCodificada.concat("$");
                    break;
                case "o":
                    fraseCodificada = fraseCodificada.concat("%");
                    break;
                case "u":
                    fraseCodificada = fraseCodificada.concat("*");
                    break;
                default:
                    fraseCodificada = fraseCodificada.concat(frase.substring(i - 1, i));
            }
            if (i == longitud - 1) {
                fraseCodificada = fraseCodificada.concat(".");
            }
        }

        return fraseCodificada;
    }

}
