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
public class Cabeceras {
    NodoCabecera primero;
    NodoCabecera ultimo;
    
     public Cabeceras(){
   primero = null;
   ultimo = null;
  
   
}
     public void Insertar(NodoCabecera inserta){
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
    
    void insertarFrenteCol(NodoCabecera inserta){
        primero.anterior=inserta;
        inserta.siguiente=primero;
        primero=primero.anterior;
    }
    
    void insertarFinalCol(NodoCabecera inserta){
        ultimo.siguiente=inserta;
        inserta.anterior=ultimo;
        ultimo=ultimo.siguiente;
    }
    
    void insertarMedioCol(NodoCabecera inserta){
        NodoCabecera temporal1;
        NodoCabecera temporal2;
        temporal1=primero;
        while(temporal1.x<inserta.x){
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
            NodoCabecera temporal=primero;
            while(temporal!=null){
                System.out.println("X= "+temporal.x);
                temporal=temporal.siguiente;
        }
        }
        
    }
    
   public boolean existe(int x){
       if(vacioCol()){
           System.out.println("no existe, lista vacia");
            return false;
       }else{
           NodoCabecera temporal;
           temporal=primero;
           while(temporal!=null){
                if(temporal.x==x){
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
   
   NodoCabecera Buscar(int x){
       if(existe(x)){
           NodoCabecera temporal;
           temporal=primero;
           while(temporal.x!=x){
               temporal=temporal.siguiente;
           }
           System.out.println("retornando");
           return temporal;
       }else{
           System.out.println("no existe");
           return (new NodoCabecera(-1));
           
       }
   }
   
  
}
