/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_pila;

import java.util.Scanner;

public class Ejercicio1_pila {

    
    public static void main(String[] args) {
        // TODO code application logic here
        pila pil = new pila();
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese los caracteres/ ingrese terminar para dejar de introducir");
     
        int v = 0;
        do{
            pil.push(leer.nextLine());
            if(pil.peek().equals("terminar")){
                pil.pop();
                v = 1;
            }else{
                v = 2;
            }  
        }while(v != 1);
        int n=0;
        int t = pil.size();
        System.out.print("***la palabra es :  ");
       while(n < t){
           System.out.print(pil.pop());
           n++;
       }
        System.out.println("");
        
       
        
    }
    
}
