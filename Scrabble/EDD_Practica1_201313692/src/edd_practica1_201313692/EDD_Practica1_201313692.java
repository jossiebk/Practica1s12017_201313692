
package edd_practica1_201313692;

/**
 *
 * @author jossie
 */
public class EDD_Practica1_201313692 {
 public static ListaFichas listaF = new ListaFichas();
  public static ListaFichas listaF1 = new ListaFichas();
   public static ListaFichas listaF2 = new ListaFichas();
    public static ListaFichas listaF3 = new ListaFichas();
     public static ListaFichas listaF4 = new ListaFichas();
      public static ListaFichas listaF5 = new ListaFichas();
       public static ListaFichas listaF6 = new ListaFichas();
   public static ListaFichas listaF7 = new ListaFichas();
    public static ListaFichas listaF8 = new ListaFichas();
     public static ListaFichas listaF9 = new ListaFichas();
      public static ListaFichas listaF10 = new ListaFichas();
  
  
 public static ListaDiccionario listaD = new ListaDiccionario();
 public static ListaCircular listacircular=new ListaCircular();
 public static Cola colaFicha = new Cola();
   
       public static MatrizOrtogonal matriz=new MatrizOrtogonal();
    public static void main(String[] args) {
        
        NodoListaFichas pieza1 =new NodoListaFichas();
        NodoListaFichas pieza2 =new NodoListaFichas();
         NodoListaFichas pieza3 =new NodoListaFichas();
        NodoListaFichas pieza4 =new NodoListaFichas();
         NodoListaFichas pieza5 =new NodoListaFichas();
        NodoListaFichas pieza6 =new NodoListaFichas();
           
        NodoListaDiccionario palabra1 =new NodoListaDiccionario();
        NodoListaDiccionario palabra2 =new NodoListaDiccionario();
        NodoListaDiccionario palabra3 =new NodoListaDiccionario();
           
        
      
        /*
        NodoListaFichas pieza1 =new NodoListaFichas();
        pieza1.setFicha("F");
        pieza1.setValor(1);
        listaF.push(pieza1);
        pieza2.setFicha("G");
        pieza2.setValor(1);
        listaF.push(pieza2);
         pieza3.setFicha("E");
         pieza3.setValor(1);
         listaF.push(pieza3);
        pieza4.setFicha("Q");
        pieza4.setValor(1);
        listaF.push(pieza4);
         pieza5.setFicha("P");
         pieza5.setValor(1);
         listaF.push(pieza5);
        pieza6.setFicha("Y");
        pieza6.setValor(1);
        listaF.push(pieza6);
        
        
        */
    
    
    
        int i=0,cantidad=95,rango=95;
        int arreglo[]=new int[cantidad];
        arreglo[i]=(int)(Math.random()*rango);
        for(i=1;i<cantidad;i++){
            arreglo[i]=(int)(Math.random()*rango);
            for(int j=0;j<i;j++){
            if(arreglo[i]==arreglo[j]){
            i--;
            }
            }
        }
       for(int k=0;k<cantidad;k++){
           //System.out.print((k+1)+".-"+arreglo[k]+"\n");
            NodoCola fich =new NodoCola();
            if(arreglo[k]<12){
                fich.setFicha("A");
                fich.setValor(1);
                colaFicha.push(fich);
            }else if(arreglo[k]>11 && arreglo[k]<24){
                  fich.setFicha("E");
                fich.setValor(1);
                colaFicha.push(fich);
            }else if(arreglo[k]>23 && arreglo[k]<33){
                  fich.setFicha("O");
                fich.setValor(1);
                colaFicha.push(fich);
            }else if(arreglo[k]>32 && arreglo[k]<39){
                  fich.setFicha("I");
                fich.setValor(1);
                colaFicha.push(fich);
            }else if(arreglo[k]>38 && arreglo[k]<45){
                  fich.setFicha("S");
                fich.setValor(1);
                colaFicha.push(fich);
            }else if(arreglo[k]>44 && arreglo[k]<50){
                  fich.setFicha("N");
                fich.setValor(1);
                colaFicha.push(fich);
            }else if(arreglo[k]>49 && arreglo[k]<54){
                  fich.setFicha("L");
                fich.setValor(1);
                colaFicha.push(fich);
            }else if(arreglo[k]>53 && arreglo[k]<59){
                  fich.setFicha("R");
                fich.setValor(1);
                colaFicha.push(fich);
            }else if(arreglo[k]>58 && arreglo[k]<64){
                  fich.setFicha("U");
                fich.setValor(1);
                colaFicha.push(fich);
            }else if(arreglo[k]>63 && arreglo[k]<68){
                  fich.setFicha("T");
                fich.setValor(1);
                colaFicha.push(fich);
            }else if(arreglo[k]>67 && arreglo[k]<73){
                  fich.setFicha("D");
                fich.setValor(2);
                colaFicha.push(fich);
            }else if(arreglo[k]>72 && arreglo[k]<75){
                  fich.setFicha("G");
                fich.setValor(2);
                colaFicha.push(fich);
            }else if(arreglo[k]>74 && arreglo[k]<79){
                  fich.setFicha("C");
                fich.setValor(3);
                colaFicha.push(fich);
            }else if(arreglo[k]>78 && arreglo[k]<81){
                  fich.setFicha("B");
                fich.setValor(3);
                colaFicha.push(fich);
            }else if(arreglo[k]>80 && arreglo[k]<83){
                  fich.setFicha("M");
                fich.setValor(3);
                colaFicha.push(fich);
            }else if(arreglo[k]>82 && arreglo[k]<85){
                  fich.setFicha("P");
                fich.setValor(3);
                colaFicha.push(fich);
            }else if(arreglo[k]>84 && arreglo[k]<87){
                 fich.setFicha("H");
                fich.setValor(4);
                colaFicha.push(fich);
            }else if(arreglo[k]>86 && arreglo[k]<88){
                  fich.setFicha("F");
                fich.setValor(4);
                colaFicha.push(fich);
            }else if(arreglo[k]>87 && arreglo[k]<89){
                  fich.setFicha("V");
                fich.setValor(4);
                colaFicha.push(fich);
            }else if(arreglo[k]>88 && arreglo[k]<90){
                  fich.setFicha("Y");
                fich.setValor(4);
                colaFicha.push(fich);
            }else if(arreglo[k]>89 && arreglo[k]<91){
                  fich.setFicha("Q");
                fich.setValor(5);
                colaFicha.push(fich);
            }else if(arreglo[k]>90 && arreglo[k]<92){
                  fich.setFicha("J");
                fich.setValor(8);
                colaFicha.push(fich);
            }else if(arreglo[k]>91 && arreglo[k]<93){
                  fich.setFicha("Ñ");
                fich.setValor(8);
                colaFicha.push(fich);
            }else if(arreglo[k]>92 && arreglo[k]<94){
                 fich.setFicha("X");
                fich.setValor(8);
                colaFicha.push(fich);
            }else if(arreglo[k]>93 && arreglo[k]<95){
                  fich.setFicha("Z");
                fich.setValor(10);
                colaFicha.push(fich);
            }
       }
       
       
        
         System.out.println("ell tamaño es: "+colaFicha.size());
       
         
         
        int a=colaFicha.size()-1;
        for(int x=0;x<=a;x++){
          //  colaFicha.Eliminar();
            System.out.println("pop: "+colaFicha.buscar(x).getFicha()+"--"+Integer.toString(colaFicha.buscar(x).getValor()));
         }
        
        
        
       
        
     
       
       //matriz.llenar(3, 3);
     
       //int dato=matriz.l.Buscar(0).Filas.primero.abajo.derecha.dato;
       //int dato1=matriz.c.Buscar(0).Columna.primero.abajo.derecha.dato;
        //System.out.println(dato+" "+dato1);
        
        inicio ventana1=new inicio();
        ventana1.setVisible(true);
    
    }
    
   
}
