package Ejercicio4;


import java.util.Scanner;

public class EscribirApuestas {

    /*
    Mediante una programacion dinamica de las 8 reinas, Para completar una quiniela, se debe solicitar por teclado el numero de apuestas con valor 1, con valor x
    y con valor 2. El programa debe escribir una apuesta que contenga el numero de apuestas con valor 1, con valor x
    y con valor 2.
    si la suma de los valores de las apuestas es mayor que 15, el programa debe escribir un mensaje de error.
     */
    void solicitarApuestas() {
        int 1 = 0;
        int X = 0;
        int 2 = 0;
        int suma = 0;
        while (suma < 15) {
            System.out.println("Introduce el numero de apuestas con valor 1");
            Scanner teclado;
            1 = teclado.nextInt();
            System.out.println("Introduce el numero de apuestas con valor X");
            X = teclado.nextInt();
            System.out.println("Introduce el numero de apuestas con valor 2");
            2 = teclado.nextInt();
            suma = 1 + X + 2;
            if (suma > 15) {
                System.out.println("Error, la suma de los valores de las apuestas es mayor que 15");
            } else {
                System.out.println("La apuesta es: " + 1 + " " + X + " " + 2);
            }
        }

    }
    //escribir algoritmo de backtracking para que el programa escriba una solución de todas las combinaciones
    // de apuestas posibles con el numero de apuestas con valor 1, con valor x y con valor 2 indicados por el usuario.
    void generarQuiniela() {//
        boolean fin = false;
        int nivel1 = 0;
        int[] s = new int[0];
        int nivel;
        Object solucion ;
        do{
            s[nivel]=generar(nivel,s);//genera una combinacion de apuestas posible
            if(solucion (nivel,s)){//comprueba si la combinacion es valida
                imprimir(solucion);//imprime la combinacion
            } else if (factible(nivel, s)) {//si la combinacion no es valida, comprueba si es factible
                nivel++;//si es factible, incrementa el nivel
            } else {//si no es factible, decrementa el nivel
                nivel--;
            }
        }while(nivel1>=0);

    }

    private boolean factible(int nivel, int[] s) {
        return false;
    }

    private void imprimir(Object solucion) {
        System.out.println(solucion);
    }

    private boolean solucion(int nivel, int[] s) {
        return false;
    }

    private int generar(int nivel, int[] s) {
        return 0;
    }

    public static void main(String[] args) {
        EscribirApuestas e = new EscribirApuestas();
        e.solicitarApuestas();//
        e.generarQuiniela();//
    }
}
