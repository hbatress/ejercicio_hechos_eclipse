package Paquete;

public class Lista_Simple {
	Nodo Inicio,Fin;
	int bueno,otro;
	int i=0;
	public Lista_Simple() {
		Inicio=null;
		Fin=null;
	}
	
	
	public void agregarLista(int Datos) {
	
		Nodo nodoNuevo=new Nodo();
		nodoNuevo.Bien=Datos;

		 
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
				bueno=nodoNuevo.Bien;
				nodoNuevo=nodoNuevo.siguiente;
			i++;
			}
	}
	
	public  void Imprimir() {
		Nodo actualNodo=new Nodo();
		actualNodo=Inicio;
		while (actualNodo!=null) {
		System.out.println(actualNodo.Bien);
		 actualNodo=actualNodo.siguiente;
		}

	}

	
}
