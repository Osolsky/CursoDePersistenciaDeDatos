/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.osolsky.mensajes_app;

import com.mysql.cj.protocol.Resultset;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
    
    public static ArrayList<Mensajes> leerMensajseDB() throws SQLException {
        ArrayList<Mensajes> completeList = new ArrayList<>();
        Conexion db_conncect = new Conexion();

       

        try ( Connection conexion = db_conncect.get_connection()) {
            String query = "SELECT * FROM mensajes";
            PreparedStatement ps = null;
            ResultSet rs = null;

            try {
                ps = conexion.prepareStatement(query);
                rs = ps.executeQuery();

                while (rs.next()) {
                    Mensajes mensajeActual = new Mensajes();
                    mensajeActual.setId_mensaje(rs.getInt("id_mensaje"));
                    mensajeActual.setMensaje(rs.getString("mensaje"));
                    mensajeActual.setAutor_mensaje(rs.getString("autor_mensaje"));
                    mensajeActual.setFecha_mensaje(rs.getString("fecha_mensaje"));

                    completeList.add(mensajeActual);
                }
            } catch (SQLException e) {

            }
        } catch (SQLException e) {

        }
        return completeList;
    }
    
    public static void borrarMensajeDB(int id_mensaje){
    
    }
    
    public static void actualizarMensajeDB(Mensajes mensaje){
        
    }
}
