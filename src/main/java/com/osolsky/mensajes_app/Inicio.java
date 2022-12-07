/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.osolsky.mensajes_app;

import java.sql.Connection;
import java.util.Scanner;

/**
 *
 * @author said_
 */
public class Inicio {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Conexion conexion = new Conexion();
        int opcion =0;
        
        do{
            System.out.println("-------------");
            System.out.println("Aplicacion de mensajes");
            System.out.println("1. Crear un mensaje");
            System.out.println("2. Listar los mensajes");
            System.out.println("3. Editar un mensaje");
            System.out.println("4. Eliminar un mensaje");
            System.out.println("5. Salir");
            opcion= scanner.nextInt();
            
            
            switch(opcion){
                case 1:
                    MensajesService.crearMensaje();
                    break;
                case 2:
                    MensajesService.listarMensajes();
                    break;
                case 3:
                    MensajesService.editarMensaje();
                    break;
                case 4:
                    MensajesService.borrarMensajes();
                    break;
                default:
                    break;
            
            }
            
        }while(opcion !=5);{
    
    
    
      }

    
}}
