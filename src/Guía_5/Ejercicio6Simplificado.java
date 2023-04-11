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
public class Ejercicio6Simplificado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del
         * 1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son
         * idénticas. Crear un programa que permita introducir un cuadrado por
         * teclado y determine si este cuadrado es mágico o no. El programa
         * deberá comprobar que los números introducidos son correctos, es
         * decir, están entre el 1 y el 9.
         */
        Scanner leer = new Scanner(System.in);

//        int[][] matriz = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
        int[][] matriz = new int[3][3];

        //Ingreso de valores a la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                int contador = 0, numero;
                do {
                    System.out.print("Ingrese un número para [" + i + "]" + "[" + j + "]: ");
                    numero = leer.nextInt();
                    if (numero > 0 && numero < 10) {
                        contador++;
                        matriz[i][j] = numero;
                    }
                } while (contador == 0);
                System.out.println("");
            }
        }
        //Suma de las diagonales
        int sumaDiagonal1 = 0, sumaDiagonal2 = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == j) {
                    sumaDiagonal1 += matriz[i][j];
                }
                if (i == 2 - j) {
                    sumaDiagonal2 += matriz[i][j];
                }
            }
        }

        //Sumar las filas
        int[] vectorFilas = new int[3];
        int[] vectorColumnas = new int[3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                vectorFilas[i] += matriz[i][j];
                vectorColumnas[j] += matriz[i][j];
            }
        }
        
        //Comprobación de que sea un cuadrado mágico
        boolean cuadradoMagico = false;
        int sumaFilas = 0, sumaColumnas = 0;
        if (sumaDiagonal1 == sumaDiagonal2) {
            for (int i = 0; i < matriz.length; i++) {
                if (sumaDiagonal1 == vectorFilas[i]) {
                    sumaFilas++;
                }
                if (sumaDiagonal1 == vectorColumnas[i]) {
                    sumaColumnas++;
                }
            }
            if (sumaFilas == 3 && sumaColumnas == 3) {
                cuadradoMagico = true;
            }
        }
        //Mensaje de comprobación (Cuadrado mágico)
        if (cuadradoMagico == true) {
            System.out.println("Es un cuadrado mágico");
        } else if (cuadradoMagico == false) {
            System.out.println("No es un cuadrado mágico");
        }
    }
}
