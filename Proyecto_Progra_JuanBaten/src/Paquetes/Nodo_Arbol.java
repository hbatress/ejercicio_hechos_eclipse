package Paquetes;

public class Nodo_Arbol {
	private int Anio;
	private  String perro;
	private Nodo_Arbol Izquierdo, derecho;
	
	
	public Nodo_Arbol() {
		
	}
	public Nodo_Arbol(int anio,String perro) {
		this.Anio=anio;
		this.perro=perro;
		
	}
	public int getAnio() {
		return Anio;
	}
	public void setAnio(int anio) {
		Anio = anio;
	}
	public String getPerro() {
		return perro;
	}
	public void setPerro(String perro) {
		this.perro = perro;
	}
	public Nodo_Arbol getIzquierdo() {
		return Izquierdo;
	}
	public void setIzquierdo(Nodo_Arbol izquierdo) {
		Izquierdo = izquierdo;
	}
	public Nodo_Arbol getDerecho() {
		return derecho;
	}
	public void setDerecho(Nodo_Arbol derecho) {
		this.derecho = derecho;
	}	
	

	
	
	
}
