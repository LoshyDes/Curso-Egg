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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Realice un programa que compruebe si una matriz dada es
         * antisimétrica. Se dice que una matriz A es antisimétrica cuando ésta
         * es igual a su propia traspuesta, pero cambiada de signo. Es decir, A
         * es antisimétrica si A = -AT. La matriz traspuesta de una matriz A se
         * denota por AT y se obtiene cambiando sus filas por columnas (o
         * viceversa).
         */
        Scanner leer = new Scanner(System.in);
        /*La línea de abajo es para inicializar una matriz en los valores elegidos 
         (comentar la línea 34 y de la 41 hasta la 46 si vas a usar esta)
         */
        int[][] matrizA = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};

//      int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][3];
        int comprobante1 = 0, comprobante2 = 0;

        /**
         * El bucle de abajo es para pedir que ingrese una matriz (es necesaria
         * la línea 34 y si vas a usar esta comentar la línea 32)
         */
//        for (int i = 0; i < matrizA.length; i++) {
//            for (int j = 0; j < matrizA.length; j++) {
//                System.out.print("[" + i + "]" + "[" + j + "]: ");
//                matrizA[i][j] = leer.nextInt();
//            }
//        }
        //Mostramos la matriz A
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.println("");
        }

        //Comprobamos si es su antisimétrica
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizA[i][j] == -matrizA[j][i]) {
                    comprobante1++;
                } else {
                    comprobante2++;
                }
            }
        }
        //Decimos si es o no antisimétrica
        if (comprobante1 > 0 && comprobante2 == 0) {
            System.out.println("Es una matriz antisimétrica");
        } else if (comprobante2 > 0) {
            System.out.println("No es una matriz antisimétrica");
        }
    }
}
