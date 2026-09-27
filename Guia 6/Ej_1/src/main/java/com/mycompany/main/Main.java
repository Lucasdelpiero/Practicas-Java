/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author Lucas
 */
public class Main {

    public static void main(String[] args) {
        try {
            Usuario usuario = new Usuario("Lucas", "1564");
            System.out.println( usuario.getNombre()+ " " + usuario.getContraseña());
        }
        catch(NombreInvalidoException e){
            System.out.println("Nombre no es valido");
        }
        catch(ContrasenaInvalidaException e){
            System.out.println("Contrasenia no valida");
        }
        finally{
            System.out.println("Entro al try entonces viene aca tmbn");
        }
    }
}
