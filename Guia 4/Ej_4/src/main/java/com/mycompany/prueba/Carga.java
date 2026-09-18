/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba;


public class Carga extends Vehiculo{
    protected double porcentaje = 0.2; // SueldoBase += 20% * PMA (PMA: peso maximo admitido)
    protected double PMA;
    
    public Carga(String patente, double PMA) {
        super(patente);
        this.PMA = PMA;
        descripcion = "Carga";
    }
}
