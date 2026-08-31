/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prueba;

/**
 *
 * @author Lucas
 */
public class Prueba {
    public static void main(String[] args) {
        Torneo torneo = Torneo.getTorneo();
        torneo.simularTorneo();
        
        Equipo river = torneo.getEquipos().get(0);
        Jugador goleador = river.getGoleador();
        System.out.println("Goleador de River: " + goleador.getNombre() +  " con " + goleador.getCantGoles() + " goles");
        System.out.println("Promedio gol de goleador: " + goleador.getPromedioGol());
        System.out.println("Puntos de River: " + torneo.puntosObtenidos(river));
        Equipo boca = torneo.getEquipos().get(1);
        System.out.println("El mejor entre river y boca es: " + torneo.comparaEquipos(river, boca).getNombre());
    }
}
