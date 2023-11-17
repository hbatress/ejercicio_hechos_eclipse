package lista_enlazada_ejemplo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class prueba {


Nodo Inicio,Fin;
	
	public prueba() {
		Inicio=null;
		Fin=null;
	}
	
	@Test
	public void agregarLista(int Datos) {// este constructor recibe los datos de la clase nodo
	int resultado=1;
		Inicio=new Nodo(Datos,Inicio);
		
		if(Fin==null) {
			Fin=Inicio;
		}
	Datos=1;
	assertEquals(Datos, resultado);	
		
	}
	
	public void MostrarDatos() {
		Nodo array=Inicio;
		System.out.println();
		while(array!=null) {
			System.out.println("["+array.Bien+"]");
			array=array.siguiente;
					
		}
	}

}
