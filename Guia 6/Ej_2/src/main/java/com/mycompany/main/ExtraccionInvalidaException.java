/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Lucas
 */
public class ExtraccionInvalidaException extends Exception{
    private Dato_Extraccion_Invalido dato;

    public Dato_Extraccion_Invalido getDato() {
        return dato;
    }
    
    public ExtraccionInvalidaException(double saldo, double extraccionSolicitada) {
        this.dato = new Dato_Extraccion_Invalido(saldo, extraccionSolicitada);
    }
    
    
}
