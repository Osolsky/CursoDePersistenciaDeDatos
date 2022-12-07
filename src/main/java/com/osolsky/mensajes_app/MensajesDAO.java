/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.osolsky.mensajes_app;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author said_
 */
public class MensajesDAO {
    
    public static void crearMensajeDB(Mensajes mensaje) {
        Conexion db_connect = new Conexion();

        try ( Connection conexion = db_connect.get_connection()) {
            PreparedStatement p = null;
            try {
                String query = ("INSERT INTO mensajes (mensaje,autor_mensaje) VALUES(?,?)");
                p = conexion.prepareStatement(query);
                p.setString(1, mensaje.getMensaje());
                p.setString(2, mensaje.getAutor_mensaje());
                p.executeUpdate();
                System.out.println("El mensaje se creo correctamente");
            } catch (SQLException e) {
                System.out.println(e);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public static void leerMensajseDB(){
        
    }
    
    public static void borrarMensajeDB(int id_mensaje){
    
    }
    
    public static void actualizarMensajeDB(Mensajes mensaje){
        
    }
}
