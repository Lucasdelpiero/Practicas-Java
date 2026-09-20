/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Lucas
 */
public class Cancion {
    protected int numeroPista;
    protected String titulo;
    protected double duracion;

    public int getNumeroPista() {
        return numeroPista;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getDuracion() {
        return duracion;
    }

    public Cancion(int numeroPista, String titulo, double duracion) {
        this.numeroPista = numeroPista;
        this.titulo = titulo;
        this.duracion = duracion;
    }
}
