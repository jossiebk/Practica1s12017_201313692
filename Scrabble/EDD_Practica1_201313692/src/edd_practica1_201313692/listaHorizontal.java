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
public class listaHorizontal {
     NodoMatriz ultimo,primero; //los nodos de mis "cabeceras o indicadores" verticales
    //NodoMatriz siguiente, anterior;
    
    public listaHorizontal(){
   primero = null;
   ultimo = null;
    }
    
    //metodos para insertar en las listas horizontales
    //%%%%%%%%%%%%%%%%
    //%%%%%%%%%%%%%%%%%
    //&&&&&&&&&&&&&&&&
    public void InsertarCol(NodoMatriz inserta){
        if(vacioCol()){
            primero=ultimo=inserta;
        }else{
            if(inserta.x<primero.x){
                insertarFrenteCol(inserta);
            }else if(inserta.x>ultimo.x){
                insertarFinalCol(inserta);
            }else{
                insertarMedioCol(inserta);
            }
        }
        
    }
    
    //metodo para verificar si esta vacia la matriz
    public boolean vacioCol(){
        if(primero==null){
            return true;
        }else{
            return false;
        }
    }
    
    void insertarFrenteCol(NodoMatriz inserta){
        primero.izquierda=inserta;
        inserta.derecha=primero;
        primero=primero.izquierda;
    }
    
    void insertarFinalCol(NodoMatriz inserta){
        ultimo.derecha=inserta;
        inserta.izquierda=ultimo;
        ultimo=ultimo.derecha;
    }
    
    void insertarMedioCol(NodoMatriz inserta){
        NodoMatriz temporal1;
        NodoMatriz temporal2;
        temporal1=primero;
        while(temporal1.x<inserta.x){
            temporal1=temporal1.derecha;
        }
        temporal2=temporal1.izquierda;
        temporal2.derecha=inserta;
        temporal1.izquierda=inserta;
        inserta.derecha=temporal1;
        inserta.izquierda=temporal2;
        
    }
    
    void recorrerCol(){
        if(!vacioCol()){
            NodoMatriz temporal=primero;
            while(temporal!=null){
                System.out.println("X= "+temporal.x);
                temporal=temporal.derecha;
        }
        }
        
    }
    
}
