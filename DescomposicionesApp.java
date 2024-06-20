/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.descomposicionesapp;

import javax.swing.JOptionPane;

public class DescomposicionesApp {

    public static void main(String[] args) {
        try {
            String input = JOptionPane.showInputDialog("Ingrese un número natural:");
            if (input != null) {
                int numero = Integer.parseInt(input);//Este integer lo utilise para tener manipulacion del texto y del Int.
                if (numero > 0) {
                    Descompositor descompositor = new Descompositor();
                    Combinacion combinacion = new Combinacion(1000); //Esto lo puse para almacenar combinaciones.
                    int[] arrayCombinacion = new int[numero]; //esto es una variable que almacena un array de números enteros. 
                    descompositor.descomponer(numero, numero - 1, arrayCombinacion, 0, combinacion);
                    String descomposiciones = combinacion.obtenerResultado();
                    JOptionPane.showMessageDialog(null, "Descomposiciones de " + numero + " como suma de números menores:\n" + descomposiciones);
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor ingrese un número natural mayor que 0.");
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada no válida. Por favor ingrese un número natural.");
        }
    }
}
