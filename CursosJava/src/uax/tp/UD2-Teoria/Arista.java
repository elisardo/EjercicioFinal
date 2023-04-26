//Estuctura básica para grafos-Aristas con peso y nodos origen y destino
public class Arista {
    private Nodo v1;
    private Nodo v2;
    private int peso;
    /*Construye una nueva arista con dos nodos, si es un grafo dirigido el primero
    es el nodo origen y el segundo el destino.*/
    public Arista(Nodo v1, Nodo v2){}

    /* Construye una nueva arista con dos nodos y el peso. Si es un grafo dirigido
    * el primero es de origen y el segundo de destino */
    public Arista(Nodo v1, Nodo v2, int peso){}

    /* Devuelve el nodo origen de la arista */
    public Nodo getV1(){
        return v1;
    }

    /* Devuelve el nodo destino de la arista */
    public Nodo getV2(){
        return v2;
    }

    /* Devuelve el peso de la arista */
    public int getPeso(){
        return peso;
    }
}
