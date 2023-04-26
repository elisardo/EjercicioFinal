//Elisardo Alvarez
//Feedback UD1
//
//TAM = 7
//fHash(k) = ((k^2)-1) % n
//elementos = {2,6,9,8,1}
//factor carga = 50% = 3.5 elementos.
package feedback_UD1;

import java.util.Arrays;


public class RellenarTablaCerrada {
    private static final int TAM = 7;

    public static void main(String[] args) {
        final int[] hashMap = new int[TAM];
        final int[] values = {2,6,9,8,1};
        int FC=TAM/2;
        int carga=0;//es un contador para el Factor de carga

        Arrays.fill(hashMap, -1); //rellenamos la tabla con -1 de las posiciones vacias.
        fill_hash_map(hashMap, values);
}

    private static int f_hash(final int n) {
        return (n*n -1) % TAM; //devuelve el valor de la posicion en la que se debe insertar el elemento.
    }
    private static int f_rehash(int f_hash, int col) {
        return (int) (f_hash + Math.pow(col, 2)) % (TAM*TAM)+1;//obtenemos la nueva posicion para la nueva tabla 2tam+1
    }
    private static void pintarHashMap(final int[] hashMap) {
        for (int i = 0; i < hashMap.length; i++)
            System.out.print(hashMap[i] + ", ");//imprimimos la tabla
        System.out.println("\n");
    }
    private static void fill_hash_map(final int[] hashMap, final int[] values) {
        int i, f_hash, col;
        for (i = 0; i < values.length; i++) {//recorremos los elementos a insertar
            f_hash = f_hash(values[i]);//obtenemos la posicion en la que se debe insertar el elemento
            if (hashMap[f_hash] == -1 && (carga<=FC))//si la posicion esta vacia y
                hashMap[f_hash] = values[i];//insertamos el elemento
                carga++;//incrementamos el contador de carga
            else {
                int f_rehash;//obtenemos la nueva posicion para el rehash
                col = 0;//inicializamos la columna
                do {
                    f_rehash = f_rehash(f_hash, ++col);//obtenemos la nueva posicion del rehash
                } while (hashMap[f_rehash] != -1);//mientras la posicion no este vacia
                hashMap[f_rehash] = values[i];//insertamos el elemento
            }
        }
        pintarHashMap(hashMap);

    }