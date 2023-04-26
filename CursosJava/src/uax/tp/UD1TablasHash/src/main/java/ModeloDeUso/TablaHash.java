package ModeloDeUso;
import java.util.ArrayList;

import java.util.Hashtable;

public class TablaHash <E,K>{//tabla generica con 2 obj. E define el objeto. K define el tipo de clave
}

    /**
     * Insertar un elemento con su clave en la tabla hash. Si ya existe un elemento
     * con dicha clave no se inserta y devuelve false. Si la tabla supera el
     * factor de carga límite, se amplía la tabla y se hace un rehash.
     * @param dato El dato que se quiere guardar
     * @param clave La clave del dato a guardar.
     * @return true si se ha insertado correctamente y false en caso contrario.
     */
    public boolean insertar(E dato, K clave){
    }

    /**
     * Busca el dato que corresponde con la clave dada
     * @param clave La clave del dato que se quiere.
     * @return El elemento de la tabla que tiene la clave buscada. Si no existe
     * devuelve null.
     */
    public E buscar(K clave){
    }

    /**
     * Elimina de la tabla el dato que corresponde con la clave.
     * @param clave La clave del dato que se desea eliminar.
     * @return true si el elemento se encontró y borró y false en caso contrario.
     */
    public boolean borrar(K clave){
    }

    private int fHash(int clave){
        return clave % tabla.length;
    }

    private int fHash(int clave){
        return (clave * clave) % tabla.length;
    }

    private int fHash(String clave){
        int hash = 0;
        for(char c: clave.toCharArray()){
            hash += c;
        }
        return hash % tabla.length;
    }

    private int fHash(String clave){
        int hash = 0;
        for(char c: clave.toCharArray()){
            hash += (31*hash + c) % tabla.length;
        }
        return hash;
    }






