/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.osolsky.mensajes_app;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author said_
 */
public class MensajesService {
    public static void crearMensaje() {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu mensaje");
        String mensaje = sc.nextLine();
        System.out.println("Dame tu nombre");
        String nombre = sc.nextLine();

        Mensajes registro = new Mensajes();
        registro.setMensaje(mensaje);
        registro.setAutor_mensaje(nombre);

        MensajesDAO.crearMensajeDB(registro);
    }
    
    public static void listarMensajes() throws SQLException{
       ArrayList <Mensajes>registros= MensajesDAO.leerMensajseDB();
       
       for(Mensajes mensaje : registros){
           System.out.println("ID: "+mensaje.getId_mensaje());
           System.out.println("Mensaje: "+mensaje.getMensaje());
           System.out.println("Autor: "+mensaje.getAutor_mensaje());
           System.out.println("Fecha: "+mensaje.getFecha_mensaje());
           System.out.println("-----------------------------");
       }
        System.out.println("FIN DE LOS MENSAJES"); 
      
    }
    
    public static void borrarMensajes(){
    }
    
    public static void editarMensaje(){
    }
}
