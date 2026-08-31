/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba;


public class Jugador {
    private String nombre, nacimiento;
    private int numCamiseta, numPos, cantJugados = 0, cantGoles = 0;

    public String getNombre() {
        return nombre;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public int getNumCamiseta() {
        return numCamiseta;
    }

    public int getNumPos() {
        return numPos;
    }

    public int getCantJugados() {
        return cantJugados;
    }

    public int getCantGoles() {
        return cantGoles;
    }
    
    public double getPromedioGol(){
        if (cantJugados == 0)
            return 0;
        else{
            return (double)cantGoles / (double)cantJugados;
        }
    }
    
    public void sumarPartido(){
        cantJugados++;
    }
    
    public void sumarGol(){
        cantGoles++;
    }
   
    
    public Jugador(String nombre, String nacimiento, int numCamiseta, int numPos) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.numCamiseta = numCamiseta;
        this.numPos = numPos;
    } 
    
}
