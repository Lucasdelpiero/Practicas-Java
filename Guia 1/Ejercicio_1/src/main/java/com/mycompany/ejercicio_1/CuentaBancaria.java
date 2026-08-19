/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_1;

/**
 *
 * @author cabro
 */
public class CuentaBancaria {
    private double saldo;
    String titular;
    
    public CuentaBancaria(String titular, double cantidad){
        this.titular = titular;
        this.saldo = cantidad;
    }
    
    void depositar(double cantidad){
        this.saldo += cantidad;
    }
    
    void extraer(double cantidad){
        this.saldo -= cantidad;
    }
    
    double getSaldo(){
        return this.saldo;
    }   
    
    void setTitular(String titular){
        this.titular = titular;
    }
    
    String getTitular(){
        return this.titular;
    }
}
