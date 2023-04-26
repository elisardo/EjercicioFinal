package Backtracking;

import java.util.Arrays;
/*
Bonoloto de num que sumen una cantidad K. Bonoloto es una combinacion de 6 num entre el 1 y el 49.
@solucion. Una tupla {a,b,c,d,e,f} donde:
    a toma valores de 1 al 44
     b toma valores de a+1 al 45
    c toma valores de b+1 al 46
    d toma valores de c+1 al 47
    e toma valores de d+1 al 48
    f toma valores de e+1 al 49
    suma de los valores de a,b,c,d,e,f es K
 */
public class Bonoloto {
    public static void main(String[] args) {
        bonoloto(64);
    }
    private static void bonoloto(int k) {
        int sol[] = new int[6];
        int num = 1;
        int nivel = 0;
        sol[nivel]=0;
        do{
            sol[nivel]++;
            if(nivel == 5 && suma(nivel, sol) == k){//si hemos encontrado una solucion
                System.out.println(Arrays.toString(sol) + " y van " + num++);
            }else if(nivel < 5 && suma(nivel, sol) < k){//si es una posible solucion
                sol[nivel+1]=sol[nivel];//seguimos avanzando niveles
                nivel++;
            }else{
                while(nivel >=0 && sol[nivel] >= 44 + nivel){//si no es una solucion, retrocedemos
                    nivel--;
                }
            }
        }while(nivel >= 0);
    }
    private static int suma(int nivel, int sol[]) {
        int suma = 0;
        for(int i = 0; i<=nivel; i++){
            suma += sol[i];
        }
        return suma;
    }
}
