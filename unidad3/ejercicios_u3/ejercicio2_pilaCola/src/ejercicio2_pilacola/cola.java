
package ejercicio2_pilacola;

public class cola {
    nodoCola inicio, fin;
    int tama;
    
    public cola(){
        inicio = fin = null;
        tama = 0;
    }
   
    public boolean vacia(){
        return inicio == null;
    }
    
    public void insertar(Object valor){
        nodoCola nuevo = new nodoCola(valor); 
        if(vacia()){
            inicio = nuevo;
        }else{
            fin.siguiente = nuevo;
        }
        fin = nuevo;
        tama++;
    }
    
    public Object quitar(){
        Object aux = inicio.dato;
        inicio= inicio.siguiente;
        tama--;
        return aux;
    }
    
    public Object inicioCola(){
        return inicio.dato;
    }
    
    public int tama(){
        return tama;
    }
    
}
