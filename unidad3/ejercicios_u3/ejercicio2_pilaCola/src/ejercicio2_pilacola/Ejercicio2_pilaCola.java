
package ejercicio2_pilacola;
import java.util.Scanner;
import javax.swing.*;
public class Ejercicio2_pilaCola {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        pila pil = new pila();
        cola col = new cola();
        
       int v = 0;
        System.out.println("introduzca los datos de la pila/esbriba terminar para dejar de ingresar");
        do{
            pil.push(leer.nextLine());
            if(pil.peek().equals("terminar")){
                pil.pop();
                v = 1;
            }else{
                v = 2;
            }  
        }while(v != 1);
        
        int n = pil.size();
        int t = 0;
        System.out.println("\nDATOS DE LA PILA:");
        while(t < n){//uso este while para imprimir la pila y al mismo tiempo llenar la cola
            System.out.println(pil.peek());//me imprime los datos que tiene la pila
            col.insertar(pil.pop());//le paso los datos de la pila a la cola
            t++;
        }
        
        System.out.println("\nDATOS DE LA COLA CREADA");
        int n2 = col.tama();
        int t2=1;
        while(t2 <= n2){
            System.out.print(col.quitar()+ "  ");
            t2++;
        }
        
    }
    
}
