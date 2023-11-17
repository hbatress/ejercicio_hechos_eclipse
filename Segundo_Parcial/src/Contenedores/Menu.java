package Contenedores;

import java.util.Scanner;

public class Menu {

 
	public static void main(String[] args) {
			

		Scanner Informacion=new Scanner(System.in);
		int opciones, dos;
		System.out.println("===========BIENVENIDOS===========");
		System.out.println("Ingrese el nodo raiz");
		System.out.print("=>");
		opciones=Informacion.nextInt();
		Nodo arbol=new Nodo(opciones);	

		System.out.println("Nodo Raiz ingresado correctamente\n");
		
		do {
			System.out.println("===================MENU================");
			System.out.println("[1. Agregar un valor al nodo arbol     ]");
			System.out.println("[2. Eliminar un valor del nodo arbol   ]");
			System.out.println("[3. Mostrar valores en InOrden         ]");			
			System.out.println("[4. salir :)                           ]");
			System.out.println("=======================================");
			System.out.println("Ingrese su opción: ");
			System.out.print("=>");
			opciones=Informacion.nextInt();
		
		switch(opciones) {
		case 1:	
		    System.out.println("Ingrese el numero ");	
		    System.out.print("=>");
		    int datos=Informacion.nextInt();
		  
			arbol.Ingresar(datos);

			break; 
		case 2:	 
		    System.out.println("Ingrese el dato a eliminar ");	
		    System.out.print("=>");
		    int otro=Informacion.nextInt();
		    
		    arbol.delete(otro);
		    System.out.print("Dato eliminado correctamente");    
			
			break;		
		case 3:
			 System.out.println("\nIMPRIMIR NODOS ARBOL EN INT ORDEN\n");
				arbol.Inorden();
			
			break;
		case 4:
			System.out.println("salio del programa :)");
			break;
				default:
					
		}
		
		if(opciones==4) {
			
		}else {
		System.out.println("======================================");		
		}
		

		}while(opciones!=4);
 
	}

	

}