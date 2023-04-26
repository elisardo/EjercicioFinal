/**
 * A partir de dos valores enteros introducidos por el usuario, muestra por la consola
 * el resultado de las operaciones aritméticas: la suma, la resta, el producto y la
 * división de dichos valores.
 */
package uax.poo.practicas;

import java.util.Scanner;

public class Ej1Calculadora {
    public static void main(String[] args) {

        //declaramos las variables
        int num1, num2;
        Scanner sc = new Scanner(System.in); //variable para leer el scanner

        //solicitamos numeros al usuario
        System.out.println("Introduce el primer numero: ");
        num1 = sc.nextInt();

        System.out.println("Introduce el segundo numero: ");
        num2 = sc.nextInt();

        //Imprimimos el resultado de las cuatro operaciones solicitadas
        System.out.println("OPERACIONES ARITMETICA CON: " +num1 + " "+num2);
        System.out.println("El resultado de la sumas es: "+(num1+num2));
        System.out.println("El resultado de la resta es: "+(num1-num2));
        System.out.println("El resultado de la multiplicacion es: "+(num1*num2));
        System.out.println("El resultado de la division es: "+(num1/num2));

    }
}
