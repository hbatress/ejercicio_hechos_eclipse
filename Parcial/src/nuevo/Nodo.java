package nuevo;

public class Nodo {

    public int[] claves;
    public String[] departamento;
    public String[] bebida;
    public Nodo[] hijos;
    public static int numClaves;
    public boolean hoja = false;
    public int lleno = 0;
    public Nodo padre;

    public Nodo() {
        hijos = new Nodo[Raiz.orden * 2 + 3];
        claves = new int[Raiz.orden * 2 + 1];
        departamento=new String[Raiz.orden*2+3];
        bebida=new String[Raiz.orden*2+1];
        
    }
    
}
