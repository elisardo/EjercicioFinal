public class Grafo {
    public Grafo(int numNodos) {}
    public boolean añadirArista(Arista arista){}
    public boolean añadirNodo(Nodo nodo){}
    public boolean eliminarArista(Arista arista){}
    public boolean eliminarNodo(Nodo nodo){}
    private int posicionNodo(Nodo nodo) {}
    public Nodo[] listaNodos() {}
    public Arista[] listaAristas() {}
    private int numeroDeAristas() {}
    private int numeroDeNodos() {}

    //Proceso de resolucion
    /*
     *Se creará un nuevo Grafo (el tamaño será el número de nodos del grafo actual).
     *Como inicialmente no se sabe qué nodos habrá que eliminar, ya que se quitarán aristas,
     * se copiarán todos los nodos
     *A continuación se copiarán todas las aristas que cumplan la condición
     * Por último, habrá que recorrer todos los nodos y calcular si alguno de ellos
     * no tiene ninguna arista que incida. Si algún nodo es de grado 0 se elimina
     *
     * */



    //Ejercicio2
    /*
     *Para cierta aplicación se ha detectada la necesidad de disponer de una operación
     * de la clase grafo para eliminar todas las aristas cuyo peso sea inferior a un valor dado.
     * Una vez eliminadas estas aristas hay que eliminar todos los nodos desconectados.
     * El resultado debe ser un nuevo grafo, manteniendo el original.
     * Se debe escribir en la clase Grafo un método con la siguiente cabecera:
     *       public Grafo limpiaGrafo (int valor) { }
     */
    public Grafo limpiaGrafo(int valor) {
        Grafo nuevoGrafo = new Grafo(numeroDeNodos());
        // Primero copio todos los Nodos
        for (Nodo nodo : listaNodos()) {
            nuevoGrafo.añadirNodo(nodo);
        }// Copio todas las aristas con peso >= valor
        for (Arista a : listaAristas()) {
            if (a.getPeso() >= valor) {
                nuevoGrafo.añadirArista(a);
            }
        }/
        // Ahora hay que eliminar del nuevoGrafo los Nodos de grado 0
        for (Nodo nodo : nuevoGrafo.listaNodos()) {
            int grado = 0;
            for (Arista a : nuevoGrafo.listaAristas()) {
                if (a.getV1().igual(nodo) || a.getV2().igual(nodo)) {
                    grado++;
                }
            }
            //si grado=0 se elimina el nodo
            if (grado == 0) {
                nuevoGrafo.eliminarNodo(nodo);
            }
        }
        return nuevoGrafo;
    }

    private Nodo[] listaNodos() {
        return null;
    }

    private Arista[] listaAristas() {
        return null;
    }
    //Ejercicio1
/*Donde es irrelevante la implementación del grafo como matriz de adyacencias
o como lista de adyacencias, se pide lo siguiente:

Para cierta aplicación se ha detectada la necesidad de realizar una operación de listado
del contenido de un grafo dirigido, de acuerdo con ciertas características.

Para ello debe escribir en la clase Grafo un método con la siguiente signatura:
    public void escribirNodos(int grado1, int grado2) { }
que recorra todos los nodos del grafo y escriba por pantalla los nombre de los nodos que
tengan un grado comprendido entre los grados dados, incluidos am-bos.
El grado de un nodo es el número de aristas que entran o salen del mismo.
 */
    public void escribirNodos(int gradio1, int gradio2) {
        Nodo[] listaNodos = listaNodos();
        Arista[] listaAristas = listaAristas();

        for (Nodo nodo : listaNodos) {
            int grado = 0;
            for (Arista a : listaAristas) {
                if (a.getV1().igual(nodo) || a.getV2().igual(nodo)) {
                    grado++;
                }
            }
            int grado1;
            int grado2;
            if (grado > grado1 && grado <= grado2) {
                //se escriben los nombres de los nodos, uno en cada linea junto a su grado
                System.out.println("El nodo " + nodo + " tiene grado " + grado);
            }
        }
    }
}
public class Nodo {
    private String nombre;
    public Nodo(String nombre) {}
    public String getNombre() {}
    public boolean igual(Nodo v) {}
}
public class Arista
{
    private Nodo v1;
    private Nodo v2;
    private int peso;
    public Arista(Nodo v1, Nodo v2, int peso) {}
    public Nodo getV1() {}
    public Nodo getV2() {}
    public int getPeso() {}
}














