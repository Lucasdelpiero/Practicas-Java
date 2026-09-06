/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba;

import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class Departamento {
    private String nombre;
    private ArrayList<Empleado> empleados;
    
    public void imprimePlanilla(){
        System.out.println("Departemento de " + getNombre() + ": ");
        for(Empleado emp: empleados)
            System.out.println(emp.getNombre() +  ": $" + emp.getSueldo());
    }
    
    public void agregarEmpleado(Empleado emp){
        empleados.add(emp);
    }
    
    public void quitarEmpleado(Empleado emp){
        empleados.remove(emp);
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
    public Departamento(String nombre, ArrayList<Empleado> empleados) {
        this.nombre = nombre;
        this.empleados = empleados;
    }

    public Departamento(String nombre) {
        this.nombre = nombre;
        empleados = new ArrayList<Empleado>();
    }
 
}
