package paquete;

import static org.junit.Assert.*;
//import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import org.junit.Before;
import org.junit.jupiter.api.Test;


class test_deListaDoble {
	
	//crear un nodo
	@Test
	public void crearNodoRaiz() {
		System.out.println("Se Creo el Nodo :)");
		Integer nodoInteger=4;
		Nodo asdNodo=new Nodo(nodoInteger);
		assertEquals("valor del nodo raiz ",
				asdNodo.getInformacion(),
				nodoInteger);
	}  
	
	//inserta un nodo al inicio
	@Test
	public void AgregarUnNodoA() {
		System.out.println("Se agrego un nodo al inicio :)");
		Integer nodoInteger=4, nodoUnoInteger=2,dosInteger=3;
		Nodo asdNodo=new Nodo(nodoInteger);

		Lista listaEnlazadadoble= new Lista();
		listaEnlazadadoble.insertarInicio(nodoUnoInteger);
		assertEquals("valor de agregar un nodo ",
				listaEnlazadadoble.getInicioNodo().getInformacion(),
				nodoUnoInteger);
		listaEnlazadadoble.mostrarInicioAFin();
	} 
	//insertar un nodo al final
	@Test
	public void AgregarUnNodoB() {
		System.out.println("Se agrego un nodo al final :)");
		Integer nodoInteger=1, nodoUnoInteger=2;
		Nodo asdNodo=new Nodo(nodoInteger);

		Lista listaEnlazadadoble= new Lista();
		listaEnlazadadoble.insertarFin(nodoUnoInteger);
		assertEquals("valor de agregar un nodo ",
				listaEnlazadadoble.getFiNodo().getInformacion(),
				nodoUnoInteger);
	} 
	//buscar un nodo y que no muestre que esta vacio
	@Test
	public void BuscarValor() {
		System.out.println("Buscar un nodo ingresado");
		Integer valorNodoRaiz=1;
		Nodo asdNodo=new Nodo(valorNodoRaiz);
		Optional<Nodo> nodoBuscado= asdNodo.buscarUnNodo(1);
		assertNotNull("Nodo no sea null",nodoBuscado.get());
	}
	


}
