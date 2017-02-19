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
public class NodoMatriz {
    int dato,x,y;
    NodoMatriz arriba;
    NodoMatriz abajo;
    NodoMatriz izquierda;
    NodoMatriz derecha;
    
   //nodo de la matriz ortogonal  
     public NodoMatriz(int dato,int x, int y){
        this.dato=dato;
        this.x=x;
        this.y=y;
        this.arriba = null;
        this. abajo=null;
        this.izquierda=null;
        this.derecha=null;
    }
}
