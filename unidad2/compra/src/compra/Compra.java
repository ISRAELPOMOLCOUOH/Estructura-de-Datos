
package compra;

/**
 *
 * @author Usuario
 */
import javax.swing.*;
public class Compra {

    public static void main(String[] args) {
        // TODO code application logic here
        int TotVenta = Integer.parseInt(JOptionPane.showInputDialog("total de la compra"));
        int pago = Integer.parseInt(JOptionPane.showInputDialog("monto de pago"));
        int cambio = pago - TotVenta;
        
        tienda ti = new tienda();
        ti.CalcularCambio(cambio);
    }
    
}
