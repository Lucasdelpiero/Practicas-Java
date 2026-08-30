/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prueba;


public class Prueba {

    
    
    
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.agregaContacto("Alf", 123, new int[] {451, 568});       
        agenda.agregaContacto("Jorge", 145, new int[] {4458});
        agenda.agregaContacto("Pedro", 123, new int[] {5598});
        agenda.agregaContacto("Noelia", 598, new int[] {3225, 1144});
        agenda.agregaContacto("Alf", 123, new int[] {115, 2268, 4486});
        
        System.out.println("1: Alf: " + agenda.buscaContacto("Alf"));
        System.out.println("2: Todos los contactos: ");
        agenda.mostrarContactos();
    }
}
