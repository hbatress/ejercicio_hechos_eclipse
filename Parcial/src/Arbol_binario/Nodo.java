package Arbol_binario;

public class Nodo {
			private int Cantidad;
			private String bebida;
			private Nodo Izquierdo, derecho;


	public Nodo() {
	
	}
	public Nodo(int Cantidad,String bebida) {
		
		this.Cantidad=Cantidad;
		this.bebida=bebida;
	

	}
	
	   public void imprimirDato() {
	    System.out.println("Cantidad de personas: "+this.getCantidad()
	    +"\nClase de bebida: "+this.getBebida());
	
	    System.out.println("");
	    }
	public int getCantidad() {
		return Cantidad;
	}
	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}
	public String getBebida() {
		return bebida;
	}
	public void setBebida(String bebida) {
		this.bebida = bebida;
	}
	public Nodo getIzquierdo() {
		return Izquierdo;
	}
	public void setIzquierdo(Nodo izquierdo) {
		Izquierdo = izquierdo;
	}
	public Nodo getDerecho() {
		return derecho;
	}
	public void setDerecho(Nodo derecho) {
		this.derecho = derecho;
	}

	
}
