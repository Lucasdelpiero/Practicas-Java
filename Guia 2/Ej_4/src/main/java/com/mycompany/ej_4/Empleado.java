/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ej_4;

import java.util.ArrayList;
import java.util.Scanner;


public class Empleado {
    private String nombre;
    private int telefono;
    private String email;

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public Empleado(String nombre, int telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }
    public int buscaProducto(int codigo, ArrayList<Producto> prod){
        int i=0;
        while(i < prod.size() & prod.get(i).getCodigo() != codigo ){
                i++;
            }
        return i;
    }
    
    public Pedido hacerPedido(String fecha,ArrayList<Producto> productos){
        int opt = 1, codigo, cantidad;
        Pedido pedido;
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
            System.out.println("-Responsable: " + this.getNombre());
            pedido = new Pedido(this, fecha, listaPedidos);
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
    
    
}
