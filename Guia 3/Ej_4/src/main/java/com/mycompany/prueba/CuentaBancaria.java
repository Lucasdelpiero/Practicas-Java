/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba;


public class CuentaBancaria {
    private String nombre;
    protected double saldo = 0;

    public String getNombre() {
        return nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public boolean extraer(double cant){
        if(cant >= saldo){
            System.out.println(getNombre() + " extrajo $" + cant);
            setSaldo(saldo - cant);
            return true;
        } else {
            System.out.println(getNombre() + " no pudo extraer $" + cant);
            return false;
        }
    }
    
    public void depositar(double cant){
        System.out.println(getNombre() + " deposito $" + cant);
        setSaldo(saldo + cant);
    }

    public CuentaBancaria(String nombre) {
        this.nombre = nombre;
    }
    
   
    
}
