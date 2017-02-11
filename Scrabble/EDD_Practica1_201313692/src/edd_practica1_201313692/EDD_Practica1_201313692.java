
package edd_practica1_201313692;

/**
 *
 * @author jossie
 */
public class EDD_Practica1_201313692 {
 public static ListaFichas listaF = new ListaFichas();
 public static ListaDiccionario listaD = new ListaDiccionario();
 
    public static void main(String[] args) {
        
        NodoListaFichas pieza2 =new NodoListaFichas();
        NodoListaFichas pieza3 =new NodoListaFichas();
           
        NodoListaDiccionario palabra1 =new NodoListaDiccionario();
        NodoListaDiccionario palabra2 =new NodoListaDiccionario();
        NodoListaDiccionario palabra3 =new NodoListaDiccionario();
           
        Cola colaFicha = new Cola();
        
        colaFicha.Insertar(4,"D");
        colaFicha.Insertar(14,"G");
        colaFicha.Insertar(3,"J");
        colaFicha.Insertar(9,"Q");
        colaFicha.Insertar(5,"X");
        colaFicha.Insertar(1,"O");
        System.out.println("ell tamaño es: "+colaFicha.tamañoCola());
        
        int a=colaFicha.tamañoCola()-1;
        for(int x=0;x<=a;x++){
            NodoListaFichas pieza =new NodoListaFichas();
            //System.out.println(colaFicha.Eliminar());
            colaFicha.Eliminar();
            System.out.println("eliminado:   "+colaFicha.p+"--"+Integer.toString(colaFicha.r));
           
            pieza.setFicha(colaFicha.p);
            pieza.setValor(colaFicha.r);
            listaF.push(pieza);
            
        }
        
        
        /*
        String ficha ="F";
        pieza.setFicha(ficha);
        listaF.push(pieza);
        
        
        String ficha2 ="G";
        pieza2.setFicha(ficha2);
        listaF.push(pieza2);
        
        
        String ficha3 ="T";
        pieza3.setFicha(ficha3);
        listaF.push(pieza3);
        */
        
        
        for(int x=0;x<listaF.size();x++){
            System.out.println(listaF.buscar(x).getFicha()+listaF.buscar(x).getValor());
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
        
        
        
        for(int y=0;y<listaD.size();y++){
            System.out.println(listaD.buscar(y).getPalabra());
        }
        
        
        ListaCircular listacircular=new ListaCircular();
        listacircular.Insertar(3);
        listacircular.Insertar(13);
        listacircular.Insertar(5);
        listacircular.Insertar(99);
        listacircular.Insertar(56);
        listacircular.Insertar(23);
        listacircular.Insertar(69);
        
        listacircular.MostrarLista();
    
        listacircular.eliminar(23);
        listacircular.MostrarLista();
        listacircular.eliminar(5);
        listacircular.MostrarLista();
        listacircular.eliminar(99);
        listacircular.MostrarLista();
    }
    
}
