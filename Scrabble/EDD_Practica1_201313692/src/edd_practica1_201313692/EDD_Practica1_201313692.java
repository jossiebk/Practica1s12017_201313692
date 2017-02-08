
package edd_practica1_201313692;

/**
 *
 * @author jossie
 */
public class EDD_Practica1_201313692 {
 public static ListaFichas listaF = new ListaFichas();
 public static ListaDiccionario listaD = new ListaDiccionario();
 
    public static void main(String[] args) {
        NodoListaFichas pieza =new NodoListaFichas();
        NodoListaFichas pieza2 =new NodoListaFichas();
        NodoListaFichas pieza3 =new NodoListaFichas();
           
        NodoListaDiccionario palabra1 =new NodoListaDiccionario();
        NodoListaDiccionario palabra2 =new NodoListaDiccionario();
        NodoListaDiccionario palabra3 =new NodoListaDiccionario();
           
        String ficha ="F";
        pieza.setFicha(ficha);
        listaF.push(pieza);
        
        
        String ficha2 ="G";
        pieza2.setFicha(ficha2);
        listaF.push(pieza2);
        
        
        String ficha3 ="T";
        pieza3.setFicha(ficha3);
        listaF.push(pieza3);
        
        
        
        for(int x=0;x<listaF.size();x++){
            System.out.println(listaF.buscar(x).getFicha());
        }
    
        System.out.println("---------------------------------------");
        String pal1 ="Fuerte";
        palabra1.setPalabra(pal1);
        listaD.push(palabra1);
        
        
        String pal2 ="Episodio";
        palabra2.setPalabra(pal2);
        listaD.push(palabra2);
       
        
        String pal3 ="Triton";
        palabra3.setPalabra(pal3);
        listaD.push(palabra3);
        
        
        
        for(int x=0;x<listaF.size();x++){
            System.out.println(listaD.buscar(x).getPalabra());
        }
        
    
    }
    
}
