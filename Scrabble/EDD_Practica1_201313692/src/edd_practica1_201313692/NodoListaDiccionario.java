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

public class NodoListaDiccionario {
    String palabra;
    NodoListaDiccionario siguiente;
    
    //inicializo la variable y el nodo siguiente
public void Diccionario(String palabra){
    this.palabra = palabra;
    this.siguiente = null;
}
    
public void enlacesiguiente(NodoListaDiccionario x){
     siguiente = x;
}

public NodoListaDiccionario obtenersiguiente(){
    return siguiente;
}
    
   //metodo para obtener la palabra que se agregara al diccionario
     public String getPalabra(){
    return palabra;
    }
     //metodo para asignar la palabra que guardare
    public void setPalabra(String palabra){
    this.palabra = palabra;
    }
    
   

}
