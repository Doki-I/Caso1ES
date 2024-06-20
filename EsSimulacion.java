/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.essimulacion;

public class EsSimulacion {

    public static void main(String[] args) {
        Estribo estribo = new Estribo();

        //Aquí agregare sacos de prueba para el inventario
        estribo.agregarSaco(new SacoConcentrado(100, "perro", 50.0, "Marca1"));
        estribo.agregarSaco(new SacoConcentrado(500, "gato", 100.0, "Marca2"));
        estribo.agregarSaco(new SacoConcentrado(3000, "roto", 0.0, "Marca3")); //Este será uno roto
        estribo.agregarSaco(new SacoConcentrado(100, "gato", 50.0, "Marca4"));
        estribo.agregarSaco(new SacoConcentrado(3000, "perro", 150.0, "Marca5"));

        //Esto mostrara inventario antes de la venta
        estribo.mostrarInventario();

        estribo.venderSaco(0);

        //Con esto se eliminara los sacos rotos para que no salgan en pantalla
        estribo.eliminarSacoroto();

        //Mostrar inventario después de la venta y eliminación de sacos rotos
        estribo.mostrarInventario();

        //Mostrar total de ventas
        estribo.mostrarVentasTotales();
    }
}
