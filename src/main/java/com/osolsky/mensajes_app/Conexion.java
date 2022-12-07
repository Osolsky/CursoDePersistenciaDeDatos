/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.osolsky.mensajes_app;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author said_
 */
public class Conexion {
    
    public Connection get_connection(){
    Connection conection = null;
    
        try {
            conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app","root","");
        } catch (Exception e) {
            System.out.println(e);
        }
    return conection;
    }
}
