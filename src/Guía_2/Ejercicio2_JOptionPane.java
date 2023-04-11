/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guía_2;

import javax.swing.JOptionPane;

/**
 *
 * @author LogiC
 */
public class Ejercicio2_JOptionPane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String cadena;
    cadena = JOptionPane.showInputDialog("Ingrese su nombre");
    JOptionPane.showMessageDialog(null, "Su nombre es: " + cadena);
    }
    
}
