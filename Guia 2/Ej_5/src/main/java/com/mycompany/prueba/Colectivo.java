/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba;

/**
 *
 * @author Lucas
 */
public class Colectivo {
    private String modelo;
    private int numeroInterno = 0;
    private static int sig = 0;

    public String getModelo() {
        return modelo;
    }

    public int getNumerointerno() {
        return numeroInterno;
    }

    public Colectivo(String modelo) {
        this.modelo = modelo;
        numeroInterno = sig;
        Colectivo.sig++;
    }
}
