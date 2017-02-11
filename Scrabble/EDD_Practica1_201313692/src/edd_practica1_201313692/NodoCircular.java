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
public class NodoCircular {
    int dato;
    NodoCircular siguiente;
    
    public NodoCircular(int d){
        this.dato=d;
        siguiente=this;
    }
    
}
