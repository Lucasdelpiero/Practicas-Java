/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba;
import java.util.ArrayList;

public class Contacto {
    private String nombre;
    private int fijo;
    private int[] celulares;

    public void setFijo(int fijo) {
        this.fijo = fijo;
    }

    public void setCelulares(int[] celulares) {
        this.celulares = celulares;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFijo() {
        return fijo;
    }

    public int[] getCelulares() {
        return celulares;
    }
    
    public void printDatos(){
        System.out.println("Nombre: " +getNombre());
        System.out.println("-Fijo: " + getFijo());
        for(int cel : getCelulares())
            System.out.println("-Cel :" + cel);  
    }
    
    public Contacto(String nombre, int fijo, int[] celulares) {
        this.nombre = nombre;
        this.fijo = fijo;
        this.celulares = celulares;
    }  
}
