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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Realizar un programa que pida dos números enteros positivos por
         * teclado y muestre por pantalla el siguiente menú: El usuario deberá
         * elegir una opción y el programa deberá mostrar el resultado por
         * pantalla y luego volver al menú. El programa deberá ejecutarse hasta
         * que se elija la opción 5. Tener en cuenta que, si el usuario
         * selecciona la opción 5, en vez de salir del programa directamente, se
         * debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
         * desea salir del programa (S/N)? Si el usuario selecciona el carácter
         * ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
         */

        Scanner leer = new Scanner(System.in);

        int numero1, numero2, variableMenu;
        String salir;
        do {
            System.out.println("Ingrese el primer número entero positivo");
            numero1 = leer.nextInt();
        } while (numero1 < 0);

        do {
            System.out.println("Ingrese el segundo número entero positivo");
            numero2 = leer.nextInt();
        } while (numero2 < 0);

        do {
            System.out.println("Menú\n" + "1. Sumar\n" + "2. Restar\n"
                    + "3. Multiplicar\n" + "4. Dividir\n" + "5. Salir\n"
                    + "Elija una opción");
            variableMenu = leer.nextInt();
            switch (variableMenu) {
                case 1:
                    System.out.println("La suma es = " + (numero1 + numero2));
                    break;
                    
                case 2:
                    System.out.println("La resta es = " + (numero1 - numero2));
                    break;
                    
                case 3:
                    System.out.println("La multiplicación es = " + (numero1 * numero2));
                    break;
                    
                case 4:
                    System.out.println("La división es = " + (numero1 / numero2));
                    break;
                    
                case 5:
                    System.out.println("Desea Salir? s/n");
                    salir = leer.nextLine();
                    salir = leer.nextLine();
                    if (salir.equalsIgnoreCase("s")) {
                      variableMenu = 5;

                    } else {
                        
                      variableMenu = 0;
                    }
                    
                    continue;
                    
                default:
                    System.out.println("El numero ingresado no está en el menú");
                    
            }

            salir = leer.nextLine();
            salir = leer.nextLine();

        } while (variableMenu != 5);
    }
}
