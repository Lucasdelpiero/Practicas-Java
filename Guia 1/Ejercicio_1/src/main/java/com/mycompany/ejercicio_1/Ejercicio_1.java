/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_1;

import java.util.Scanner;



public class Ejercicio_1
{
    
 

    public static void main(String[] args) {
        int opcion = 1;
        double cantidad;
        
        CuentaBancaria unacuenta = new CuentaBancaria("Jorge", 500);
        
        while (opcion != 0){
            System.out.println("Que accion desea hacer ");
            System.out.println("0: Salir, 1: Depositar, 2: Extraer 3: Saldo, 4: Titular, 5: Cambiar titular.");
            Scanner sc = new Scanner(System.in);
            opcion = sc.nextInt();
            if (opcion == 1) {
                System.out.println("Ingrese cantidad a depositar: ");
                sc = new Scanner(System.in);
                cantidad = sc.nextInt();
                unacuenta.depositar(cantidad);
                System.out.println("Se ha depositado: " + cantidad);
                System.out.println("Nuevo saldo: " + unacuenta.getSaldo());
            } else if (opcion == 2) {
                System.out.println("Ingrese cantidad a extraer: ");
                sc = new Scanner(System.in);
                cantidad = sc.nextInt();
                if(cantidad <= unacuenta.getSaldo()){
                    unacuenta.extraer(cantidad);
                    System.out.println("Nuevo saldo: " + unacuenta.getSaldo());
                } else {
                    System.out.println("No hay suficiente efectivo.");
                }
            } else if (opcion == 3) {
                System.out.println("Saldo: " + unacuenta.getSaldo());
            } else if (opcion == 4){
                System.out.println("Titular: " + unacuenta.getTitular());
            } else if (opcion == 5){
                sc = new Scanner(System.in);
                String nuevoTitular = sc.next();
                unacuenta.setTitular(nuevoTitular);
                System.out.println("Titular: " + unacuenta.getTitular());
            } else {
                System.out.println("Opcion no valida, intente de nuevo.");
            }
            System.out.println("====================================");
        }
        

    }
}
