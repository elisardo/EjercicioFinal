package uax.tp.e1.recursividad;/*
* Caso base: Si el numero es 1, el factorial es 1. Si el numero es 0, el factorial es 1.
* Caso recursivo: Si el numero es mayor que 1, el factorial es el numero * el factorial (numero - 1)
*/


public class CalcularFactorial {
    public static int factorial(int numero) {
        if (numero == 1) {//Caso base
            return 1;
        } else if (numero == 0) {//Caso base
            return 1;
        } else {//caso recursivo
            return numero * factorial(numero - 1);
        }
    }

    public static void main(String[] args) {
        int numero=5;
        System.out.println("El factorial de "+numero+" es: " + factorial(numero));
    }
}
