/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba;

/**
 *
 * @author Lucas
 */
public class EmpleadoPermanente extends Empleado {
    private int antiguedad;
    private double sueldoBase;
    
    public static enum Niveles {
        PRINCIPIANTE,
        INTERMEDIO,
        EXPERTO,
    }
    private Niveles nivel = Niveles.PRINCIPIANTE;

    public Niveles getNivel() {
        return nivel;
    }
    
    public double getSueldo(){
        return Sueldos.getSueldoNeto(this);
    }
    
    public void setNivel(Niveles nivel) {
        this.nivel = nivel;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
    
    
    
    public EmpleadoPermanente(String nombre, int numeroLegajo , String domicilio,int antiguedad, double sueldoBase,int expertice) {
        super(nombre, numeroLegajo, domicilio);
        this.antiguedad = antiguedad;
        this.sueldoBase = sueldoBase;
        if (expertice == 0)
            this.nivel = Niveles.PRINCIPIANTE;
        else if (expertice == 1)
            this.nivel = Niveles.INTERMEDIO;
        else
            this.nivel = Niveles.EXPERTO;
    }
    
    
    
    
    
}
