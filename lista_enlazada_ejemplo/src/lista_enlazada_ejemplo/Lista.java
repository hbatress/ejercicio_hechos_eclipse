package lista_enlazada_ejemplo;

import javax.management.MBeanFeatureInfo;

public class Lista {

	Nodo Inicio,Fin;
	
	public Lista() {
		Inicio=null;
		Fin=null;
	}
	
	
	public void agregarLista(int Datos) {// este constructor recibe los datos de la clase nodo
	
		Inicio=new Nodo(Datos,Inicio);
		
		if(Fin==null) {
			Fin=Inicio;
		}
	
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
