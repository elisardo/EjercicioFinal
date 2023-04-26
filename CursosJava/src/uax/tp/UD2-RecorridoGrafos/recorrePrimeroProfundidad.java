/* Recorrido de un grafo de Primero en Profundidad
* @return un array con la lista de nodos utilizando el recorrido en profundidad*/
public Nodo[] recorrePrimeroProfundidad {
    Nodo[]lista=new Nodo[listaNodos.length];

    for(int i=0; i<marca.length; i++){
        if(marca[i]==0)rpp(i);
    }

    //En marca tenemos el orden en que los nodos han sido visitados
    for(int i=0; i<marca.length; i++){
        lista[marca[i]-1]=listaNodos[i];
    }
    return lista;
}

void rpp(int v){
    marca[v]=orden++;
    int w;//sucesores de v
    for(w=0; w<marca.length; w++){
        if((matrizAdy[v][w]!=0) && (marca[w]==0)){
            rpp(w);
        }
    }
}
