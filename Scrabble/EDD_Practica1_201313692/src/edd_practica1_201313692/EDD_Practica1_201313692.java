
package edd_practica1_201313692;

/**
 *
 * @author jossie
 */
public class EDD_Practica1_201313692 {
 public static ListaFichas listaF = new ListaFichas();
 public static ListaDiccionario listaD = new ListaDiccionario();
 public static ListaCircular listacircular=new ListaCircular();
 public static Cola colaFicha = new Cola();
    public static void main(String[] args) {
        
        NodoListaFichas pieza2 =new NodoListaFichas();
        NodoListaFichas pieza3 =new NodoListaFichas();
           
        NodoListaDiccionario palabra1 =new NodoListaDiccionario();
        NodoListaDiccionario palabra2 =new NodoListaDiccionario();
        NodoListaDiccionario palabra3 =new NodoListaDiccionario();
           
        Cola colaFicha = new Cola();
      
    
    
    
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
            if(arreglo[k]<12){
                 colaFicha.Insertar(1,"A");
            }else if(arreglo[k]>11 && arreglo[k]<24){
                 colaFicha.Insertar(1,"E");
            }else if(arreglo[k]>23 && arreglo[k]<33){
                 colaFicha.Insertar(1,"O");
            }else if(arreglo[k]>32 && arreglo[k]<39){
                 colaFicha.Insertar(1,"I");
            }else if(arreglo[k]>38 && arreglo[k]<45){
                 colaFicha.Insertar(1,"S");
            }else if(arreglo[k]>44 && arreglo[k]<50){
                 colaFicha.Insertar(1,"N");
            }else if(arreglo[k]>49 && arreglo[k]<54){
                 colaFicha.Insertar(1,"L");
            }else if(arreglo[k]>53 && arreglo[k]<59){
                 colaFicha.Insertar(1,"R");
            }else if(arreglo[k]>58 && arreglo[k]<64){
                 colaFicha.Insertar(1,"U");
            }else if(arreglo[k]>63 && arreglo[k]<68){
                 colaFicha.Insertar(1,"T");
            }else if(arreglo[k]>67 && arreglo[k]<73){
                 colaFicha.Insertar(2,"D");
            }else if(arreglo[k]>72 && arreglo[k]<75){
                 colaFicha.Insertar(2,"G");
            }else if(arreglo[k]>74 && arreglo[k]<79){
                 colaFicha.Insertar(3,"C");
            }else if(arreglo[k]>78 && arreglo[k]<81){
                 colaFicha.Insertar(3,"B");
            }else if(arreglo[k]>80 && arreglo[k]<83){
                 colaFicha.Insertar(3,"M");
            }else if(arreglo[k]>82 && arreglo[k]<85){
                 colaFicha.Insertar(3,"P");
            }else if(arreglo[k]>84 && arreglo[k]<87){
                 colaFicha.Insertar(4,"H");
            }else if(arreglo[k]>86 && arreglo[k]<88){
                 colaFicha.Insertar(4,"F");
            }else if(arreglo[k]>87 && arreglo[k]<89){
                 colaFicha.Insertar(4,"V");
            }else if(arreglo[k]>88 && arreglo[k]<90){
                 colaFicha.Insertar(4,"Y");
            }else if(arreglo[k]>89 && arreglo[k]<91){
                 colaFicha.Insertar(5,"Q");
            }else if(arreglo[k]>90 && arreglo[k]<92){
                 colaFicha.Insertar(8,"J");
            }else if(arreglo[k]>91 && arreglo[k]<93){
                 colaFicha.Insertar(8,"Ñ");
            }else if(arreglo[k]>92 && arreglo[k]<94){
                 colaFicha.Insertar(8,"X");
            }else if(arreglo[k]>93 && arreglo[k]<95){
                 colaFicha.Insertar(10,"Z");
            }
       }
        
         System.out.println("ell tamaño es: "+colaFicha.tamañoCola());
        
        int a=colaFicha.tamañoCola()-1;
        //for(int x=0;x<=a;x++){
          //  colaFicha.Eliminar();
            //System.out.println("pop: "+colaFicha.p+"--"+Integer.toString(colaFicha.r));
         //}
        
       
        
       MatrizOrtogonal matriz;
       matriz=new MatrizOrtogonal();
       
       matriz.llenar(3, 3);
     
       //int dato=matriz.l.Buscar(0).Filas.primero.abajo.derecha.dato;
       //int dato1=matriz.c.Buscar(0).Columna.primero.abajo.derecha.dato;
        //System.out.println(dato+" "+dato1);
        
        inicio ventana1=new inicio();
        ventana1.setVisible(true);
    
    }
    
   
}
