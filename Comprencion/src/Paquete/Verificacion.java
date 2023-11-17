package Paquete;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Verificacion {

	@Test
	public void Unitaria() {
		Nodo si=new Nodo();
		int resultado;
		System.out.println("prueba corroborar la lista");
	
		Lista_Simple lista=new Lista_Simple();

		lista.agregarLista(3);

		//Menu asMenu=new Menu();
		//Menu.main(null); 
 
	int esperado=3;
	resultado=lista.bueno;

	assertEquals(esperado,resultado);
	lista.Imprimir();
	/* esperado=5;
	lista.agregarLista(5);
	assertEquals(esperado,resultado);
	lista.Imprimir();
	*/
	}

}
