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
    
    public boolean extraer(double cant){
        if (cantExtracciones <= maxExtracciones & getSaldo() > cant){
            cantExtracciones++;
            System.out.println(getNombre() + " extrajo $" + cant + " / numExtRest: " + (maxExtracciones - cantExtracciones));
            setSaldo(getSaldo() - cant);
            return true;
        } else {
            System.out.println(getNombre() + " no pudo extraer $" + cant);
            return false;
        }
    }
   
    public CajaDeAhorro(String nombre) {
        super(nombre);
    }
    
    
}
