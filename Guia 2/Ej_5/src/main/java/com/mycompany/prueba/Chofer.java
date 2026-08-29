/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba;

/**
 *
 * @author Lucas
 */
public class Chofer {
    private Categoria categoria;
    private Domicilio domicilio;
    private String nombre;
    private Colectivo colectivo;

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }
    
    public void setColectivo(Colectivo colectivo) {
        this.colectivo = colectivo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public String getNombre() {
        return nombre;
    }

    public Colectivo getColectivo() {
        return colectivo;
    }
    
    public Chofer(String nombre, Categoria categoria, Domicilio domicilio) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.domicilio = domicilio;
    }
}
