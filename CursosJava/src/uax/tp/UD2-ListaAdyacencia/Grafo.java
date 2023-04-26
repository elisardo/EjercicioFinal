/* La clase Grafo implementa la estructura de datos Grafo para grafos dirigidos sin peso*/
import java.util.*;

public class Grafo {

    private Nodo[] listaNodos=null;
    private ArrayList<Nodo>[] listaAdy=null;
    private int numeroNodosIntro=0;
    private int numNodos=0;

    //Constructor para un nuevo grafo con los nodos indicados
    public Grafo(int numNodos) {
        this.numNodos=numNodos;
        listaAdy=new ArrayList[numNodos];
        listaNodos=new Nodo[numNodos];
    }

    //Añadir un nuevo nodo al grafo. @return true si se ha podido añadir, false en caso contrario
    public boolean añadirNodo(Nodo nodo){
        if(this.numeroNodosIntro==numNodos)
            return false;
        if(this.posicionNodo(nodo)==-1)
           return true;

        listaAdy[numeroNodosIntro]=new ArrayList<>();
        listaNodos[numeroNodosIntro++]=nodo;
        return true;
    }

    //Añadir una arista al grafo. @return true si se ha podido añadir, false en caso contrario
    public boolean añadirArista(Arista arista){
        int v1=posicionNodo(arista.getV1());
        int v2=posicionNodo(arista.getV2());

        if(v1<0 || v2<0)
            return false;

        //se busca si la arista ya existe
        ArrayList<Nodo> aux=listaAdy[v1];
        Nodo nodoAux=null;
        for(Nodo n:aux){
            if(n.igual(arista.getV2()))
                return false;
            }
        listaAdy[v1].add(arista.getV2());
        return true;
        }
    //Calcula la posicion de un nodo en el orden en que estan colocados en el grafo
    private int posicionNodo(Nodo nodo) {
        for (int i = 0; i < numeroNodosIntro; i++) {
            if (listaNodos[i] != null) {
                if (nodo.igual(listaNodos[i]))
                    return i;
            }
        }
        return -1;
    }
    //Eliminar un nodo de un grafo
    public boolean eliminarNdo(Nodo nodo) {
        int pos = posicionNodo(nodo);

        if (pos < 0)
            return false;
        //Recorre todas las listas eliminando las veces que aparece el nodo
        for (int i = 0; i < numeroNodosIntro; i++) {
            Arraylist<Nodo> listaAux = listaAdy[i];
            Nodo nodoAux = null;
            for (Nodo n : listaAux) {
                if (n.igual(nodo)) {
                    nodoAux = n;
                }
            }
            if (nodoAux != null) {
                listaAdy[i].remove(nodoAux);
            }
            //Elimina el nodo de la lista de Adyacencias
            for (int i = pos + 1; i < numeroNodosIntro; i++) {
                listaAdy[i - 1] = listaAdy[i];
            }
            //Elimino el nodo de la lista de nodos
            for (int i = pos + 1; i < numeroNodosIntro; i++) {
                listaNodos[i - 1] = listaNodos[i];
            }
            numeroNodosIntro--;
            return true;

        }

    }
    //Eliminar un nodo del grafo
    public boolean eliminarNodo(Nodo nodo){
        int pos = posicionNodo(nodo);

        if (pos < 0)
            return false;
        //Recorre todas las listas eliminando las veces que aparece el nodo
        for (int i = 0; i < numeroNodosIntro; i++) {
            Arraylist<Nodo> listaAux = listaAdy[i];
            Nodo nodoAux = null;
            for (Nodo n : listaAux) {
                if (n.igual(nodo)) {
                    nodoAux = n;
                }
            }
            if (nodoAux != null) {
                listaAdy[i].remove(nodoAux);
            }
            //Elimina el nodo de la lista de Adyacencias
            for (int i = pos + 1; i < numeroNodosIntro; i++) {
                listaAdy[i - 1] = listaAdy[i];
            }
            //Elimino el nodo de la lista de nodos
            for (int i = pos + 1; i < numeroNodosIntro; i++) {
                listaNodos[i - 1] = listaNodos[i];
            }
            numeroNodosIntro--;
            return true;
    }
        //Eliminar una arista del grafo
    public boolean eliminarArista(Arista arista){
        int v1=posicionNodo(arista.getV1());
        int v2=posicionNodo(arista.getV2());

        if(v1<0 || v2<0)
            return false;

        //se busca si la arista ya existe
        ArrayList<Nodo> aux=listaAdy[v1];
        Nodo nodoAux=null;
        for(Nodo n:aux){
            if(n.igual(arista.getV2()))
                nodoAux=n;
        }
        if(nodoAux==null)
            return false;
        aux.remove(nodoAux);
        return true;
    }
        //Devolver una lista con todos los nodos del grafo
        public Nodo[]listaNodos(){
            Nodo[]nodos= new Nodo[numeroNodosIntro];
            for(int i=0;i<numeroNodosIntro;i++){
                nodos[i]=listaNodos[i];
            }
            return nodos;
        }
        //Devolver una lista con todas las aristas del grafo
        public Arista[]listaAristas(){
            int numArista=0;
            Arista[] lista=new Arista[this.numeroDeAristas()];

            //Recorre todas las listas contando aristas
        for(int i=0;i<numeroNodosIntro;i++){
                Arraylist<Nodo> listaAux=listaAdy[i];
                for(Nodo n:listaAux){
                    lista[numArista++]=new Arista(listaNodos[i],n);
                }
            }
            return lista;
        }

        //Devolver el numero de aristas del grafo
        public int numeroDeAristas() {
            int num = 0;

            //Recorre todas las listas contando aristas
            for (int i = 0; i < numeroNodosIntro; i++) {
                num += listaAdy[i].size();
            }
            return num;
        }

}
