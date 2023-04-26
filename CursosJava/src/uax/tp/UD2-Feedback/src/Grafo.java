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

    /*Limpiar los nodos de grado 0 y el signo de las aristas de peso negativo en un grafo dirigido
    @return un nuevo grafo sin aristas de peso negativo y sin nodos de grado 0
     */
    public Grafo limpieza() {
        //crea un nuevo grafo con el mismo numero de nodos y aristas que el original
        Grafo nuevoGrafo = new Grafo(this.numeroDeNodos());
        //Eliminamos del nuevo grafo los nodos de grado 0
        for (int i = 0; i < this.numeroDeNodos(); i++) {
            if (this.listaNodos()[i].getGrado() != 0) {
                nuevoGrafo.añadirNodo(this.listaNodos()[i]);
            }
        }
        //Cambiamos de signo las aristas de peso negativo
        for (int i = 0; i < this.numeroDeAristas(); i++) {
            if (this.listaAristas()[i].getPeso() < 0) {
                nuevoGrafo.añadirArista(new Arista(this.listaAristas()[i].getV1(), this.listaAristas()[i].getV2(), -this.listaAristas()[i].getPeso()));
            }
        }
        //Eliminamos las aristas que no tienen nodos en el nuevo grafo
        for (int i = 0; i < this.numeroDeAristas(); i++) {
            if (nuevoGrafo.posicionNodo(this.listaAristas()[i].getV1()) == -1 || nuevoGrafo.posicionNodo(this.listaAristas()[i].getV2()) == -1) {
                nuevoGrafo.eliminarArista(this.listaAristas()[i]);
            }
        }
        return nuevoGrafo;
    }
}
public class Nodo {
    private String nombre;
    public Nodo(String nombre) {}
    public String getNombre() {}
    public boolean igual(Nodo v) {}

    public int getGrado() {
    }
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


