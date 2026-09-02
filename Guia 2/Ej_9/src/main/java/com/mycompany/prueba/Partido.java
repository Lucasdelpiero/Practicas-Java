/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba;

import java.util.GregorianCalendar;
import java.util.ArrayList;

public class Partido {
    private GregorianCalendar fecha;
    private ArrayList<Jugador> participantes, local, visitante;
    private int golesLocal, golesVisitante;

    public GregorianCalendar getFecha() {
        return fecha;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public ArrayList<Jugador> getParticipantes() {
        return participantes;
    }
    
    public boolean jueganJuntos(Jugador jug1, Jugador jug2){
        return ((local.contains(jug1) & local.contains(jug2)) | (visitante.contains(jug1) & visitante.contains(jug2)) );
    }
    
    public int puntosParaJugador(Jugador jug){
       if (golesLocal > golesVisitante & local.contains(jug))
           return 3;
       else
           if (golesLocal < golesVisitante & visitante.contains(jug))
               return 3;
           else if(golesLocal == golesVisitante)
               return 1;
       return 0;
   }
    
    public void escribePartido(){
        System.out.println("Locales:");
        for (Jugador jug: local)
            System.out.println(jug.getNombre() + ": " + jug.getPuntaje());
        
        System.out.println("Visitante:");
        for (Jugador jug: visitante)
            System.out.println(jug.getNombre() + ": " + jug.getPuntaje());
        
        System.out.println("Resultado: " + golesLocal + "-" + golesVisitante);
        System.out.println("------------------------------");
    }
    
    private void armarEquipos(){
        ArrayList<Jugador> temp = new ArrayList<Jugador>(participantes);
        temp.sort((j1, j2) -> -1 * Integer.compare(j1.getPuntaje(),j2.getPuntaje()));
        /*
        for (Jugador jug: temp)
            System.out.println(jug.getNombre() + ": " + jug.getPuntaje());
        */
        
        int i = 0;
        for(i=0; i < temp.size(); i++){{
            if (i % 2 == 0)
                local.add(temp.get(i));
            else
                visitante.add(temp.get(i));
        }    
        }
        /*
        System.out.println("Locales:");
        for (Jugador jug: local)
            System.out.println(jug.getNombre() + ": " + jug.getPuntaje());
        
        System.out.println("Visitante:");
        for (Jugador jug: visitante)
            System.out.println(jug.getNombre() + ": " + jug.getPuntaje());
        */
    }
    
    public void setResultado(int golesLocal, int golesVisitante){
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
        
        if(golesLocal > golesVisitante){
            for(Jugador jug: local)
                jug.sumarPuntos(3);
        } else if (golesLocal < golesVisitante){
            for(Jugador jug: visitante)
                jug.sumarPuntos(3);
        } else {
            for(Jugador jug: participantes)
                jug.sumarPuntos(1);
        }
        /*
        System.out.println("Resultado: " + golesLocal + "-" + golesVisitante);
        System.out.println("------------------------------");
        */
    }
    
    public Partido(GregorianCalendar fecha, ArrayList<Jugador> participantes) {
        this.fecha = fecha;
        this.participantes = participantes;
        local = new ArrayList<>();
        visitante = new ArrayList<>();
        armarEquipos();
    }
    
    
}
