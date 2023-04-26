/*
 * Grafo.java
 *
 */
/**
 * La clase Grafo implementa la estructura de datos Grafo, para grafos dirigidos con pesos.
 * @author Jesús Sánchez Allende
 *
 */
package grafo;

import java.util.*;

public class Grafo {

    private Nodo[] listaNodos=null;
    private int matrizAdy[][]=null;
    private int numeroNodosIntro=0;
    private final int numNodos;
    
    //Atributos para recorrido de grafos
    private final int marca[];
    private int orden=1;

    /**
     * Construye un nuevo grafo con el número máximo de nodos indicado
     * @param numNodos El número de nodos máximo para el grafo.
     */
    public Grafo(int numNodos) {
        this.numNodos = numNodos;
        matrizAdy = new int[numNodos][numNodos];
        listaNodos = new Nodo[numNodos];
        
        marca=new int[numNodos];
        
        // Inicialización de la matriz a infinto
        for (int i = 0; i < numNodos; i++) {
            for (int j = 0;j< numNodos; j++) {
                matrizAdy[i][j]=0;
            }
        }
    }
    
    /**
     * Añade un nuevo nodo al grafo.
     * @param nodo El nuevo nodo que se desea añadir.
     * @return true si se añade el nodo, false si ya no caben
     * más vértices en el grafo debido al tamaño con el que se construyó, o si
     * el nodo que se desea añadir ya existe. El nodo queda identificado
     * de forma única por su nombre.
     */
    public boolean añadirNodo(Nodo nodo) {
        if (this.numeroNodosIntro == numNodos)
            return false;
        if (this.posicionNodo(nodo)!=-1)
            return false;
        
        listaNodos[numeroNodosIntro++] = nodo;
        return true;
    }

    /**
     * Añade una nueva arista al grafo.
     * @param arista La arista que se desea añadir
     * @return true si se añade la arista, false si la arista es entre nodos
     * que no están en el grafo o el peso es menor que cero.
     * Si la arista ya existe se sustituye el peso de la arista que hubiese. 
     */
    public boolean añadirArista(Arista arista){
        int v1 = posicionNodo(arista.getV1());
        int v2 = posicionNodo(arista.getV2());
        int peso = arista.getPeso();
        
        if ((v1 < 0) || (v2 < 0)  || (peso <= 0) )
            return false;
        
        matrizAdy[v1][v2]=peso;
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
        
        // Mover la matriz hacia arriba
        for(int i = pos + 1; i < numeroNodosIntro; i++){
            for(int j = 0; j < numeroNodosIntro; j++){
                matrizAdy[i - 1][j] = matrizAdy[i][j];
            }
        }
        
        // Mover la matriz hacia la izquierda
        for(int i = 0; i < numeroNodosIntro - 1; i++){
            for(int j = pos  + 1; j < numeroNodosIntro; j++){
                matrizAdy[i][j - 1] = matrizAdy[i][j];
            }
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
        
        if ((v1 < 0) || (v2 < 0) || (matrizAdy[v1][v2] == 0))
            return false;
        
        matrizAdy[v1][v2] = 0;
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
        for (int i=0;i < numeroNodosIntro; i++) {
            for (int j=0;j < numeroNodosIntro; j++) {
                if (matrizAdy[i][j]>0) {
                    Arista a = new Arista(listaNodos[i], listaNodos[j], matrizAdy[i][j]);
                    lista[numArista++]=a;
                }
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
        for (int i=0;i < numeroNodosIntro; i++) {
            for (int j=0;j < numeroNodosIntro; j++) {
                if (matrizAdy[i][j]>0)
                    num++;
            }
        }
        return num;
    }
    
   
    /**
     * Método que calcula el camino mínimo desde el primer nodo del grafo a un
     * cierto nodo de destino. Para ello utiliza el camino mínimo de Dijkstra.
     * @param destino El nodo hasta el que se quiere calcular el camino mínimo.
     * @return Un array con todos los nodos que componen el camino en sentido inverso.
     */
    public Nodo[] caminoMinimoDijkstra(Nodo destino){
        //V= Conjunto de nodos del grafo
        //S= Conjunto de nodos escogidos
        //El camino se calcula desde 0 al resto de nodos.
        
        //Array donde se almacenan los caminos mínimos desde 0.
        int[] D = new int[numNodos];
        
        // Array con el camino por el que pasa cada nodo v
        int[] P = new int[numNodos];
        
        // Array de	nodos seleccionados
        boolean[] S = new boolean[numNodos];
        
        // Matriz de Adyacencia
        int C[][] = matrizAdy;
        
        // Incializacion de D[], p[] y s[]
        for (int i = 1; i < numNodos ;i++) {
            // Se inicaliza la distancia mínima desde 0 al resto de los nodos.
            D[i] = C [0][i];
            // array de camino minimo
            P[i]=0;
            //vertices seleccionados
            S[i]= false;
        }
        
        S[0]=true;	//s={0} El vertice 0 ya se ha seleccionado
        
        
        //Bucle de numNodos-1 iteracione para D[]
        for (int i = 1; i < numNodos-1;i++) {
            //Elegir primer nodo no seleccionado
            int w =1;
            while(S[w]) {
                w ++;
            }
            
            //Elegir w en V-S tal que D[w] sea minimo
            for (int j=1; j< numNodos; j++) {
                if (!(S[j]) && (D[j] < D[w])) {
                    w = j;
                }
            }
            
            S[w] = true; // s=s+w
            
            // Para el resto de nodos. Es decir para
            // los que todavía no se han estudiado (V-S).
            // Se comprueba si el camino al origen seria mas
            // corto si se pasara por el nodo w
            
            for (int v = 1; v < numNodos; v++) {
                if (!S[v] && (D[v] > (D[w] + C[w][v]))) {
                    D[v] = (D[w]+ C[w][v]);
                    P[v]=w;
                }
            }
        }
        
        // Calculo del Camino
        
        int posicionOrigen=0;
        int posicionDestino=posicionNodo(destino);
        // Lista de nodos que forman el camino (en orden inverso)
        Nodo[] listaCamino=new Nodo[listaNodos.length];
        int indice=0;
        
        //Almacenar Nodo Destino
        listaCamino[indice++]=listaNodos[posicionDestino];
        
        boolean fin=false;
        while(!fin) {
            if(P[posicionDestino]==posicionDestino) fin=true;
            else {
                posicionDestino = P[posicionDestino];
                listaCamino[indice++]=listaNodos[posicionDestino];
            }
        }
        
        return listaCamino;
    }
    
    /**
     * Recorrido del grafo utilizando un recorrido de primero en anchura.
     * @return Un array con la lista de nodos utilizando el recorrido en anchura.
     */
    public Nodo[] recorrePrimeroAnchura() {
        
        /*Lista de nodos a devolver */
        Nodo[] lista=new Nodo[numNodos];
        
        /* Inicializa marca*/
        for( int i=0; i< marca.length; i++) {
            marca[i]=0;
        }
        /*Inicializa orden */
        orden=1;
        /*Recorrido en anchura */
        for( int i=0; i< numNodos; i++) {
            if (marca[i]==0) rpa(i);
        }
        
        // Ahora en marca tenemos el orden en que
        // los nodos han sido visitados
        
        for( int i=0; i< marca.length; i++) {
            System.out.println(marca[i]);
        }
        /* Construimos la lista de nodos en orden recorrido */
        for( int i=0; i< marca.length; i++) {
            lista[marca[i]-1]=listaNodos[i];
        }
        
        return lista;
    }
    
    void rpa(int v) {
        /* Crea Cola vacia */
        LinkedList<Integer> cola= new LinkedList();
        /* Marca el vertice como visitado siguiendo la secuencia de visita*/
        marca[v]=orden++;
        /* Inserta v en la cola */
        cola.addLast(v);//inserta en Cola
        while(!cola.isEmpty()) //mientras la cola no este vacia
        {
            int x = cola.getFirst(); //extrae primer elemento
            cola.removeFirst(); //elimina primer elemento
            int y;//  nodos adyacentes
            //Para los nodos adyacentes
            for(y=0; y<marca.length; y++) {
                if ((matrizAdy[x][y] != 0) && marca[y] == 0) {
                    marca[y]=orden++;// marca el nodo como visitado
                    cola.addLast(y);//inserta en Cola
                }
            }
        }
        
        
    }
    
    
    /**
     * Recorrido del grafo utilizando un recorrido de primero en profundidad.
     * @return Un array con la lista de nodos utilizando el recorrido en profundidad.
     */
    public Nodo[] recorrePrimeroProfundidad() {
        
        Nodo[] lista=new Nodo[listaNodos.length];
        
        for( int i=0; i< marca.length; i++) {
            if (marca[i]==0) rpp(i);
        }
        
        // Ahora en marca tenemos el orden en que
        // los nodos han sido visitados
        
        for( int i=0; i< marca.length; i++) {
            System.out.println(marca[i]);
        }
        
        for( int i=0; i< marca.length; i++) {
            lista[marca[i]-1]=listaNodos[i];
        }
        
        return lista;
    }
    
    void rpp(int v) {
        marca[v]=orden++;
        int w;//  adyacentes
        for(w=0; w < marca.length; w++) {
            if ((matrizAdy[v][w] != 0) && marca[w] == 0){
                rpp(w);
            }
        }
    }

}