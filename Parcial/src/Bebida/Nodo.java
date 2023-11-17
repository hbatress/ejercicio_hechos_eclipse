package Bebida;

public class Nodo {

	private int NoEncuesta, edad, respuesta;
	private String nombre;
	private Nodo izquierdo, derecho;
	

	public Nodo(int NoEncuesta,String nombre,int edad, int respuesta, Nodo Izquierdo, Nodo derecho) {
		this.NoEncuesta=NoEncuesta;
		this.nombre=nombre;
		this.edad=edad;
		this.respuesta=respuesta;
		this.derecho=derecho;
		this.izquierdo=Izquierdo;
	}

	public int getNoEncuesta() {
		return NoEncuesta;
	}

	public void setNoEncuesta(int noEncuesta) {
		NoEncuesta = noEncuesta;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(int respuesta) {
		this.respuesta = respuesta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Nodo getIzquierdo() {
		return izquierdo;
	}

	public void setIzquierdo(Nodo izquierdo) {
		this.izquierdo = izquierdo;
	}

	public Nodo getDerecho() {
		return derecho;
	}

	public void setDerecho(Nodo derecho) {
		this.derecho = derecho;
	}
	

}
