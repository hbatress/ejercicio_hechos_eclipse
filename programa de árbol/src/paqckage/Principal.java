package paqckage;
import java.util.Scanner;

public class Principal {

 
	public static void main(String[] args) {
			

		Scanner Informacion=new Scanner(System.in);
		int opciones;
		System.out.println("===========BIENVENIDOS===========");
		System.out.println("Ingrese el nodo raiz");
		System.out.print("=>");
		opciones=Informacion.nextInt();
		Nodo2 arbol=new Nodo2(opciones);	
		
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

			
		//arbol.imprimirPantalla();
		//arbol.Postorden();
			arbol.mostrarAngel();
		//	arbol.insertar();
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
