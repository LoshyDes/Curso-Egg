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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Realizar un algoritmo que llene un vector con los 100 primeros
         * números enteros y los muestre por pantalla en orden descendente.
         */
        int[] vector = new int[100];
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = i+1;
        }
        
        System.out.println("Vector: ");
        
        for (int i = (vector.length)-1; i >= 0; i--) {
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println("");
        
    }
}
