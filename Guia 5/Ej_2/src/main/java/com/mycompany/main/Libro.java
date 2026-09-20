/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Lucas
 */
public class Libro extends Publicacion implements Prestable{
    protected boolean prestado = false;

    @Override
    public boolean isPrestado() {
        return prestado;
    }
    
    @Override
    public void prestar() {
        if (!isPrestado()){
            prestado = true;
            System.out.println("Se presto: " + getTitulo());
        }
        else
            System.out.println("Ya esta prestado");
    }
    
    @Override
    public void devolver() {
        if (isPrestado()){
            prestado = false;
            System.out.println("Se devolvio: " + getTitulo());
        }
        else
            System.out.println("No esta prestado");
    }
    
    @Override
    public String toString(){
        String pal = "";
        pal = getCodigo() + "-" + getTitulo() + "-" + Integer.toString(getAnio());
        return pal;
    }
    
    public Libro(String codigo, String titulo, int anio) {
        super(codigo, titulo, anio);
    }
    
}
