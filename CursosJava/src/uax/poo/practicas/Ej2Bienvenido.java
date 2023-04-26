/**
 * Crea un programa que pida al usuario que introduzca su nombre y devuelva el mensaje
 * “Bienvenido al curso de M03B” seguido del nombre del alumno.
 */

package uax.poo.practicas;

import java.util.Scanner;

public class Ej2Bienvenido {
    public static void main(String[] args) {

        String nombre;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu nombre: ");
        nombre = sc.nextLine();

        System.out.println("Bienvenido al curso M03B, " + nombre);
    }
}
