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
public class NodoCola {
    int valor;
    String Ficha;
    //int valor;
    NodoCola siguiente;
   
    public void Fichas(String Ficha,int valor){
    this.Ficha = Ficha;
    this.valor=valor;
    this.siguiente = null;
}
    
public void enlacesiguiente(NodoCola x){
     siguiente = x;
}

public NodoCola obtenersiguiente(){
    return siguiente;
}
    
   
     public String getFicha(){
    return Ficha;
    }
    public void setFicha(String Ficha){
    this.Ficha = Ficha;
    }
    
     public int getValor(){
    return valor;
    }
    public void setValor(int valor){
    this.valor = valor;
    }
   

    
    
}
