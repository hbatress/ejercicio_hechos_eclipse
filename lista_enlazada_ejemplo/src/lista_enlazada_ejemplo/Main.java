package lista_enlazada_ejemplo;

import java.util.Scanner;
public class Main {

	public static void main(String[]args) {
		
		prueba lista1=new prueba();
		
		Scanner entradaScanner=new Scanner(System.in);

		int op=0;
		do {
		
			System.out.println("\n1. Agregar");
			System.out.println("2. Mostrar");			
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
