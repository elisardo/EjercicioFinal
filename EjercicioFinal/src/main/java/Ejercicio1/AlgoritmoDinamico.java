package Ejercicio1;
/* Hacer un algoritmo dinamico para f(n,m)
* Optamos por un algoritmo Divide y Vencerás, ya que la función f(n,m) está dividida en subfunciones
* y cada subfunción podemos optimizarla con nuevos algoritmos de optimización.
* Memorizaremos los valores de f(n,m) para que no sean calculados de nuevo.
* casos:    n=0         entonces    f(n,m)=m
*           n=m         entonces    f(n,m)=0
*           n>m y m=0   entonces    f(n,m)=f(n-1,n+1)
*           m>n>0       entonces    f(n,m)=f(n-1,m-n)
*           n>m>0       entonces    f(n,m)=f(n-1,n-m)
*
* */

public class AlgoritmoDinamico {
    public static int calculaFuncion(int n, int m){

        if (n==0){
            return m;
        } else if (n==m){
            return 0;
        } else if (n>0 && m==0){
            m=n+1;
            return calculaFuncion(n-1,m);
        } else if (m>n && n>0){
            m=m-n;
            return calculaFuncion(n-1,m);
        } else /*(n>m && m>0)*/{
            m=n-m;
            return calculaFuncion(n-1,m);
        }
    }

    public static void main(String[] args) {
        System.out.println(calculaFuncion(13,9));
    }

}
