/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd_practica1_201313692;

/**
 *
 * @author jossie
 */
public class NodoLateral {
     NodoMatriz primero;
    int y;
    NodoLateral siguiente;
    NodoLateral anterior;
    listaHorizontal Filas;
    
  
    
     public NodoLateral(int y){
        this.y=y;
        Filas=new listaHorizontal();
        siguiente=null;
        anterior=null;
    }
}
