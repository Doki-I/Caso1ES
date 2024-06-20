/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.essimulacion;

import javax.swing.JOptionPane;
import java.util.Arrays;
import java.util.Comparator;

public class Estribo {

    private static final int CAPACIDAD_ESTRIBO = 100; //Aquí le pondré un limite de escribos
    private SacoConcentrado[] sacos;
    private int contadorSacos;
    private int sacosRotos;
    private double ventasTotales;

    public Estribo() {
        this.sacos = new SacoConcentrado[CAPACIDAD_ESTRIBO];
        this.contadorSacos = 0;
        this.sacosRotos = 0;
        this.ventasTotales = 0.0;
    }

    public void agregarSaco(SacoConcentrado saco) {
        try {//En este try pueden ocurrir excepciones 
            if (contadorSacos < CAPACIDAD_ESTRIBO) {
                sacos[contadorSacos] = saco;
                contadorSacos++;
                ordenarPorPeso();
            } else {
                JOptionPane.showMessageDialog(null, "Estribo lleno, no se puede agregar más sacos.");
            }
        } catch (Exception e) {//El Exeption e fue visto en Cliente servidor y lo aprovecharé para las excepciones de el try
            JOptionPane.showMessageDialog(null, "Error al agregar saco: " + e.getMessage());
        }
    }

    public void eliminarSaco(int indice) {
        try {
            if (indice >= 0 && indice < contadorSacos) {
                for (int i = indice; i < contadorSacos - 1; i++) {
                    sacos[i] = sacos[i + 1];
                }
                sacos[contadorSacos - 1] = null;
                contadorSacos--;
            } else {
                JOptionPane.showMessageDialog(null, "Índice de saco inválido.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar saco: " + e.getMessage());
        }
    }

    public void venderSaco(int indice) {
        try {
            if (indice >= 0 && indice < contadorSacos) {
                ventasTotales += sacos[indice].getPrecio();
                eliminarSaco(indice);
            } else {
                JOptionPane.showMessageDialog(null, "Índice de saco inválido.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al vender saco: " + e.getMessage());
        }
    }

    public void eliminarSacoroto() {
        try {
            for (int i = 0; i < contadorSacos; i++) {
                if (sacos[i].getTipo().equalsIgnoreCase("roto")) {
                    eliminarSaco(i);
                    sacosRotos++;
                    i--; // Para compensar la eliminación del elemento
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar saco roto: " + e.getMessage());
        }
    }

    public void mostrarInventario() {
        try {
            StringBuilder inventario = new StringBuilder();
            for (int i = 0; i < contadorSacos; i++) {
                inventario.append(sacos[i]).append("\n");
            }
            JOptionPane.showMessageDialog(null, "Inventario:\n" + inventario.toString());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar inventario: " + e.getMessage());
        }
    }

    public void mostrarVentasTotales() {
        try {
            JOptionPane.showMessageDialog(null, "Total de ventas del día: $" + ventasTotales);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar ventas totales: " + e.getMessage());
        }
    }

    private void ordenarPorPeso() {
        try {
            Arrays.sort(sacos, 0, contadorSacos, Comparator.comparingInt(SacoConcentrado::getPeso));//El array sort me ayudará a ordenar los números
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al ordenar sacos por peso: " + e.getMessage());
        }
    }
}
