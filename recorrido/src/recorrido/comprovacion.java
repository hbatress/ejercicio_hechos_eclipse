package recorrido;

public class comprovacion {

	public comprovacion() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Nodo aNodo=new Nodo(15);

		aNodo.Ingresar(7);
		aNodo.Ingresar(20);
		aNodo.Ingresar(3);
		aNodo.Ingresar(9);
		aNodo.Ingresar(18);
		aNodo.Ingresar(24);

		aNodo.alturaArbol();
		aNodo.imprimirNivel();
		//aNodo.imprimirPantalla();
		//aNodo.PreOrden();
		//aNodo.anchura();

		
	}

}
