package uax.tp.e1.recursividad;/* Rotar un numero N las veces que indique R
* Para N=12345 y R=2, el resultado es: 54123
*Para rotar debemos dividir /10 y %10 para obtener el ultimo digito y el resto de la division
* 12345/10=1234, 12345%10=5
* luego ponemos el 5 en el primer lugar.Multiplicando por 10000 y sumando el resto de la division
* 5*10000+1234=54123
* El 10000 lo obtenemos de la siguiente manera:
* 10 ^num de digitos-1.
* Caso base: si R=1, el resultado es el mismo numero.
* Caso recursivo: N mod 10; N/10; N*10+N%10;
* */

public class RotarNveces {

    public static int rotar(int n, int r) {
        if (r == 0) {
            return n;
        } else {
            //calcular el numero de digitos del numero
            int numDigitos = 0;
            int num = n;
            while (num != 0) {
                numDigitos++;
                num /= 10;
            }
           return (n % 10) * (int) Math.pow(10, numDigitos - 1) + rotar(n / 10, r - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(rotar(12345, 2));
    }
}


