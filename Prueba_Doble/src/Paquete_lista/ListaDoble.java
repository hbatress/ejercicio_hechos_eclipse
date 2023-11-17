package Paquete_lista;

public class ListaDoble {

	Nodo primero;
	Nodo ultimo;
	
	//creacion del costrctor 
	public ListaDoble(){
		
		primero=null;
		ultimo=null;
		
	}
	
	//creacion de un metodo en este caso ingresar
	
	public void ingresarNodo(int datos) {

		//crear un nuevo nodo
		Nodo nuevo=new Nodo();
		nuevo.datos=datos;
		
		
		if(primero==null) {
			primero=nuevo;
			
			//este nodos apunta al anterior y al siguiente
			primero.siguiente=null;
			primero.anterior=null;
			ultimo=primero;
		}else {
			ultimo.siguiente=nuevo;
			nuevo.anterior=ultimo;
			nuevo.siguiente=null;
			ultimo=nuevo;
		}
		
	}
	
	public void imprimir() {
		Nodo actual=new Nodo();
		
		actual =primero;
		while(actual !=null) {
			System.out.println("=>"+actual.datos);
			actual=actual.siguiente;
			
		}
	}
	
}
