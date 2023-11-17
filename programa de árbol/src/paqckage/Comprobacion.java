package paqckage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class Comprobacion {

	@Test
	public void NodoRaiz() {
	System.out.println("===========INGRESAR NODO RAIZ===========");	
	int resultado=30;
	Integer Datos=30;
		Nodo arbol=new Nodo(Datos);
		arbol.Ingresar(20);

	assertEquals(arbol.getActualNodo(),resultado);	
	arbol.imprimirPantalla();
		
	}
	
	@Test
	public void NodoDerecho() {		
		System.out.println("===========INGRESAR NODO DERECHO===========");	
		int Derecho=25; 
		Integer Datos=25;
		Nodo arbolNodo=new Nodo(Datos);
		
		 arbolNodo.Ingresar(40);
		 arbolNodo.Ingresar(55);

				
		assertEquals(arbolNodo.getActualNodo(),Derecho);
		arbolNodo.imprimirPantalla();
	}

	@Test
	public void NodoIzquierdo() {
	System.out.println("===========INGRESAR NODO IZQUIERDO===========");	
	int izquierdo=20;
	Integer datosInteger=20;
	Nodo arbolNodo=new Nodo(datosInteger);
	 arbolNodo.Ingresar(11);
	 arbolNodo.Ingresar(9);
	 arbolNodo.Ingresar(5);
	assertEquals(arbolNodo.getActualNodo(),izquierdo);	
	arbolNodo.imprimirPantalla();
	}
	
	
}
