package arbolV1_recorrido;

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
public void imprimirPreOrden() {

    
    String valorNodoIzquierdo="", valorNodoDerecho="";
    if (this.nodoIzquierdo!=null) {
    	valorNodoIzquierdo=this.nodoIzquierdo.getValorDelNodoActual().toString();
    }
    if (this.nodoIzquierdo!=null) {
    	valorNodoDerecho=this.nodoDerecho.getValorDelNodoActual().toString();
    }
    
    System.out.println("Actual: "+this.valorDelNodoActual+
    		" IZQ "+valorNodoIzquierdo + " DER " + valorNodoDerecho);
    if(this.nodoIzquierdo!=null){
        this.nodoIzquierdo.imprimirNodosEnConsolaDelRecorridoInOrden();
    }
    
    if(this.nodoDerecho!=null){
        this.nodoDerecho.imprimirNodosEnConsolaDelRecorridoInOrden();
    }
}
	
    public void imprimir(){
        String valorNodoIzquierdo="", valorNodoDerecho="";//guardar temporalmente
    	if(this.nodoIzquierdo!=null){
    		//System.out.println("");
        this.nodoIzquierdo.imprimir();
    }
        if (this.nodoIzquierdo!=null) {
        	valorNodoIzquierdo=this.nodoIzquierdo.getValorDelNodoActual().toString();
        	
        }
        if (this.nodoDerecho!=null) {

        	valorNodoDerecho=this.nodoDerecho.getValorDelNodoActual().toString();
        }

        if(this.nodoIzquierdo==null) {
        	if(this.nodoDerecho==null) {
        	  	
        	}else {
        		 System.out.println("Padre:");
        	     System.out.println(this.valorDelNodoActual);
        		 System.out.println("Hijo:"); 
                 System.out.println("Derc:"+valorNodoDerecho);
			}
        }else if (this.nodoDerecho==null) {
			
        	if(this.nodoIzquierdo==null) {
				
        	}else {
        		System.out.println("Padre:");
        		System.out.println(this.valorDelNodoActual);
				System.out.println("Hijo:"); 
				System.out.println("Izq:"+valorNodoIzquierdo);	
        	}
        	
        	}else {
       		 System.out.println("");
        		System.out.println("Padre: "+this.valorDelNodoActual);
        		//System.out.println(this.valorDelNodoActual);
        		System.out.println("Hijo:"); 
        		System.out.println("izq: "+valorNodoIzquierdo+" Derc:"+valorNodoDerecho);
        		
        	}
		 
      
      
	
    	 if(this.nodoDerecho!=null){
      	   //System.out.println("");
              this.nodoDerecho.imprimir();
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
