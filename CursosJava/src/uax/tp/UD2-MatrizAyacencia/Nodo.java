/* La clase Nodo representa un nodo de un grafo que tiene un nombre*/

public class Nodo {
    private String nombre;


    /* Construye un nuevo nodo con el nombre del mismo*/
    public Nodo(String nombre) {
        this.nombre = nombre;
    }

    /*Devuelve el nombre del nodo*/
    public String getNombre() {
        return nombre;
    }

    /*Devuelve si dos nodos son iguales.
     * Dos nodos son iguales si ambos tienen el mismo texto de nombre
     * @param v El nodo con el que comparar
     * @return si son iguales o no*/
    public boolean igual(Nodo v) {
        return v.getNombre().equals(this.nombre);
    }

    /*Representa el nodo con su nombre*/
    public String toString() {
        return nombre;
    }
}
