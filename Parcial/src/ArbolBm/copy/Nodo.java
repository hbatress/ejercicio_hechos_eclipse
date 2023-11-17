package ArbolBm.copy;


public class Nodo {

	//Variables a utilizar
	public int []Personas;

    //nodo que apunta
    public Nodo []nodo;
    public static int numValores;
    public boolean tengoHijos = false;
    public int ocupados = 0;
    public Nodo padre;
    public Nodo(){
       nodo = new Nodo [Raiz.grado * 2 + 3];
       Personas = new int [Raiz.grado * 2 + 1];
    }

}
