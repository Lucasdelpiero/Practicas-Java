/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba;
import java.util.ArrayList;

public class Estacion {
    private ArrayList<Surtidor> surtidores = new ArrayList<>();

    public ArrayList<Surtidor> getSurtidores() {
        return surtidores;
    }
    
    // tipo = 0:gasoil; 1:premium; 2:super
    public int getCantLitros(int tipo){
        int total = 0;
        for(Surtidor surt :surtidores)
            total += surt.getCantTipo(tipo);
        return total;
    }
    
    public Surtidor surtMayorVentasTipo(int tipo){
        Surtidor masVentas = surtidores.get(0);
        int cantMax = masVentas.getCantTipo(tipo);
        int cant;
        
        for(Surtidor surt: surtidores){
            cant = surt.getVentasTipo(tipo);
            if (cant > cantMax){
                cantMax = cant;
                masVentas = surt;
            }
        }
        
        return masVentas;
    }
    
    int getVentasSurtidor(int pos, int tipo){
        Surtidor sort = surtidores.get(pos);
        if (sort == null)
            return 0;
        else{
            return sort.getVentasTipo(tipo) ;
        }
        
    }
    
    public int getVentasEstacion(int tipo){
        int total = 0;
        for(Surtidor surt: surtidores){
            total += surt.getVentasTipo(tipo);
        }
        return total;
    }
    
    public void printVentasSurtidor(int tipo){
        for(Surtidor sort: surtidores){
            System.out.println("ID: " + sort.getId() + " Cant: " + sort.getVentasTipo(tipo));
        } 
    }
    
    public Estacion() {
        int cantSurtidores = 6, i;
        for(i=0; i < cantSurtidores; i++){
            Surtidor surt = new Surtidor();
            surtidores.add(surt);
        }
    }
}
