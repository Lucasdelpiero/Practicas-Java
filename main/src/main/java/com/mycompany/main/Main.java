/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

import controlador.ControladorPrincipal;
import java.awt.event.MouseListener;
import javax.swing.JPanel;
import modelo.Buscaminas;
import vista.VentanaPrincipal;

/**
 *
 * @author Lucas
 */
public class Main {
    public static void main(String[] args) {
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
        ControladorPrincipal controlador = new ControladorPrincipal(ventanaPrincipal);
        
    }
    

}
