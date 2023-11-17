package Arbol_binario;

import java.security.PublicKey;
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Arbol {
		
		String[] niveles;
		private Nodo raiz;
		int cant;
	    int altura;
	    String imrpimirbebidaString;
    	int imprimircantidad;
        public static String arbol = "";
	public Arbol() {
		
	}
	
	public void insertar(int Cantidad,String Bebida) {
		
	       if (this.raiz == null){
	            this.raiz = new Nodo(Cantidad, Bebida);
	            System.out.println("Datos ingresados correctamente");
	        } else {
	            this.insertar(this.raiz,Cantidad, Bebida);
				System.out.println("Datos ingresados correctamente");
	        }
			}
	
    private void insertar(Nodo padre, int cantidad,String bebida) {
    		if (cantidad > padre.getCantidad()) {
            if (padre.getDerecho() == null) {
                padre.setDerecho(new Nodo(cantidad, bebida));
                		
            } else {
                this.insertar(padre.getDerecho(),cantidad,bebida);
            }
    		} else {
            if (padre.getIzquierdo() == null) {
                padre.setIzquierdo(new Nodo(cantidad, bebida));
            } else {
                this.insertar(padre.getIzquierdo(),cantidad,bebida);
            }
    		}
    		}
    
    public void preorden() {
    		this.preorden(this.raiz);
    }
    private void preorden(Nodo Dato) {

    		if (Dato != null) {
    		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
    		Dato.imprimirDato();

            preorden(Dato.getIzquierdo());
            preorden(Dato.getDerecho());
    		}
    		}
  
    
    public void inorden() {
    		this.inorden(this.raiz);
    }

    private void inorden(Nodo n) {
        	if (n != null) {
            inorden(n.getIzquierdo());
    		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
            n.imprimirDato();
    		
            inorden(n.getDerecho());
        	}
    		}
       
     
    public void postorden() {
           this.postorden(this.raiz);
       }
    private void postorden(Nodo n) {
    		if (n != null) {
            postorden(n.getIzquierdo());
            postorden(n.getDerecho());
    		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
            n.imprimirDato();
    		
    		}
    		}
    
 
    public boolean existe(int busqueda) {
        return existe(this.raiz, busqueda);
    }

    private boolean existe(Nodo n, int busqueda) {
        if (n == null) {
            return false;
        }
        if (n.getCantidad() == busqueda) {
        	System.out.println("La cantidad de personas es:"+n.getCantidad()+
        			"^\nLa bebida es:"+n.getBebida()
        			
        			);
        	  imrpimirbebidaString=n.getBebida();
        	 imprimircantidad=n.getCantidad();
            return true;
        } else if (busqueda < n.getCantidad()) {
            return existe(n.getIzquierdo(), busqueda);
        } else {
            return existe(n.getDerecho(), busqueda);
        }

    }
    /*
    public int retornarAltura() {
        altura = 0;
        retornarAltura(raiz, 1);
        return altura;
    }

    private void retornarAltura(Nodo reco, int nivel) {
        if (reco != null) {
            retornarAltura(reco.getIzquierdo(), nivel + 1);
            if (nivel > altura) {
                altura = nivel;
            }
            retornarAltura(reco.getDerecho(), nivel + 1);
        }
    }
    */
    


    public int alturaArbol() {
        	altura = 0;
        	alturaArbol(raiz, 0);
        	return altura;
    		}

    private void alturaArbol(Nodo ID, int nivel) {
    		if (ID != null) {
            alturaArbol(ID.getIzquierdo(), nivel + 1);
            if (nivel > altura) {
                altura = nivel;
            }
            alturaArbol(ID.getDerecho(), nivel + 1);
    		}
    		}

    public void imprimirNivel() {
    		niveles = new String[altura + 1];

    		imprimirNivel(raiz, 0);
    		for (int i = 0; i < niveles.length; i++) {
    		System.out.print("============== En nivel: " + i+" ===================\n");
            System.out.println(niveles[i] );
			JOptionPane.showMessageDialog(null,"El nivel :"+i+niveles[i]);
    		}
    		}

    public void imprimirNivel(Nodo ID, int nivel2) {
    		if (ID != null) {
            niveles[nivel2] = "\nCantidad de personas: "+ID.getCantidad()+
            		"\nClase de bebida: "+ID.getBebida()+
            		
            		"\n"+
            		((niveles[nivel2] != null) ? niveles[nivel2] : "\n");
            imprimirNivel(ID.getDerecho(), nivel2 + 1);
            imprimirNivel(ID.getIzquierdo(), nivel2 + 1);
    		}
    		}
  
 
    public LinkedList preOrden() {
        LinkedList rec = new LinkedList();
        LinkedList recbebida = new LinkedList();
        preorden(raiz, rec,recbebida);
        return rec;
    }
    
    public void preorden(Nodo aux, LinkedList recorrido,LinkedList bbida) {
        if (aux != null) {
            recorrido.add(aux.getCantidad());
            bbida.add(aux.getBebida());
            preorden(aux.getIzquierdo(), recorrido,bbida);
            preorden(aux.getDerecho(), recorrido,bbida);
        }

    }

	public Nodo getRaiz() {
		return raiz;
	}

	public void setRaiz(Nodo raiz) {
		this.raiz = raiz;
	}


}
