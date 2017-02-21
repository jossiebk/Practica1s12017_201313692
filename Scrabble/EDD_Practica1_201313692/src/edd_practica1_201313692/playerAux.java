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
public class playerAux {
     NodoListaDiccionario inicio,  fin;
    int size;
    
    
// este metodo sera el constructor de mi lista    
public playerAux(){
   inicio = null;
   fin = null;
   size =0;
}    

// con este metodo agregare datos a la lista
public void push(NodoListaDiccionario palabra){
   if(fin == null){
      fin= palabra;
      inicio = fin;
   }else{
      fin.siguiente = palabra;
      fin = fin.siguiente;
   }
  size++;
}

public NodoListaDiccionario buscar(int index){
    int contador =0;
    NodoListaDiccionario temp= inicio;
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
        NodoListaDiccionario temporal = inicio;
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
