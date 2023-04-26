package uax.tp.e1.recursividad;/* Si dividimos un numero entre 10 hasta que el cociente es 0
Contamos las veces que hemos dividido el numero por 10
* Caso base: si el numero es <10, devuelve 1 digito
*Caso recursivo:dividir el nº entre 10 y contar las veces que hemos dividido +1(por el caso base)
Hacer la llamada recursiva con el nuevo valor
*/

public class ContarDigitos {

    public static int calculaDigitos(int numero) {
        int res;
        if (numero < 10) {//caso base
            res= 1;
        } else {//caso recursivo
            numero= numero / 10;
            res= 1 + calculaDigitos(numero);
        }
        return res;
    }

    public static int calculaDigitos2(int numero) {
        if (numero < 10) {//caso base
            return 1;
        } else {//caso recursivo
            numero= numero / 10;
            return 1 + calculaDigitos2(numero);
        }
    }

    public static void main(String[] args) {
        int numero = 12345;
        calculaDigitos(numero);
        System.out.println("El numero " + numero + " tiene " + calculaDigitos(numero) + " digitos");

    }
}
