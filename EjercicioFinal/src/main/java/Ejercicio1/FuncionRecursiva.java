package Ejercicio1;
//prueba
/* En este ejercicio, para todo n y m mayores que 0, se pide:
 * Si n=0, entonces f(n,m)=m
 * Caso base: si n = m, entonces f(n, m) = 0.
 * Caso recursivo: si m>=0, entonces f(n-1, m).El valor de m varia en función de n. Caso que:
 * si n>=0 y m=0,   entonces f(n-1, n+1).
 * si m>n>0,        entonces f(n-1, m-n).
 * si n>m>0,        entonces f(n-1, n-m).
*
*  */

public class FuncionRecursiva {

        public static int f(int n, int m) {

            if (n==0) {
                return m;
            } else if (n==m) {
                return 0;
            } else if ((m == 0) && (n > 0)) {
                m=n+1;

            } else if ((m > n) && (n > 0)) {
                m=m-n;

            } else if((n>m) && (m>0)) {
                m=n-m;

            }

            return f(n-1,m);
        }

    public static void main(String[] args) {
            System.out.println(f(10, 6));
        }

}
