package ejercicio_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.HashMap;

public class RellenarTablaAbierta<E,K> {
// declarar variables

  public interface CeldaHash<E, K> {
      Object getClave();

      default void isBorrado() {

      }
  }


    private CeldaHash<E,K>[] tabla;
    private int numElementos;//nos da el tamaño de la tabla
    private final int FC = 3;//factor de carga
    private void rehash(){
        CeldaHash<E,K>[] tablaAntigua = tabla;
        tabla = new CeldaHash[tabla.length*2+1];//crea una tabla de doble tamaño+1
        numElementos = 0;//reinicia el numero de elementos
        for(CeldaHash<E,K>celda:tablaAntigua){
            if(celda!=null && |celda.isBorrado() ){
                insertar(celda.getDato(),celda.getClave());
            }
        }
    }
    public boolean insertar(E dato,K clave){
        if (dato==null || clave==null){//no se admite nulos
            return false;
        }
        if(buscar(clave)!=null){//se inseta si no existe en la tabla
            return false;
        }
        if((numElementos+1)*100/tabla.length>FC){//si superamos el factor de carga, rehash
            rehash();
        }
 //       int hash = fHash(clave);
 //       int pos=hash;
        int pos = fHash(clave);
        if(tabla[pos]==null){
            tabla[pos]=new ArrayList<>();
        }
        tabla[pos].add(new CeldaHash<>(dato,clave));
        numElementos++;
        return true;
    }
 /*
        int colision=0;
        while((tabla[pos]!=null) && !tabla[pos].isBorrado()){
            if(tabla[pos].getClave().equals(clave)){
                return false;
            }
            colision++;
            pos=(hash+colision*colision)%tabla.length;
        }
        tabla[pos]=new CeldaHash<E,K>(dato,clave);
        numElementos++;
        return true;
    }

  */
    public E buscar(K clave){
        if(clave==null){
            return null;
        }
        int pos = fHash(clave);
        if(tabla[pos]==null){
            return null;
        }
        for(CeldaHash<E,K>celda:tabla[pos]){//recorremos el array de celdas
            if(celda.getClave().equals(clave)){
                return celda.getDato();
            }
        }
        return null;
    }

    private int fHash(K clave) {
        return 0;
    }

    public boolean borrar (K clave){
        if(clave==null){
            return false;
        }
        int pos = fHash(clave);
        if(tabla[pos]==null){
            return false;
        }
        CeldaHash<E,K> celdaAux = null;
        for(CeldaHash<E,K>celda:tabla[pos]){//recorremos el array de celdas
            if(celda.getClave().equals(clave)){
                celdaAux=celda;
            }
        }
        if(celdaAux==null){
            tabla[pos].remove(celdaAux);
            return false;
        }
        return false;
    }
    private void rehash(){
        ArrayList<CeldaHash<E,K>> tablaAntigua[] = tabla;
        tabla=new ArrayList[tabla.length*2+1]; //crea una tabla de doble tamaño+1
        numElementos = 0;//reinicia el numero de elementos
        for(ArrayList<CeldaHash<E,K>> array:tablaAntigua){
            if(array!=null){
                for(CeldaHash<E,K>celda:array){
                    insertar(celda.getDato(),celda.getClave());
                }
            }
        }
    }
    private static final int SIZE = 17;

    public static void main(String[] args) {

        final int[] hashTable = new int[SIZE];
        final int[] values = { 9332, 4569, 2231, 7810, 5554, 3852, 4041, 5699, 1209, 6693 };

        Arrays.fill(hashTable, -1);

        fill_hash_table(hashTable, values);

    }

    private static int f_hash(final int n) {

        return (n + 3) % SIZE;

    }
/*
	private static int f_rehash(int f_hash, int col) {

		return (int) (f_hash + Math.pow(col, 2)) % SIZE;

	}
*/

    private static void pintarHashTable(final int[] hashTable) {

        for (int i = 0; i < hashTable.length; i++)
            System.out.print(hashTable[i] + ", ");
        System.out.println("\n");

    }

    private static void fill_hash_table(final int[] hashTable, final int[] values) {

        int i, f_hash, col;

        for (i = 0; i < values.length; i++) {

            f_hash = f_hash(values[i]);

            if (hashTable[f_hash] == -1)
                hashTable[f_hash] = values[i];

/*			else {

				int f_rehash;
				col = 0;

				do {
					f_rehash = f_rehash(f_hash, ++col);
				} while (hashTable[f_rehash] != -1);

				hashTable[f_rehash] = values[i];
			}
*/
            pintarHashTable(hashTable);

        }

    }
}

