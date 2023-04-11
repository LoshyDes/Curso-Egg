/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guía_3;


/**
 *
 * @author LogiC
 */
public class EjercicioExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Declarar cuatro variables de tipo entero A, B, C y D y asignarle un
         * valor diferente a cada una. A continuación, realizar las
         * instrucciones necesarias para que: B tome el valor de C, C tome el
         * valor de A, A tome el valor de D y D tome el valor de B. Mostrar los
         * valores iniciales y los valores finales de cada variable. Utilizar
         * sólo una variable auxiliar.
         */
        int A,B,C,D, variableAuxiliar;
        
        A = (int)Math.floor(Math.random()*10);
        
        // Generamos un número aleatorio para B
        do {
            B = (int)Math.floor(Math.random()*10);
 
        } while (A == B);
        
        // Generamos un número aleatorio para C
        do {          
            C = (int)Math.floor(Math.random()*10);
        
        } while (A == C && B == C);
        
        // Generamos un número aleatorio para D
        do {          
            D = (int)Math.floor(Math.random()*10);

        } while (A == D && B == D && C == D);
        
        System.out.println("Valores iniciales:\n" + "A: " + A + "\nB: " + B + "\nC: " + C + "\nD: " + D);
        
        variableAuxiliar = B;
        B = C;
        C = A;
        A = D;
        D = variableAuxiliar;
        
        System.out.println("Valores Finales:\n" + "A: " + A + "\nB: " + B + "\nC: " + C + "\nD: " + D);
    }

}
