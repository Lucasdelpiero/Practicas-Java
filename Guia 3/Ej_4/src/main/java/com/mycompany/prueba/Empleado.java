/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba;

/**
 *
 * @author Lucas
 */
public abstract class Empleado {
    private String nombre;
    private int numeroLegajo;
    private String domicilio;

    public abstract double getSueldo();
    
    public String getNombre() {
        return nombre;
    }

    public int getNumeroLegajo() {
        return numeroLegajo;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    
    public Empleado(String nombre, int numeroLegajo, String domicilio) {
        this.nombre = nombre;
        this.numeroLegajo = numeroLegajo;
        this.domicilio = domicilio;
    }
    
    
    
    
}
