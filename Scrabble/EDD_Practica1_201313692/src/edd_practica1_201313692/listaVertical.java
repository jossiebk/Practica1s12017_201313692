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
public class listaVertical {
     NodoMatriz ultimo,primero; //los nodos de mis "cabeceras o indicadores" verticales
    //NodoMatriz siguiente, anterior;
    
    public listaVertical(){
   primero = null;
   ultimo = null;
  
   
}
    
    
    //metodos para insertar en listas verticales
    //metodo para insertar
    public void Insertar(NodoMatriz inserta){
        if(vacio()){
            primero=ultimo=inserta;
        }else{
            if(inserta.y<primero.y){
                insertarFrente(inserta);
            }else if(inserta.y>ultimo.y){
                insertarFinal(inserta);
            }else{
                insertarMedio(inserta);
            }
        }
        
    }
    
    //metodo para verificar si esta vacia la matriz
    public boolean vacio(){
        if(primero==null){
            return true;
        }else{
            return false;
        }
    }
    
    void insertarFrente(NodoMatriz inserta){
        primero.arriba=inserta;
        inserta.abajo=primero;
        primero=primero.arriba;
    }
    
    void insertarFinal(NodoMatriz inserta){
        ultimo.abajo=inserta;
        inserta.arriba=ultimo;
        ultimo=ultimo.abajo;
    }
    
    void insertarMedio(NodoMatriz inserta){
        NodoMatriz temporal1;
        NodoMatriz temporal2;
        temporal1=primero;
        while(temporal1.y<inserta.y){
            temporal1=temporal1.abajo;
        }
        temporal2=temporal1.arriba;
        temporal2.abajo=inserta;
        temporal1.arriba=inserta;
        inserta.abajo=temporal1;
        inserta.arriba=temporal2;
        
    }
    
    void recorrer(){
        if(!vacio()){
            NodoMatriz temporal=primero;
            while(temporal!=null){
                System.out.println("y= "+temporal.y);
                temporal=temporal.abajo;
        }
        }
        
    }
    
    
}
