/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sanjeevani.utility;

import java.util.Base64;

/**
 *
 * @author LENOVO
 */
public class PasswordEncryption {
//    public static void main(String [] args){
//        Base64.Encoder en = Base64.getEncoder();
//        String pwd ="ankita";
//        byte[] arr = pwd.getBytes();
//        String encPwd = en.encodeToString(arr);
//        System.out.println("Original string:"+pwd);
//        System.out.println("Encrypted string:"+encPwd);
//    }
    public static String getEncryptedPassword(String password){
        Base64.Encoder encoder = Base64.getEncoder();
        return encoder.encodeToString(password.getBytes());
    }
}
