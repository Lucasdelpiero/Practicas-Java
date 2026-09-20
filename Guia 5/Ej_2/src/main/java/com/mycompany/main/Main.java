/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Lucas
 */
public class Main {

    public static void main(String[] args) {
        Libro libro = new Libro("ABBFFC5","Codigo Da Vinci", 1850);
        libro.prestar();
        libro.prestar();
        libro.devolver();
        libro.devolver();
        
        ArrayList<CD> cds = new ArrayList<>();
        CD cd = new CD("FDSD", "Thriller", "Michael Jackson");
        Cancion cancion = new Cancion(1, "Thriller", 3.14);
        cd.agregarCancion(cancion);
        cds.add(cd);
        
        cd = new CD("FAS8", "Beat It", "Michael Jackson");
        cds.add(cd);
        
        cd = new CD("ACM1PT", "Wanda", "Bananero");
        cds.add(cd);
        
        
        for (CD c: cds){
            System.out.printf("%10s: %s\n",c.getTitulo(), c.getInterprete());
        }
        
        Collections.sort(cds);
        
        System.out.println("------------------");
        
        for (CD c: cds){
            System.out.printf("%10s: %s\n",c.getTitulo(), c.getInterprete());
        }
    }
}
