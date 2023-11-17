package PAQUETE;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;


class verificacion_test {

	//Comprovar si el nodo se creo correctamente
		@Test
		public void crearNodoRaiz() {
			System.out.println("===========================================");
			System.out.println("\nSe Creo el Nodo :)");
			String nombre="herber",fecha="27/01/2000";
			int identificacion=1;
			Nodo asdNodo=new Nodo(nombre,fecha,identificacion);
			assertEquals(asdNodo.getNombre(),nombre);
			assertEquals(asdNodo.getFecha_Nacimiento(),fecha);
		}  
	
	
		//Comprovar si el nodo se ingreso correctamente
		@Test
		public void AgregarUnNodoA() {
			System.out.println("===========================================");
			System.out.println("Se agrego un nodo al inicio :)");
			String nombreEnviado="herber",fechaEnviadoString="23/01/2000";
			String Nombre="herber",nacimiento="23/01/2000";
			

			ListaEnlazadaSimple listaEnlazadadoble= new ListaEnlazadaSimple();
			listaEnlazadadoble.agregarNodo(Nombre, nacimiento, 1);
			assertEquals(listaEnlazadadoble.getInicio().getNombre(),
					nombreEnviado);
			assertEquals(listaEnlazadadoble.getInicio().getFecha_Nacimiento(),
					fechaEnviadoString);
						
			listaEnlazadadoble.mostrarNodo();
		} 
		
		@Test 
		public void buscar() {
			System.out.println("===========================================");
			System.out.println("\nSe buscara el nodo correctamente");
			String nombreEnviado="herber",fechaEnviadoString="23/01/2000";
			String Nombre="herber",nacimiento="23/01/2000";
			int identificacion=1,envia=1;
			

			ListaEnlazadaSimple listaEnlazadadoble= new ListaEnlazadaSimple();
			listaEnlazadadoble.agregarNodo(Nombre, nacimiento, identificacion);
			assertEquals(listaEnlazadadoble.getInicio().getID(),
					envia);			

			assertEquals(listaEnlazadadoble.getInicio().getNombre(),
					nombreEnviado);	
			assertEquals(listaEnlazadadoble.getInicio().getFecha_Nacimiento()
					,fechaEnviadoString);	
		}
		
		
}
