/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.math.BigInteger;
import java.security.MessageDigest;

/**
 *
 * @author Angelo
 */

public class Encriptar {
    
    public String getMD5(String password){
        try{
            MessageDigest md=MessageDigest.getInstance("MD5");
            byte[] encBytes=md.digest(password.getBytes());
            BigInteger numero=new BigInteger(1, encBytes);
            String encString=numero.toString(16);
            while(encString.length()<32){
                encString="0"+encString;
            }

            return encString;
        }
        catch(Exception e){
            throw new RuntimeException(e);
       
        }
    } 
}
