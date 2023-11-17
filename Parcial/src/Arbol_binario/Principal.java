package Arbol_binario;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner Informacion=new Scanner(System.in);
		Scanner otros=new Scanner(System.in);
		int opciones, imprecion;
		int carnet, edad;
		String Nombre, facultad;
		Arbol arbol=new Arbol();
		
		do {
			System.out.println("======================================================");
			System.out.println("|                                                    |");
			System.out.println("|                    BIENVENIDOS                     |");
			System.out.println("|                                                    |");
			System.out.println("======================================================");
			System.out.println("|1. Ingresar bebida                                  |");
			System.out.println("|2. Mostrar los valores del nodo Arbol               |");
			System.out.println("|3. salir :)                                         |");
			System.out.println("======================================================");
			System.out.println("Ingrese su opción: ");
			System.out.print("=>");
			opciones=Informacion.nextInt();
		
		switch(opciones) {
		case 1:	
			
		    System.out.println("");	
			System.out.println("======== INGRESO DE INFORMACION ========");
			System.out.print("Cantidad de personas=> ");
			carnet=Informacion.nextInt();
			System.out.println();
			System.out.print("Clase de bebida=> ");
			Nombre=otros.nextLine();
			
			/*System.out.println();
			System.out.print("Edad=> ");
			edad=Informacion.nextInt();
			System.out.println();
			System.out.print("Facultad=> ");
			facultad=otros.nextLine();
			System.out.println();
			*/
			arbol.insertar(carnet, Nombre);
			arbol.existe(carnet);
			break; 
		case 2:	 
			System.out.println("===MENU DE IMPRECION DE NODOS ARBOL=====");
			System.out.println("[1. PRE ORDEN                          ]");
			System.out.println("[2. POST ORDEN                         ]");
			System.out.println("[3. IN ORDEN                           ]");
			System.out.println("[4. ANCHURA                            ]");
			System.out.println("[5. REGRESAR                           ]");			
			System.out.println("=======================================");
			System.out.println("Ingrese su opción: ");
			System.out.print("=>");
			imprecion=Informacion.nextInt();
			switch (imprecion) {

			case 1:
				System.out.println("\nIMPRIMIR NODOS ARBOL EN PREORDEN\n");	
				arbol.preorden();
			break;
			case 2:
				 System.out.println("\nIMPRIMIR NODOS ARBOL EN POST ORDEN\n");
				arbol.postorden();		
			break;	
			case 3:	
				 System.out.println("\nIMPRIMIR NODOS ARBOL EN INT ORDEN\n");
				arbol.inorden();				
			break;	
			case 4: 	
			    System.out.println("IMPRIMENDO POR ANCHURA\n");	
			    arbol.alturaArbol();
			    arbol.imprimirNivel();
			    
	    		break;
			case 5:
				System.out.println("Regresando :)");
				break;
			default:
				System.out.println("opcion invalida");
				break;
			}
			
			break;		
		case 3:
			System.out.println("salio del programa :)");
			
			break;
				default:
					
		}
		
		if(opciones==3) {
			
		}else {
			System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::");	
			System.out.println("-------------------------------------------------------");
		}
		

		}while(opciones!=3);
 
	}

}
