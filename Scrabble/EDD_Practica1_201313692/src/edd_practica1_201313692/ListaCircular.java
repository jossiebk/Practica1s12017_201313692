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
public class ListaCircular {
    NodoCircular ultimo;
    
    public ListaCircular(){
    ultimo=null;
    }
    
    //metodo para saber si mi lista esta vacia
    public boolean Vacia(){
        return ultimo==null;
    }
    
    //metodo para insertar
    public ListaCircular Insertar(int elemento,String name,int score){
        NodoCircular nuevo=new NodoCircular(elemento,name,score);
        if(ultimo!=null){
            nuevo.siguiente=ultimo.siguiente;
            ultimo.siguiente=nuevo;
        }
        ultimo=nuevo;
        return this;
    }
    
    //mostrar lista
    public void MostrarLista(){
        NodoCircular aux=ultimo.siguiente;
        String cadena="";
        do{
            cadena=cadena +"["+aux.dato+"-"+aux.nombre+"]->";
            aux=aux.siguiente;
        }while(aux!=ultimo.siguiente);
        System.out.println(cadena);
    }
    
     public String Recorrido(){
        NodoCircular aux=ultimo.siguiente;
        String cadena="";
        do{
            cadena=cadena +aux.nombre+"   -   "+aux.score+"\n";
            aux=aux.siguiente;
        }while(aux!=ultimo.siguiente);
       // System.out.println(cadena);
        return cadena;
    }
     
     
     public int Tamaño(){
        NodoCircular aux=ultimo.siguiente;
       int tamaño=0;
        do{
            aux=aux.siguiente;
            tamaño++;
        }while(aux!=ultimo.siguiente);
       // System.out.println(cadena);
        return tamaño;
    }
     
     
     
     
     public NodoCircular buscar(int index){
    int contador =0;
    NodoCircular temp= ultimo;
    while(contador<index){
       temp= temp.siguiente;
       contador++;
    }
    return temp;
}
    
    
    
    
    //metodo para eliminar
    public boolean eliminar(int elemento){
        NodoCircular actual=ultimo;
        boolean encontrado=false;
        while(actual.siguiente!=ultimo && !encontrado){
            encontrado=(actual.siguiente.dato==elemento);
            if(!encontrado){
                actual=actual.siguiente;
            }
        }
         encontrado=(actual.siguiente.dato==elemento);
         if(encontrado){
             NodoCircular aux=actual.siguiente;
             if(ultimo==ultimo.siguiente){
                 ultimo=null;
             }else{
                 if(aux==ultimo){
                     ultimo=actual;
                 }
                 actual.siguiente=aux.siguiente;
             }
             aux=null;
         }
         return encontrado==true;
    }
}
