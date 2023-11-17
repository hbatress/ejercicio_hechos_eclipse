package Paquetes;

import javax.management.MBeanFeatureInfo;


public class ListaEnlazada {

	Nodo Inicio,Fin;
	int bueno,i;
	public ListaEnlazada() {
		Inicio=null;
		Fin=null;
	}
	
	
	public void agregarLista(int Datos) {
	
		Nodo nodoNuevo=new Nodo();
		nodoNuevo.Data=Datos;

		 
		if(Inicio==null) {
			Inicio=nodoNuevo;
			Inicio.siguiente=null;
			Fin=Inicio;
		}else {
			Fin.siguiente=nodoNuevo;
			nodoNuevo.siguiente=null;
			Fin=nodoNuevo;
		}
			while(nodoNuevo!=null) {
				bueno=nodoNuevo.Data;
				nodoNuevo=nodoNuevo.siguiente;
			i++;
			}
	
	}
	
	public void MostrarDatos() {
		Nodo array=Inicio;
		System.out.println();
		while(array!=null) {
			System.out.println("["+array.Data+"]");
			array=array.siguiente;
					
		}
	}
	
}
