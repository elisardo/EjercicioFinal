//TAD Arista
//- Construir una arista con dos nodos
//Construir una arista con dos nodos y el peso
//Devolver primero el nodo inicial
//Devolver segundo el nodo final
//Devolver el peso de la arista

public class Arista {


    private Nodo v1;
    private Nodo v2;
    private int peso;

    public Arista(Nodo v1, Nodo v2) {
        this.v1 = v1;
        this.v2 = v2;
        this.peso = 0;//si no nos especifican el peso, implica qie no tiene peso pasar por este arco
    }
    public Arista(Nodo v1, Nodo v2, int peso) {
        this.v1 = v1;
        this.v2 = v2;
        this.peso = peso;
    }
    public Nodo getV1() {
        return v1;
    }

    public Nodo getV2() {
        return v2;
    }

    public int getPeso() {
        return peso;
    }

    public String toString(){
        return "(" + v1 + "." + v2 + ") ";//nos dibuja la arista
    }
}
