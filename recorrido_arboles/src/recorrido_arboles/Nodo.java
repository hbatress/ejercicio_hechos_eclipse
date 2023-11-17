package recorrido_arboles;

public class Nodo {
			private int Carnet,Edad;
			private String Nombre, Facultad;
			private Nodo Izquierdo, derecho;


	public Nodo() {
	
	}
	public Nodo(int Carnet,String Nombre, int Edad, String Facultad) {
		this.Carnet=Carnet;
		this.Nombre=Nombre;
		this.Edad=Edad;
		this.Facultad=Facultad;

	}
	
	   public void imprimirDato() {
	    System.out.println("Carnet: "+this.getCarnet()+"\nNombre: "+this.getNombre()+
	    "\nEdad: "+this.getEdad()+"\nFacultad: "+this.getFacultad());
	    System.out.println("");
	    }
	public int getCarnet() {return Carnet;
	}
	public void setCarnet(int carnet) {	Carnet = carnet;
	}
	public int getEdad() {return Edad;
	}
	public void setEdad(int edad) {	Edad = edad;
	}
	public String getNombre() {	return Nombre;
	}
	public void setNombre(String nombre) {	Nombre = nombre;
	}
	public String getFacultad() {return Facultad;
	}
	public void setFacultad(String facultad) {Facultad = facultad;
	}
	public Nodo getIzquierdo() {return Izquierdo;
	}
	public void setIzquierdo(Nodo izquierdo) {Izquierdo = izquierdo;
	}
	public Nodo getDerecho() {	return derecho;
	}
	public void setDerecho(Nodo derecho) {this.derecho = derecho;
	}
	
}
