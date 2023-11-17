package recorrido;


public class Nodo {
	 private Nodo raiz;
	    int cant;
	    int altura;
			private Integer ActualNodo;
			private Nodo nodoIzquierdo,nodoDerecho;
	
	public Nodo() { 
		
	}
	public Nodo(Integer Actual) {
		this.ActualNodo=Actual;
	} 

	public void Ingresar(Integer Agregar) {

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
	
	public void PreOrden() {
		
		System.out.println("=> " + this.ActualNodo);

		 if(this.nodoIzquierdo!=null){
	            this.nodoIzquierdo.PreOrden();
	        }
	        
	        if(this.nodoDerecho!=null){
	            this.nodoDerecho.PreOrden();
	        }	
    	
	}
	public void Postorden() {
		 if(this.nodoIzquierdo!=null){
	            this.nodoIzquierdo.Postorden();
	        }
	       
	        if(this.nodoDerecho!=null){
	            this.nodoDerecho.Postorden();
	        }
	        System.out.println("=> " + this.ActualNodo);
		
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
	
	 String[] niveles;

	    public int alturaArbol() {
	        altura = 0;
	        alturaArbol(raiz, 0);
	        return altura;
	    }

	    private void alturaArbol(Nodo otros, int nivel) {
	        if (otros != null) {
	            alturaArbol(otros.getNodoIzquierdo(), nivel + 1);
	            if (nivel > altura) {
	                altura = nivel;
	            }
	            alturaArbol(otros.getNodoDerecho(), nivel + 1);
	        }
	    }

	    public void imprimirNivel() {
	        niveles = new String[altura + 1];

	        imprimirNivel(raiz, 0);
	        for (int i = 0; i < niveles.length; i++) {
	            System.out.println(niveles[i] + " En nivel: " + i);
	        }
	    }

	    public void imprimirNivel(Nodo pivote, int nivel2) {
	        if (pivote != null) {
	            niveles[nivel2] = pivote.getActualNodo() + ", " + ((niveles[nivel2] != null) ? niveles[nivel2] : "");
	            imprimirNivel(pivote.getNodoDerecho(), nivel2 + 1);
	            imprimirNivel(pivote.getNodoIzquierdo(), nivel2 + 1);
	        }
	    }



public void imprimirPantalla() {
		
        String valorNodoIzquierdo="", valorNodoDerecho="";//guardar temporalmente
        if (this.nodoIzquierdo!=null) {
        	valorNodoIzquierdo=this.nodoIzquierdo.getActualNodo().toString();
        	
        }
        if (this.nodoDerecho!=null) {

        	valorNodoDerecho=this.nodoDerecho.getActualNodo().toString();
        }

        if(this.nodoIzquierdo==null) {
        	if(this.nodoDerecho==null) {
        	  	
        	}else {
        		 System.out.println("Padre:");
        	     System.out.println(this.ActualNodo);
        		 System.out.println("Hijo:"); 
                 System.out.println("Derc:"+valorNodoDerecho);
			}
        }else if (this.nodoDerecho==null) {
			
        	if(this.nodoIzquierdo==null) {
				
        	}else {
        		System.out.println("Padre:");
        		System.out.println(this.ActualNodo);
				System.out.println("Hijo:"); 
				System.out.println("Izq:"+valorNodoIzquierdo);	
        	}
        	
        	}else {
       		 System.out.println("");
        		System.out.println("Padre:");
        		System.out.println(this.ActualNodo);
        		System.out.println("Hijo:"); 
        		System.out.println("izq: "+valorNodoIzquierdo+" Derc:"+valorNodoDerecho);
        		
        	}
		 
      
      
    	if(this.nodoIzquierdo!=null){
    		System.out.println("");
        this.nodoIzquierdo.imprimirPantalla();
    }	
    	 if(this.nodoDerecho!=null){
      	   System.out.println("");
              this.nodoDerecho.imprimirPantalla();
          }

	}	
	
	public Integer getActualNodo() {
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
