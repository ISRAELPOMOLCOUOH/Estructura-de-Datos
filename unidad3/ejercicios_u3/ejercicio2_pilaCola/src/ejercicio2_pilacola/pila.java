/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2_pilacola;


public class pila {
    Object arreglo[];
    int top;
    
    public pila(){
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
    
    public void push(Object str){
        if(top < arreglo.length){
            arreglo[top] = str;
            top++;
        }else{
            Object temp[] = new String[arreglo.length +  5];
            for(int i=0; i <arreglo.length; i++){
                temp[i] = arreglo[i];
            }
            arreglo = temp;
            arreglo[top] = str;
            top++;
        }
    }
    
    public Object peek(){
        if(top > 0){
            return arreglo[top-1];
        }else{
            return null;
        }
    }
    
    public Object pop(){
        Object temp = null;
        if(top > 0){
            temp = arreglo[top-1];
            arreglo[top-1]= null;
            top--;
        }
        return temp;
    }
    
    public int size(){
        return top;
    }
}
