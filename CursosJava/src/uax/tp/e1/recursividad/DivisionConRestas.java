package uax.tp.e1.recursividad;/*Una división son restas sucesivas.15-4=11-4=7-4=3 (restamos hasta que el resto es menor que el divisor).
* DEBEMOS EVITAR DIVIDENDO <=0.
* Caso Base: si el divisor es mayor que el dividendo, el resultado es 0.
* Caso Recursivo: si el divisor es menor que el dividendo, se divide el dividendo
*                 por el divisor y se suma el resultado de la resta.
* */


public class DivisionConRestas {

    public static int hazRestas(int dividendo, int divisor) {
        if(divisor<=0)
        return -1;//esta division no es posible
        else{
            if (divisor > dividendo) {//caso base
                return 0;
            } else {//caso recursivo
                dividendo= dividendo-divisor;
                hazRestas(dividendo, divisor);
                return 1+hazRestas(dividendo, divisor);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(hazRestas(25, 4));
    }
}
