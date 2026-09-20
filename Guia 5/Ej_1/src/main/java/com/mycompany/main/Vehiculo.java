/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Lucas
 */
public class Vehiculo {
    protected String patente;
    protected String numeroChasis;
    protected String numeroMotor;

    public String getPatente() {
        return patente;
    }

    public String getNumeroChasis() {
        return numeroChasis;
    }

    public String getNumeroMotor() {
        return numeroMotor;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public void setNumeroChasis(String numeroChasis) {
        this.numeroChasis = numeroChasis;
    }

    public void setNumeroMotor(String numeroMotor) {
        this.numeroMotor = numeroMotor;
    }

    public Vehiculo(String patente, String numeroChasis, String numeroMotor) {
        this.patente = patente;
        this.numeroChasis = numeroChasis;
        this.numeroMotor = numeroMotor;
    }
    
    
}
