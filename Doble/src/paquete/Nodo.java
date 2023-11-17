package paquete;

import java.lang.invoke.StringConcatFactory;
import java.util.Optional;


public class Nodo {

	private Nodo siguienteNodo;
	private Nodo anteriorNodo;
	private Integer informacion;
	
public Nodo(Integer infInteger) { 
	this.informacion=infInteger;
}
	
	public Nodo(Integer inf,Nodo antes,Nodo sigui) {
		this.anteriorNodo=antes;
		this.siguienteNodo=sigui;
		this.informacion=inf;
	}
	public Optional<Nodo> buscarUnNodo(Integer valorAbuscar) {
		if (valorAbuscar==this.informacion) {
			return Optional.of(this);
		} else{
			return this.siguienteNodo.buscarUnNodo(valorAbuscar);
		}
	}

	public Nodo getSiguienteNodo() {
		return siguienteNodo;
	}


	public void setSiguienteNodo(Nodo siguienteNodo) {
		this.siguienteNodo = siguienteNodo;
	}


	public Nodo getAnteriorNodo() {
		return anteriorNodo;
	}


	public void setAnteriorNodo(Nodo anteriorNodo) {
		this.anteriorNodo = anteriorNodo;
	}


	public Integer getInformacion() {
		return informacion;
	}


	public void setInformacion(Integer informacion) {
		this.informacion = informacion;
	}
	
	
}
