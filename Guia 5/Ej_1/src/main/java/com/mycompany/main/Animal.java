/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Lucas
 */
public class Animal {
    protected String nombre;
    protected int esperanzaDeVida;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEsperanzaDeVida(int esperanzaDeVida) {
        this.esperanzaDeVida = esperanzaDeVida;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEsperanzaDeVida() {
        return esperanzaDeVida;
    }

    public Animal(String nombre, int esperanzaDeVida) {
        this.nombre = nombre;
        this.esperanzaDeVida = esperanzaDeVida;
    }
    
    
}
