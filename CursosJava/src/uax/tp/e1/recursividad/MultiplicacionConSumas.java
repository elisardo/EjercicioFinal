package uax.tp.e1.recursividad;/* El multiplicador indica cuantas veces debemos sumar el multiplicando
Caso Base: si el multiplicando es 0, el resultado es 0
Caso Recursivo: si el multiplicando es mayor que 0, el resultado es la suma de la multiplicacion del multiplicando con el multiplicador menos 1 y la suma del multiplicando con el multiplicador
*/

public class MultiplicacionConSumas {
    public static int hazSumas(int multiplicando, int multiplicador) {
        if (multiplicador == 0) {
            return 0;
        } else {
            if(multiplicador==1){
                return multiplicando;
            }else {
                multiplicador--;
                multiplicando = multiplicando + hazSumas(multiplicando, multiplicador);
                return multiplicando;
            }
        }
    }

    public static void main(String[] args) {

        System.out.println(hazSumas(5, 3));
    }
}
