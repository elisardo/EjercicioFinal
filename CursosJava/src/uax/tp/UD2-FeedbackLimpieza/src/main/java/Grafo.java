public class Grafo {
    public Grafo(int numNodos) {}

    public Grafo() {

    }

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
    public Grafo limpieza (int valor) {
        Grafo nuevoGrafo = new Grafo(numeroDeNodos());

        // Primero copio todos los Nodos
        for(Nodo nodo: listaNodos()){
            nuevoGrafo.añadirNodo(nodo);
        }
        // Copio todas las aristas con peso >= valor
        for(Arista a: listaAristas()){
            if(a.getPeso() >= valor){
                nuevoGrafo.añadirArista(a);
            }
        }

        // Ahora hay que eliminar del nuevoGrafo los Nodos de grado 0
        for(Nodo nodo: nuevoGrafo.listaNodos()){
            int grado = 0;
            for(Arista a: nuevoGrafo.listaAristas()){
                if(a.getV1().igual(nodo) || a.getV2().igual(nodo)){
                    grado++;
                }
            }

            // Si grado = 0 se elimina el nodo
            if(grado == 0){
                nuevoGrafo.eliminarNodo(nodo);
            }
        }

        return nuevoGrafo;
    }

    public void limpieza() {
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


