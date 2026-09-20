/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Lucas
 */
public class Perro extends Animal implements Emisor_De_Sonido{
    
    @Override
    public void emiteSonido(){
        System.out.println("Guau");
    }
    
    public Perro(String nombre, int esperanzaDeVida) {
        super(nombre, esperanzaDeVida);
    }
    
}
