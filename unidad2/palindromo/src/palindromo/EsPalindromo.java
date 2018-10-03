/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromo;

/**
 *
 * @author Usuario
 */
public class EsPalindromo {
    
    boolean calcula(String palabra1, int id, int di){
        if(palabra1.length()-1 > id){
            if(palabra1.charAt(id)== palabra1.charAt(di)){
                calcula(palabra1, id + 1, di - 1);
                return true;
            }
        }    
        return false;
    }   
}
