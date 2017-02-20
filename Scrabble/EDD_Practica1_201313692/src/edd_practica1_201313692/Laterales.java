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
public class Laterales {
     NodoLateral primero;
    NodoLateral ultimo;
    
     public Laterales(){
   primero = null;
   ultimo = null;
  
   
}
     public void Insertar(NodoLateral inserta){
        if(vacioCol()){
            primero=ultimo=inserta;
        }else{
            if(inserta.y<primero.y){
                insertarFrenteCol(inserta);
            }else if(inserta.y>ultimo.y){
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
    
    void insertarFrenteCol(NodoLateral inserta){
        primero.anterior=inserta;
        inserta.siguiente=primero;
        primero=primero.anterior;
    }
    
    void insertarFinalCol(NodoLateral inserta){
        ultimo.siguiente=inserta;
        inserta.anterior=ultimo;
        ultimo=ultimo.siguiente;
    }
    
    void insertarMedioCol(NodoLateral inserta){
        NodoLateral temporal1;
        NodoLateral temporal2;
        temporal1=primero;
        while(temporal1.y<inserta.y){
            temporal1=temporal1.siguiente;
        }
        temporal2=temporal1.anterior;
        temporal2.siguiente=inserta;
        temporal1.anterior=inserta;
        inserta.siguiente=temporal1;
        inserta.anterior=temporal2;
        
    }
    
    void recorrerCol(){
        if(!vacioCol()){
            NodoLateral temporal=primero;
            while(temporal!=null){
                System.out.println("Y= "+temporal.y);
                temporal=temporal.siguiente;
        }
        }
        
    }
    
    
   boolean existe(int y){
       if(vacioCol()){
           System.out.println("no existe, lista vacia");
            return false;
       }else{
           NodoLateral temporal;
           temporal=primero;
           while(temporal!=null){
                if(temporal.y==y){
                    System.out.println("existe");
                    return true;
                }else if(temporal.siguiente==null){
                    System.out.println("no se encontro");
                    return false;
                }
                temporal=temporal.siguiente;
           }
       }
       return true;
   }
   
   NodoLateral Buscar(int y){
       if(existe(y)){
           NodoLateral temporal;
           temporal=primero;
           while(temporal.y!=y){
               temporal=temporal.siguiente;
           }
           System.out.println("retornando");
           return temporal;
       }else{
           System.out.println("no existe");
           return (new NodoLateral(-1));
           
       }
   }
    
}
