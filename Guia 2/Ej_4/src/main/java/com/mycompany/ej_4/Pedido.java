/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ej_4;
import java.util.ArrayList;

public class Pedido {
    private Empleado responsable;
    private String Fecha;
    private ArrayList<LineaDePedido> lineasDePedido = new ArrayList<>(); 

    public Pedido(Empleado responsable, String Fecha, ArrayList<LineaDePedido> lineas) {
        this.responsable = responsable;
        this.Fecha = Fecha;
        this.lineasDePedido = lineas;
    }

    public Pedido(Empleado responsable, String Fecha) {
        this.responsable = responsable;
        this.Fecha = Fecha;
    }
    
    

    public Empleado getResponsable() {
        return responsable;
    }

    public String getFecha() {
        return Fecha;
    }

    public ArrayList<LineaDePedido> getLineasDePedido() {
        return lineasDePedido;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public void setLineasDePedido(ArrayList<LineaDePedido> lineasDePedido) {
        this.lineasDePedido = lineasDePedido;
    }
    
    public void añadirPedido(Producto prod, int cantidad){
        LineaDePedido lineaPed = new LineaDePedido(prod, cantidad);
        lineasDePedido.add(lineaPed);
        
    }
    
    
}
