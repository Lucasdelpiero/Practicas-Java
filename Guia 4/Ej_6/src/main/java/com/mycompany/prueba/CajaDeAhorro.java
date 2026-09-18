/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba;

public class CajaDeAhorro extends CuentaBancaria{
    private static final int maxExtracciones = 5;
    private int cantExtracciones = 0;

    public static int getMaxExtracciones() {
        return maxExtracciones;
    }
    
    @Override
    protected boolean validaExtraccion(double cant){
        return (cantExtracciones <= maxExtracciones & getSaldo() > cant);
    }
    
    @Override
    public void extraer(double cant){
        if (validaExtraccion(cant))
            cantExtracciones++;
    }
    
   
    public CajaDeAhorro(String nombre) {
        super(nombre);
    }
    
    
}
