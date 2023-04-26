package uax.tp.e1.recursividad;/*Contar digitos de un numero natural mayor que 0
Caso base: si el numero es 0, el numero de digitos es 0
Caso recursivo: si el numero es mayor que 0, el numero de digitos es 1 + uax.tp.e1.recursividad.ContDig(numero/10)
*
*
*  */

public class ContarDigitosNumNaturales {
    public static int contarDigitos(int numero) {
        if (numero == 0) {//caso base
            return 0;
        } else {
            return 1 + contarDigitos(numero / 10);
        }
    }

    public static void main(String[] args) {
        System.out.println(contarDigitos(12345));
    }
}
