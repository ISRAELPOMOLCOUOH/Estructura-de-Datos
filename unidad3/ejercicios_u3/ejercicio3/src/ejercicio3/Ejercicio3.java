
package ejercicio3;
//autor: israel pomol couoh
//sistemas 3-B
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        pila pila1 = new pila();//guarda los regalos para las personas
       
        generaRegalos rega = new generaRegalos();//llamo a la clase que genera aleatoriamente a mis regalos
        int emp =0;
        System.out.print("introduzca el nuemero de empleados: ");
        emp = leer.nextInt();
        personas persona[] = new personas[emp];//llamo a mi clase en donde esta almacenado mi arreglo de objetos
       String nombre;
       int telefono;
       
       //en este for almcaeno los datos de mi arreglo de objetos
        for(int i=0; i<persona.length; i++){
            leer.nextLine();//lo puse para poder solucionar el buffer
            System.out.print("introduce tu nombre ");
            nombre = leer.nextLine();
            System.out.print("introduce tu telefono ");
            telefono = leer.nextInt();
            //leer.nextLine();//lo puse para poder solucionar el buffer
            persona[i]= new personas(nombre,telefono);
        }
        
        int z=0;
        while(z <emp){
            pila1.push(rega.obtenerRegalo());//llamo a mi metodo que genera regalos aleatoriamente 
            z++;                             //y los guardo en una pila
        }
        System.out.println("===============================================");
        //en este for anidado eliminamos los nombre repetidos
        for(int i=0;i<persona.length;i++){
            for(int j=0;j<persona.length-1;j++){
		if(i!=j){
                    //arre[i]==arre[j] 
                    if(persona[i].getNombre().equalsIgnoreCase(persona[j].getNombre())){
			// eliminamos su valor
			persona[i].setNombre("");
                    }
		}
            }
	}
 
    // mostramos los nombres sin que esten repetidos junto con el regalo que les toco
 
    for (int k=0;k<=persona.length-1;k++){
	if(persona[k].getNombre()!= ""){
            System.out.println( persona[k].getNombre() + " tienes de regalo " + pila1.pop());
	}
    }
       
    }
    
}
