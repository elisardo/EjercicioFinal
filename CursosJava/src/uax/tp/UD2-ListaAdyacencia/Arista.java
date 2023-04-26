/* La clase Arista representa una Arista de un grafo */

public class Arista {
    private Nodo v1;
    private Nodo v2;
    private int peso;

    /* Construye una nueva arista con los nodos origen y destino y sin peso */
    public Arista(Nodo v11, Nodo v2, int peso) {
        this.nodo1 = v1;
        this.nodo2 = v2;
        this.peso = 0;
    }

    /* Construye un arista con los nodos origen y destino y con el peso dado */
    public Arista(Nodo v1, Nodo v2, int peso) {
        this.nodo1 = v1;
        this.nodo2 = v2;
        this.peso = peso;
    }

    /* Devuelve el nodo origen de la arista */
    public Nodo getV1() {
        return this.v1;
    }

    /* Devuelve el nodo destino de la arista */
    public Nodo getV2() {
        return this.v2;
    }

    /* Devuelve el peso de la arista */
    public int getPeso() {
        return this.peso;
    }

    /*Devuelve un texto que representa la arista un formato de tupla de nodos */
    public String toString() {
        return "(" + v1.toString() + "," + v2.toString() + ")";
    }
}
