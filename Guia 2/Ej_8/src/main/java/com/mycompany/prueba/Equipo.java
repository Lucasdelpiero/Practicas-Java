/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba;
import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private ArrayList<Jugador> jugadores;
    private int cantGanados = 0, cantEmpatados = 0, cantPerdidos = 0, golesFavor = 0, golesContra = 0;

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }
    
    public void sumarGanado(){
        cantGanados++;
    }
    
    public void sumarEmpatados(){
        cantEmpatados++;
    }
    
    public void sumarPerdidos(){
        cantPerdidos++;
    }
    
    public int getCantGanados() {
        return cantGanados;
    }

    public int getCantEmpatados() {
        return cantEmpatados;
    }

    public int getCantPerdidos() {
        return cantPerdidos;
    }

    public int getGolesFavor() {
        return golesFavor;
    }

    public int getGolesContra() {
        return golesContra;
    }
    
    public int getPuntaje(){
        return cantGanados * 3 + cantEmpatados;
    }
    
    public boolean tieneA(Jugador jugador){
        return jugadores.contains(jugador);
    }
    
    public void sumarGoles(int favor, int contra){
        golesFavor += favor;
        golesContra += contra;
    }
    
    public void incorporaJugador(Jugador jug){
        jugadores.add(jug);
    }
    
    public Jugador getGoleador(){
        Jugador goleador = jugadores.get(0);
        for(Jugador jug: jugadores){
            //System.out.println(jug.getNombre() +  " tiene " + jug.getCantGoles());
            if (jug.getCantGoles() > goleador.getCantGoles())
                goleador = jug;
        }
        return goleador;
    }
    
    public Equipo(String nombre) {
        this.nombre = nombre;
        jugadores = new ArrayList<>();
    }
    
    
}
