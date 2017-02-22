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
public class ListaDiccionario {
     private FileWriter fileWriter = null;
    private PrintWriter printWriter = null;
      NodoListaDiccionario inicio,  fin;
    int size;
    
    
// este metodo sera el constructor de mi lista    
public ListaDiccionario(){
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





public void Graficar(){
        NodoListaDiccionario auxNode = this.inicio;
        try {
            File directorio = new File(".\\Reportes");
            if(!directorio.exists()){
                directorio.mkdirs();
            }
            fileWriter = new FileWriter(".\\Reportes\\Doc.dot");
            printWriter = new PrintWriter(fileWriter);
                    
             printWriter.println("digraph G {");
            // printWriter.println("\trankdir = LR;\n");
             printWriter.println("\tnode[shape=record]; \n");
             printWriter.println("\tsubgraph clusterDLL {\n");
             printWriter.println("label = \"Lista de objetos\";\n");
             int count = 0;
                String color = "skyblue";
                do{
                    if(count > 0){
                        printWriter.print("tn_dll" + count + "[label = \"{ <e> |  " + auxNode.getPalabra() + "| <p> }\", style=\"filled\", color=\"black\", fillcolor=\"" + color + "\"]; \n");
                        if(count == 1){
                            printWriter.print("tn_dll0:p -> tn_dll1:e;\n");
                            //printWriter.print("tn_dll1:e -> tn_dll0:p;\n");
                        }else{
                            printWriter.print("tn_dll" + (count - 1) + ":p -> tn_dll"+ count + ":e;\n");
                            //printWriter.print("tn_dll" + count + ":e -> tn_dll" + (count - 1) + ":p;\n");
                        }
                    }else{
                        printWriter.print("tn_dll" + count + "[label = \"{ <e> | " + auxNode.getPalabra() +  "| <p> }\", style=\"filled\", color=\"black\", fillcolor=\"" + color + "\"]; \n");
                    }
                    count++;
                    auxNode = auxNode.siguiente;
                }while(auxNode != null);
                printWriter.print("\t}\n");
                printWriter.print(" }");
                printWriter.close();
                String dotPath = "C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";
                String fileInputPath = ".\\Reportes\\Doc.dot";
                String fileOutputPath = ".\\Reportes\\Doc.jpg";
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
