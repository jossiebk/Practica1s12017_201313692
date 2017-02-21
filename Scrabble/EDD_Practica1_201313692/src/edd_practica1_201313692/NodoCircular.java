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
    int score;
    NodoCircular siguiente;
    
    public NodoCircular(int d,String nombre,int score){
        this.dato=d;
        this.nombre=nombre;
        this.score=score;
        siguiente=this;
    }
    
     public String getNombre(){
    return nombre;
    }
     //metodo para asignar la palabra que guardare
    public void setNombre(String nombre){
    this.nombre = nombre;
    }
     public int getScore(){
    return score;
    }
     //metodo para asignar la palabra que guardare
    public void setScore(int score){
    this.score = score;
    }
     public int getDato(){
    return dato;
    }
     //metodo para asignar la palabra que guardare
    public void setDato(int dato){
    this.dato = dato;
    }
}
