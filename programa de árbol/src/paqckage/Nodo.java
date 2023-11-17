package paqckage;

public class Nodo {
	
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
	
	public void Inorden() {
    	if(this.nodoIzquierdo!=null){
    		System.out.println("");
        this.nodoIzquierdo.imprimirPantalla();
    }
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
			 
	      
	      
	
	    	 if(this.nodoDerecho!=null){
	      	   System.out.println("");
	              this.nodoDerecho.imprimirPantalla();
	          }

	}
	
	public void Postorden() {
		
    	if(this.nodoIzquierdo!=null){
    		System.out.println("");
        this.nodoIzquierdo.imprimirPantalla();
    }	
    	 if(this.nodoDerecho!=null){
      	   System.out.println("");
              this.nodoDerecho.imprimirPantalla();
          
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
			 
	      
	      
}

	}
	public void imprimirNodosEnConsolaDelRecorridoInOrden(){
      
	
        String valorNodoIzquierdo="", valorNodoDerecho="";
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

        		System.out.println("Padre:");
        		System.out.println(this.ActualNodo);
        		System.out.println("Hijo:"); 
        		System.out.println("izq: "+valorNodoIzquierdo+" Derc:"+valorNodoDerecho);
        		
        	}
        
      
       if(this.nodoDerecho!=null){
    	   
            this.nodoDerecho.imprimirNodosEnConsolaDelRecorridoInOrden();
        }
    	if(this.nodoIzquierdo!=null){
    		
        this.nodoIzquierdo.imprimirNodosEnConsolaDelRecorridoInOrden();
    }

    }
	
	public void insertar() {
		String valorNodoIzquierdo="", valorNodoDerecho="";
        if (this.nodoIzquierdo!=null) {
        	valorNodoIzquierdo=this.nodoIzquierdo.getActualNodo().toString();
        }
        if (this.nodoDerecho!=null) {
        	valorNodoDerecho=this.nodoDerecho.getActualNodo().toString();
        }
        
        System.out.println("Actual: " + this.ActualNodo+
        		" IZQ " + valorNodoIzquierdo + " DER " + valorNodoDerecho);
        
        if(this.nodoDerecho!=null){
            this.nodoDerecho.insertar();
        }
        
        if(this.nodoIzquierdo!=null){
            this.nodoIzquierdo.insertar();
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
