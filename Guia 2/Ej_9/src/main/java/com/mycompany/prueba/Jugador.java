/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba;


public class Jugador {
    private String nombre;
    private int puntaje = 0;

    public String getNombre() {
        return nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    
    public void sumarPuntos(int num){
        this.puntaje += num;
    }
    
    public Jugador(String nombre) {
        this.nombre = nombre;
    }
    
    
}
