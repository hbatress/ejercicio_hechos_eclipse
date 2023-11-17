package Paquetes;

import java.util.Scanner;

public class Principal {
	public static void main(String[]args) {
	
		ListaEnlazada lista1=new ListaEnlazada();	
		Scanner entradaScanner=new Scanner(System.in);
		

		
		int op=0;
		do {
		
			System.out.println("\n1. Agregar datos");
			System.out.println("2. Mostrar los datos");			
			System.out.println("3. Salir");	
			System.out.println("Ingrese una opcion");
			System.out.print("=>");
			op=entradaScanner.nextInt();
			switch(op) {
			case 1:{
				System.out.println("Ingrese el Dato a agregar");
				System.out.print("=>");
				int datos=entradaScanner.nextInt();
			

				lista1.agregarLista(datos);
				
				break;
			}
			case 2:{
				System.out.println("A continuacion Se Lista los datos ;)");
				lista1.MostrarDatos();
				break;
			}
			case 3:{
				System.out.println("Fin del programa :O");
				
				break;
			}
			default:
				if(op<0||op>3) {
					System.out.println("\nOpcion Incorrecta :o");
				}
			}
	System.out.println("===============================================");		
		}while(op!=3);
	}
}
