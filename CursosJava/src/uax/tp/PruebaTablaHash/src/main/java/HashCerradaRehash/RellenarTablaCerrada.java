package HashCerradaRehash;

import java.util.Arrays;

public class RellenarTablaCerrada {

    private static int SIZE = 7;//tamaño de la tabla

    public static void main(String[] args) {

        int[] hashTable = new int[SIZE];
        int[] values = { 1455, 1502, 1524, 1512, 1511 }; //valores de los DNI

        Arrays.fill(hashTable, -1); //a las posiciones vacias le asignamos -1

        llenar_hash_table(hashTable, values);

    }

    private static int f_hash( int n) {//calculamos la funcion hash con la suma de los digitos.

        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum % SIZE;

    }

    //calculamos la funcion rehash mediante resolucion cuadratica
    private static int f_rehash(int f_hash, int col) {


        return (int) (f_hash + Math.pow(col, 2)) % SIZE;

    }

    private static void pintarHashTable(int[] hashTable) {//pintamos la tabla

        for (int i = 0; i < hashTable.length; i++)
            System.out.print(hashTable[i] + ", ");
        System.out.println("\n");

    }

    private static void llenar_hash_table(int[] hashTable, int[] values) { //rellenamos la tabla

        int i, f_hash, col;

        for (i = 0; i < values.length; i++) {

            f_hash = f_hash(values[i]);

            if (hashTable[f_hash] == -1)//si la posicion esta vacia, asignar el DNI
                hashTable[f_hash] = values[i];

            else {//si no está vacia ejecutar reHash

                int f_rehash;
                col = 0;

                do {//mientras no encontremos una posicion vacia, ejecutar reHash
                    f_rehash = f_rehash(f_hash, ++col);
                } while (hashTable[f_rehash] != -1);

                hashTable[f_rehash] = values[i];//asignar el DNI a la posicion vacia
            }

            pintarHashTable(hashTable);

        }
    }
}
