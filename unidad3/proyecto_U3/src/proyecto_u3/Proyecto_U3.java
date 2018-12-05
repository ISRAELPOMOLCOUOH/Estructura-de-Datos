
package proyecto_u3;

import java.util.Stack;
import java.util.Scanner;
public class Proyecto_U3 {

  
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Stack pila1 = new Stack();
        Stack pila2 = new Stack();
        Stack pila3 = new Stack();
        Stack pila4 = new Stack();
        Stack pila5 = new Stack();
        Stack pilaAux = new Stack();
         
        
        Scanner leer = new Scanner(System.in);
        
        int i,j,k;
        do{
            System.out.print("introduce numero i: ");
            i = leer.nextInt();
            System.out.print("introduce numero j: ");
            j = leer.nextInt();
            if(i >0 && i<=5){
                //Si i es positivo, debe insertarse el elemento j en la pila P i 
                switch(i){
                    case 1:
                        pila1.push(j);
                        break;
                    case 2:
                        pila2.push(j);
                        break;
                    case 3:
                        pila3.push(j);
                        break;
                    case 4:
                        pila4.push(j);
                        break;
                    case 5:
                        pila5.push(j);
                        break;  
                }
                
            }else if((i <0) && (i >= -5)){
                    int ipos;
                    ipos= i*-1;
                    Object da;
                    char a;
                    switch(ipos){
                        case 1: 
                            int tp1 = pila1.size();  //tamaño de la pila 1
                            for(k =0; k<tp1; k++){//con este for recorro mi pila 
                                da = pila1.pop();
                                if(da.equals(j)){
                                    a = 'f';
                                }else{
                                    pilaAux.push(da);
                                }
                            }
                            //pila1 = pilaAux;//en esta parte realizo un cambio pasanso los datos de la pila aux a la pila que pertenece
                            int ta=pilaAux.size();//tamaño de la pila auxiliar
                            for(k=0; k<ta; k++){
                                pila1.push(pilaAux.pop());//vacio la pila auxiliar y al mismo tiempo le agrego los datos a la pila original
                            }
                            
                            break;
                        case 2:
                            int tp2 = pila2.size();                          
                            for(k =0; k<tp2; k++){//con este for recorro mi pila 
                                da = pila2.pop();
                                if(da.equals(j)){
                                    a = 'f';
                                }else{
                                    pilaAux.push(da);
                                }
                            }
                            
                            ta=pilaAux.size();//tamaño de la pila auxiliar
                            for(k=0; k<ta; k++){
                                pila2.push(pilaAux.pop());
                            }
                            break;
                        case 3:
                            int tp3 = pila3.size();                          
                            for(k =0; k<tp3; k++){//con este for recorro mi pila 
                                da = pila3.pop();
                                if(da.equals(j)){
                                    a = 'f';
                                }else{
                                    pilaAux.push(da);
                                }
                            }
                            
                           ta=pilaAux.size();//tamaño de la pila auxiliar
                            for(k=0; k<ta; k++){
                                pila3.push(pilaAux.pop());
                            }
                            break;
                        case 4:
                            int tp4 = pila4.size();                          
                            for(k =0; k<tp4; k++){//con este for recorro mi pila 
                                da = pila4.pop();
                                if(da.equals(j)){
                                    a = 'f';
                                }else{
                                    pilaAux.push(da);
                                }
                            }
                            
                            ta=pilaAux.size();//tamaño de la pila auxiliar
                            for(k=0; k<ta; k++){
                                pila4.push(pilaAux.pop());
                            }
                            break;
                        case 5:
                            int tp5 = pila5.size();                          
                            for(k =0; k<tp5; k++){//con este for recorro mi pila 
                                da = pila5.pop();
                                if(da.equals(j)){
                                    a = 'f';
                                }else{
                                    pilaAux.push(da);
                                }
                            }
                           
                            ta=pilaAux.size();//tamaño de la pila auxiliar
                            for(k=0; k<ta; k++){
                                pila5.push(pilaAux.pop());
                            }
                            break;
                        
                    }
                
                System.out.println("no se puede introducir en la pila\n");
                
            }
            System.out.println("=============================");
        }while(i != 0);
        System.out.println("ELEMENTOS INSERTADOS EN LA PILA");
        System.out.println("=== pila 1 ===");
        System.out.println(pila1);
        System.out.println("=== pila 2 ===");
        System.out.println(pila2);
        System.out.println("=== pila 3 ===");
        System.out.println(pila3);
        System.out.println("=== pila 4 ===");
        System.out.println(pila4);
        System.out.println("=== pila 5 ===");
        System.out.println(pila5);
        
      
    }
    
}
