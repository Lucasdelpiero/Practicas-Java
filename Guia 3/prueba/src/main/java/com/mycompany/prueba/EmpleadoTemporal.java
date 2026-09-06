/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba;

/**
 *
 * @author Lucas
 */
public class EmpleadoTemporal extends Empleado{
    private double sueldoHora;
    private int horasTrabajadas;
    
    public double getSueldo(){
        return Sueldos.getSueldoNeto(this);
    }
    
    public double getSueldoHora() {
        return sueldoHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setSueldoHora(double sueldoHora) {
        this.sueldoHora = sueldoHora;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    
    
    
    public EmpleadoTemporal(String nombre, int numeroLegajo, String domicilio, double sueldoHora, int horasTrabajadas) {
        super(nombre, numeroLegajo, domicilio);
        this.sueldoHora = sueldoHora;
        this.horasTrabajadas = horasTrabajadas;
    }
    
    
}
