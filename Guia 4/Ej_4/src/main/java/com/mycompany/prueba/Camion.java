/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba;

public class Camion extends Vehiculo{
    double porcentajeCamion = 0.4; // 40% fijo
    
    public Camion(String patente) {
        super(patente);
        precioBase += precioBase * porcentajeCamion;
        descripcion = "Camion";
    }
    
    
}
