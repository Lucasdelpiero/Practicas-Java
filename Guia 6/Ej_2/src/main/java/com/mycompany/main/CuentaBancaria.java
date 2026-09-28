/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Lucas
 */
public class CuentaBancaria {
    protected double saldo;
    protected String titular;

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }
    
    void depositar(double cantidad) throws DepositoInvalidoException{
        if (cantidad <= 0)
            throw new DepositoInvalidoException(cantidad);
        this.saldo += cantidad;
    }
    
    void extraer(double cantidad) throws ExtraccionInvalidaException{
        if (cantidad > saldo)
            throw new ExtraccionInvalidaException(saldo, cantidad);
        this.saldo -= cantidad;
    }

    public CuentaBancaria(String titular, double saldo) {
        this.saldo = saldo;
        this.titular = titular;
    }
    
    
    
}
