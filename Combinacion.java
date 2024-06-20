/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.descomposicionesapp;

public class Combinacion {
    private String[] combinaciones;
    private int index;

    public Combinacion(int size) {
        this.combinaciones = new String[size];
        this.index = 0;
    }

    public void agregarCombinacion(int[] combinacion, int longitud) {
        String combinacionStr = "[";
        for (int i = 0; i < longitud; i++) {
            combinacionStr += combinacion[i];
            if (i < longitud - 1) {
                combinacionStr += ", ";
            }
        }
        combinacionStr += "]";
        combinaciones[index] = combinacionStr;
        index++;
    }

    public String obtenerResultado() {
        String resultadoFinal = "";
        for (int i = 0; i < index; i++) {
            resultadoFinal += combinaciones[i] + "\n";
        }
        return resultadoFinal;
    }
}
