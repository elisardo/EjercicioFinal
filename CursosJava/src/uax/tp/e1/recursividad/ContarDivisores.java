package uax.tp.e1.recursividad;/*
* Para buscar divisores de un número, buscamos candidatos.
*
* Caso Base: Si el número es 1, no tiene divisores.
* Caso Recursivo: Si el número es mayor que 1, buscamos divisores de un número. si del 1 n/2 no
* hemos encontrado divisores es que no tiene divisores.
*
* */


public class ContarDivisores {
    public static int CalculaDivisores(int n, int divisor) {

        int contador=0;
        if (divisor>(n/2)) {//caso base
            return contador;
        } else {
            if(n%divisor==0) {
               contador=1+CalculaDivisores(n,divisor+1);
            }else{
                contador=0+CalculaDivisores(n,divisor+1);
            }
        }
        return contador;
    }

    /* OTRA FORMA DE HACERLO*/
    public static int CalculaDivisores2(int n, int divisor) {

        int contador=0;
        if (divisor>(n/2)) {//caso base
            return contador;
        } else {
            int aux=0;
            if(n%divisor==0) {
                aux=1;
            }
            contador=aux+CalculaDivisores2(n,divisor+1);
        }
        return contador;
    }

    public static void main(String[] args) {

        System.out.println(CalculaDivisores(12, 1));
        System.out.println(CalculaDivisores2(12, 1));
    }
}
