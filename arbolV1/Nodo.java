package arbolV1;

public class Nodo {
	/*VARIABLES*/
	private Integer valorDelNodoActual;
	private Nodo nodoIzquierdo,nodoDerecho;
	
	/*CONSTRUCTOR*/
	public Nodo(Integer valorDelNodoActual) {
		this.valorDelNodoActual=valorDelNodoActual;
	}
	
	/*FUNCIONALIDAD ESPECIFICA*/
	public void agregarNodo(Integer valorDelNodoAagregar) {
	    if (valorDelNodoAagregar < this.valorDelNodoActual) {
	        if (this.nodoIzquierdo!= null) {
	            this.nodoIzquierdo.agregarNodo(valorDelNodoAagregar);
	        } else {
	            this.nodoIzquierdo = new Nodo(valorDelNodoAagregar);
	        }
	    } else {
	        if (this.nodoDerecho != null) {
	            this.nodoDerecho.agregarNodo(valorDelNodoAagregar);
	        } else {
	            this.nodoDerecho = new Nodo(valorDelNodoAagregar);
	        }
	    }
	}
	
	public void imprimirNodosEnConsolaDelRecorridoInOrden(){
        if(this.nodoIzquierdo!=null){
            this.nodoIzquierdo.imprimirNodosEnConsolaDelRecorridoInOrden();
        }
        
        String valorNodoIzquierdo="", valorNodoDerecho="";
        if (this.nodoIzquierdo!=null) {
        	valorNodoIzquierdo=this.nodoIzquierdo.getValorDelNodoActual().toString();
        }
        if (this.nodoIzquierdo!=null) {
        	valorNodoDerecho=this.nodoDerecho.getValorDelNodoActual().toString();
        }
        
        System.out.println("Actual: "+this.valorDelNodoActual+
        		" IZQ "+valorNodoIzquierdo + " DER " + valorNodoDerecho);
        
        if(this.nodoDerecho!=null){
            this.nodoDerecho.imprimirNodosEnConsolaDelRecorridoInOrden();
        }
    }
	
	
	/*OBTENER Y ASIGNAR VALORES A VARIBLES*/
	public Integer getValorDelNodoActual() {return valorDelNodoActual;}
	public void setValorDelNodoActual(Integer valorDelNodoActual) {this.valorDelNodoActual = valorDelNodoActual;}

	public Nodo getNodoIzquierdo() {return nodoIzquierdo;}
	public void setNodoIzquierdo(Nodo nodoIzquierdo) {this.nodoIzquierdo = nodoIzquierdo;}

	public Nodo getNodoDerecho() {return nodoDerecho;}
	public void setNodoDerecho(Nodo nodoDerecho) {this.nodoDerecho = nodoDerecho;}

}
