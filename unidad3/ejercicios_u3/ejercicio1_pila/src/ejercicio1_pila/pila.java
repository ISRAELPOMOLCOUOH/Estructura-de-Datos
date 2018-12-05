
package ejercicio1_pila;


public class pila {
    String arreglo[];
    int top;
    pila(){
        arreglo = new String[5];
        top = 0;
    }
    
 public boolean empty(){
     if(top == 0){
         return true;
     }else{
         return false;
     }
 }
 
 public void push(String str){
     if(top < arreglo.length){
         arreglo[top] = str;
         top++;
     }else{
         String temp[] = new String[arreglo.length + 5];
         for(int i=0; i<arreglo.length; i++){
             temp[i] = arreglo[i];
         }
         arreglo = temp;
         
         arreglo[top] = str;
         top++;
     }
 }
 
 public String peek(){
     if(top > 0){
         return arreglo[top-1];
     }else{
         return null;
     }
 }
 
 public String pop(){
     String temp = null;
     if(top > 0){
         temp = arreglo[top-1];
         arreglo[top-1] = null;
         top--;
     }
     return temp;
 }
 
 public int size(){
     return top;
 }
 
}
