package uax.tp.e1.recursividad;/* Para invertir un numero natural debemos dividir /10 y recogemos los restos.
5874===>4785
---------------------------------------
5874/10=587 resto 4
587/10=58 resto 7
58/10=5 resto 8
5/10=0 resto 5
Para conformar el nuevo numero debemos multiplicar *10 los resultados y sumarle los restos.
4*10+7=47
47*10+5=475
475*10+8=4758
Para ello NECESITAMOS iniciar el valor inicial a 0. Para pode hacer la primera multiplicacion y suma.
0*10+4=4
---------------------------------------
Caso Base: Si el numero es 0, no se puede invertir.
Caso Base: Si el numero es <10, no se puede invertir.
Caso Recursivo: numero%10; actualizar numero/10; actualizar valor de Res=0*10.

*/


public class InvertirDigitos {

    public static int invertir(int numero){
        int res=0;
        int resto=0;
        if(numero<10){
           return resto;
        }
        /*if(numero<10){
            return res=numero%10;
        }*/
        res= (10*res)+resto;
        resto=invertir(numero/10);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(invertir(5678));
    }

}
