/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.essimulacion;
//Esta clase fue creada para poder visualizar con detenimiento cada funcion y tener orden en la informacion de los sacos
public class SacoConcentrado {
    private int peso;
    private String tipo;
    private double precio;
    private String marca;

    public SacoConcentrado(int peso, String tipo, double precio, String marca) {
        this.peso = peso;
        this.tipo = tipo;
        this.precio = precio;
        this.marca = marca;
    }

    public int getPeso() {
        return peso;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "Saco de " + peso + " gramos, tipo: " + tipo + ", marca: " + marca + ", precio: $" + precio;
    }
}
//