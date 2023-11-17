package paquete;

import java.lang.invoke.StringConcatFactory;


public class Lista {
private Nodo inicioNodo;
private Nodo fiNodo;


	public Lista() {
		this.inicioNodo=null;
		this.fiNodo=null;
	}
	 
	public void insertarInicio(Integer informacion) {
		if(inicioNodo==null) {
			this.inicioNodo=new Nodo(informacion, null, null);
			this.fiNodo=inicioNodo;
		}else {
			
			Nodo nuevoNodo=new Nodo(informacion, null, inicioNodo);
			inicioNodo.setAnteriorNodo(nuevoNodo);
			inicioNodo=nuevoNodo;
		}
	}
	public void insertarFin(Integer informacion) {
		if(inicioNodo==null) {
			this.fiNodo=new Nodo(informacion, null, null);
			this.inicioNodo=fiNodo;
		}else {
			
			Nodo nuevoNodo=new Nodo(informacion, fiNodo, null);
			fiNodo.setSiguienteNodo(nuevoNodo);
			fiNodo=nuevoNodo;
		}
	}	 
	public void mostrarInicioAFin() {
		Nodo recorrerNodo=inicioNodo;
		
		while(recorrerNodo!=null) {
			System.out.println("=>"+recorrerNodo.getInformacion());
			recorrerNodo=recorrerNodo.getSiguienteNodo();
		}
	System.out.println();
		
	}
	public void mostrarfinAInicio() {
		Nodo recorrerNodo=fiNodo;
		
		while(recorrerNodo!=null) {
			System.out.println("=>"+recorrerNodo.getInformacion());
			recorrerNodo=recorrerNodo.getAnteriorNodo();
		}
	System.out.println();
		
	}

	public Nodo getInicioNodo() {
		return inicioNodo;
	}

	public void setInicioNodo(Nodo inicioNodo) {
		this.inicioNodo = inicioNodo;
	}

	public Nodo getFiNodo() {
		return fiNodo;
	}

	public void setFiNodo(Nodo fiNodo) {
		this.fiNodo = fiNodo;
	}
	

	
}
