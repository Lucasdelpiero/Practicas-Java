/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ej_3;

public class CuentaBancaria {
    private double saldo;
    private String titular;
    
    CuentaBancaria(String titular){
        this.titular = titular;
    }
    
    void depositar(double monto){
        if (monto > 0){
            saldo += monto;
        }
    }
    
    boolean extraer(double monto){
        if (saldo >= monto){
            saldo -= monto;
            return true;
        } else return false;
    }
    
    double getSaldo(){
    return saldo;
    }
    String getTitular(){
    return titular;
    }
    

}
