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
public class Cola {
    NodoCola inicio, fin;
    int tamaño;
    //inicializo los punteros
    public Cola(){
        inicio=fin=null;
        tamaño=0;
    }
    //retorno verdadero si el inicio aun es nulo osea no tengo nada ahi
    public boolean Vacia(){
        return inicio==null;
    }
    
    public void Insertar(int elemento,String fi){
        //creo un nuevo objeto del tipo del nodo
        NodoCola nuevo=new NodoCola(elemento,fi);
        //si la cola esta vacia el inicio sera el elemento que vino
        if(Vacia()){
            inicio=nuevo;
        }else{
            fin.siguiente=nuevo;
        }
        fin=nuevo;
        tamaño++;
    }
    
    String p="";
    int r;
    public String Eliminar(){
        String aux=inicio.ficha;
        p=aux;
        int aux2=inicio.dato;
        inicio=inicio.siguiente;
        tamaño--;
        r=aux2;
        return aux;
    }
    
    
    
    public int inicioCola(){
        return inicio.dato;
    }
    
    public int tamañoCola(){
        return tamaño;
    }
    
}
