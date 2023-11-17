public class Nodo {
	private Integer valorNodoActual;
	private Nodo hijoIzquierdo;
	private Nodo hijoDerecho;
    private Nodo raiz;
    int altura;
    String[] niveles;
    
    public Nodo(){ //constructor vacio
        
    }
    
	//constructor que ya recibe parametros 
	public Nodo(Integer nodoActual, Nodo nodoIzquierdo,Nodo nodoDerecho) {
	this.valorNodoActual = valorNodoActual;
	this.hijoIzquierdo = hijoIzquierdo;
	this.hijoDerecho = hijoDerecho;
	
	}

	//gett y sett de variables
	public Integer getValorNodoActual() {
		return valorNodoActual;
	}

	public void setValorNodoActual(Integer valorNodoActual) {
		this.valorNodoActual = valorNodoActual;
	}

	public Nodo getHijoIzquierdo() {
		return hijoIzquierdo;
	}

	public void setHijoIzquierdo(Nodo hijoIzquierdo) {
		this.hijoIzquierdo = hijoIzquierdo;
	}

	public Nodo getHijoDerecho() {
		return hijoDerecho;
	}

	public void setHijoDerecho(Nodo hijoDerecho) {
		this.hijoDerecho = hijoDerecho;
	}

	public Nodo getRaiz() {
		return raiz;
	}

	public void setRaiz(Nodo raiz) {
		this.raiz = raiz;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public String[] getNiveles() {
		return niveles;
	}

	public void setNiveles(String[] niveles) {
		this.niveles = niveles;
	}
	
	public void agregarNodoArbol(Integer valorNodoActual) { //medoto agragar un nodo al aárbol
	     Nodo nuevoNodo=new Nodo(valorNodoActual,null,null); //instanciamos nuevo nodo
	    if(raiz==null){ // calidamos si la raiz es nulo
	        raiz=nuevoNodo; //la raiz sera igual a nuevo
	        
	    }else{ // de lo contrario
	      Nodo auxiliar=raiz; //definir variables 
	      Nodo nodoPadre;
	        while(true){ //mientras que sea verdadero
	            nodoPadre=auxiliar; //guadamos valor de nodo padrea en auxiliar
	            if(valorNodoActual<auxiliar.valorNodoActual){ //condicion
	                auxiliar=auxiliar.hijoIzquierdo; 
	                if(auxiliar==null){ //si auxiliar es nulo
	                    nodoPadre.hijoIzquierdo=nuevoNodo; // se crea nodo
	                    return;
	                }
	            }else{//de lo contrario
	                auxiliar=auxiliar.hijoDerecho;
	                if(auxiliar==null){ //se crea nodo
	                    nodoPadre.hijoDerecho=nuevoNodo;
	                    return ;
	                }
	            }
	        }
	    }
	 }
	
	//imprimir nodos en inorden
	public void imprimirInOrden(Nodo valordeNodo) {
		if(valordeNodo!=null){
	        imprimirInOrden(valordeNodo.hijoIzquierdo);           
	        System.out.println(" Nodo: " + valordeNodo.valorNodoActual);
            imprimirInOrden(valordeNodo.hijoDerecho);
	        } 
	}	
}