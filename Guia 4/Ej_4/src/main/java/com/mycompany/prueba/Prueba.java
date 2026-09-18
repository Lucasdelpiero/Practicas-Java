/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prueba;

import java.util.ArrayList;


public class Prueba {
    
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        
        Vehiculo v = new Auto("AU123");
        vehiculos.add(v);
        
        v = new Auto("AU456");
        vehiculos.add(v);
        
        v = new Combi("CM456");
        vehiculos.add(v);
        
        v = new Carga("CG456", 1.5);
        vehiculos.add(v);
        
        v = new Camion("CM7515");
        vehiculos.add(v);
        
        for(Vehiculo vehiculo: vehiculos)
            vehiculo.describir();
        
        
    }
}
