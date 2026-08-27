/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ej_2;


public class Punto
{
private int x;
private int y;
public Punto(int x, int y) // Nombre variable pegada al tipo
{
this.x = x;
this.y = y;
}

private void setX(int x){
    this.x = x;
}

private void setY(int y){
    this.y = y;
}

public void cambia(int x1,int y1)
{
    setX(x1); // no existen setters originalmente
    setY(y1); 
}
public String cartel()
{return"Punto[x="+x+",y="+y+"]";}
}
