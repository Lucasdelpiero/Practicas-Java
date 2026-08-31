/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba;
import java.util.ArrayList;

public class Torneo {
    private static Torneo torneo = null;
    private ArrayList<Equipo> equipos;
    private ArrayList<Partido> partidos;

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }
    
    public Equipo comparaEquipos(Equipo equipo1, Equipo equipo2){
        int puntos1, puntos2;
        puntos1 = equipo1.getPuntaje();
        puntos2 = equipo2.getPuntaje();
        
        if (puntos1 > puntos2){
            return equipo1;
        } else if (puntos2 > puntos1) return equipo2;
        
        int golesFav1 = equipo1.getGolesContra();
        int golesFav2 = equipo2.getGolesFavor();
        
        if (golesFav1 > golesFav2){
            return equipo1;
        } else if (golesFav2 > golesFav1) return equipo2;
        
        int golesContra1 = equipo1.getGolesContra();
        int golesContra2 = equipo2.getGolesContra();
        
        if (golesContra1 < golesContra2){
            return equipo1;
        } else if (golesContra2 > golesContra1) return equipo2;
        
        
        return equipo1;
    }
    
    public Jugador comparaJugadores(Jugador jug1, Jugador jug2){
        if (jug1.getCantGoles() > jug2.getCantGoles())
            return jug1;
        else return jug2;
    }
    
    public int puntosObtenidos(Equipo equipo){
        int total = 0;
        for(Partido part: partidos)
            if (part.estaEquipo(equipo)) 
                total += part.puntosPara(equipo);
        
        return total;
    }
    
    public void simularTorneo(){
        Partido partido;
        int fecha = 1;
        if (equipos == null)
            return;
        for(Equipo local: equipos){
            for(Equipo visitante: equipos){
                if (local != visitante){
                    partido = new Partido(local, visitante, fecha++);
                    partido.simularPartido();
                    partidos.add(partido);
                }
            }
        }
    }
    
    public Jugador getGoleadorEquipo(Equipo equipo){
        return equipo.getGoleador();
    }
    
    public static Torneo getTorneo() {
        if (torneo == null)
            torneo = new Torneo();
        
         
        torneo.equipos = new ArrayList<Equipo>();
        torneo.partidos = new ArrayList<Partido>();
        Equipo eq = new Equipo("River");
        Jugador jug = new Jugador("Barovero", "91218", 1, 1);
        eq.incorporaJugador(jug);
        jug = new Jugador("Maidana", "91218", 2, 2);
        eq.incorporaJugador(jug);
        jug = new Jugador("Ponzio", "91218", 23, 5);
        eq.incorporaJugador(jug);
        jug = new Jugador("Mora", "91218", 7, 7);
        eq.incorporaJugador(jug);
        torneo.equipos.add(eq);
        
        eq = new Equipo("Boca");
        jug = new Jugador("Orion", "666", 1, 1);
        eq.incorporaJugador(jug);
        jug = new Jugador("Blanco", "444", 2, 2);
        eq.incorporaJugador(jug);
        jug = new Jugador("Gago", "555", 5, 5);
        eq.incorporaJugador(jug);
        jug = new Jugador("Tevez", "91218", 10, 9);
        eq.incorporaJugador(jug);
        torneo.equipos.add(eq);
        
        /*
        eq = new Equipo("Racing");
        jug = new Jugador("Saja", "777", 1, 1);
        eq.incorporaJugador(jug);
        jug = new Jugador("Di Marco", "444", 2, 2);
        eq.incorporaJugador(jug);
        jug = new Jugador("Milito", "22", 22, 9);
        eq.incorporaJugador(jug);
        torneo.equipos.add(eq);
        
        eq = new Equipo("Independiente");
        jug = new Jugador("Vizco", "777", 1, 1);
        eq.incorporaJugador(jug);
        jug = new Jugador("Milito trucho", "222", 2, 2);
        eq.incorporaJugador(jug);
        jug = new Jugador("Tagliafico", "998", 3, 3);
        eq.incorporaJugador(jug);
        torneo.equipos.add(eq);
        */
        
        
        return torneo;
    }
    
    
}
