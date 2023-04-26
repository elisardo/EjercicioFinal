/**
 * Escribe un programa que pida al usuario un número cualquiera mayor que cero y
 * calcule el número de dígitos que lo forman. El programa se reiniciará hasta que
 * el usuario introduzca el valor 0, lo que hará que el éste finalice su ejecución.
 */
package uax.poo.practicas;

import java.util.Scanner;

public class Ej4LongitudNumero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        do{
            System.out.println("Introduce un numero");
            num = sc.nextInt();
            if(num > 0){
                System.out.println("El numero tiene: "+ String.valueOf(num).length());//convertimos el Int en String para poder contar
            }
        }while(num != 0);
    }
}
