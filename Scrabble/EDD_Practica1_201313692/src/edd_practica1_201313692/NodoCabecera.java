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
public class NodoCabecera {
    int x;
    NodoCabecera siguiente;
    NodoCabecera anterior;
    listaVertical Columna;
    
  
    
     public NodoCabecera(int x){
        this.x=x;
        Columna=new listaVertical();
        siguiente=null;
        anterior=null;
    }
    
     
     
     
}
