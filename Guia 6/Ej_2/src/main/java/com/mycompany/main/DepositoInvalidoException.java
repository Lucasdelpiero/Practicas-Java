/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Lucas
 */
public class DepositoInvalidoException extends Exception{
    protected double cantidadInvalida;

    public double getCantidadInvalida() {
        return cantidadInvalida;
    }
    
    public DepositoInvalidoException(double cantidadInvalida) {
        this.cantidadInvalida = cantidadInvalida;
    }
    
    
    
    
    
}
