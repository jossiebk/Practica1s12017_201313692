/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd_practica1_201313692;

import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author jossie
 */
public class Tablero {
    
    //metodo para crear la matriz de labels o cuadritos
     public JTextField[][] crea_cuadros(int tamaño, JPanel jPanel6){
      jPanel6.removeAll();
    JTextField [][]entradas = new JTextField[tamaño][tamaño];
     for(int x =0; x<tamaño; x++){
     for(int y =0; y<tamaño; y++){
        entradas[x][y]= new JTextField(); 
        entradas[x][y].setBounds(4+(25*x),4+(25*y),25,25);
        entradas[x][y].setVisible(true);
        entradas[x][y].setText(" ");  
       jPanel6.add(entradas[x][y]);
     }
     }

     jPanel6.repaint();
   return entradas;
   
  }  
}
