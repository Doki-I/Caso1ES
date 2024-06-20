/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.descomposicionesapp;

public class Descompositor {

    public void descomponer(int n, int maximo, int[] combinacion, int longitud, Combinacion resultado) {
        if (n == 0) {
            resultado.agregarCombinacion(combinacion, longitud);
            return;
        }
        for (int i = 1; i <= Math.min(n, maximo); i++) { //Puse este metodo estático en mi codigo para obtener de manera simple el minimo de 2 números.  
            combinacion[longitud] = i;
            descomponer(n - i, i, combinacion, longitud + 1, resultado);
        }
    }
}
