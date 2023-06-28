package org.example;

import java.sql.Connection;
import java.sql.DriverManager;


public class Main {
    public static void main(String[] args) {
        String user = "postgres";
        String pass ="02172003";


        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/prueba_proyecto",user, pass);
            System.out.println("Conectado");
        }catch (Exception e){
            System.out.println(e.getMessage());

        }






    }
}

