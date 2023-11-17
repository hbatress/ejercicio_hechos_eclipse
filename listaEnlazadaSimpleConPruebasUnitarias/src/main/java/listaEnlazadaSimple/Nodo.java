package listaEnlazadaSimple;

import java.util.Optional;

public class Nodo {

	private Integer valorDelNodoActual;
	private Nodo siguiente;
	
	/*CONSTRUCTOR*/
	public Nodo(Integer valorDelNodoActual) {
		this.valorDelNodoActual=valorDelNodoActual;
	}
	
	public void agregarNodo(Integer valorDelNodoAagregar) {
		if (this.siguiente!= null) {
            this.siguiente.agregarNodo(valorDelNodoAagregar);
        } else {
            this.siguiente= new Nodo(valorDelNodoAagregar);
        }
	}
	
	public void mostrarNodosEnConsola(){
		System.out.println("Valor del nodo: "+this.valorDelNodoActual);
		
		if(this.siguiente!=null){
            this.siguiente.mostrarNodosEnConsola();
        }
    }
	
	public Optional<Nodo> buscarUnNodo(Integer valorAbuscar) {
		if (valorAbuscar==this.valorDelNodoActual) {
			return Optional.of(this);
		} else{
			return this.siguiente.buscarUnNodo(valorAbuscar);
		}
	}
	
	/*OBTENER Y ASIGNAR VALORES A VARIBLES*/
	public Integer getValorDelNodoActual() {return valorDelNodoActual;}
	public void setValorDelNodoActual(Integer valorDelNodoActual) {this.valorDelNodoActual = valorDelNodoActual;}
	public Nodo getSiguiente() { return this.siguiente; }
}

