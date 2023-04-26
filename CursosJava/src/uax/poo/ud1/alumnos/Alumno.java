/**
 * La Herencia responde a tres preguntas:
 * 1 - ES UN? un alumno es una persona? un animal es una persona? un empleado es una persona?
 * 2- TIENE UN? para la composición. un animal tiene un cuerpo? un persona tiene cuerpo?
 * 3-
 */


package uax.poo.ud1.alumnos;

public class Alumno {
    static int numAlumnos =0;

    //atributos
    String nombre;
    String apellidos;
    int anyoNacimiento;
    int np;
    String grupo;

    //constructor
    Alumno(){
    }

    public Alumno(String nombre, String apellidos, int anyoNacimiento) {
        this.nombre = nombre;//" this.nombre" es la variable y "nombre" es el atributo
        this.apellidos = apellidos;
        this.anyoNacimiento = anyoNacimiento;

        numAlumnos++; //numAlumnos = numAlumnos +1;
    }

    public Alumno(String nombre, int numeroPersonal, int anyoNacimiento) {
        this.nombre = nombre;//" this.nombre" es la variable y "nombre" es el atributo
        this.np = numeroPersonal;
        this.anyoNacimiento = anyoNacimiento;
    }

    //metodo Imprimir
public static void imprimirTotalAlumnos(){
    System.out.println("El nº de alumnos es: " + numAlumnos);
}

    public static void main(String[] args) {

       imprimirTotalAlumnos();//necesita que el metodo se static. Imprime 0
        /**
         * declaramos/instanciamos tres objetos.
         * Llamamos a la clase Alumno + nombre de variable  + "="
         */

        Alumno alumno1 = new Alumno("Blanca","Sanchez",1998);
        Alumno alumno2 = new Alumno("Alicia","Sanchez",1990);
        Alumno alumno3 = new Alumno("Alejandra","Moreno",2000);

        imprimirTotalAlumnos();// Imprime 3

        //vamos a imprimir el nombre de los alumnos
        System.out.println(alumno1.nombre);
        System.out.println(alumno2.nombre);
        System.out.println(alumno3.nombre);

        //vamos a cambiar el nombre al alumno3
        alumno3.nombre = "Alex";

        System.out.println(alumno1.nombre);
        System.out.println(alumno2.nombre);
        System.out.println(alumno3.nombre);
    }
}
