/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba;


public class Auto extends Vehiculo{
    protected double porcentajeIncremento = 1.015; // 1.5%
    
    public Auto(String patente) {
        super(patente);
        precioBase += precioBase * porcentajeIncremento; 
        descripcion = "Auto";
    }
    
    
}
