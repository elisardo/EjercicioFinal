/**
 * Suponga que se dispone de las siguientes claves: 2, 6, 9, 8, 1 que se utilizan para insertar en
 * una tabla hash. Suponga que la tabla es de tamaño 7 y que la función de hash es fHash(k) = (k2
 * - 1).
 * Escriba un programa en Java que introduzca los valores anteriores en una tabla
 * hash de la clase HashMap creándola inicialmente de tamaño 7. El programa debe
 * escribir el contenido de la tabla después de cada una de las inserciones realizadas.
 */

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] keys = {2, 6, 9, 8, 1};
        int[] values = {4, 36, 81, 64, 1};
        int[] hash = new int[keys.length];

        for (int i = 0; i < keys.length; i++) {
            hash[i] = (int) Math.pow(keys[i], 2) - 1;
            map.put(hash[i], values[i]);
            System.out.println("Hash: " + hash[i] + " Value: " + values[i]);
        }
    }
}
