/*
 * Grafo.java
 *
 */
/**
 * La clase Grafo implementa la estructura de datos Grafo, para grafos dirigidos sin pesos.
 * @author Jesús Sánchez Allende
 *
 */
package grafolistas;

import java.util.*;

public class Grafo {

    private Nodo[] listaNodos=null;
    private ArrayList<Nodo>[] listaAdy=null;
    private int numeroNodosIntro=0;
    private final int numNodos;
    
    /**
     * Construye un nuevo grafo con el número máximo de nodos indicado
     * @param numNodos El número de nodos máximo para el grafo.
     */
    public Grafo(int numNodos) {
        this.numNodos = numNodos;
        listaAdy = new ArrayList[numNodos];
        listaNodos = new Nodo[numNodos];
    }
    
    /**
     * Añade un nuevo nodo al grafo.
     * @param nodo El nuevo nodo que se desea añadir.
     * @return true si se añade el nodo, false si ya no caben
     * más nodos en el grafo debido al tamaño con el que se construyó, o si
     * el nodo que se desea añadir ya existe. El nodo queda identificado
     * de forma única por su nombre.
     */
    public boolean añadirNodo(Nodo nodo) {
        if (this.numeroNodosIntro == numNodos)
            return false;
        if (this.posicionNodo(nodo)!=-1)
            return false;

        listaAdy[numeroNodosIntro] = new ArrayList<>();
        listaNodos[numeroNodosIntro++] = nodo;
        return true;
    }

    /**
     * Añade una nueva arista al grafo.
     * @param arista La arista que se desea añadir
     * @return true si se añade la arista, false si la arista es entre nodos
     * que no están en el grafo.
     */
    public boolean añadirArista(Arista arista){
        int v1 = posicionNodo(arista.getV1());
        int v2 = posicionNodo(arista.getV2());
        
        if ((v1 < 0) || (v2 < 0))
            return false;

        // Se busca si la arista ya estaba.
        ArrayList<Nodo> aux = listaAdy[v1];
        Nodo nodoAux = null;
        for(Nodo n:aux){
            if(n.igual(arista.getV2()))
                return false;
        }
        
        listaAdy[v1].add(arista.getV2());
        return true;
    }
    
    /**
     * Calcula la posición de un nodo en el orden en que están colocados.
     * Es un método privado de la clase Grafo para indizar la matriz de adyacencias.
     * @param nodo El nodo que se desea buscar
     * @return La posición en la matriz de adyacencias para dicho nodo o
     *  -1 si no se encuentra.
     */
    private int  posicionNodo(Nodo nodo) {
        for (int i=0;i< numNodos; i++) {
            if (listaNodos[i]!=null) {
                if (nodo.igual(listaNodos[i]))
                    return i ;
            }
        }
        return -1;
    }

    /**
     * Elimina un nodo del grafo
     * @param nodo El nodo que se desea eliminar
     * @return false si el nodo no existe en el grafo.
     */
    public boolean eliminarNodo(Nodo nodo){
        int pos = posicionNodo(nodo);
        
        if(pos < 0)
            return false;
        
        // Recorre todas las listas eliminando las veces que aparece.
        for(int i = 0; i < numeroNodosIntro; i++){
            ArrayList<Nodo> listaAux = listaAdy[i];
            Nodo nodoAux = null;
            for(Nodo n:listaAux){
                if(n.igual(nodo)){
                    nodoAux = n;
                }
            }
            if(nodoAux != null)
                listaAdy[i].remove(nodoAux);
        }
        
        // Elimina el nodo de la lista de Adyacencias
        for(int i = pos + 1; i < numeroNodosIntro; i++){
            listaAdy[i -1] = listaAdy[i];
        }

        // Elimino el nodo de la lista de nodos
        for(int i = pos + 1; i < numeroNodosIntro; i++){
            listaNodos[i - 1] = listaNodos[i];
        }
        
        numeroNodosIntro--;
        return true;
    }

    /**
     * Elimina una arista del grafo
     * @param arista La arista a eliminar
     * @return false si la arista no existe en el grafo.
     */
    public boolean eliminarArista(Arista arista){
        int v1 = posicionNodo(arista.getV1());
        int v2 = posicionNodo(arista.getV2());
        
        if ((v1 < 0) || (v2 < 0))
            return false;

        // Recorro la lista a partir de v1 para ver si está.
        ArrayList<Nodo> aux = listaAdy[v1];
        Nodo nodoAux = null;
        for(Nodo n:aux){
            if(n.igual(arista.getV2()))
                nodoAux = n;
        }
        if(nodoAux == null)
            return false;
        
        aux.remove(nodoAux);
        return true;
    }
    
    /**
     * Devulve un array con la lista de nodos que tiene el grafo. El array que
     * devuelve es un array completo con los nodos del grafo.
     * @return Un array lleno con todos los nodos del grafo.
     */
    public Nodo[] listaNodos() {
        Nodo[] nodos = new Nodo[numeroNodosIntro];
        for (int i = 0; i < numeroNodosIntro; i++) {
            nodos[i] = listaNodos[i];
        }
        return nodos;
    }

    /**
     * Devuelve un array con la lista de Aristas del grafo.
     * @return Un array lleno con todas las aristas del grafo.
     */
    public Arista [] listaAristas() {
        int numArista=0;
        Arista[] lista=new Arista[this.numeroDeAristas()];

        // Recorre todas las listas contando las aristas.
        for(int i = 0; i < numeroNodosIntro; i++){
            ArrayList<Nodo> listaAux = listaAdy[i];
            for(Nodo n:listaAux){
                lista[numArista++]=new Arista(listaNodos[i], n);
            }
        }
        return lista;
    }

    /**
     * Método privado para contar el número de aristas que tiene el grafo.
     * @return El número de aristas del grafo.
     */
    private int numeroDeAristas() {
        int num=0;

        // Recorre todas las listas contando las aristas.
        for(int i = 0; i < numeroNodosIntro; i++){
            num += listaAdy[i].size();
        }
        return num;
    }
   
}