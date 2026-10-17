/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Lucas
 */
public class VentanaPrincipal extends JFrame{
    final int ancho_ventana = 800, largo_ventana = 600;
    private final JLabel labelAncho = new JLabel("Ancho: ");
    private final JTextField campoAncho = new JTextField("10");
    private final JLabel labelAlto = new JLabel("Alto: ");
    private final JTextField campoAlto = new JTextField("10");
    private final JLabel labelMinas = new JLabel("Minas: ");
    private final JTextField campoMinas = new JTextField("20");
    private final JButton botonIniciar = new JButton("Iniciar");
    private final JFrame ventana;
    
    public VentanaPrincipal() {
        super("Buscaminas");
        ventana = new JFrame("Buscaminas");
        ventana.setSize(ancho_ventana, largo_ventana);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setLayout(new GridLayout(4, 1));
        
        crearInterfazInicial(ventana);

        ventana.setVisible(true);
       
    }
    public void borrarTodo(){
        ventana.getContentPane().removeAll();
        ventana.setLayout(new FlowLayout());
        ventana.setSize(ancho_ventana, largo_ventana);
    }
    public void refrescar(){
        ventana.revalidate();
        ventana.repaint();
    }
    
    public void agregaComponente(JPanel panel){
        ventana.add(panel);
    }
    
    public int getAncho(){
        return Integer.parseInt(campoAncho.getText());
    }
    
    public int getAlto(){
        return Integer.parseInt(campoAlto.getText());
    }
    
    public int getMinas(){
        return Integer.parseInt(campoMinas.getText());
    }
    
    private void crearInterfazInicial(JFrame ventana){
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        labelAncho.setPreferredSize(new Dimension(100, 50));
        panel.add(labelAncho);
        campoAncho.setPreferredSize(new Dimension(100, 30));
        panel.add(campoAncho);
        ventana.add(panel);
        
        panel = new JPanel();
        panel.setLayout(new FlowLayout());
        labelAlto.setPreferredSize(new Dimension(100, 50));
        panel.add(labelAlto);
        campoAlto.setPreferredSize(new Dimension(100, 30));
        panel.add(campoAlto);
        ventana.add(panel);
        
        panel = new JPanel();
        panel.setLayout(new FlowLayout());
        labelMinas.setPreferredSize(new Dimension(100, 50));
        panel.add(labelMinas);
        campoMinas.setPreferredSize(new Dimension(100, 30));
        panel.add(campoMinas);
        ventana.add(panel);
        
        panel = new JPanel();
        panel.setLayout(new FlowLayout());
        botonIniciar.setPreferredSize(new Dimension(100, 50));
    
        panel.add(botonIniciar);
        ventana.add(panel);
    }

    public JButton getBotonIniciar() {
        return botonIniciar;
    }
    
}
