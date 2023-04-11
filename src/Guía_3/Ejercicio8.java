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
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Dibujar un cuadrado de N elementos por lado utilizando el carácter
         * “*”. Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá
         * dibujar lo siguiente: 
         * 
         *  * * * * 
         *  *     *
         *  *     *
         *  * * * *
         */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese N para formar un cuadrado (tiene que ser "
                + "mayor a 2)");
        int nElementos = leer.nextInt();

        for (int i = 0; i < nElementos; i++) {
            for (int j = 0; j < nElementos; j++) {
                if (i == 0 || i == nElementos - 1) {
                    System.out.print(" * ");
                } else if (j == 0 || j == nElementos - 1){
                    System.out.print(" * ");
                } else if (j > 0 || j < nElementos - 1){
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }
    }
}
