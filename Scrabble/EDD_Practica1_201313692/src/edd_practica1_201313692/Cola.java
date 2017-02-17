/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd_practica1_201313692;

import java.io.FileWriter;
import java.io.PrintWriter;

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
    
    public void grafica(){
    FileWriter fichero=null;
    PrintWriter pw=null;
    try{
        fichero=new FileWriter("C:\\Users\\jossie\\Documents\\GitHub\\Practica1s12017_201313692\\GraficaCola.dot");
        pw=new PrintWriter(fichero);
        pw.println("diagraph dibujo{");
        pw.println("    rankdir=UD;");
        pw.println("noce[shape=box];");
        
    }catch(Exception e){
        e.printStackTrace();
    }finally{
        try{
        if(null!=fichero)
            fichero.close();
        }catch(Exception e2){
            e2.printStackTrace();
        }
    }
    
    }
    
}
