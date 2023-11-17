package ListaEnlazadaSimple;


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
	
	/*OBTENER Y ASIGNAR VALORES A VARIBLES*/
	public Integer getValorDelNodoActual() {return valorDelNodoActual;}
	public void setValorDelNodoActual(Integer valorDelNodoActual) {this.valorDelNodoActual = valorDelNodoActual;}
}
