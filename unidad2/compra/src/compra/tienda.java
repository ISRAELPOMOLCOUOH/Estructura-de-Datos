/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compra;

/**
 *
 * @author Usuario
 */

public class tienda {
  int d =0, c=0, ci=0, ve=0, diez=0, cinco=0,dos=0, u=0;
    int CalcularCambio(int cambio){
        while(cambio > 0){
            if(cambio >= 200 ){
                d+=1;
                //System.out.println(d + " billetes de 200 pesos");
                return CalcularCambio(cambio-200);
            }
            if((cambio >=100) && (cambio < 200)){
                c+=1;
                //System.out.println(c + " billetes de 100 pesos");
                return CalcularCambio(cambio-100);
            }
            if((cambio >= 50) && (cambio < 100)){
                ci+=1;
                //System.out.println(ci + " billetes de 50 pesos");
                return CalcularCambio(cambio-50);
            }
            if((cambio >= 20) && (cambio < 50)){
                ve+=1;
                //System.out.println(ve + " billetes de 20 pesos");
                return CalcularCambio(cambio-20);
            }
            if((cambio >= 10) && (cambio <20)){
                diez+=1;
                //System.out.println(diez + " monedas de 10 pesos");
                return CalcularCambio(cambio-10);
            }
            if((cambio >= 5) && (cambio < 10)){
                cinco+=1;
                //System.out.println(cinco + " monedas de 5 pesos");
                return CalcularCambio(cambio-5);
            }
            if((cambio >= 2) && (cambio < 5)){
                dos+=1;
                //System.out.println(dos + " monedas de 2 pesos");
                return CalcularCambio(cambio-2);
            }
            if(cambio == 1){
                u+=1;
                //System.out.println(u + " moneda de 1 peso");
                return CalcularCambio(cambio-1);
            }
        }
        
        if (d>0) {            
            System.out.println(d + " billetes de 200 pesos");
        }
        if (c>0) {            
            System.out.println(c + " billetes de 100 pesos");
        }
        if (ci>0) {            
            System.out.println(ci + " billetes de 50 pesos");
        }
        if (ve>0) {            
            System.out.println(ve + " billetes de 20 pesos");
        }
        if (diez>0) {            
            System.out.println(diez + " monedas de 10 pesos");
        }
        if (cinco>0) {            
            System.out.println(cinco + " monedas de 5 pesos");
        }
        if (dos>0) {            
            System.out.println(dos + " monedas de 2 pesos");
        }

        if (u>0) {            
            System.out.println(u + " monedas de 1 pesos");
        }



        
      return 0;
    }
}
