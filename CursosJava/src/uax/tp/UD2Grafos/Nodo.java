//TAD Grafo
/*
* G = (V, A)
* Nodo
* -Construir un nodo dado un nombre
* -Obtener el nombre del nodo
* */
public class Nodo {
    private String nombre;

    // construye un nuevo nodo con el nombre
    public Nodo(String nombre) {
        this.nombre = nombre;
    }
//devuelve el nombre del nodo
    public String getNombre() {
        return nombre;
    }
    public boolean igual(Nodo v){   //compara si hay dos nodos iguales
        return v.getNombre().equals(this.nombre);
    }
    public String toString(){
        return nombre;
    }
}
