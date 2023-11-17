package nuevo;

public class comprovacion {

	public comprovacion() {
		
	}

	public static void main(String[] args) {
		
		Raiz comprovacion=new Raiz(2);
		comprovacion.insertarNodo(55, "Guatemala", "coca");
		comprovacion.insertarNodo(77, "Santa Rosa", "cerbeza");
		comprovacion.insertarNodo(37, "Huehetenango", "cerbeza");
		comprovacion.insertarNodo(48, "Peten", "cerbeza");
		comprovacion.insertarNodo(61, "Perro", "cerbeza");
		comprovacion.insertarNodo(73,"aSD", "cerbeza");
		comprovacion.insertarNodo(80, "qqq", "cerbeza");
		comprovacion.impresion();
		
	}

}
