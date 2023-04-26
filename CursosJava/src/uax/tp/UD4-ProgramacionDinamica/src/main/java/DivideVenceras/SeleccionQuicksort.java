package DivideVenceras;
//es una optimizacion del algoritmo de seleccion, que nos permite reducir el numero de comparaciones

public class SeleccionQuicksort {

    public static void seleccion(int a[], int izq, int der, int k) {
        int pivote = a[izq];
        int i = izq;
        int j = der;
        int aux;
        while (i < j) {
            while (a[i] <= pivote && i < j) {
                i++;
            }
            while (a[j] > pivote) {
                j--;
            }
            if (i < j) {
                aux = a[i];
                a[i] = a[j];
                a[j] = aux;
            }
        }
        a[izq] = a[j]; // se coloca el pivote en su lugar
        a[j] = pivote;
        if (k < j) {
            seleccion(a, izq, j - 1, k); // selección en subarray izquierdo
        }
        if (k > j) {
            seleccion(a, j + 1, der, k); // selección en subarray derecho
        }
    }
}
