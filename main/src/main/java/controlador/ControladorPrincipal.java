/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;
import modelo.Buscaminas;
import vista.BotonCelda;
import vista.VentanaPrincipal;

/**
 *
 * @author Lucas
 */
public class ControladorPrincipal implements MouseListener{
    private VentanaPrincipal ventanaPrincipal;
    private Buscaminas buscaminas;
    
    public ControladorPrincipal(VentanaPrincipal ventana) {
        this.ventanaPrincipal = ventana;
        ventana.getBotonIniciar().addMouseListener(this);
    }

    public void setBuscaminas(Buscaminas buscaminas) {
        this.buscaminas = buscaminas;
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        if (!(e.getSource() instanceof BotonCelda )){
            int ancho = ventanaPrincipal.getAncho();
            int alto = ventanaPrincipal.getAlto();
            int minas = ventanaPrincipal.getMinas();

            ventanaPrincipal.borrarTodo();
            buscaminas = new Buscaminas(ancho, alto, minas);
            JPanel tablero = buscaminas.getTablero(this);
            ventanaPrincipal.agregaComponente(tablero);
            ventanaPrincipal.refrescar();
            tablero.revalidate();
            tablero.repaint();
        } else if (e.getSource() instanceof BotonCelda ){
            BotonCelda boton = (BotonCelda)e.getSource();
            buscaminas.presionaBoton(boton.x, boton.y);
            System.out.println("Boton[" + boton.x + "][" + boton.y + "] = " + buscaminas.matriz[boton.x][boton.y]);
        }
        
    }


    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }
    
}
