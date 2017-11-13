/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aes;


/**
 *
 * @author Personal
 */
public class main {
    public static void main(String[] args) throws Exception{
        
        String key = "92AE31A79FEEB2A3";
        String iv = "0123456789ABCDEF";
        
        String cleartext ="hola mundo";
        System.out.println("Texto encriptado"+ aes.Encriptacion.encrypt(key, iv, cleartext));
        String encriptado =   aes.Encriptacion.encrypt(key, iv, cleartext);
        System.out.println("Textto encriptado"+ aes.Encriptacion.decrypt(key, iv, encriptado));
    
    }
     
}
