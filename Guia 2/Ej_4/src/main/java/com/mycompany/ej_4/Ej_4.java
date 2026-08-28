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
    
    
    public int buscaProducto(int codigo, ArrayList<Producto> prod){
        int i=0;
        while(i < prod.size() & prod.get(i).getCodigo() != codigo ){
                i++;
            }
        return i;
    }
    
    public Pedido hacerPedido(Empleado resp, String fecha,ArrayList<Producto> productos){
        int opt = 1, codigo, cantidad;
        Producto prod;
        ArrayList<LineaDePedido> listaPedidos = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("Ingrese codigo de producto (0-9):");
            codigo = sc.nextInt();
            System.out.println("Ingrese cantidad:");
            cantidad = sc.nextInt();
            
            prod = productos.get(buscaProducto(codigo, productos));
            LineaDePedido lineaDePedido = new LineaDePedido(prod, cantidad);
            listaPedidos.add(lineaDePedido);
            
            System.out.println("Ingrese 1 si quiere agregar una linea de pedido o 0 para salir");
            opt = sc.nextInt();
            
        } while(opt != 0);
        
        
        System.out.println("Pedido:");
        if (!listaPedidos.isEmpty()){
            System.out.println("-Responsable: " + resp.getNombre());
            pedido = new Pedido(resp, fecha, listaPedidos);
            pedido.getLineasDePedido().forEach((LineaDePedido linea) -> 
            {
                System.out.println("--Producto: " + linea.getProducto().getDescripcion());
                System.out.println("--Cantidad: " + linea.getCantidad());
                System.out.println("--Precio: $" + linea.getCantidad() * linea.getProducto().getPrecio() + " / $" +
                    linea.getProducto().getPrecio() + " c/u");
            });
            return pedido;
            
        } else {
            return null;
        }
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
        
        while(opt != 0){
            System.out.println("Si quiere hacer un pedido presione 1, para salir 0");
            opt = sc.nextInt();
            
            System.out.println("Elija empleado responsable (0-1)");
            resp = sc.nextInt();
            if (opt == 1){
                ped = prueba.hacerPedido(prueba.listaEmpleados.get(resp), "21/04/2026", prueba.productos);
                
                if (ped != null){
                    prueba.pedidos.add(ped);
                }
            }
        }

    }

   }
