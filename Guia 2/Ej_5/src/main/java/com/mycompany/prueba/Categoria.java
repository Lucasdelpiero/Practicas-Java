/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba;

/**
 *
 * @author Lucas
 */
public class Categoria {
    private String nombreCategoria;
    private double sueldo;

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public double getSueldo() {
        return sueldo;
    }

    public Categoria(String nombreCategoria, double sueldo) {
        this.nombreCategoria = nombreCategoria;
        this.sueldo = sueldo;
    }
    
    
}
