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
public class EjercicioExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Dado un tiempo en minutos, calcular su equivalente en días y horas.
         * Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe
         * calcular su equivalente: 1 día, 2 horas.
         */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un tiempo en minutos");
        int minutos = leer.nextInt(), horas, dias;

        dias = 0;
        horas = (minutos / 60);

        do {
            if (horas >= 24) {

                horas -= 24;
                dias++;
            }
        } while (horas >= 24);
        System.out.println("La equivalencia de " + minutos + " minutos es de: " + dias + " Días con " + horas + " horas");

    }
}


