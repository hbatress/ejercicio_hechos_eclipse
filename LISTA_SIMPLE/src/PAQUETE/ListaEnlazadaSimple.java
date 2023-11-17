package PAQUETE;

//import java.util.Scanner;

public class ListaEnlazadaSimple{
	private Nodo inicio;
	private Nodo fin;


	public ListaEnlazadaSimple() {
		inicio=null;
		fin=null;
	}
	

	public void agregarNodo(String persona, String fecha,int identificacion ) {

		inicio=new Nodo(persona,fecha,identificacion,inicio);
		if(fin==null) {
		fin=inicio;
	}
}

	public void mostrarNodo() {
		if(inicio==null) {
			System.out.println("La lista esta vacia");
		}else {
			System.out.println("Estos son los datos del nodo: ");
			Nodo objetoNodo=inicio;
			System.out.println();
			while(objetoNodo!=null) {
			System.out.println(
			"Identificacion: "+objetoNodo.getID()+
			"\nNombre: "+objetoNodo.getNombre()+
			"\nFecha de Nacimiento:"+objetoNodo.getFecha_Nacimiento());
			objetoNodo=objetoNodo.getSiguienteNodo();
			if(objetoNodo!=null) {
			System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::");
			}		
		}

		
		
	}
		
	
}
	public boolean ListaVacia() {
	    return inicio==null;
	}
	
	public boolean BuscarElemento (int elemento){
	    Nodo temporal=inicio;
	    
	    while (temporal!=null&& temporal.getID()!=elemento)
	    {
	    temporal=temporal.getSiguienteNodo();
	    }
	    System.out.println(
	    		"\nIdentificacion: "+temporal.getID()+
	    		"\nNombre: "+temporal.getNombre()+
	    		"\nFecha de Nacimiento: "+temporal.getFecha_Nacimiento()
	    		);
	    return temporal!=null;
	    }
	
	public Nodo getInicio() {
		return inicio;
	}

	public void setInicio(Nodo inicio) {
		this.inicio = inicio;
	}

	public Nodo getFin() {
		return fin;
	}

	public void setFin(Nodo fin) {
		this.fin = fin;
	}

	


}