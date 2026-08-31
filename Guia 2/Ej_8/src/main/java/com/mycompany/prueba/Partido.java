/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba;
import java.util.ArrayList;
import java.util.Random;

public class Partido {
    private Equipo local, visitante;
    private int fecha;
    ArrayList<Jugador> goleadores;

    public Equipo getLocal() {
        return local;
    }

    public Equipo getVisitante() {
        return visitante;
    }

    public int getFecha() {
        return fecha;
    }

    public ArrayList<Jugador> getGoleadores() {
        return goleadores;
    }
    
    
    
    public int golesEquipo(Equipo equipo){
        int total = 0;
        for(Jugador gol: goleadores)
            if (equipo.tieneA(gol))
                total++;
        
        return total;
    }
    
    public boolean estaEquipo(Equipo equipo){
        return equipo == local || equipo == visitante;
    }
    
    public int puntosPara(Equipo equipo){
        Equipo otro;
        if (equipo == local)
            otro = visitante;
        else
            otro = local;
        
        int golesE = golesEquipo(equipo);
        int golesOtro = golesEquipo(otro);
        
        
        if(golesE > golesOtro)
            return 3;
        else
            if (golesE == golesOtro)
                    return 1;
            else return 0;
    }
    
    public void simularPartido(){
        System.out.println("Se juega " + local.getNombre() + " VS " + visitante.getNombre() + " Fecha " + fecha);
        
        Random r = new Random();
        int golesLocal = r.nextInt(5);
        int golesVis = r.nextInt(5);
        int rand;
        int i;
        
        System.out.println("-Resultado: " + golesLocal+ "-" + golesVis);
        System.out.println("-Goleadores:");
        Jugador tempJug;
        System.out.println("--" + local.getNombre());
        for(i=0; i < golesLocal; i++){
            rand = r.nextInt(local.getJugadores().size() );
            tempJug = local.getJugadores().get(rand);
            goleadores.add(tempJug); 
            System.out.println("+++" + tempJug.getNombre());
        }
        System.out.println("--" + visitante.getNombre());
        for(i=0; i < golesVis; i++){
            rand = r.nextInt(visitante.getJugadores().size() - 1);
            tempJug = visitante.getJugadores().get(rand);
            goleadores.add(tempJug);
            System.out.println("+++" + tempJug.getNombre());
            
        }
        
        ;
        
        local.sumarGoles(golesLocal, golesVis);
        visitante.sumarGoles(golesVis, golesLocal);
        if (golesLocal > golesVis){
          local.sumarGanado();
          visitante.sumarPerdidos();
        } else if (golesLocal < golesVis){
            visitante.sumarGanado();
            local.sumarPerdidos();
        } else {
            local.sumarEmpatados();
            visitante.sumarEmpatados();
        }
        
        for(Jugador jug: local.getJugadores()){
            jug.sumarPartido();
        }
        
        for(Jugador jug: visitante.getJugadores()){
            jug.sumarPartido();
        }
        
        
        for(Jugador jug: goleadores){
            jug.sumarGol();
        }
    }
    
    public Partido(Equipo local, Equipo visitante, int fecha) {
        this.local = local;
        this.visitante = visitante;
        this.fecha = fecha;
        goleadores = new ArrayList<>();
    }
}
