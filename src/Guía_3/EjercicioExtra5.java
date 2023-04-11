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
public class EjercicioExtra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /**
     * Una obra social tiene tres clases de socios:
     * 1) Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de 
     * descuento en todos los tipos de tratamientos.
     * 
     * 2) Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento 
     * para los mismos tratamientos que los socios del tipo A.
     * 
     * 3) Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos 
     * sobre dichos tratamientos.
     * 
     * 4) Solicite una letra (carácter) que representa la clase de un socio, 
     * y luego un valor real que represente el costo del tratamiento 
     * (previo al descuento) y determine el importe en efectivo a pagar por 
     * dicho socio.
     */
        Scanner leer = new Scanner(System.in);

        String letra;
        Double costo, costosocio;

        do {
            System.out.println("ingrese que tipo de socio es");
            letra = leer.next();
            //letra = leer.nextLine().substring(0, 1);
            letra = letra.toUpperCase();
            if (!letra.equals("A") && !letra.equals("B") && !letra.equals("C")) {
                System.out.println("No existe la categoria de socio, por favor ingrese una correcta");
            }
        } while (!letra.equalsIgnoreCase("A") && !letra.equals("B") && !letra.equals("C"));

        System.out.println("ingrese el costo del tratamiento");
        costo = leer.nextDouble();

        switch (letra) {
            case "A":
                costosocio = costo * 0.5;
                System.out.println("El costo que debera abonar el socio es: $" + costosocio);
                break;
            case "B":
                costosocio = costo * 0.65;
                System.out.println("El costo que debera abonar el socio es: $" + costosocio);
                break;
            case "C":
                costosocio = costo;
                System.out.println("El costo que debera abonar el socio es: $" + costosocio);
                break;
        }
    }

}
