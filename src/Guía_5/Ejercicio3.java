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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Recorrer un vector de N enteros contabilizando cuántos números son de
         * 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
         */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector: ");
        System.out.print("Tamaño(N): ");
        int N = leer.nextInt();
        int[] vector = new int[N];

        //Rellenamos el vector
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 100) * (int) (Math.random()*10) * (int) (Math.random() * 10);
        }

        //Mostramos el vector
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println(" ");
        int digitos5 = 0, digitos4 = 0, digitos3 = 0, digitos2 = 0, digitos1 = 0;
        
        for (int i = 0; i < vector.length; i++) {
            
            if (vector[i] > 10000) {
                digitos5++;
            } else if (vector[i] > 1000) {
                digitos4++;
            } else if (vector[i] > 100) {
                digitos3++;
            } else if (vector[i] > 10) {
                digitos2++;
            } else if (vector[i] >= 0) {
                digitos1++;
            }
        }
        System.out.println("Hay \n" + digitos5 + " números de 5 dígitos, \n"
                + digitos4 + " números de 4 dígitos, \n"
                + digitos3 + " números de 3 dígitos, \n"
                + digitos2 + " números de 2 dígitos, \n"
                + digitos1 + " números de 1 dígito");
    }
}
