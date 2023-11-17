/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.appuber;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author usuario
 */
public class Verificacion {
    
   public static void crearUsuarioDB(Enviar_Informacion Enviar_Informacion){ 
       
   
    //creamos un objeto para abrir la conexion
        Conexion db_connect = new Conexion();
        //creamos un try catch para validar si nos conectamos o no
        try(Connection conexion = db_connect.get_connection()){
            //crearemos otro try para la parte de inserccion
            //declaramos una variable se llame ps, para prepara declaracion
            PreparedStatement ps = null;
           try{
               String query = "INSERT INTO cuenta_uber(NAME_USER, DOCUMENTATION,EMAIL,Password)VALUES (?,?,?,?)";
               ps = conexion.prepareStatement(query);
               ps.setString(1, Enviar_Informacion.getNAME_USER());
               ps.setString(2, Enviar_Informacion.getDOCUMENTATION());
               ps.setString(3, Enviar_Informacion.getEMAIL());
               ps.setString(4, Enviar_Informacion.getPassword());
               ps.executeUpdate();
               System.out.println("mensaje creado");
               
           }catch(SQLException ex){
               System.out.println(ex);
           }   
        }catch(SQLException e){
            //Si no logramos conectarnos a la bd simplemente capturamos el error
            //y lo imprimimos
            System.out.println(e);   
   }
}
   
   public static void leerDatosDB(int ID_usuario ){
        Conexion db_connect = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try(Connection conexion = db_connect.get_connection()){
            String query = "SELECT `ID_usuario`, `NAME_USER`, `DOCUMENTATION`, `EMAIL`, `Password` FROM `cuenta_uber` WHERE ID_usuario = ?";
            ps=conexion.prepareStatement(query);
           ps.setInt(1,ID_usuario );
            rs = ps.executeQuery();
            while(rs.next()){
                System.out.println("ID: " + rs.getInt("ID_usuario"));
                System.out.println("Nombre: " + rs.getString("NAME_USER"));
                System.out.println("Documento: " + rs.getInt("DOCUMENTATION"));
                System.out.println("Correo Electronico: " +  rs.getString("EMAIL"));
                   System.out.println("Contraseña: " + rs.getString("Password"));
                System.out.println(" ");
            }
            
        }catch(SQLException e)
        {
            System.out.println("No se pudieron recuperar los mensajes");
            System.out.println(e);
        }
    }

public static void borrarMensajeDB(int id_mensaje){
        Conexion db_connect = new Conexion();
        
        try(Connection conexion = db_connect.get_connection()){
            PreparedStatement ps = null;
            try{
                String query = "DELETE FROM cuenta_uber WHERE ID_usuario = ?";
                ps = conexion.prepareStatement(query);
                ps.setInt(1, id_mensaje);
                ps.executeUpdate();
                System.out.println("El mensaje ha sido borrado");
                
            }catch(SQLException ex){
                System.out.println(ex);
                System.out.println("No se pudo borrar el mensaje");
            }
            
        }catch(SQLException e){
            System.out.println(e);
        }
    }
public static void actualizarMensajeDB(Enviar_Informacion Enviar_Informacion){
        Conexion db_connect = new Conexion();
        
        try(Connection conexion = db_connect.get_connection()){
           PreparedStatement ps = null;
           
           try{
               String query = "UPDATE cuenta_uber SET NAME_USER = ? WHERE ID_usuario = ?";
               ps = conexion.prepareStatement(query);
               ps.setString(1, Enviar_Informacion.getNAME_USER());
               ps.setInt(2, Enviar_Informacion.getID_usuario());
               ps.executeUpdate();
               System.out.println("Mensaje se actualizó correctamente");
               
           }catch(SQLException ex){
               System.out.println(ex);
               System.out.println("No se pudo actualizar el mensaje");
           }
           
        }catch(SQLException e){
            System.out.println(e);
        }
    }
}