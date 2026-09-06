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
public class Empresa {
    private ArrayList<Departamento> departamentos;
    
    public void añadirDepartamento(Departamento dep){
        departamentos.add(dep);
    }
    
    public void imprimePlanillas(){
        for(Departamento dep: departamentos)
            dep.imprimePlanilla();
    }
    
    public Empresa() {
        departamentos = new ArrayList<Departamento>();
    }
    
    
}
