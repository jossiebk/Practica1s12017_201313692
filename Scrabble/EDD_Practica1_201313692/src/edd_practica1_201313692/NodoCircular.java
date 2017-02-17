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
    String nombre;
    NodoCircular siguiente;
    
    public NodoCircular(int d,String nombre){
        this.dato=d;
        this.nombre=nombre;
        siguiente=this;
    }
    
}
