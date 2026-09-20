/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class CD implements Prestable, Comparable<CD>{
    protected String codigo;
    protected String titulo;
    protected String interprete;
    protected ArrayList<Cancion> canciones;
    protected boolean prestado;
    
    @Override
    public int compareTo(CD o) {
        int valor = interprete.compareTo(o.getInterprete());
        if (valor == 0)
            valor = titulo.compareTo(o.getTitulo());
        return valor;
    }
    
    public void agregarCancion(Cancion can){
            canciones.add(can);
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getInterprete() {
        return interprete;
    }
    
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
    

    public CD(String codigo, String titulo, String interprete){
        this.codigo = codigo;
        this.titulo = titulo;
        this.interprete = interprete;
        canciones = new ArrayList<>();
    }

    public CD(String codigo, String titulo, String interprete, ArrayList<Cancion> canciones) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.interprete = interprete;
        this.canciones = canciones;
        canciones = new ArrayList<>();
    }

    

    
    
    
}
