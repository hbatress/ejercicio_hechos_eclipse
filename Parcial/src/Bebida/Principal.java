package Bebida;
import java.rmi.NoSuchObjectException;
import java.util.Scanner;


public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		arbol arbol=new arbol();
		Scanner Informacion=new Scanner(System.in);
		int NoEncuesta,edad, respuesta,opciones;
		String nombre;
		System.out.println("===========BIENVENIDOS===========");
		System.out.println("El numero de encuesta:");
		System.out.print("=>");
		NoEncuesta=Informacion.nextInt();
		System.out.println("Ingrese un nombre y un apellido");
		System.out.print("=>");
		Informacion.nextLine();
		nombre=Informacion.nextLine();
		//nombre=Informacion.next();
		System.out.println("Ingrese su edad");
		System.out.print("=>");
		edad=Informacion.nextInt();
		System.out.println("Ingrese su respuesta");
		System.out.print("=>");
		respuesta=Informacion.nextInt();
		arbol.agregar(NoEncuesta, nombre, edad, respuesta);
		
		System.out.println("Nodo Raiz ingresado correctamente\n");
		do {
			System.out.println("===================MENU================");
			System.out.println("[1. Agregar un valor al nodo arbol     ]");
			System.out.println("[2. Mostrar los valores del nodo Arbol ]");
			System.out.println("[3. salir :)                           ]");
			System.out.println("=======================================");
			System.out.println("Ingrese su opción: ");
			System.out.print("=>");
			opciones=Informacion.nextInt();
		
		switch(opciones) {
		case 1:	
		  /*
			System.out.println("Ingrese el numero ");	
		    System.out.print("=>");
		    int datos=Informacion.nextInt();
		   
			arbol.Ingresar(datos);
			*/
			System.out.println("El numero de encuesta:");
			System.out.print("=>");
			NoEncuesta=Informacion.nextInt();
			System.out.println("Ingrese su nomnbre");
			System.out.print("=>");
			nombre=Informacion.next();
			System.out.println("Ingrese su edad");
			System.out.print("=>");
			edad=Informacion.nextInt();
			System.out.println("Ingrese su respuesta");
			System.out.print("=>");
			respuesta=Informacion.nextInt();
			arbol.agregar(NoEncuesta, nombre, edad, respuesta);
			
			System.out.println("Nodo Raiz ingresado correctamente\n");
			break; 
		case 2:	 
			arbol.mayorValor();
			arbol.menorValor();
			
			break;		
		case 3:
			System.out.println("salio del programa :)");
			
			break;
				default:
					
		}
		
		if(opciones==3) {
			
		}else {
		System.out.println("======================================");		
		}
		
		
		}while(opciones!=3);
 
	}
	}


