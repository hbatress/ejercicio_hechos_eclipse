package paqckage;

public class Nodo2 {
	
			private Integer ActualNodo;
			private Nodo2 nodoIzquierdo,nodoDerecho;
	
	public Nodo2() { 
		
	}
	public Nodo2(Integer Actual) {
		this.ActualNodo=Actual;
	} 

	public void Ingresar(Integer Agregar) {

	 if(Agregar < this.ActualNodo) {
	    if (this.nodoIzquierdo!= null) {
	        this.nodoIzquierdo.Ingresar(Agregar);
	        System.out.println("Se agrego al lado Izquierdo");	
	    } else {
	         this.nodoIzquierdo = new Nodo2(Agregar);
	         System.out.println("Se agrego al lado Izquierdo");	
	        }	
		}else {
	        if (this.nodoDerecho != null) {
	            this.nodoDerecho.Ingresar(Agregar);
	            System.out.println("Se agrego al lado Derecho");	
	        } else {
	            this.nodoDerecho = new Nodo2(Agregar);
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
        this.nodoIzquierdo.Postorden();
    }	
    	 if(this.nodoDerecho!=null){
      	   System.out.println("");
              this.nodoDerecho.Postorden();
          
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
	
	public void mostrarAngel() {
		if(this.nodoIzquierdo!=null){
    		System.out.println("");
        this.nodoIzquierdo.mostrarAngel();
    }	
    	 if(this.nodoDerecho!=null){
      	   System.out.println("");
              this.nodoDerecho.mostrarAngel();
    	 }
	       String valorNodoIzquierdo="", valorNodoDerecho="";//guardar temporalmente

	        if (this.nodoIzquierdo!=null) {
	        	valorNodoIzquierdo=this.nodoIzquierdo.getActualNodo().toString();
	        	
	        }
	        if (this.nodoDerecho!=null) {
	        	valorNodoDerecho=this.nodoDerecho.getActualNodo().toString();
	        }

	        if(this.nodoIzquierdo==null) {
	        			System.out.println("Padre:");
		        		System.out.println(this.ActualNodo);
						System.out.println("Hijo:"); 
						System.out.println("Izq:"+valorNodoIzquierdo);		
	        		
	        }else if(this.nodoDerecho==null) {
	        		 System.out.println("Padre:");
	        	     System.out.println(this.ActualNodo);
	        		 System.out.println("Hijo:"); 
	                 System.out.println("Derc:"+valorNodoDerecho);
	        			
        		} else {
        			System.out.println("Padre:");
	        		System.out.println(this.ActualNodo);
	        		System.out.println("Hijo:"); 
	        		System.out.println("izq: "+valorNodoIzquierdo+" Derc:"+valorNodoDerecho);	
	        }
	        
		
	}
	
	public void identificarNodo() {
		if(this.nodoIzquierdo!=null){
    		System.out.println("");
        this.nodoIzquierdo.identificarNodo();
    }	
    	 if(this.nodoDerecho!=null){
      	   System.out.println("");
              this.nodoDerecho.identificarNodo();;
    	 }
	       String valorNodoIzquierdo="", valorNodoDerecho="";//guardar temporalmente

	        if (this.nodoIzquierdo!=null) {
	        	valorNodoIzquierdo=this.nodoIzquierdo.getActualNodo().toString();
	        	
	        
	        if (this.nodoDerecho!=null) {
	        	valorNodoDerecho=this.nodoDerecho.getActualNodo().toString();
	        }


	        if(this.nodoIzquierdo==null) {
	        			System.out.println("Padre:");
		        		System.out.println(this.ActualNodo);
						System.out.println("Hijo:"); 
						System.out.println("Izq:"+valorNodoIzquierdo);		
	        		
	        }else if(this.nodoDerecho==null) {
	        		 System.out.println("Padre:");
	        	     System.out.println(this.ActualNodo);
	        		 System.out.println("Hijo:"); 
	                 System.out.println("Derc:"+valorNodoDerecho);
	        			
        		} else {
        			System.out.println("Padre:");
	        		System.out.println(this.ActualNodo);
	        		System.out.println("Hijo:"); 
	        		System.out.println("izq: "+valorNodoIzquierdo+" Derc:"+valorNodoDerecho);	
	        }
	        
	        
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
	public Nodo2 getNodoIzquierdo() {
		return nodoIzquierdo;
	}
	public void setNodoIzquierdo(Nodo2 nodoIzquierdo) {
		this.nodoIzquierdo = nodoIzquierdo;
	}
	public Nodo2 getNodoDerecho() {
		return nodoDerecho;
	}
	public void setNodoDerecho(Nodo2 nodoDerecho) {
		this.nodoDerecho = nodoDerecho;
	}	 
	 
	
}
