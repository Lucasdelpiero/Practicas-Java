/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Lucas
 */
public class Dato_Extraccion_Invalido {
    protected double extraccion_solicitada;
    protected double saldo;

    public double getExtraccion_solicitada() {
        return extraccion_solicitada;
    }

    public double getSaldo() {
        return saldo;
    }

    public Dato_Extraccion_Invalido(double saldo, double extraccion_solicitada) {
        this.extraccion_solicitada = extraccion_solicitada;
        this.saldo = saldo;
    }
    
    
}
