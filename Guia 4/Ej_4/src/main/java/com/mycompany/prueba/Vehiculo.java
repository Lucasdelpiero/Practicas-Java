/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba;


public class Vehiculo {
    protected String patente;
    protected double precioBase = 500;
    protected String descripcion = "";
    
 /**
  * <b>Pre:</b> Patente existe y no es null. <br>
  * <b>Post:</b> Devuelve el string patente. <br>
 */
    public String getPatente() {
        return patente;
    }
 /**
  * <b>Pre:</b> Precio base tiene un valor valido. <br>
  * <b>Post:</b> Devuelve el valor de precio de alquiler. <br>
 */
    public double getPrecioBase() {
        return precioBase;
    }
    
 /**
  * <b>Pre:</b> Tiene patente, precio base y descripcion. <br>
  * <b>Post:</b> Escribe en consola sus valores. <br>
 */
    public void describir(){
       System.out. printf("%10s: %8s     Precio: $%.2f\n", descripcion, patente, precioBase);
    }
    
 /**
  * <b>Pre:</b> Tiene un precio base distinto de cero.<br>
  * <b>Post:</b> Asigna la patente al objeto.<br>
  * 
  * @param patente patente del auto, patente != ""
 */
    public Vehiculo(String patente) {
        this.patente = patente;
    }
    
    
    
}
