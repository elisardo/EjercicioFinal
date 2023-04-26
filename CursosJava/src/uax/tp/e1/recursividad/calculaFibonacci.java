package uax.tp.e1.recursividad;/* Para calcular la serie Fibonacci sumamos los dos terminos anteriores.
Al hacerlo recursivamente, no conocemos los terminos anteriores, por lo que
necesitamos una funcion que nos permita calcular el termino anterior.
Caso base: si el numero es 0 o 1, el termino es 1.
Caso recursivo: si el numero es mayor que 1, el valor (n-1) + (n-2)


*/



public class calculaFibonacci {

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {//caso base
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        int n=7;
        System.out.println("El valor de fibonacci del nº "+n+ " es: "+fibonacci(n));
    }
}
