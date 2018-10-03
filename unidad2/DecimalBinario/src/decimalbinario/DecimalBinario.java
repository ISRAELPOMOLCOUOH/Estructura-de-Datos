package decimalbinario;

/**
 *
 * @author Pomol Couoh Israel
 */
import java.util.*;
import javax.swing.*;
public class DecimalBinario {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));
        
         CalcularConversion ca = new CalcularConversion();
         System.out.println(ca.convertir(numero));
    }
    
}
