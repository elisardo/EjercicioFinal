package uax.poo.feedbackFinal.ejercicio5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Persona> personas = new ArrayList<Persona>();
        Scanner sc = new Scanner(System.in);
        String nombre;
        float peso;
        float altura;
        String resp;

        do {
            System.out.println("Introduce el nombre de la persona: ");
            nombre = sc.nextLine();
            System.out.println("Introduce el peso de la persona: ");
            peso = sc.nextFloat();
            System.out.println("Introduce la altura de la persona: ");
            altura = sc.nextFloat();
            sc.nextLine(); //limpiar el buffer del scaner
            Persona persona = new Persona(nombre, peso, altura);
            personas.add(persona);
            //preguntar si desea agregar mas personas al arraylista de personas. si desea salir debe pulsar s y salir del bucle while
            System.out.println("Pulse 's' para salir");
            resp = sc.nextLine();
        } while (!resp.equals("s"));

        System.out.println("Se han introducido los siguientes datos:");
        for (Persona persona : personas) {//recorremos el arraylist para mostrar los datos introducidos
            System.out.println(persona);
        }
        System.out.println("__________________________________");

        System.out.println("Nombres de las personas, ordenado de mayor a menor altura:");
        personas.sort((p1, p2) -> Float.compare(p2.getAltura(), p1.getAltura()));
        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + " " + persona.getAltura());
        }

    }

}
