/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Lucas
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Emisor_De_Sonido> emisores = new ArrayList<>();
        
        Emisor_De_Sonido a = new Gato("Michi", 10);
        emisores.add(a);
        
        a = new Perro("Rocko", 10);
        emisores.add(a);
        
        a = new Vaca("Gertrudis", 15);
        emisores.add(a);
        
        a = new Ambulancia("12354", "5143", "44856");
        emisores.add(a);
        
        for(Emisor_De_Sonido emi: emisores)
            emi.emiteSonido();
    }
}
