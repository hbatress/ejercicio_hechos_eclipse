package Bebida;

public class arbol {

	 private Nodo raiz;
	    int cant;
	    int altura;

	    public arbol() {
	        this.raiz = null;
	    }
	    public void agregar(int NoEncuesta,String nombre,int edad, int respuesta) {
	        Nodo nuevo = new Nodo(NoEncuesta,nombre,edad,  respuesta, null, null);
	        insertar(nuevo, raiz);
	    }

	    public void insertar(Nodo nuevo, Nodo pivote) {
	        if (this.raiz == null) {
	            raiz = nuevo;
	        } else {
	            if (nuevo.getNoEncuesta() <= pivote.getNoEncuesta()) {
	                if (pivote.getIzquierdo() == null) {
	                    pivote.setIzquierdo(nuevo);
	                } else {
	                    insertar(nuevo, pivote.getIzquierdo());
	                }
	            } else {
	                if (pivote.getDerecho() == null) {
	                    pivote.setDerecho(nuevo);
	                } else {
	                    insertar(nuevo, pivote.getDerecho());
	                }
	            }
	        }

	    }

	    //metodos nuevos
	    public boolean existe(int info) {
	        Nodo reco = raiz;
	        while (reco != null) {
	            if (info == reco.getNoEncuesta()) {
	                return true;
	            } else if (info > reco.getNoEncuesta()) {
	                reco = reco.getDerecho();
	            } else {
	                reco = reco.getIzquierdo();
	            }
	        }
	        return false;
	    }

	    public void menorValor() {
	        if (raiz != null) {
	            Nodo reco = raiz;
	            while (reco.getIzquierdo() != null) {
	                reco = reco.getIzquierdo();
	            }
	            System.out.println("Encuesta No." + reco.getNoEncuesta());	
	            System.out.println("Nombre: " + reco.getNombre());
	            System.out.println("Edad" + reco.getEdad());	
	        }
	    }
	    public void mayorValor() {
	        if (raiz != null) {
	            Nodo reco = raiz;
	            while (reco.getDerecho() != null) {
	                reco = reco.getDerecho();
	            }
	            System.out.println("Encuesta No." + reco.getNoEncuesta());	
	            System.out.println("Nombre: " + reco.getNombre());
	            System.out.println("Edad" + reco.getEdad());	
	        }
	    }
}
