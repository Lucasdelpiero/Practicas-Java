/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ej_4;


public class LineaDePedido {
    private Producto producto;
    private int cantidad;

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public LineaDePedido(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }    
  
}
