/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Lucas
 */
public class Ambulancia extends Vehiculo implements Emisor_De_Sonido{
    
    @Override
    public void emiteSonido(){
        System.out.println("WIII UUUU WIII UUU");
    }
    
    
    public Ambulancia(String patente, String numeroChasis, String numeroMotor) {
        super(patente, numeroChasis, numeroMotor);
    }
    
}
