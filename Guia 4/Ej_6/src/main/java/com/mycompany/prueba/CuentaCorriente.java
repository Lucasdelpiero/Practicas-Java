/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba;


public class CuentaCorriente extends CuentaBancaria{
    private double tope;
    private double cantGirada;

    public void setTope(double tope) {
        this.tope = tope;
    }

    public double getTope() {
        return tope;
    }

    public double getCantGirada() {
        return cantGirada;
    }
    
    public boolean girarDescubierto(double cant){
        if(cantGirada + cant <= tope){
            System.out.println(getNombre() + " giro al descubierto $" + cant);
            cantGirada += cant;
            return true;
        } else {
            System.out.println(getNombre() + " no pudo girar al descubierto $" + cant);
            return false;
        }
    }
    
    public CuentaCorriente(String nombre, double tope) {
        super(nombre);
        this.tope = tope;
    }
}
