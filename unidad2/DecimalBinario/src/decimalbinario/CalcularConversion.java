/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimalbinario;

/**
 *
 * @author Usuario
 */
class CalcularConversion {
    
    int convertir(int numero){
        if(numero < 2){
            return numero;
        }else{
            return numero % 2 + convertir(numero/2)*10;
        }
    }
}
