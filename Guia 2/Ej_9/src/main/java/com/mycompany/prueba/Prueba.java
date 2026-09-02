/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prueba;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Prueba {
    private static ArrayList<Partido> partidos;
    private static ArrayList<Jugador> amigos;
    
    public static void escribeHistorial(){
        for(Partido part: partidos)
            part.escribePartido();
    }
    
    public static void consultaPar(Jugador jug1, Jugador jug2){
        int cantJuntos=0, cantEnfrentados=0;
        for(Partido part: partidos){
            if(part.jueganJuntos(jug1, jug2))
                cantJuntos++;
            else
                cantEnfrentados++;
        }
        System.out.println(jug1.getNombre() + " y " + jug2.getNombre() + " jugaron:");
        System.out.println("Juntos: " + cantJuntos);
        System.out.println("Enfrentados: " + cantEnfrentados);
    }
    
    public static void consultaJug(Jugador jug){
        int ganados=0, empatados=0, perdidos=0;
        
        for(Partido part: partidos){
            int punt = part.puntosParaJugador(jug);
            if(punt == 3)
                ganados++;
            else if (punt == 1)
                empatados++;
            else
                perdidos++;
        }
        System.out.println(jug.getNombre());
        System.out.println("Ganados: " + ganados);
        System.out.println("Empatados: " + empatados);
        System.out.println("Perdidos: " + perdidos);
    }
    
    
    public Prueba() {
        partidos = new ArrayList<>();
        amigos = new ArrayList<>();
    }
    
    public static void main(String[] args) {
        Prueba prueba = new Prueba();
        Jugador jug = new Jugador("Lucas");
        jug.setPuntaje(10);
        Jugador lucas = jug;
        amigos.add(jug);
        jug = new Jugador("Santi");
        jug.setPuntaje(9);
        amigos.add(jug);
        jug = new Jugador("Renzo");
        amigos.add(jug);
        jug = new Jugador("Martin");
        Jugador martin = jug;
        amigos.add(jug);
        jug = new Jugador("Nico");
        amigos.add(jug);
        jug = new Jugador("Mauro");
        amigos.add(jug);
        
        GregorianCalendar fecha = new GregorianCalendar(2026, 8, 20);
        Partido part = new Partido(fecha, amigos);
        part.setResultado(4, 2);
        partidos.add(part);
   
        part = new Partido(fecha, amigos);
        part.setResultado(3, 1);
        partidos.add(part);
        
        part = new Partido(fecha, amigos);
        part.setResultado(2, 2);
        partidos.add(part);
        
        part = new Partido(fecha, amigos);
        part.setResultado(1, 4);
        partidos.add(part);
        
        escribeHistorial();
        consultaJug(lucas);
        consultaPar(lucas, martin);
        
    }
}
