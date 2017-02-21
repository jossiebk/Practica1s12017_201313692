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
public class nodoPlayerAux {
     String nombre;
     int score;
    NodoListaDiccionario siguiente;
    
    //inicializo la variable y el nodo siguiente
public void nodoPlayerAux(String nombre,int punteo){
    this.nombre = nombre;
    this.score=punteo;
    this.siguiente = null;
}
    
public void enlacesiguiente(NodoListaDiccionario x){
     siguiente = x;
}

public NodoListaDiccionario obtenersiguiente(){
    return siguiente;
}
    
   //metodo para obtener la palabra que se agregara al diccionario
     public String getNombre(){
    return nombre;
    }
     //metodo para asignar la palabra que guardare
    public void setNombre(String palabra){
    this.nombre = palabra;
    }
    
     public int getScore(){
    return score;
    }
     //metodo para asignar la palabra que guardare
    public void setScore(int score){
    this.score = score;
    }
   

}
