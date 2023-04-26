//creamos una array de listas de nodos
import java.util.ArrayList;
import java.util.List;

public class GrafoLista {
    private Nodo[] listaNodos=null; //lista de nodos
    private ArrayList<Nodo>[] listaAdy= null;//lista de adyacencia.Representa el grafo
    private int numNodosIntro=0;//numero de nodos introducidos
    private int numNodos;//numero de nodos del grafo
    int marca[];
    int orden=0;

    public GrafoLista(int numNodos) {
        this.numNodos = numNodos;
        listaAdy = new ArrayList[numNodos];
        listaNodos = new Nodo[numNodos];
    }

    public boolean añadirNodo(Nodo nodo) {
        if(this.numNodosIntro==numNodos){//verificar si caben mas nodos.
            return false;
        }
        if(this.posicionNodo(nodo)==-1){//el nodo ya existe en el grafo
            return false;
        }
        listaAdy[numNodosIntro]=new ArrayList<>();//creamos una lista de nodos
        listaNodos[numNodosIntro]=nodo;//añadimos el nodo
        return true;
    }
    public boolean añadirArista(Arista arista) {//vamos averificar si existen los nodos y si no existen los añadimos
        int v1 = posicionNodo(arista.getV1());//obtener la posicion de nodo origen
        int v2 = posicionNodo(arista.getV2());//obtener la posicion de nodo destino

        if (v1 < 0 || v2 < 0) {//verificar si existen los nodos antes de añadir la arista
            return false;

            ArrayList<Nodo> aux = listaAdy[v1];//obtenemos la lista de nodos de la posicion del nodo origen
            Nodo(Nodo n:aux){//recorremos la lista de nodos de la posicion del nodo origen
                if (n.igual(arista.getV2())) {//verificamos si el nodo ya existe en la lista
                    return false;
                }
            }
            listaAdy[v1].add(arista.getV2());  //añadimos el nodo destino a la lista de nodos de la posicion del nodo origen
            return true;
        }
    }
    private int posicionNodo(Nodo nodo){
            for(int i=0; i<numNodos; i++) {
                if (listaNodos[i] != null) {
                    if (nodo.igual(listaNodos[i])) {
                        return i;
                    }
                    return i;
                }
            }
            return -1;
    }
    public boolean eliminarNodo(Nodo nodo) {
        int pos=posicionNodo(nodo);//verificar si el nodo existe para poder borrarlo
        if(pos<0){
            return false;

        for(int i=0; i<numNodosIntro; i++){
            ArrayList<Nodo> aux = listaAdy[i];//obtenemos la lista de nodos de la posicion del nodo origen
            Nodo nodoAux=null;
            for(Nodo n:listaAux){
                if(n.igual(nodo)){
                    nodoAux=n;
                }
            }
            if(nodoAux !=null){
                listaAux.remove(nodoAux);
            }
        }
        for (int i = pos +1; i < numNodosIntro; i++) {
            listaAdy[i-1] = listaAdy[i];
        }

        for (int i = pos +1; i < numNodosIntro; i++) {
            listaNodos[i-1] = listaNodos[i];
        }

        numNodosIntro--;
        return true
    }
        public boolean eliminarArista(Arista arista) {
            int v1 = posicionNodo(arista.getV1());//obtener la posicion de nodo origen
            int v2 = posicionNodo(arista.getV2());//obtener la posicion de nodo destino
            if(v1<0 || v2<0){
                return false;
            }
            ArrayList<Nodo> aux = listaAdy[v1];//obtenemos la lista de nodos de la posicion del nodo origen
            Nodo nodoAux=null;
            for(Nodo n:listaAux) {
                if (n.igual(arista.getV2())) {
                    nodoAux = n;
                }
                if (nodoAux == null) {
                    return false;

                    aux.remove(nodoAux);
                    return true;
                }
            public Nodo[] listaNodos () {
                Nodo[] nodos = new Nodo[numNodosIntro];
                for (int i = 0; i < numNodosIntro; i++) {
                    nodos[i] = listaNodos[i];
                }
                    return nodos;
            }

             public Arista[] listaAristas () {
                    int numAristas = 0;
                    Arista[] lista = new Arista[this.numeroAristas()];

                    for (int i = 0; i < numNodosIntro; i++) {
                        ArrayList<Nodo> listaAux = listaAdy[i];

                        for (Nodo n : listaAux) {
                            lista[numAristas++] = new Arista(listaNodos[i], n);
                        }
                        return lista;
                    }
                }

  /* marca nodo como visitado
    para todo nodo w sucesor del nodo
        si (el nodo w no está marcado)
            rpp(w)
  *
  *
  * */
             private int numeroAristas(){
                    int num=0;
                    for(int i=0; i< numeroNodoIntro; i++){
                        num+=listaAdy[i].size();
                    }
                    return num;
                    }
             int marca[numNodos]=Arrays.

                public Nodo[] recorrerPrimeroProfundidad(){
                    Nodo [] lista = new Nodo[this.numNodos];

                    for(int i=0; i< marca.length  ; i++){
                        if(marca[i]==0) rpp(i);
                    }
                }

                    }
        void rpp(int v){//algoritmo de recorrido primero profundidad. nodos hijos.
            marca[v]=orden++;
            int w;
            for(w=0; w< marca.length; w++){
                if((matrizAdy[v][w] !=0) && marca[w]==0)
                    rpp(w);
            }
            }
          //algoritmo de recorrido primero anchura
          public Nodo[] recorrerPrimeroAnchura(){//lista de nodos a devolver
              Nodo [] lista = new Nodo[numNodos];
              //Inicializa marca
              for(int i=0; i< marca.length; i++){
                  if (marca[i]==0);
              }
              //Inicializa orden
            orden=1;

              //Recorrido en ancchura
            for(int i=0; i<numNodos;i++){
                if(marca[i]==0) rpa(i);
            }

              //Construimos lista de nodos en orden de recorrido
            for (int i=0; i< marca.length; i++){
                lista[marca[i]-1]=listaNodos[i];
            }
            return lista;}

        void rpa(int v){//algoritmo de recorrido primero anchura. nodos hermanos
                //crea cola vacia
                LinkedList<Integer> cola = new LinkedList();
        // Marca el vertice como visitado siguiendo la secuencia de visita
                marca[v]=orden++;
         //Inserta v en la cola vacia
                cola.addLast(v);
                while(!cola.isEmpty()) //Mientras la cola no este vacia
                {
                    int x=cola.getFirst(); //Extrae el primer elemento de la cola
        //Para los nodos adyacentes
                for(y=0; y<marca.length; y++){
                    if ((matrizAdy[x][y] !=0) && marca[y]==0)
                    {
                        marca[y]=orden++;//Marca el nodo como visitado
                        cola.addLast(y);//Inserta el nodo en la cola
                    }
                }
                }
    }
}
