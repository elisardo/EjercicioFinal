import java.util.EventListener;
import java.util.Scanner;

public class EntradaEjemplo1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu nombre, por favor: ");
        String nombre = entrada.nextLine();//guardamos un String los datos del objeto entrada en nombre
        System.out.println("Introduce tu edad, por favor: ");
        int edad = entrada.nextInt();//guardamos un int los datos del objeto entrada en edad
        System.out.println("Hola " + nombre + " tienes " + edad + " años");

    }
}
