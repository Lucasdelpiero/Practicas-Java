/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba;


public class Surtidor {
    private final int id; 
    private static int sigNum = 0;
    private int cantGasoil;
    private int cantPremium;
    private int cantSuper; 
    private final int maximaCarga = 20000;
    
    private int ventasGasoil;
    private int ventasPremium;
    private int ventasSuper;
    
    public int getCantTipo(int tipo){
        if(tipo == 0)
            return getCantGasoil();
        else if (tipo == 1)
            return getCantPremium();
        else
            return getCantSuper();
    }
    
    public int getId(){
        return id;
    }
    
    public int getCantGasoil() {
        return cantGasoil;
    }

    public int getCantPremium() {
        return cantPremium;
    }

    public int getCantSuper() {
        return cantSuper;
    }

    public int getVentasGasoil() {
        return ventasGasoil;
    }

    public int getVentasPremium() {
        return ventasPremium;
    }

    public int getVentasSuper() {
        return ventasSuper;
    }
    
    public int getVentasTipo(int tipo){
        if (tipo == 0)
            return getVentasGasoil();
        else if (tipo == 1)
            return getVentasPremium();
        else 
            return getVentasSuper();
    }
    
    public int getVentasTotales(){
        return getVentasGasoil() + getVentasPremium() + getVentasSuper();
    }
    
    public void llenarDepositoGasoil(){
        cantGasoil = maximaCarga;
    }
    
    public void llenarDepositoPremium(){
        cantPremium = maximaCarga;
    }
    
    public void llenarDepositoSuper(){
        cantSuper = maximaCarga;
    }
    
    public boolean extraerGasoil(int cant){
        if (cant < cantGasoil){
            cantGasoil -= cant;
            ventasGasoil += cant;
            return true;
        } else return false;
    }
    
    public boolean extraerPremium(int cant){
        if (cant < cantPremium){
            cantPremium -= cant;
            ventasPremium += cant;
            return true;
        } else return false;
    }
    
    public boolean extraerSuper(int cant){
        if (cant < cantSuper){
            cantSuper -= cant;
            ventasSuper += cant;
            return true;
        } else return false;
    }
    

    public Surtidor() {
        id = sigNum++;
        cantGasoil = maximaCarga;
        cantPremium = maximaCarga;
        cantSuper = maximaCarga;
    }
    
    
}
