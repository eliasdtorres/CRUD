package com.crud.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncriptarPassword {

    public static void main(String[] args) {

        String password = "123";
        System.out.println("Sin encriptar: "+ password);
        System.out.println("Encriptado: "+ encriptarPassword(password));

    }
    
    //se encripta el password
    public static String encriptarPassword(String password) {
        
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        
        return encoder.encode(password);
    }
}
