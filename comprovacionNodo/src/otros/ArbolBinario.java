package otros;

public class ArbolBinario {
	  
	    
	 private Nodo raiz;
	    int cant;
	    int altura;

	    public ArbolBinario() {
	        this.raiz = null;
	    }

	    public void agregar(int dato) {
	        Nodo nuevo = new Nodo(dato, null, null);
	        insertar(nuevo, raiz);
	    }

	    public void insertar(Nodo nuevo, Nodo pivote) {
	        if (this.raiz == null) {
	            raiz = nuevo;
	        } else {
	            if (nuevo.getDato() <= pivote.getDato()) {
	                if (pivote.getIzq() == null) {
	                    pivote.setIzq(nuevo);
	                } else {
	                    insertar(nuevo, pivote.getIzq());
	                }
	            } else {
	                if (pivote.getDer() == null) {
	                    pivote.setDer(nuevo);
	                } else {
	                    insertar(nuevo, pivote.getDer());
	                }
	            }
	        }

	    }

	    //metodos nuevos
	    public boolean existe(int info) {
	        Nodo reco = raiz;
	        while (reco != null) {
	            if (info == reco.getDato()) {
	                return true;
	            } else if (info > reco.getDato()) {
	                reco = reco.getDer();
	            } else {
	                reco = reco.getIzq();
	            }
	        }
	        return false;
	    }

	    public int cantidad() {
	        cant = 0;
	        cantidad(raiz);
	        return cant;
	    }

	    private void cantidad(Nodo reco) {
	        if (reco != null) {
	            cant++;
	            cantidad(reco.getIzq());
	            cantidad(reco.getDer());
	        }
	    }

	    private void cantidadNodosHoja(Nodo reco) {
	        if (reco != null) {
	            if (reco.getIzq() == null && reco.getDer() == null) {
	                cant++;
	            }
	            cantidadNodosHoja(reco.getIzq());
	            cantidadNodosHoja(reco.getDer());
	        }
	    }

	    public int cantidadNodosHoja() {
	        cant = 0;
	        cantidadNodosHoja(raiz);
	        return cant;
	    }

	    public int retornarAltura() {
	        altura = 0;
	        retornarAltura(raiz, 1);
	        return altura;
	    }

	    private void retornarAltura(Nodo reco, int nivel) {
	        if (reco != null) {
	            retornarAltura(reco.getIzq(), nivel + 1);
	            if (nivel > altura) {
	                altura = nivel;
	            }
	            retornarAltura(reco.getDer(), nivel + 1);
	        }
	    }

	    public void menorValor() {
	        if (raiz != null) {
	            Nodo reco = raiz;
	            while (reco.getIzq() != null) {
	                reco = reco.getIzq();
	            }
	            System.out.println("Menor valor del �rbol:" + reco.getDato());
	        }
	    }

	    public void mayorValor() {
	        if (raiz != null) {
	            Nodo reco = raiz;
	            while (reco.getDer() != null) {
	                reco = reco.getDer();
	            }
	            System.out.println("Mayor valor del �rbol:" + reco.getDato());
	        }
	    }

	    int subizq = 0;
	    int subder = 0;

	    public void imprimirBalance() {
	        subizq = 0;
	        subder = 0;

	        Balance(this.raiz, true, 0);
	        System.out.println("lado Izquierdo " + subizq + " Lado Derecho " + subder);
	        if (subizq - subder == 0) {
	            System.out.println("El balance es: 0 ");
	        } else if (subizq - subder == -1) {
	            System.out.println("El balance es -1, derecha");
	        } else if (subizq - subder == 1) {
	            System.out.println("El balance 1, izquierda");

	        } else {
	            System.out.println("No es balanceado.."
	                + "porque es mas grande el lado "
	                + ((subizq > subder) ? "Izquierdo" : "Derecho"));
	        }

	    }

	    public void Balance(Nodo reco, boolean lado, int i) {

	        if (reco != null) {

	            if (reco.getDer() == null && reco.getIzq() == null) {
	                if (lado) {
	                    subder = (i > subder) ? i : subder;
	                } else {
	                    subizq = (i > subizq) ? i : subizq;
	                }
	            }

	            Balance(reco.getDer(), lado, i + 1);
	            if (i == 0) {
	                lado = false;
	            }
	            Balance(reco.getIzq(), lado, i + 1);
	        }

	    }

	    //altura arbol
	    String[] niveles;

	    public int alturaArbol() {
	        altura = 0;
	        alturaArbol(raiz, 0);
	        return altura;
	    }

	    private void alturaArbol(Nodo pivote, int nivel) {
	        if (pivote != null) {
	            alturaArbol(pivote.getIzq(), nivel + 1);
	            if (nivel > altura) {
	                altura = nivel;
	            }
	            alturaArbol(pivote.getDer(), nivel + 1);
	        }
	    }

	    public void imprimirNivel() {
	        niveles = new String[altura + 1];

	        imprimirNivel(raiz, 0);
	        for (int i = 0; i < niveles.length; i++) {
	    		System.out.print("============== En nivel: " + i+" ===================\n");
	            System.out.println(niveles[i] );
	        }
	    }

	    public void imprimirNivel(Nodo pivote, int nivel2) {
	        if (pivote != null) {
	            niveles[nivel2] = "|"+pivote.getDato() + "| " + ((niveles[nivel2] != null) ? niveles[nivel2] : "");
	            imprimirNivel(pivote.getDer(), nivel2 + 1);
	            imprimirNivel(pivote.getIzq(), nivel2 + 1);
	        }
	    }

	   
	    public void imprimirAlturaDeCadaNodo() {
	        imprimirAlturaDeCadaNodo(raiz, 1);

	    }
	    private void imprimirAlturaDeCadaNodo(Nodo reco, int nivel) {
	        if (reco != null) {
	            System.out.println("Nodo contiene: "+reco.getDato() + " y su altura es: "+nivel);
	            imprimirAlturaDeCadaNodo(reco.getIzq(), nivel + 1);
	            imprimirAlturaDeCadaNodo(reco.getDer(), nivel + 1);
	        }
	    }

	}