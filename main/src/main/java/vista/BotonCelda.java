/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;

/**
 *
 * @author Lucas
 */
public class BotonCelda extends JButton {
    public int x, y;
    
    public int getPosX() {
        return x;
    }

   
    public int getPosY() {
        return y;
    }
    
    public BotonCelda(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }



    
}
