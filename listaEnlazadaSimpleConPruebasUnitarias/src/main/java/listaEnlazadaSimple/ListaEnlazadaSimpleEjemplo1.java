package listaEnlazadaSimple;

public class ListaEnlazadaSimpleEjemplo1 {
	public static void main (String [ ] args) {
		Nodo listaEnlazadaSimple= new Nodo(1);
		listaEnlazadaSimple.agregarNodo(2);
		listaEnlazadaSimple.agregarNodo(3);
		
		listaEnlazadaSimple.mostrarNodosEnConsola();
	}
}
