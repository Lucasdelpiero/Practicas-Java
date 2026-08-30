/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba;
import java.util.HashMap;

public class Agenda {
    private HashMap<String, Contacto> contactos;

    public HashMap<String, Contacto> getContactos() {
        return contactos;
    }
    
    public Contacto agregaContacto(String nombre, int fijo, int[] celulares){
        Contacto cont = new Contacto(nombre, fijo, celulares);
        contactos.put(nombre, cont);
        return cont;
    }
    
    public Contacto buscaContacto(String nombre){
        return contactos.get(nombre);
    }
    
    public void mostrarContactos(){
        for(String cont : contactos.keySet()){
            contactos.get(cont).printDatos();
        }
    }
    
    public Agenda() {
        contactos = new HashMap<String, Contacto>();
    }
}
