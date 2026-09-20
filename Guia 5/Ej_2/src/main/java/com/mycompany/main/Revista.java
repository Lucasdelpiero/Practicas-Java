/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Lucas
 */
public class Revista extends Publicacion {
    protected int numero;

    public int getNumero() {
        return numero;
    }
    
    @Override
    public String toString() {
        String pal = "";
        pal = getCodigo() + "-" + getTitulo() + "-" + Integer.toString(getAnio()) + "-" + Integer.toString(getNumero());
        return pal;
    }
    
    public Revista(String codigo, String titulo, int anio, int numero) {
        super(codigo, titulo, anio);
        this.numero = numero;
    }

    
    
}
