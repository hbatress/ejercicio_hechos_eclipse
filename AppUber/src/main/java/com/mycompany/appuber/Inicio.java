/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.appuber;
import java.util.Scanner;
import java.sql.Connection;
/**
 *
 * @author usuario
 */
public class Inicio {
   
 public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int opcion = 0;
        
        do{
            System.out.println("-------------------------------------------------");
            System.out.println("|                  Aplicación de uber           |");
            System.out.println("|1. Ingresar Usuario                            |");
            System.out.println("|2. Listar Historial de Busqueda                |");
            System.out.println("3. eliminar mansajes");
            System.out.println("4. editar mensaje");
            System.out.println("5. salir");
            opcion = sc.nextInt();
            
            switch(opcion){
                case 1:
                        System.out.println("Se ingresara el usuario a la base de datos de Uber");
                        //MensajesService.crearMensaje();
                       Cuenta.Usuario();
                        break;
                case 2:
                        System.out.println("Se listara el dato del usuario");
                        Cuenta.ListarDatos();
                        break;
                case 3:
                        System.out.println("Borrar datos del usuario");
                        Cuenta.borrarMensaje();
                        break;
                case 4:
                        System.out.println("va ir a la capa de servicio editar mensaje");
                        Cuenta.editarMensaje();
                        break;
                default:
                        break;
                        }
            }while(opcion != 5);
        
        Conexion conexion = new Conexion();
        try(Connection cnx = conexion.get_connection()){
            
        }catch(Exception e){
            System.out.println(e);
        }
    } 
 
 
 public void seccion(){
      Scanner sc = new Scanner(System.in);
      
      
 }
 
}
