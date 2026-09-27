/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Lucas
 */
public class Usuario {
    String nombre, contraseña;

    public String getNombre() {
        return nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    protected void setNombre(String nombre) throws NombreInvalidoException {
        if (nombre == null || nombre == "")
            throw new NombreInvalidoException();
        this.nombre = nombre;
    }

    protected void setContraseña(String contraseña) throws ContrasenaInvalidaException {
        if (contraseña == null || contraseña == "")
            throw new ContrasenaInvalidaException();
        this.contraseña = contraseña;
    }
    
    
    
    public Usuario(String nombre, String contraseña) throws NombreInvalidoException, ContrasenaInvalidaException{
        try {
            this.setNombre(nombre);
        }
        catch(NombreInvalidoException e){
            throw e;
        }
        
        try {
            this.setContraseña(contraseña);
        }
        catch(ContrasenaInvalidaException e) {
            throw e;
        }
    }
    
    
}
