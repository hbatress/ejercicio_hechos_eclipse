package listaEnlazadaSimple;

import static org.junit.Assert.*;

import java.util.Optional;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ListaEnlazadaSimpleEjemplo1Test {

	private static JUnitHelloWorld helloWorld;
		
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Antes de todas");
		helloWorld = new JUnitHelloWorld();
	}
	
	@Before
	public void before() {
		System.out.println("Antes de cada una");
	}
	
	@Test
	public void crearNodoRaiz() {
		System.out.println("1. Crear nodo raiz");
		Integer valorNodoRaiz=1;
		Nodo listaEnlazadaSimple= new Nodo(valorNodoRaiz);
		assertEquals("valor del nodo raiz ",
				listaEnlazadaSimple.getValorDelNodoActual(),
				valorNodoRaiz);
		
	}
	
	@Test
	public void agregarUnNodoAraiz() {
		System.out.println("2. Agregar un nodo a la raiz");
		Integer valorNodoRaiz=1, valorNodoUno=2;
		
		Nodo listaEnlazadaSimple= new Nodo(valorNodoRaiz);
		listaEnlazadaSimple.agregarNodo(valorNodoUno);
		assertEquals(
				"valor de agregar un nodo ",
				listaEnlazadaSimple.getSiguiente()
				.getValorDelNodoActual(),
				valorNodoUno);
	}
	
	@Test
	public void buscarValorEnNodoRaizSinRespuestaNull() {
		System.out.println("3. Buscar valor en nodo raiz");
		Integer valorNodoRaiz=1;
		Nodo listaEnlazadaSimple= new Nodo(valorNodoRaiz);
		Optional<Nodo> nodoBuscado= listaEnlazadaSimple.buscarUnNodo(1);
		assertNotNull("Nodo no sea null",nodoBuscado.get());
	}
	
	@Test
	public void buscarValorEnNodoRaiz() {
		System.out.println("4. Buscar valor en nodo raiz");
		Integer valorNodoRaiz=1;
		Nodo listaEnlazadaSimple= new Nodo(valorNodoRaiz);
		Optional<Nodo> nodoBuscado= listaEnlazadaSimple.buscarUnNodo(1);
		assertEquals("valor buscado debe ser igual al valor del nodo raiz",
				nodoBuscado.get().getValorDelNodoActual(), valorNodoRaiz);
	}
	
	@Test
	public void buscarValorEnPrimerHijoDeNodoRaiz() {
		System.out.println("4. Buscar valor hijo de nodo raiz");
		
		Integer valorNodoRaiz=1, valorNodoUno=2;
		Nodo listaEnlazadaSimple= new Nodo(valorNodoRaiz);
		listaEnlazadaSimple.agregarNodo(valorNodoUno);
		
		Optional<Nodo> nodoBuscado= listaEnlazadaSimple.buscarUnNodo(valorNodoUno);
		assertEquals("buscar valor en hijo de nodo raiz",
				nodoBuscado.get().getValorDelNodoActual(), valorNodoUno);
	}
	
	@Test
	public void buscarValorEnTodosLosHijosDeNodoRaiz() {
		System.out.println("4. Buscar valor hijo de nodo raiz");
		
		Integer valorNodoRaiz=1, valorNodoDos=2, valorNodoTres=3, 
				valorNodoCuatro=4, valorNodoCinco=5;
		Nodo listaEnlazadaSimple= new Nodo(valorNodoRaiz);
		listaEnlazadaSimple.agregarNodo(valorNodoDos);
		listaEnlazadaSimple.agregarNodo(valorNodoTres);
		listaEnlazadaSimple.agregarNodo(valorNodoCuatro);
		listaEnlazadaSimple.agregarNodo(valorNodoCinco);
		
		Optional<Nodo> nodoBuscado= listaEnlazadaSimple.buscarUnNodo(valorNodoCinco);
		assertEquals("buscar valor en hijo de nodo raiz",
				nodoBuscado.get().getValorDelNodoActual(), valorNodoCinco);
	}
	
	
	@After
	public void after() {
		System.out.println("Despues de cada una");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("Despues de todas");
	}

}
