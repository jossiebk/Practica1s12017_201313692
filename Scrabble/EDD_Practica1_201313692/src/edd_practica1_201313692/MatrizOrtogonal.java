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

public class MatrizOrtogonal {
    Cabeceras c;
    Laterales l;
 //Cabeceras cabecera=new Cabeceras(); 
 //Laterales lateral=new Laterales();
    MatrizOrtogonal(){
        c=new Cabeceras();
        l=new Laterales();
    }
    
    void Insertar(int x,int y,int inserta,String ficha){
        NodoMatriz insercion;
        insercion= new NodoMatriz(inserta,x,y,ficha);
        if(c.existe(x)==false){
           c.Insertar(new NodoCabecera(x));
        }
        if(l.existe(y)==false){
           l.Insertar(new NodoLateral(y));
        }
        NodoCabecera CTemporal;
        NodoLateral LTemporal;
        CTemporal=c.Buscar(x);
        LTemporal=l.Buscar(y);
        CTemporal.Columna.Insertar(insercion);
        LTemporal.Filas.InsertarCol(insercion);
        System.out.println("inserto "+inserta+" en "+x+","+y+" con: "+ficha);
    }
    
    void llenar(int x,int y){
        int o=0;
        String b="";
        for(int j=0;j<y;j++){
            for(int i=0;i<x;i++){
                Insertar(i,j,o,b);
                o++;
            }
        }
    }
    
    void Buscar(){
     
    }
       
    
    
        
       
        
        //System.out.println("resultado= "+res);
        
    
    
    
    
    
}
