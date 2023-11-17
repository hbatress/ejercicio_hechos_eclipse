package otros;
import java.util.Scanner;

public class Principal {

 
	public static void main(String[] args) {
			
		ArbolBinario asdArbolBinario=new ArbolBinario();
		System.out.println("===MENU DE IMPRECION DE NODOS ARBOL=====");
		System.out.println("[1. NORMAL                             ]");
		System.out.println("[2. PRE ORDEN                          ]");
		System.out.println("[3. POST ORDEN                         ]");
		System.out.println("[4. IN ORDEN                           ]");
		System.out.println("[5. ANCHURA                            ]");
		System.out.println("[6. REGRESAR                           ]");			
		System.out.println("=======================================");
		System.out.println("Ingrese su opción: ");
		System.out.print("=> 3\n");

		asdArbolBinario.agregar(5);
		asdArbolBinario.agregar(3);
		asdArbolBinario.agregar(7);
		asdArbolBinario.agregar(2);
		asdArbolBinario.agregar(10);
		asdArbolBinario.agregar(11);
		asdArbolBinario.agregar(8);
		asdArbolBinario.agregar(4);

		asdArbolBinario.alturaArbol();
		asdArbolBinario.imprimirNivel();
		
	}

	

}
