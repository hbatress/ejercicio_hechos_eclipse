package Paquetes;

import java.security.cert.CertPathValidator;

import javax.swing.JOptionPane;


public class Arbol_Binario {

	private Nodo_Arbol raiz;
	int cant;
    int altura;
	int i=0;
	String[] Datos;
	int pocicion=1;
	public Arbol_Binario() {
		
	}
	public void add(int Cantidad,String Bebida) {
        //Primero esta validación ya que existe la posibilidad de que la 
        //raiz este siempre con un valor asignado
	       if (this.raiz == null){
	            this.raiz = new Nodo_Arbol(Cantidad, Bebida);
	           // JOptionPane.showMessageDialog(null,"Se ingreso la raiz");

	        } else {
	            this.add(this.raiz,Cantidad, Bebida);
	           // JOptionPane.showMessageDialog(null,"Se ingreso el dato correctamente");

	        }
			}
	
    private void add(Nodo_Arbol padre, int cantidad,String bebida) {
    		if (cantidad > padre.getAnio()) {
            if (padre.getDerecho() == null) {
                //Se aplica recursividad para ir recorriendo el árbol por la 
                //rama derecha
                padre.setDerecho(new Nodo_Arbol(cantidad, bebida));
                		
            } else {
                //Se asigna el nodo en la posición vacia encontrada a la 
                //derecha
                this.add(padre.getDerecho(),cantidad,bebida);
            }
    		} else {
            if (padre.getIzquierdo() == null) {
                //Se aplica recursividad para ir recorriendo el árbol por la 
                //rama izquierda
                padre.setIzquierdo(new Nodo_Arbol(cantidad, bebida));
            } else {
                //Se asigna el nodo en la posición vacia encontrada a la 
                //izquierda
                this.add(padre.getIzquierdo(),cantidad,bebida);
            }
    		}
    		}
    public int alturaArbol() {
    	altura = 0;
    	alturaArbol(raiz, 0);
    	return altura;
		}

private void alturaArbol(Nodo_Arbol ID, int nivel) {
		if (ID != null) {
        alturaArbol(ID.getIzquierdo(), nivel + 1);
        if (nivel > altura) {
            altura = nivel;
        }
        alturaArbol(ID.getDerecho(), nivel + 1);
		}
		}

public void imprimirNivel() {
	Datos = new String[altura + 1];

		imprimirNivel(raiz, 0);
		for (int i = 0; i < Datos.length; i++) {
		System.out.print("============== En nivel: " + i+" ===================\n");
        System.out.println(Datos[i] );
		JOptionPane.showMessageDialog(null,"El nivel :"+i+Datos[i]);
		}
		}

public void imprimirNivel(Nodo_Arbol ID, int nivel2) {
		if (ID != null) {
			Datos[nivel2] = "\nCantidad de personas: "+ID.getAnio()+
        		"\nClase de bebida: "+ID.getPerro()+
        		
        		"\n"+
        		((Datos[nivel2] != null) ? Datos[nivel2] : "\n");
        imprimirNivel(ID.getDerecho(), nivel2 + 1);
        imprimirNivel(ID.getIzquierdo(), nivel2 + 1);
		}
		}


}
