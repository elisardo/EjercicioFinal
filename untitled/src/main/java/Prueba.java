public class Prueba {
    public int buscar(int[] array, int valor) {
        for (int i=0;i<array.length;i++) {
            if (array[i] == valor) {
                return i;
            }
        }
        return -1;
    }
    public boolean estaVacio(int []array){
        if(array.length>0)
            return false;
        else
            return true;
    }
}
