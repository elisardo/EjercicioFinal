//public class recorrePrimeroAnchura {}

/* Recorrido de un grafo utilizando un recorrido de Primero en Anchura
 * @retun un array con la lista de nodos utilizando el recorrido en anchura*/

public class recorrePrimeroAnchura {
    public Nodo[] recorrePrimeroAnchura() {
        //lista de nodos a devolver
        Nodo[] lista = new Nodo[numNodos];

        //iniciamos la marca de los nodos a 0
        for (int i=0; i<marca.length; i++) {
            marca[i] = 0;
        }
        //iniciamos el orden de los nodos
        orden = 1;

        //recorrido en anchura
        for(int i=0; i<numNodos; i++){
            if(marca[i] == 0){
                rpa(i);
            }
        }
        //Construimos la lista de nodos en orden recorrido
        for(int i=0; i<marca.length; i++){
            lista[marca[i]-1] = listaNodos[i];
        }
        return lista;
    }
    void rpa(int v){
        //crea cola vacia
        linkedList<Integer> cola = new linkedList();
        //marca el vertice como visitado siguiendo la secuencia de visita
        marca[v] = orden++;
        //inserta v en la cola
        cola.addLast(v);//extrae el primer elemento de la cola
        while(!cola.isEmpty())//mientras la cola no este vacia
        {
            int x=cola.getFirst();//extrae el primer elemento de la cola
            cola.removeFirst();//elimina el primer elemento de la cola
            int y;//sucesores de x
            for(y=0; y<marca.length; y++){
                if((matrizAdy[x][y]!=0) && (marca[y]==0)){
                    marca[y] = orden++;//marca el sucesor como visitado
                    cola.addLast(y);//
                }

            }
        }
    }
