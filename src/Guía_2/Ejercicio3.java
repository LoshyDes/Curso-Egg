/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guía_2;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author LogiC
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*
    Escribir un programa que pida una frase y la muestre toda en mayúsculas y 
    después toda en minúsculas.
    */
    Scanner leer = new Scanner(System.in); // Creamos el Scanner
    
    System.out.println("Ingrese una frase");
    
    String frase;
    frase = leer.nextLine();
    
    //Con import
    System.out.println("Frase en minúscula: " + toLowerCase(frase));
    System.out.println("Frase en mayúscula: " + toUpperCase(frase));
    
    //Sin import
    System.out.println("Frase en minúscula: " + frase.toLowerCase());
    System.out.println("Frase en mayúscula: " + frase.toUpperCase());
    }
    
}
