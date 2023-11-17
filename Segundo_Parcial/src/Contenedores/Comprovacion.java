package Contenedores;

import static org.junit.jupiter.api.Assertions.*;

import java.security.PublicKey;

import org.junit.jupiter.api.Test;

class Comprovacion {

	@Test
	public void NodoRaiz() {
	System.out.println("===========INGRESAR NODO RAIZ===========");	
	int resultado=30;
	Integer Datos=30;
	Nodo arbol=new Nodo(Datos);
		
	assertEquals(arbol.getActualNodo(),resultado);
	System.out.println("------IMPRIMIENDO RAIZ-------");		
	arbol.Inorden();
		
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
		System.out.println("------IMPRIMIENDO DATOS-------");
		arbolNodo.Inorden();
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
	System.out.println("------IMPRIMIENDO DATOS-------");
	arbolNodo.Inorden();
	}
	
	@Test
	public void elimianr() {
		System.out.println("===========ELIMINAR DATOS DEL ARBOL===========");	
		int izquierdo=20;
		Integer datosInteger=20;
		Nodo arbolNodo=new Nodo(datosInteger);
		 arbolNodo.Ingresar(11);
		 arbolNodo.Ingresar(9);
		 arbolNodo.Ingresar(5);
		assertEquals(arbolNodo.getActualNodo(),izquierdo);	
		System.out.println("------IMPRIMIENDO DATOS-------");
		arbolNodo.Inorden();
		System.out.println("ELIMINANDO EL DATO 9");
		arbolNodo.delete(9);
		System.out.println("\n------IMPRIMIENDO DATOS-------");
		arbolNodo.Inorden();		
		
	}

}
