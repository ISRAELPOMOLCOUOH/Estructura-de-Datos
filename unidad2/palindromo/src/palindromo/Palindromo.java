
package palindromo;

/**
 *
 * @author pomol couoh Israel
 */
import java.util.*;
public class Palindromo {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String palabra = leer.nextLine();
        String palabra1 = palabra.replace(" ", "");//use el replace para eliminar los espacios
        EsPalindromo pa  = new  EsPalindromo();
        int id= 0, di = palabra1.length()-1;
        
        if(pa.calcula(palabra1, id, di)== true){
            System.out.println("Esta palabra es un palindromo");
        }else{
            System.out.println("Esta palabra no es un palindromo");
        }
    }
    
}
