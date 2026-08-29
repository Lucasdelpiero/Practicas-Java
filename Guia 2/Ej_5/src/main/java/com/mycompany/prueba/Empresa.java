/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prueba;
import java.util.ArrayList;
/**
 *
 * @author Lucas
 */
public class Empresa {
    private Categoria cat1, cat2, cat3;
    private Colectivo col1, col2;
    private Chofer ch1, ch2, ch3;
    
    private ArrayList<Categoria> categorias = new ArrayList<>();
    private ArrayList<Colectivo> colectivos = new ArrayList<>();
    private ArrayList<Chofer> choferes = new ArrayList<>();

    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }

    public ArrayList<Colectivo> getColectivos() {
        return colectivos;
    }

    public ArrayList<Chofer> getChoferes() {
        return choferes;
    }
    
    public void infoChoferes(){
        choferes.forEach(el -> {
        System.out.println("Nombre:" + el.getNombre());
        System.out.println("-Categoria: " + el.getCategoria().getNombreCategoria());
        System.out.println("-Direccion: " + el.getDomicilio().getCalle() + " " + el.getDomicilio().getNumero());
        Colectivo col = el.getColectivo();
        if (col != null){
            System.out.println("-Col ID: " + el.getColectivo().getNumerointerno());
            System.out.println("-Col modelo: " + el.getColectivo().getModelo());
        } else System.out.println("-No tiene colectivo");
        System.out.println("--------------------");
        }
        
        );
    }
    
    
    public ArrayList<Chofer> getChoferesSinCol(){
        ArrayList<Chofer> list = new ArrayList<>();
        this.choferes.forEach(el -> {
        if (el.getColectivo() == null)
            list.add(el);
        });
        return list;
    }
    
    public ArrayList<Chofer> getChoferCat(Categoria cat){
        ArrayList<Chofer> lista = new ArrayList<>();
        getChoferes().forEach(el ->{
            if (el.getCategoria() == cat){
                lista.add(el);
            }
        });
        return lista;
    }
    
    public ArrayList<Chofer> getChoferSueldoSup(double monto){
        ArrayList<Chofer> lista = new ArrayList<>();
        choferes.forEach(el -> {
            if (el.getCategoria().getSueldo() > monto){
                lista.add(el);
            }
        });
        
        return lista;
    }
    
    public ArrayList<Categoria> getCategoriaSueldoSup(double monto){
        ArrayList<Categoria> lista = new ArrayList<>();
        categorias.forEach(el -> {
            if (el.getSueldo() > monto){
                lista.add(el);
            }
        });
        
        return lista;
    }
    
    public Empresa() {
        col1 = new Colectivo("A");
        col2 = new Colectivo("B");
        colectivos.add(col1);
        colectivos.add(col2);
        
        cat1 = new Categoria("Inicial", 100);
        cat2 = new Categoria("Experimentado", 200);
        cat3 = new Categoria("Experto", 350);
        categorias.add(cat1);
        categorias.add(cat2);
        categorias.add(cat3);
        
        Domicilio dom = new Domicilio("Rivadavia", 505);
        ch1 = new Chofer("Jorge",cat1, dom);
        dom = new Domicilio("Peralta Ramos", 1200);
        ch2 = new Chofer("Alfonso",cat2, dom);
        dom = new Domicilio("San Martin", 3020);
        ch3 = new Chofer("Ricardo",cat3, dom);
        
        ch1.setColectivo(col1);
        ch2.setColectivo(col2);
        
        choferes.add(ch1);
        choferes.add(ch2);
        choferes.add(ch3);
        
        
    }
    
}
