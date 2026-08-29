/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prueba;

import java.util.ArrayList;


/**
 *
 * @author Lucas
 */
public class Prueba {

    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.infoChoferes();
        Categoria cat = empresa.getCategorias().get(0);
        
        System.out.println("1: Cant choferes sin colectivo: " + empresa.getChoferesSinCol().size());
        
        System.out.println("2: Cant colectivos: " + empresa.getColectivos().size());
        
        System.out.println("3: Choferes de categoria: " + cat.getNombreCategoria());
        empresa.getChoferCat(cat).forEach(el -> {
            System.out.println("-" + el.getNombre());
        });
        
        int sueldoAsuperar = 150;
        System.out.println("4: Categorias que pagan mas de : $" + sueldoAsuperar);
        empresa.getCategoriaSueldoSup(sueldoAsuperar).forEach(el -> {
            System.out.println("-" + el.getNombreCategoria() + ", sueldo: $" + el.getSueldo());
        }
        );
        
        System.out.println("5: Empleados con sueldo mayor a : $" + sueldoAsuperar);
        empresa.getChoferSueldoSup(sueldoAsuperar).forEach(el -> {
            System.out.println("-" + el.getNombre());
        });
        
    }
}
