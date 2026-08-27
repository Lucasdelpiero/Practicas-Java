/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ej_1;

//Sea la siguiente clase F y la variable f1, una instancia de F. ¿Cuál sería el resultado de f1.p()?
public class F
{
private int x = 0;
private int y = 0;
public F() { }
public void p()
{
    int x = 1;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("x = " + this.x);
    }
}
/*
x = 1 toma el x mas local posible
y = 0
x = 0
*/
