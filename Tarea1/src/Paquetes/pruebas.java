package Paquetes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Paquete.Lista_Simple;
import Paquete.Nodo;

class pruebas {

	@Test
	public void Unitaria() { 
		ListaEnlazada lista=new ListaEnlazada();
		int resultado;
		System.out.println("prueba unitaria de la lista");
	
		

		lista.agregarLista(3);

 
		int esperado=3;
		resultado=lista.bueno;

		assertEquals(esperado,resultado);
		lista.MostrarDatos();
		System.out.println("Felicidade paso la prueba ");
	}
}
