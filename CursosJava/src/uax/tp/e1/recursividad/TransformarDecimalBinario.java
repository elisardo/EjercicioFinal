package uax.tp.e1.recursividad;/* Transformar recursivamente un numero base10 a Binario
*Para transformar un numero base10 a binario se divide el numero entre 2
* y se guarda el resto de la division en una variable.
* 20 decimal=10100
* -----------------------
* 20 mod2=0, 20/2=10,
* 10 mod2=0, 10/2=5,
* 5 mod2=1, 5/2=2,
* 2 mod2=0, 2/2=1,
* 1 mod2=1, 1/2=0,
* 0 mod2=1, 0/2=0
*
* Se multiplican los restos por 10^0, 10^1, 10^2, 10^3, 10^4, 10^5, 0 lo que es lo mismo 10^veces
* que dividimos por 2
* -----------------------
* Caso base: si el numero es 0, se retorna 0
* Caso recursivo: se divide el numero entre 2 y se guarda el resto en una variable
* */


public class TransformarDecimalBinario {

    public static int decimalBinario(int numero) {
        int binario = 0;
        int exp=0;
        if (numero == 0) {
            return 0;
        } else {
            int resto = numero % 2;
            numero = numero / 2;
            exp=1+exp;
            binario = (resto * (int) Math.pow(10, exp))+decimalBinario(numero);
            System.out.println(numero + " " + resto + " " + binario);
        }
        return binario;
    }

    public static void main(String[] args) {
        int decimal = 4;
        System.out.println(decimalBinario(decimal));
    }

}
