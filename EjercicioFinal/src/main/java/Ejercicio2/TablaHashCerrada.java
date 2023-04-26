package Ejercicio2;

import java.util.Arrays;

public class TablaHashCerrada {

//public class RellenarTablaCerrada {
    private static final int SIZE = 7;

    /*public TablaHashCerrada() {
    }*/

    public static void main(String[] args) {
        int[] hashTable = new int[7];//tamaño de la tabla hash dado por el ejercicio.
        int[] values = new int[]{1455, 1502, 1524, 1512, 1511};//digitos de los DNI a insertar.
        Arrays.fill(hashTable, -1);
        fill_hash_table(hashTable, values);
    }

    private static int f_hash(int n) {
        //la funcion Hash calcula la suma de los dígitos de los números de DNI. Indicado por el ejercicio.
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum % SIZE;
    }

    private static int f_rehash(int f_hash, int col) {
        return (int)((double)f_hash + Math.pow((double)col, 2.0)) % 35;
    }

    private static void pintarHashTable(int[] hashTable) {
        for(int i = 0; i < hashTable.length; ++i) {
            System.out.print(hashTable[i] + ", ");
        }

        System.out.println("\n");
    }

    private static void fill_hash_table(int[] hashTable, int[] values) {
        for(int i = 0; i < values.length; ++i) {
            int f_hash = f_hash(values[i]);
            if (hashTable[f_hash] == -1) {
                hashTable[f_hash] = values[i];
            } else {
                int col = 0;

                int f_rehash;
                do {
                    ++col;
                    f_rehash = f_rehash(f_hash, col);
                } while(hashTable[f_rehash] != -1);

                hashTable[f_rehash] = values[i];
            }
        }

    }
}
