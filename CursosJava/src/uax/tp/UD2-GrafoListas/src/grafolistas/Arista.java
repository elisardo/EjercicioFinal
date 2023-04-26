/*
 * Arco.java
 *
 */
package grafolistas;

/**
 * La clase Arista representa una Arista de un grafo.
 * @author Jesús Sánchez Allende
 */
public class Arista {

    private final Nodo v1;
    private final Nodo v2;
    private final int peso;

    /**
     * Construye una nueva arista a partir de los nodos de origen y destino
     * y el peso de la misma.
     * @param v1 Nodo de origen de la Arista
     * @param v2 Nodo de destino de la arista
     */
    public Arista(Nodo v1, Nodo v2) {
        this.v1 = v1;
        this.v2 = v2;
        this.peso = 0;
    }

    /**
     * Construye una nueva arista a partir de los nodos de origen y destino
     * y el peso de la misma.
     * @param v1 Nodo de origen de la Arista
     * @param v2 Nodo de destino de la arista
     * @param peso Peso de la arista
     */
    public Arista(Nodo v1, Nodo v2, int peso) {
        this.v1 = v1;
        this.v2 = v2;
        this.peso = peso;
    }

    /**
     * Devuelve el nodo de origen de la arista.
     * @return El nodo origen de la arista
     */
    public Nodo getV1() {
        return this.v1;
    }

    /**
     * Devuelve el nodo de destino de la arista
     * @return El nodo de destino de la arista
     */
    public Nodo getV2() {
        return this.v2;
    }

    /**
     * Devuelve el peso de la arista.
     * @return El peso de la arista.
     */
    public int getPeso() {
        return this.peso;
    }

    /**
     * Devuelve un texto que representa la arista en formato de tupla de nodos.
     * @return El texto que representa la arista.
     */
    @Override
    public String toString() {
        return "(" + v1.toString() + ", " + v2.toString() + ")";
    }
}
