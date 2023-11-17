package recorrido;
import java.util.Scanner;

public class Principal {

 
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
			System.out.println("[2. Mostrar los valores del nodo Arbol ]");
			System.out.println("[3. salir :)                           ]");
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
			System.out.println("===MENU DE IMPRECION DE NODOS ARBOL=====");
			System.out.println("[1. NORMAL                             ]");
			System.out.println("[2. PRE ORDEN                          ]");
			System.out.println("[3. POST ORDEN                         ]");
			System.out.println("[4. IN ORDEN                           ]");
			System.out.println("[5. ANCHURA                            ]");
			System.out.println("[6. REGRESAR                           ]");			
			System.out.println("=======================================");
			System.out.println("Ingrese su opción: ");
			System.out.print("=>");
			dos=Informacion.nextInt();
			switch (dos) {
			case 1: 
				System.out.println("\nIMPRECION NORMAL\n");				
				//arbol.imprimirPantalla();
			break;
			case 2:
				System.out.println("\nIMPRIMIR NODOS ARBOL EN PREORDEN\n");		
				arbol.PreOrden();	
			break;
			case 3:
				 System.out.println("\nIMPRIMIR NODOS ARBOL EN POST ORDEN\n");
				arbol.Postorden();		
			break;	
			case 4:	
				 System.out.println("\nIMPRIMIR NODOS ARBOL EN INT ORDEN\n");
				arbol.Inorden();				
			break;	
			case 5: 	
			    System.out.println("IMPRIMENDO POR ANCHURA\n");	
			    arbol.alturaArbol();
			    arbol.imprimirNivel();
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
		System.out.println("======================================");		
		}
		

		}while(opciones!=3);
 
	}

	

}
