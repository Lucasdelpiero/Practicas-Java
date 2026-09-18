/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prueba;


public class Prueba {

    public static void main(String[] args) {
        CajaDeAhorro ahorro = new CajaDeAhorro("Lucas");
        CuentaCorriente corriente = new CuentaCorriente("Santi", 500);
        CuentaUniversitaria universitaria = new CuentaUniversitaria("Martin");
        
        ahorro.depositar(1000);
        ahorro.extraer(100);
        ahorro.extraer(300);
        ahorro.extraer(800);
        
        corriente.girarDescubierto(400);
        corriente.girarDescubierto(200);
        
        universitaria.depositar(4000);
        universitaria.extraer(800);
        universitaria.extraer(500);
        universitaria.extraer(200);
    }
}
