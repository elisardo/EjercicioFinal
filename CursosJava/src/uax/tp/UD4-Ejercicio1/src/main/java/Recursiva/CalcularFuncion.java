package Recursiva;

/**
 *Crear una clase que calcule de forma recursiva la función f(n)
 * si n=0 f(n)=1
 * si n=1 f(n)=2
 * si n=2 f(n)=2
 * si n>2 f(n)=(n+2)f(n-2)+3f(n-3)
 * @author Elisardo
 */
public class CalcularFuncion {
    public static void main(String[] args) {
       int n;
       if (n==0)
           return 1;
    }

    public static int funcion(int n){
        if (n==0)
            return 1;
        else if (n==1 || n==2)
            return 2;
        else
            return (n+2)*funcion(n-2)+3*funcion(n-3);
    }
}
