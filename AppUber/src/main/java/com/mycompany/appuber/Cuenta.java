/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.appuber;
import java.util.Scanner;
/**
 *
 * @author usuario
 */

public class Cuenta {
    
public static void Usuario(){
    int opcion=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("-----------------------");
            System.out.println("  Inicio de Seccion");
            System.out.println("1. Pasajero");
            System.out.println("2. Conductor");
            System.out.println("3. Volver atras");
            opcion = sc.nextInt();
            
 switch(opcion){
                case 1:
                       Cuenta.Pasajero();
                     break;
                case 2:
                       Cuenta.Conductor();
                    break;
                case 3:
                    
                    break;
                    
                default:
                         System.out.println("Opcion Incorrecta >:| ");
                    break;
 }
    
    
}
public static void Pasajero(){
       Scanner sc = new Scanner(System.in);
 System.out.println("Escribe tu Nombre: ");
 String Nombre = sc.nextLine();
 System.out.println("Escribe tu CUI: ");
  String CUI = sc.nextLine();
 System.out.println("Escribe tu EMAIL: ");
  String EMAIL = sc.nextLine();
 System.out.println("Escribe tu Password: ");
  String PASSWORD = sc.nextLine();
  
  Enviar_Informacion registro = new Enviar_Informacion();
 
  registro.setNAME_USER(Nombre);
  registro.setDOCUMENTATION(CUI);
  registro.setEMAIL(EMAIL);
  registro.setPassword(PASSWORD);
  
  Verificacion.crearUsuarioDB(registro);
}

public static void Conductor(){




}
public static void ListarDatos(){
     Scanner sc = new Scanner(System.in);
        System.out.println("Indique el ID del mensaje que quiere Listar");
        int id_mensaje = sc.nextInt();
        Verificacion.leerDatosDB(id_mensaje);
        //MensajesDAO.borrarMensajeDB(id_mensaje);  
    }

public static void borrarMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique el ID del usuario que quiere borrar");
        int id_mensaje = sc.nextInt();
        Verificacion.borrarMensajeDB(id_mensaje);
    }

 public static void editarMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu nuevo nombre");
        String mensaje = sc.nextLine();
        
        System.out.println("Indica el ID del mensaje a editar");
        int id_mensaje = sc.nextInt();
        
        Enviar_Informacion actualizacion = new Enviar_Informacion();
        actualizacion.setID_usuario(id_mensaje);
        actualizacion.setNAME_USER(mensaje);
        Verificacion.actualizarMensajeDB(actualizacion);
       // MensajesDAO.actualizarMensajeDB(actualizacion);
        
    }
}
