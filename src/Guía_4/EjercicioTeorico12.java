/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guía_4;

import java.util.Scanner;

/**
 *
 * @author LogiC
 */
public class EjercicioTeorico12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Crea un procedimiento EsMultiplo que reciba los dos números pasados
         * por el usuario, validando que el primer número múltiplo del segundo e
         * imprima si el primer número es múltiplo del segundo, sino informe que
         * no lo son.
         */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números");
        System.out.print("Número 1: ");
        int numero1 = leer.nextInt();
        System.out.println("");
        System.out.print("Número 2: ");
        int numero2 = leer.nextInt();
        System.out.println("");
        
        EsMultiplo(numero1, numero2);
        
    }
    public static void EsMultiplo(int numero1, int numero2) {
        if (numero1 % numero2 == 0) {
            System.out.println("El número " + numero1 + " es múltiplo de " + numero2);
        } else {
            System.out.println("El número " + numero1 + " no es múltiplo de " + numero2);
        }
    }
}
