/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ej_2;

public class Ej_2
{
    public static void main(String[] args)
    {
        Punto p1 = new Punto(2,3);
        Punto p2;
        //Punto p3 = new Punto(); NO hay constructor vacio 
        Punto p3 = new Punto(0,0);
        System.out.println("P1="+p1.cartel());
        //p3=p2; NO se inicializa p2 entonces no se le puede asignar a p3
        p2=p1;
        p1.cambia(8,5);
        System.out.println("P2="+p2.cartel());
    }
}
