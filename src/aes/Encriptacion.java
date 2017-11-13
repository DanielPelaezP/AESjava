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
import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Encriptacion {
    
    private final static String tipo_alg = "AES";
    private final static String cI = "AES/CBC/PKCS5padding";
    
    public static String encrypt(String key, String vector, String Cadenaorginal) throws Exception{
    Cipher cipher = Cipher.getInstance(cI);
    SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes(), tipo_alg);
    IvParameterSpec ivParameterSpec = new IvParameterSpec(vector.getBytes());
    cipher.init(Cipher.ENCRYPT_MODE,skeySpec,ivParameterSpec );
    byte[] encrypted = cipher.doFinal(Cadenaorginal.getBytes());
     return new String(encrypted, "ISO-8859-1");
    }
    
    public static String decrypt (String key, String vector, String Cadenacifrada) throws Exception{
        Cipher cipher = Cipher.getInstance(cI);
        SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes(), tipo_alg);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(vector.getBytes());
        byte[] enc = Cadenacifrada.getBytes("ISO-8859-1");
        cipher.init(Cipher.DECRYPT_MODE,skeySpec,ivParameterSpec );
        byte[] decrypted = cipher.doFinal(enc);       
        return new String (decrypted);
    
    }
}
    

