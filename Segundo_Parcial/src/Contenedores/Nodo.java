package Contenedores;


public class Nodo {
	

	    private int ActualNodo;
		private Nodo nodoIzquierdo,nodoDerecho;

		 
	public Nodo() {}
	
	public Nodo(int Actual) {
		this.ActualNodo=Actual;
	} 

	public void Ingresar(int Agregar) {

	 if(Agregar < this.ActualNodo) {
	    if (this.nodoIzquierdo!= null) {
	        this.nodoIzquierdo.Ingresar(Agregar);
	        System.out.println("Se agrego al lado Izquierdo");	
	    } else {
	         this.nodoIzquierdo = new Nodo(Agregar);
	         System.out.println("Se agrego al lado Izquierdo");	
	        }	
		}else {
	        if (this.nodoDerecho != null) {
	            this.nodoDerecho.Ingresar(Agregar);
	            System.out.println("Se agrego al lado Derecho");	
	        } else {
	            this.nodoDerecho = new Nodo(Agregar);
	           System.out.println("Se agrego al lado Derecho");	
	        }
		}   
	}
	
 	public void Inorden() {
		 if(this.nodoIzquierdo!=null){
	            this.nodoIzquierdo.Inorden();
	        }
	        
	        System.out.println("=> " + this.ActualNodo);
	        
	        if(this.nodoDerecho!=null){
	            this.nodoDerecho.Inorden();
	        }	
	}
 	
    public Nodo findPredecessor() {
        if (this.getNodoDerecho() == null) {
            return this;
        } else {
            return this.getNodoDerecho().findPredecessor();
        }
    }
 
    public Nodo findSuccessor() {
        if (this.getNodoIzquierdo() == null) {
            return this;
        } else {
            return this.getNodoIzquierdo().findSuccessor();
        }
    }
    
 	public Nodo delete(int value) {
        Nodo response = this;
        if (value < this.ActualNodo) {
        	this.nodoIzquierdo = this.nodoIzquierdo.delete(value);
        	} else if (value > this.ActualNodo) {
            this.nodoDerecho = this.nodoDerecho.delete(value);
        } else {
            if (this.nodoIzquierdo != null && this.nodoDerecho != null) {
                Nodo temp = this;
                Nodo maxOfTheLeft = this.nodoIzquierdo.findPredecessor();
                this.ActualNodo = maxOfTheLeft.getActualNodo();
                temp.nodoIzquierdo = temp.nodoIzquierdo.delete(maxOfTheLeft.getActualNodo());
            } else if (this.nodoIzquierdo != null) {
                response = this.nodoIzquierdo;
            } else if (this.nodoDerecho != null) {
                response = this.nodoDerecho;
            } else {
                response = null;
            }
        }
        return response;
    }
 	
	public int getActualNodo() {
		return ActualNodo;
	}
	public void setActualNodo(Integer actualNodo) {
		ActualNodo = actualNodo;
	}
	public Nodo getNodoIzquierdo() {
		return nodoIzquierdo;
	}
	public void setNodoIzquierdo(Nodo nodoIzquierdo) {
		this.nodoIzquierdo = nodoIzquierdo;
	}
	public Nodo getNodoDerecho() {
		return nodoDerecho;
	}
	public void setNodoDerecho(Nodo nodoDerecho) {
		this.nodoDerecho = nodoDerecho;
	}

	 
	
}
