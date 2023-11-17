package lista_enlazada_ejemplo;

public class Nodo {

	int Bien;//atributos o variable
	Nodo siguiente;
	
	public Nodo(int Bien) {
		this.Bien=Bien;
		
	}
	
	public Nodo(int Bien,Nodo siguiente) {
		
		this.siguiente=siguiente;
		this.Bien=Bien;
	}
	
	
	
}
