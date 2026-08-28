/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ej_4;

import java.util.ArrayList;
import java.util.Scanner;


public class Ej_4 {
    public Empleado emp1, emp2;
    ArrayList<Empleado> listaEmpleados = new ArrayList<>();
    private double[] listaPrecios = {100, 50, 30, 50, 150, 60, 30, 20, 90, 65};
    private String[] listaDesc = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
    ArrayList<Producto> productos = new ArrayList<>();
    ArrayList<Pedido> pedidos = new ArrayList<>();
    Pedido pedido;

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }
    
    
    
    public Ej_4() {
    this.emp1 = new Empleado("Jorge", 4814782, "jorge@gmail.com");
    this.emp2 = new Empleado("Alf", 155321, "alf@gmail.com");
    listaEmpleados.add(emp1);
    listaEmpleados.add(emp2);
    
    int i = 0;
    for(i=0; i < listaPrecios.length; i++){
        Producto producto = new Producto(i, listaDesc[i], listaPrecios[i]);
        productos.add(producto);
    }
    }
    
    public static void main(String[] args){
        Ej_4 prueba = new Ej_4();
        int opt = 1, resp;
        Scanner sc = new Scanner(System.in);
        Pedido ped;
        
        // Menu
        while(opt != 0){
            System.out.println("Si quiere hacer un pedido presione 1, para salir 0");
            opt = sc.nextInt();
            
            System.out.println("Elija empleado responsable (0-1)");
            resp = sc.nextInt();
            if (opt == 1){
                //Empleado se encarga de crear un pedido
                ped = prueba.listaEmpleados.get(resp).hacerPedido("21/04/2026", prueba.getProductos());
                
                if (ped != null){
                    prueba.pedidos.add(ped);
                }
            }
        }

    }

   }
