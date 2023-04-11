/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guía_5;


/**
 *
 * @author LogiC
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Realizar un programa que rellene un matriz de 4 x 4 de valores
         * aleatorios y muestre la traspuesta de la matriz. La matriz traspuesta
         * de una matriz A se denota por B y se obtiene cambiando sus filas por
         * columnas (o viceversa).
         */
        int [][] matrizA = new int [4][4];
        int [][] matrizB = new int [4][4];
        //Generamos la matriz A
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizA [i][j] = (int) (Math.random() * 10);
            }
        }
        //Mostramos la matriz A
        System.out.println("Matriz A: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
               System.out.print("[" + matrizA[i][j] + "]");
            }
            System.out.println("");
        }
        //Generamos Matriz B
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizB [j][i] = matrizA [i][j];
            }
        }
        //Mostramos la matriz B
        System.out.println("Matriz Traspuesta: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
               System.out.print("[" + matrizB[i][j] + "]");
            }
            System.out.println("");
        }
    }
}
