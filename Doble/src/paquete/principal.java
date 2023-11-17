package paquete;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner entradaScanner=new Scanner(System.in);
		Lista objeto=new Lista();
		int op=0;
		do {
			System.out.println("\n1. Agregar datos de primero");
			System.out.println("2. Agregar datos de utlimo");
			System.out.println("3. Mostrar los datos de primero a fin");
			System.out.println("4. Mostrar los datos de fin a primero");
			System.out.println("5. Salir");	
			System.out.println("Ingrese una opcion");
			System.out.print("=>");
			op=entradaScanner.nextInt();
			switch(op) {
			case 1:{
				System.out.println("Ingrese el Dato a agregar");
				System.out.print("=>");
				int datos=entradaScanner.nextInt();
				objeto.insertarInicio(datos);
				
				break;
			}
			case 2:{
				System.out.println("Ingrese el Dato a agregar");
				System.out.print("=>");
				int datos=entradaScanner.nextInt();
				objeto.insertarFin(datos);
				

				break;
			}
			case 3:{
				System.out.println("A continuacion Se Lista los datos ;)");
				objeto.mostrarInicioAFin();

				
				break;
			}
			case 4:{
				System.out.println("A continuacion Se Lista los datos ;)");
				objeto.mostrarfinAInicio();

				
				break;
			}
			case 5:{

				System.out.println("Fin del programa :O");
				
				break;
			}
			default:
				if(op<0||op>5) {
					System.out.println("\nOpcion Incorrecta :o");
				}
			}
	System.out.println("===============================================");		
		}while(op!=5);
		}



	}

