/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba;

public class CuentaUniversitaria extends CuentaBancaria{
    private final double topeDiario = 1000;
    private double cantExtraida = 0;
    
    public boolean extraer(double cant){
        if (saldo >= cant & cantExtraida + cant <= topeDiario){
            cantExtraida += cant;
            setSaldo(saldo - cant);
            System.out.println(getNombre() + " extrajo $" + cant + " / restanteDia: " + (topeDiario - cantExtraida));
            return true;
        } else{
            System.out.println(getNombre() + " no pudo extraer $" + cant + " / restanteDia: " + (topeDiario - cantExtraida));
            return false;
        }
            
    }
    
    public double getTopeDiario() {
        return topeDiario;
    }

    public double getCantExtraida() {
        return cantExtraida;
    }
    
    public void reseteaCantExtraida(){
            cantExtraida = 0;
    }

    public CuentaUniversitaria(String nombre) {
        super(nombre);
    }
   
}
