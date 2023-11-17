package PAQUETE;
import java.util.Scanner;
public class menu {

	public static void main(String[] args) {


		int ID=0,buscar;
		ListaEnlazadaSimple opcin=new ListaEnlazadaSimple();
		

		Scanner Informacion=new Scanner(System.in);
		Scanner busqueda=new Scanner(System.in);
		int opciones;
		do {
			System.out.println("==============MENU============");
			
			System.out.println("[1. Agregar un Nodo           ]");
			System.out.println("[2. Buscar nodo               ]");
			System.out.println("[3. Mostrar los nodos         ]");
			System.out.println("[4. salir del nodo            ]");
			System.out.println("===============================");
			System.out.println("Ingrese su opción: ");
			System.out.print("=>");
			opciones=Informacion.nextInt();
		
		switch(opciones) {
		case 1:	
		ID++;
		System.out.println("\n===============================");
		System.out.println("Identificacion No."+ID);
		System.out.println("Ingrese el Nombre");
		System.out.print("=>");
		String Nombre_completo=Informacion.next();
		System.out.println("Ingrese la fecha de nacimiento");
		System.out.print("=>");
		String fecha=busqueda.next();
		opcin.agregarNodo(Nombre_completo,fecha,ID);

			break;
			
		case 2:
		System.out.println("Identificacion a buscar:");
		System.out.print("=>");
		buscar=busqueda.nextInt();
		opcin.BuscarElemento(buscar);
			break;
			
		case 3:
		opcin.mostrarNodo();
			break;
		case 4:
		System.out.println("salio del programa :)");
			default:	
		}

		if(opciones==4) {
		
		}else {
		System.out.println("======================================");		
		}
		}while(opciones!=4);
		Informacion.close();
		busqueda.close();
	}	
}
