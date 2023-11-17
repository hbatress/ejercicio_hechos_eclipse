import java.util.Scanner;

public class menu {

	public menu() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Nodo valorActual = new Nodo();  //Instanciamos nuevo objeto
		
		//Creamos el nodo raíz del árbol
		Scanner Scanner=new Scanner(System.in);
		System.out.println(" Agregar primero el valor del nodo raiz del árbol: ");
		System.out.println(" Ingrese valor -->> ");
		int valor=Scanner.nextInt();              
		valorActual.agregarNodoArbol(valor);

		int opcion=0;
		do {
		     //menú de opciones 
		      System.out.println("Ingresar una que desee ");
		      System.out.println("1. Agregar un nodo al arbol");   
			  System.out.println("2. Mostrar valores inOrdern del árbol");
			  System.out.println("3. Eliminar un nodo del árbol");
			  System.out.println("4. Fin del programa");
			  System.out.println("-->> ");
			  opcion=Scanner.nextInt();
			switch(opcion) {
			case 1:
                         
				System.out.println("Digite el valor del nodo");
				System.out.println("-->> ");
				int valor1=Scanner.nextInt();  
				valorActual.agregarNodoArbol(valor1);
				
				break;
			case 2:
			    System.out.println("Mostrar los valor en inOrden");
			    valorActual.imprimirInOrden(valorActual.getRaiz());
			    
				break;
			case 3:
				System.out.println("Eliminar un nodo del árbol ");
               
				
			   break;
			case 4:
				System.out.println("el programa ha finalizado");
				break;
			default:
				if(opcion<0||opcion>4) {
					System.out.println("su opcion digitada es incorrecta");
				}
			}		    
		}while(opcion!=4);
	
	}
}
