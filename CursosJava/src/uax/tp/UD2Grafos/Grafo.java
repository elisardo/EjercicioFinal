/*
* TAD GRAFO
* -Construir un grafo de tamaño determinado para el num de nodos
* -Añadir nodo al grafo
* -Añadir una arista al grafo solo si existen los nodos y si existe la arista se actualiza el peso
* -Eliminar el un nodo. Si el nodo existe se elimina el nodo y todas las aristas que lo conectan. Si no exite false
* -Eliminar una arista. Verificar que la arista existe. False si no existe
* -Devolver una lista de nodos
* -Devolver una lista de aristas del grafo
*
*  */


public class Grafo {//crear una matriz de nodos
    private Nodo[] listaNodos=null; //lista de nodos
    private int matrizAdy[][]= null;//matriz de adyacencia.Representa el grafo
    private int numNodosIntro=0;//numero de nodos introducidos
    private int numNodos;//numero de nodos del grafo


    public Grafo(int numNodos) {
        this.numNodos = numNodos;
        listaNodos = new Nodo[numNodos];
        matrizAdy = new int[numNodos][numNodos];

        for(int i=0; i<numNodos; i++){//rellenar la matriz de adyacencia con "0"
            for(int j=0; j<numNodos; j++){
                matrizAdy[i][j]=0;
            }
        }

    }
/*añadir nuevo nodo al grafo
* true si se añade el nodo. False si ya no caben mas nodos
* más vertices en el grafo debido al tamaño de la matriz
* o si * el nodo ya existe
* */

    public boolean añadirNodo(Nodo nodo) {
        if(this.numNodosIntro==numNodos){//no caben mas nodos
            return false;
        }
        if(this.posicionNodo(nodo)!=-1){//el nodo ya existe en el grafo
            return false;
        }
        listaNodos[numNodosIntro++]=nodo;//si no esta en el grafo lo añadimos
        return true;
    }

    public boolean añadirArista(Arista arista) {//vamos averificar si existen los nodos y si no existen los añadimos
        int v1=posicionNodo(arista.getV1());//no podemos encontrar -1
        int v2=posicionNodo(arista.getV2());
        int peso=arista.getPeso();

        if(v1<0 || v2<0) || (peso<=0){  //si es -1 o el peso es menor o igual a 0 no existe el nodo.
            return false;
        }
    }

        return false;
    }

    public boolean eliminarNodo(Nodo nodo) {
        return false;
    }

    public boolean eliminarArista(Arista arista) {
        return false;
    }

    public Nodo[] listaNodos{return null;}
    public Arista[] listaAristas{return null;}

    private  int posicionNodo(Nodo nodo){
        for(int i=0; i<numNodos; i++){ //recorrer el array para buscar el elemento
            if(listaNodos[i] !=null){//si el elemento no es null
                if(nodo.igual(listaNodos[i])){//comparar el elemento con el nodo
                    return i;//devuelve la posicion del nodo
                }
        }
        return -1;//si no esta en el grafo devuelve -1
    }
}
