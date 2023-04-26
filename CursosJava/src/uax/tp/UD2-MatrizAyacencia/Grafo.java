/*La clase Grafo impleneta la estructura de datos Grafo, para grafos dirigidos con pesos */
import java.util.*;

public class Grafo {

    private Nodo[] listaNodos=null;
    private int matriAdy[][]=null;
    private int numeroNodosIntro=0;
    private int numNodos;


    /*Construye un grafo con un numero de nodos dado*/
    public Grafo(int numNodos) {
        this.numNodos = numNodos;
        matriAdy = new int[numNodos][numNodos];
        listaNodos = new Nodo[numNodos];

        //Inicializamos la matriz de adyacencia a cero
        for (int i = 0; i < numNodos; i++) {
            for (int j = 0; j < numNodos; j++) {
                matriAdy[i][j] = 0;
            }
        }
    }

    /*Agrega un nodo al grafo
    * @return true si se añade el nodo y false si no caben
    * mas vertices en el grafo debido al tamaño con el que se construyó o si
    * el nodo que se desea añadir ya existe.
    * El nodo queda identificado de forma única por su nombre*/
    public boolean añadirNodo(Nodo nodo) {
        if(this.numeroNodosIntro == numNodos)
            return false;
        if(this.posicionNodo(nodo) != -1)
            return false;

        listaNodos[numeroNodosIntro++] = nodo;
        return true;
    }

    /* Añadir nueva arista al grafo.
    @return true si se añade la arista y false si es entre dos nodos que
    no existen en el grafo o el peso es menor que cero.
    Si la arista ya existe, se actualiza el peso de la arista.*/

    public boolean añadirArista(Arista arista) {
        int v1=posicionNodo(arista.getV1());
        int v2=posicionNodo(arista.getV2());
        int peso=arista.getPeso();

        if(v1<0 || v2<0 || peso<=0)
            return false;

        matriAdy[v1][v2]=peso;
        return true;
    }

    /*Calcular la posicion de un nodo en el orden en que estan colocado en el grafo
    * Es un metodo privado de la clase Grafo pra indizar la matriz de adyacencias
    * @return la posicion de la matriz de adyacencias para dicho nodo y -1 si no se encuentra*/

    private int posicionNodo(Nodo nodo) {
        for (int i = 0; i < numeroNodosIntro; i++) {
            if (listaNodos[i] != null) {
                if (nodo.igual(listaNodos[i]))
                    return i;
            }
        }
        return -1;
    }

    /* Elimina un nodo del grafo
    @return true si se elimina el nodo y false si no existe en el grafo*/

    public boolean eliminarNodo(Nodo nodo) {
        int pos = posicionNodo(nodo);

        if (posicion < 0)
            return false;

        //Mover la matriz hacia arriba
        for (int i = pos + 1; i < numeroNodosIntro; i++) {
            for (int j = 0; j < numeroNodosIntro; j++) {
                matriAdy[i - 1][j] = matriAdy[i][j];
            }
        }
        //Mover la matriz hacia la izquierda
        for (int i = 0; i < numeroNodosIntro - 1; i++) {
            for (int j = pos + 1; j < numeroNodosIntro; j++) {
                matriAdy[i][j - 1] = matriAdy[i][j];
            }
        }
        //Eliminar el nodo de la lista de nodos
        for (int i = pos + 1; i < numeroNodosIntro - 1; i++) {
            listaNodos[i - 1] = listaNodos[i];
        }
        numeroNodosIntro--;
        return true;

    }

    /* Elimina una arista del grafo
    @return true si se elimina la arista y false si no existe en el grafo
     */
    public boolean eliminarArista(Arista arista) {
        int v1 = posicionNodo(arista.getV1());
        int v2 = posicionNodo(arista.getV2());

        if ((v1 < 0 || v2 < 0) || (matriAdy[v1][v2] == 0))
            return false;

        matriAdy[v1][v2] = 0;
        return true;
    }

    /* Devuelve un array con la lista de nodos que tiene el grafo
    El array devuelto es un array completo con los nodos del grafo.
    @return un array con la lista de nodos del grafo
     */

    public Nodo[] listaNodos(){
        for(int i=0;i<numeroNodosIntro;i++){
            Nodos[i]=listaNodos[i];
        }
        return nodos;
    }

    /* Devuelve un array con la lista de aristas que tiene el grafo
    El array devuelto es un array completo con las aristas del grafo.
     */
    public Arista[] listaAristas(){
      int numArista=0;
      Arista[] lista=new Arista[this.numeroDeAristas()];
      for(int i=0;i<numeroNodosIntro;i++){
          for(int j=0;j<numeroNodosIntro;j++){
              if(matriAdy[i][j]>0){
                  lista[numArista++]=a;
              }
          }
      }
      return lista;
    }
    /* Metodo privado para contar el numero de aristas que tiene un grafo*/
    private int numeroDeAristas(){
        int num=0;
        for(int i=0;i<numeroNodosIntro;i++){
            for(int j=0;j<numeroNodosIntro;j++){
                if(matriAdy[i][j]>0){
                    num++;
                }
            }
        }
        return num;
    }



}
