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
public class ListaFichas {
    NodoListaFichas inicio,  fin;
    int size;
    
    
// este metodo sera el constructor de mi lista    
public ListaFichas(){
   inicio = null;
   fin = null;
   size =0;
}    

// con este metodo agregare datos a la lista
public void push(NodoListaFichas ficha){
   if(fin == null){
      fin= ficha;
      inicio = fin;
   }else{
      fin.siguiente = ficha;
      fin = fin.siguiente;
   }
  size++;
}

public NodoListaFichas buscar(int index){
    int contador =0;
    NodoListaFichas temp= inicio;
    while(contador<index){
       temp= temp.obtenersiguiente();
       contador++;
    }
    return temp;
}


public void eliminar(int index){
   if(index==0){
       inicio = inicio.obtenersiguiente();
    }else{
        int contador = 0;
        NodoListaFichas temporal = inicio;
        while(contador < index-1){
             temporal = temporal.obtenersiguiente();
             contador++;
        }
     temporal.enlacesiguiente(temporal.obtenersiguiente().obtenersiguiente());
    }
   size--;
}



public int size(){
   return size;
}


public boolean vacia(){
   if(fin== null){
      return true;
   }else{
      return false;
   }
}
}
