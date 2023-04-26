package uax.tp.e1.recursividad;/* Resolver recursivamente las torres de Hanoi*/

public class TorresHanoi {
    public static void hanoi(int n, char origen, char destino, char auxiliar) {
        if (n >0) {
            hanoi(n - 1, origen, auxiliar, destino);
            System.out.println("Mover disco " + n + " de " + origen + " a " + destino);
            hanoi(n - 1, auxiliar, destino, origen);
        }
    }

    public static void main(String[] args) {
        hanoi(3, 'A', 'C', 'B');
    }
}
