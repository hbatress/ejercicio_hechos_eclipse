package arbolV1_RecorridoInOrden;

public class Arbol {

	public static void main (String [ ] args) {
		Nodo nodoRaiz= new Nodo(10);
		nodoRaiz.agregarNodo(3);
		nodoRaiz.agregarNodo(5);
		nodoRaiz.agregarNodo(2);
		nodoRaiz.agregarNodo(15);
		nodoRaiz.imprimirNodosEnConsolaDelRecorridoInOrden();
		//nodoRaiz.eliminarUnNodo(10);
		//nodoRaiz.imprimirNodosEnConsolaDelRecorridoInOrden();
		
		/*
		Optional<Nodo> nodoAbuscar=nodoRaiz.buscarUnNodo(2);
		if (nodoAbuscar.isEmpty()) {
			System.out.println("Nodo no encontrado");
		}else {
			System.out.println("Nodo encontrado con valor "+nodoAbuscar.get().getValorDelNodoActual());
			if (nodoAbuscar.get().getNodoDerecho()==null && nodoAbuscar.get().getNodoIzquierdo()==null) {
				System.out.println("El nodo es hoja, facil de eliminar");
			}else{
				System.out.println("El nodo NO es hoja");
			}
		}
		*/
		
		
		
		System.out.println("FINALIZA EL PROGRAMA");
	}
	/*https://devs4j.com/2017/11/15/arboles-binarios-en-java/*/
}
