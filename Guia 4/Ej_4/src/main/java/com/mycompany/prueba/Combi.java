/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba;


public class Combi extends Vehiculo{
    protected double porcentajeIncremento = 1.015; // 1.5%
    protected double porcentajeCombi = 1.02; // 2%
    
    public Combi(String patente) {
        super(patente);
        double baseVieja = precioBase;
        precioBase += precioBase *porcentajeIncremento;
        precioBase += precioBase * porcentajeCombi;   
        descripcion = "Combi";
    }
    
    
}
