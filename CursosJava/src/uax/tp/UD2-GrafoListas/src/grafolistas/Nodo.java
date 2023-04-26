/*
 * Nodo.java
 *
 */

package grafolistas;

/**
 * La clase Nodo representa un nodo de un grafo que tiene un nombre.
 * @author Jesús Sánchez Allende
 */
public class Nodo {
    private final String nombre;

    /**
     * Construye un nuevo nodo con el nombre del mismo.
     * @param nombre Nombre para identificar el nodo
     */
    public Nodo(String nombre) {
        this.nombre=nombre;
    }

    /**
     * Devuelve el nombre del nodo.
     * @return El nombre del nodo
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Devuelve si dos nodos son iguales. Dos nodos se considerar�n iguales
     * si ambos tienen el mismo texto de nombre.
     * @param v El nodo con el que comparar.
     * @return Si son iguales o no.
     */
    public boolean igual(Nodo v) {
        return v.getNombre().equals(this.nombre);
    }

    /**
     * Representa el nodo con su nombre.
     * @return El texto del nombre del nodo.
     */
    @Override
    public String toString(){
        return nombre;
    }
}
