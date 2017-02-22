/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd_practica1_201313692;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    
      private FileWriter fileWriter = null;
    private PrintWriter printWriter = null;
    
    
    public void Graficar(){
        NodoCircular auxNode = this.ultimo;
        try {
            File directorio = new File(".\\Reportes");
            if(!directorio.exists()){
                directorio.mkdirs();
            }
            fileWriter = new FileWriter(".\\Reportes\\circular.dot");
            printWriter = new PrintWriter(fileWriter);
                    
             printWriter.println("digraph G {");
            // printWriter.println("\trankdir = LR;\n");
             printWriter.println("\tnode[shape=record]; \n");
             printWriter.println("\tsubgraph clusterCDLL {\n");
             printWriter.println("label = \"Usuarios\";\n");
             int count = 0;
                String color = "cornflowerblue";
                do{
                    if(count > 0){
                        printWriter.print("tn_cdll" + count + "[label = \"{ <e> | Dato. " + auxNode.nombre + "| <p> }\", style=\"filled\", color=\"black\", fillcolor=\"" + color + "\"]; \n");
                        if(count == 1){
                            printWriter.print("tn_cdll0:p -> tn_cdll1:e;\n");
                            printWriter.print("tn_cdll1:e -> tn_cdll0:p;\n");
                        }else{
                            printWriter.print("tn_cdll" + (count - 1) + ":p -> tn_cdll"+ count + ":e;\n");
                            printWriter.print("tn_cdll" + count + ":e -> tn_cdll" + (count - 1) + ":p;\n");
                        }
                    }else{
                        printWriter.print("tn_cdll" + count + "[label = \"{ <e> | Dato. " + auxNode.nombre +  "| <p> }\", style=\"filled\", color=\"black\", fillcolor=\"" + color + "\"]; \n");
                    }
                    count++;
                    auxNode = auxNode.siguiente;
                }while(auxNode != this.ultimo);
                if(count - 1 > 0){
                    printWriter.print("tn_cdll0:e -> tn_cdll" + (count - 1) + ":p;");
                    printWriter.print("tn_cdll" + (count - 1) + ":p -> tn_cdll0:e;");
                }
                printWriter.print("\t}\n");
                printWriter.print(" }");
                printWriter.close();
                String dotPath = "C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";
                String fileInputPath = ".\\Reportes\\circular.dot";
                String fileOutputPath = ".\\Reportes\\circular.jpg";
                String tParam = "-Tjpg";
                String tOParam = "-o";
                
                String[] cmd = new String[5];
                cmd[0] = dotPath;
                cmd[1] = tParam;
                cmd[2] = fileInputPath;
                cmd[3] = tOParam;
                cmd[4] = fileOutputPath;
                
                Runtime rt = Runtime.getRuntime();
                rt.exec(cmd);
        } catch (IOException ex) {
            //Logger.getLogger(DoublyLinkedList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
