/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import controlador.ControladorPrincipal;
import vista.BotonCelda;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Buscaminas {

    
    int N,M;
    public int[][] matriz; // -1 bomba, -2 desactivado, el resto son 

    public Buscaminas(int ancho, int alto, int minas) {
        int cantMinas = minas;
        N = alto;
        M = ancho;
        matriz = new int[ancho][alto];
        
        Random random = new Random();
        int randomI, randomJ;
        while (cantMinas > 0 ){
            randomI = random.nextInt(alto);
            randomJ = random.nextInt(ancho);
            
            if(matriz[randomI][randomJ] == 0){
                matriz[randomI][randomJ] = -1;
                cantMinas--;
            }
        }
        System.out.println("Matriz creada");
    }
  
    int getMinasCercanas(int i, int j){
        int cant = 0;
        int fila = i, columna = j;
        for (int ix = fila - 1; ix <= fila + 1; ix++) {
            for (int jx = columna - 1; jx <= columna + 1; jx++) {

                // Verificar que la posición esté dentro de la matriz
                if (ix >= 0 && i < N && jx >= 0 && jx < M) {

                    // No contar la propia celda
                    if (ix != fila || jx != columna) {
                        if (isMina(ix, jx)) {
                            cant++;
                        }
                    }
                }
            }
        }
       
        return cant;
    }
        
    public boolean isMina(int i, int j){return (matriz[i][j] == -1);}
    
    public void presionaBoton(int i, int j){
        if (isMina(i,j)){
            System.out.println("Perdiste perreque");
        } else {
            matriz[i][j] = getMinasCercanas(i, j);
            //muestraAlrededores(i, j);
        }
    }
    
    public void muestraAlrededores(int i, int j){
        int topLeft = i - 1, botRight = j + 1;
        if (topLeft < 0) topLeft = 0;
        if (botRight >= M) botRight = M - 1;
        int fila, col;
        
        for(fila = topLeft; fila <topLeft + 3; fila++){
            for(col = topLeft; col < botRight; col++){
                if (!isMina(i, j)){
                    if (getMinasCercanas(i,j) == 0){
                        // desactivar boton
                        matriz[i][j] = -2;
                    } else {
                        matriz[i][j] = getMinasCercanas(i, j);
                    }
                }
            }
        }
        //if (!isMina(i - 1, j - 1)) muestraAlrededores(i - 1, j - 1);
        
    }
            
    public JPanel getTablero(ControladorPrincipal controlador){
        int i, j;
        JPanel gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(N, M));
        for(i=0; i < N; i++){
            for(j=0; j < M; j++){
                //JButton boton = new JButton();
                BotonCelda boton = new BotonCelda(i, j);
                if (isMina(i,j)){
                    boton.setText("B");
                } else {
                    //boton.setText(String.valueOf(getMinasCercanas(i, j)));
                }
                boton.setPreferredSize(new Dimension(50, 50));
                boton.addMouseListener(controlador);
                gridPanel.add(boton);
            }
        }
        System.out.println("Tablero creado");
        return gridPanel;
    }

    
    
}
