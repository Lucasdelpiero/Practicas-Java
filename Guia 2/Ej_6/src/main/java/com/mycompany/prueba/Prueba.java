/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prueba;


import java.util.Random;

public class Prueba {

    
    public void simulaUso(Estacion estacion){
        int num;
        Random r = new Random();
        for(Surtidor surt: estacion.getSurtidores()){
            num = r.nextInt(20000);
            surt.extraerGasoil(num);
            num = r.nextInt(20000);
            surt.extraerPremium(num);
            num = r.nextInt(20000);
            surt.extraerSuper(num);
            surt.llenarDepositoGasoil();
            surt.llenarDepositoPremium();
            surt.llenarDepositoSuper();
        }
        
        for(Surtidor surt: estacion.getSurtidores()){
            num = r.nextInt(20000);
            surt.extraerGasoil(num);
            num = r.nextInt(20000);
            surt.extraerPremium(num);
            num = r.nextInt(20000);
            surt.extraerSuper(num);
        }
        
    }
    
    public static void main(String[] args) {
        Estacion estacion = new Estacion();
        Prueba prueba = new Prueba();
        prueba.simulaUso(estacion);
        
        System.out.println("1: Cant surtidores: " + estacion.getSurtidores().size());
        System.out.println("2: Existencia Gasoil: [L] " + estacion.getCantLitros(0));
        System.out.println("2: Existencia Premium: [L] " + estacion.getCantLitros(1));
        System.out.println("2: Existencia Super: [L] " + estacion.getCantLitros(2));
        System.out.println("3: Mas ventas Gasoil: [ID] " + estacion.surtMayorVentasTipo(0).getId());
        System.out.println("3: Mas ventas Premium: [ID] " + estacion.surtMayorVentasTipo(1).getId());
        System.out.println("3: Mas ventas Super: [ID] " + estacion.surtMayorVentasTipo(2).getId());
        System.out.println("4: Datos historicos ");
        System.out.println("4: Surtidor para Gasoil: ");
        estacion.printVentasSurtidor(0);
        System.out.println("4: Estacion para Gasoil: " + estacion.getVentasEstacion(0));
        
    }
}
