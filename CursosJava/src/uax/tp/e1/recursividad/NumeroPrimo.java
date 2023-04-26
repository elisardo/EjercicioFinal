package uax.tp.e1.recursividad;/*Saber si un un numero es primo o no
* Devuelve un boolean
* Hacerlo de forma recursiva
* Caso base: si el numero es 1, no es primo
* Caso recursivo: si no encontramos un divisor antes de la mitad del nº, es primo
*/


public class NumeroPrimo {
    public static boolean esPrimo(int numero) {
        if (numero == 1) {
            return false;
        } else if (numero == 2) {
            return true;
        } else {
            return Primo(numero,2);
        }
    }
    public static  boolean Primo(int numero, int divisor) {
        if (divisor > numero / 2) {//no hemos encontrado un divisor antes de la mitad. Es primo
            return true;
        } else if (numero % divisor == 0) {//hemos encontrado un divisor. No es primo
            return false;
        } else {
            return Primo(numero, divisor + 1);
        }
    }

    public static void main(String[] args) {
        int numero=13;
        //tomar el valor boolean del metodo uax.tp.e1.recursividad.Primo
        boolean esPrimo=esPrimo(numero);
        //boolean res=uax.tp.e1.recursividad.Primo();
        esPrimo(numero);
        System.out.println("El numero "+numero+ " es primo? "+(esPrimo));
    }
}
