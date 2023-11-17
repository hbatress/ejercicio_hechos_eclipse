package nuevo;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Raiz {

    public static int orden;
    public Nodo primero;
    public boolean raiz;
    public int nivel = 1;
    public int imprimir = 1;
    public static String arbol = "";
    public static ArrayList<Integer> listaClaves;
    public static ArrayList<String> listadepartamento;
    public static ArrayList<String> ListaBebida;    

    public Raiz() {
    	
    }
    public Raiz(int orden) {
        Raiz.orden = orden;
        primero = new Nodo();
        raiz = true;
        listaClaves = new ArrayList<>();
        listadepartamento=new ArrayList<>();
        ListaBebida=new ArrayList<>();
    }

        public boolean nodoVacio(Nodo nodo) {
        return nodo == null;
    }


    public void insertarNodo(int clave,String departamento,String bebida) {  
        if (!primero.hoja) {
            int j = 0;
            for (int i = 0; i < primero.claves.length; i++) {
                if (primero.claves[i] == 0) {
                    primero.claves[i] = clave;
                    primero.departamento[i]=departamento;
                    primero.bebida[i]=bebida;
                    listaClaves.add(clave);
                    listadepartamento.add(departamento);
                    ListaBebida.add(bebida);
                    j = i;
                    //ordenarClaves(primero.claves,primero.departamento,primero.bebida);
                    break;
                }
            }
            if (j == 2 * orden)
                dividirNodos(primero);
        } else {
            setHoja(primero);
            insertarHijo(primero, clave,departamento,bebida);
        }
    }

    public void insertarHijo(Nodo padre, int clave,String departamento,String bebida) {
        boolean logrado = false;
        if (!nodoVacio(padre) && !padre.hoja) {
            for (int i = 0; i <= 2 * orden; i++) {
                if (padre.claves[i] == 0) {
                    padre.claves[i] = clave;
                    padre.departamento[i]=departamento;
                    padre.bebida[i]=bebida;
                    //ordenarClaves(padre.claves,padre.departamento,padre.bebida);
                    listaClaves.add(clave);
                    listadepartamento.add(departamento);
                    ListaBebida.add(bebida);
                    if (i == 2 * orden)
                        dividirNodos(padre);
                    break;
                }
            }
            logrado = true;
        }
        for (int i = 0; i < 2 * orden + 1 && !nodoVacio(padre) && !logrado; i++) {
            if (clave < padre.claves[i] || padre.claves[i] == 0) {
                logrado = true;
                insertarHijo(padre.hijos[i], clave,departamento,bebida);
                i = 2 * orden;
            }
        }
    }
    
    public void dividirArreglo(int[] arreglo,String[] depa,String[] bebi, int izquierda, int derecha) {
        if (izquierda < derecha) {
            int mitad = (izquierda + derecha) / 2;
            dividirArreglo(arreglo,depa,bebi, izquierda, mitad);
            dividirArreglo(arreglo,depa,bebi, mitad + 1, derecha);
            unirArreglo(arreglo,depa,bebi, izquierda, mitad, derecha);
        }
    }
    
    public void unirArreglo(int[] arreglo,String[] depa,String[] bebi, int izquierda, int mitad, int derecha) {
        int i, j, k;
        int[] aux = new int[arreglo.length];
        String[] depar=new String[depa.length];
        String[] bebid=new String[bebi.length];
        for (i = izquierda; i <= derecha; i++) {
            aux[i] = arreglo[i];
            depar[i] =depa[i];
            bebid[i] =bebi[i];
        }
        i = k = izquierda;
        j = mitad + 1;
        while (i <= mitad && j <= derecha) {
            arreglo[k++] = (aux[i] <= aux[j]) ? aux[i++] : aux[j++];
            depa[k++]=(depar[i]);
            bebi[k++] = (bebid[i]);
        }
        while (i <= mitad) {
            arreglo[k++] = aux[i++];
            depa[k++] = depar[i++];
            bebi[k++] = bebid[i++];
        }
    }

 
    public void ordenarClaves(int[] claves,String[] departamentos,String[] bebida) {
        int contador = 0;
        for (int i : claves)
            if (i != 0)
                contador++;
            else
                break;
        dividirArreglo(claves,departamentos,bebida, 0, contador - 1);
    }

 
    public void ordenarNodos(Nodo nodo) {
        int i = 0, j;
        Nodo temp;
        while (i < 2 * orden + 3 && !nodoVacio(nodo.hijos[i])) {
            j = 0;
            while (j < 2 * orden + 2 && !nodoVacio(nodo.hijos[j]) && !nodoVacio(nodo.hijos[j + 1])) {
                if (nodo.hijos[j].claves[0] > nodo.hijos[j + 1].claves[0]) {
                    temp = nodo.hijos[j];
                    nodo.hijos[j] = nodo.hijos[j + 1];
                    nodo.hijos[j + 1] = temp;
                }
                j++;
            }
            i++;
        }
    }


    public void setHoja(Nodo nodo) {
        if (nodo == primero)
            if (primero.hijos[0] != null)
                primero.hoja = true;
        for (Nodo hijo : nodo.hijos) {
            if (hijo != null) {
                nodo.hoja = true;
                setHoja(hijo);
            }
        }
    }


    public void dividirNodos(Nodo nodo) {
        Nodo izquierdo = new Nodo();
        Nodo derecho = new Nodo();

        //Primera división
        if (!nodoVacio(nodo.hijos[0])) {
            for (int i = 0; i < orden + 1; i++) {
                izquierdo.hijos[i] = nodo.hijos[i];
                izquierdo.hijos[i].padre = izquierdo;
                nodo.hijos[i] = null;

                derecho.hijos[i] = nodo.hijos[orden + 1 + i];
                derecho.hijos[i].padre = derecho;
                nodo.hijos[orden + 1 + i] = null;
            }
        }

        //Guardar los valores en izquierdo y derecho
        for (int i = 0; i < orden; i++) {
            izquierdo.claves[i] = nodo.claves[i];
            izquierdo.departamento[i] = nodo.departamento[i];
            izquierdo.bebida[i] = nodo.bebida[i];
            nodo.claves[i] = 0;
            nodo.departamento[i] = "";
            nodo.bebida[i] = "";
            derecho.claves[i] = nodo.claves[orden + 1 + i];
            derecho.departamento[i] = nodo.departamento[orden + 1 + i];
            derecho.bebida[i] = nodo.bebida[orden + 1 + i];
            nodo.claves[orden + 1 + i] = 0;
            nodo.departamento[orden+1+i]="";
            nodo.bebida[orden+1+i]="";
        }
        nodo.claves[0] = nodo.claves[orden];
        nodo.departamento[0] = nodo.departamento[orden];
        nodo.bebida[0] = nodo.bebida[orden];
        
        nodo.claves[0] = nodo.claves[orden];
        nodo.departamento[0] = nodo.departamento[orden];
        nodo.bebida[0] = nodo.bebida[orden];
        
        nodo.claves[orden] = 0;
        nodo.departamento[orden] = "";
        nodo.bebida[orden] = "";
        nodo.hijos[0] = izquierdo;
        nodo.hijos[0].padre = nodo;
        nodo.hijos[1] = derecho;
        nodo.hijos[1].padre = nodo;
        setHoja(primero);
        ordenarNodos(nodo);

        //Ahora se sube el valor del padre
        if (!nodoVacio(nodo.padre)) {
            boolean logrado = false;
            for (int i = 0; i < nodo.padre.claves.length && !logrado; i++) {
                if (nodo.padre.claves[i] == 0) {
                    nodo.padre.claves[i] = nodo.claves[0];
                    logrado = true;
                    nodo.claves[0] = 0;
                    ordenarClaves(nodo.padre.claves,nodo.padre.departamento,nodo.padre.bebida);
                }
            }
            int posicion = 0;
            for (int i = 0; i < 2 * orden + 3; i++) {
                if (!nodoVacio(nodo.padre.hijos[i])) {
                    posicion++;
                } else {
                    break;
                }
            }
            nodo.padre.hijos[posicion] = nodo.hijos[0];
            nodo.padre.hijos[posicion].padre = nodo.padre;
            nodo.padre.hijos[posicion + 1] = nodo.hijos[1];
            nodo.padre.hijos[posicion + 1].padre = nodo.padre;

            int actual = 0;
            for (int i = 0; i < 2 * orden + 3 && !nodoVacio(nodo.padre.hijos[i]); i++) {
                if (nodo.padre.hijos[i].claves[0] == nodo.claves[0]) {
                    actual = i;
                    break;
                }
            }

            Nodo temp = nodo.padre;
            nodo = null;
            int j = actual;
            while (j < 2 * orden + 2 && !nodoVacio(temp.hijos[j]) && !nodoVacio(temp.hijos[j + 1])) {
                temp.hijos[j] = temp.hijos[j + 1];
                j++;
            }
            temp.hijos[j] = null;
            ordenarClaves(temp.claves,temp.departamento,temp.bebida);
            ordenarNodos(temp);
            if (temp.claves[2 * orden] != 0) {
                dividirNodos(temp);
            }
        }
    }


    public void eliminar(int clave) {
        boolean encontrado = false;
        int pos = 0;
        for (int i = 0; i < listaClaves.size() && !encontrado; i++) {
            if (listaClaves.get(i) == clave) {
                encontrado = true;
                pos = i;
            }
        }

        if (encontrado)
            listaClaves.remove(pos);
        else
            System.out.println("No encontrado");

        ArrayList<Integer> aux = listaClaves;
        ArrayList<String> otro=listadepartamento;
        ArrayList<String> otros=ListaBebida;  
        listaClaves = new ArrayList<>();
        primero = new Nodo();
        primero.hoja = false;
        for (int i = 0; i < aux.size(); i++) {
            int claveNueva = aux.get(i);
            String departamentonuevo= otro.get(i);
            String bebidanueva=otros.get(i);
            insertarNodo(claveNueva,departamentonuevo,bebidanueva);
        }
    }


    public boolean buscar(int clave) {
        for (int i = 0; i < listaClaves.size(); i++) {
            if (listaClaves.get(i) == clave) {
                System.out.println("Elemento encontrado");
                return true;
            }
        }
        System.out.println("No encontrado");
        return false;
    }


    public String imprimirArbol(Nodo nodo) {
        arbol += "\n";
        for (int i = 0; i < 2 * orden + 1; i++) {
            if (nodo.hijos[i] != null) {
                if (i == 0) {
                    nivel++;
                    imprimir = 1;
                } else {
                    imprimir++;
                }
                imprimirArbol(nodo.hijos[i]);
            }
            for (int j = 0; nodo.hijos[i] != null && j < nodo.hijos[i].claves.length; j++) {
                //arbol += "[";
            	
                if (nodo.hijos[i].claves[j] != 0)
                	
                    arbol += "\nPersonas:"+nodo.hijos[i].claves[j] + 
                    "\ndepartamentos:"+nodo.hijos[i].departamento[i]+"\nbebidas:"+nodo.hijos[i].bebida[i];
            else
                   arbol += "   ";
              // arbol += " ] ";
            }
        }
       if (arbol.length() > (2 * orden + 3) * 4) {
            System.out.println(arbol);
            return arbol;
            
        }
        
        return arbol;
    }


    public String impresion() {
        imprimirArbol(primero);
        nivel = 1;
        imprimir = 1;
        return arbol;
    }

  
    public boolean validarNumero(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
