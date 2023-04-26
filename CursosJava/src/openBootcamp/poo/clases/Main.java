package openBootcamp.poo.clases;

import openBootcamp.poo.herencia.Camion;
import openBootcamp.poo.herencia.Coche;
import openBootcamp.poo.herencia.Motocicleta;

/**
 * Los objetos se crean
 * 1- Nombre de la clase (inventado) + Operdor de asignación (0) + NEW nombreDeLa clase (inventado)+ ();
 * Realmente NEW nombreDeLaClase() es una llamada al CONSTRUCTOR de la Clase
 */
public class Main {
    public static void main(String[] args) {

//1. Clases y Objetos =================================================
        // crear un objeto con el constructor vacio
        Vehiculo toyotaPrius = new Vehiculo();
        // crear un objeto con el constructor con parametros
        Vehiculo fordMondeo = new Vehiculo("Ford", "Mondeo",2.1,2010,false,false);
        System.out.println(fordMondeo.fabricante);//la variable que utilcemos debe ser PUBLIC en la clase Vehiculo.
        System.out.println(fordMondeo.modelo);
        System.out.println(fordMondeo.speed);
        fordMondeo.acelerar(50);//vamos a acelerar el objeto fordMondeo
        System.out.println(fordMondeo.speed);

        //crear un objeto con parametros y añadir objetos
        Motor motorGTI = new Motor("GTI",190,459.0, 6);
        Vehiculo fordMondeo2 = new Vehiculo("Ford", "Mondeo2",2.1,2010,false,false,0,motorGTI);
        System.out.println(fordMondeo.fabricante);//la variable que utilcemos debe ser PUBLIC en la clase Vehiculo.
        System.out.println(fordMondeo.modelo);
        System.out.println(fordMondeo.speed);
        fordMondeo.acelerar(50);//vamos a acelerar el objeto fordMondeo
        System.out.println(fordMondeo.speed);

//2. Herencia =================================================================
        //vamos a probar la herencia, accediendo al fabricante de Vehiculo desde Motocicleta
        Motocicleta kawasakiNinja = new Motocicleta();
        kawasakiNinja.fabricante="Kawasaki";

        System.out.println("Fin de programa");

//3. Polimorfismo =================================================================
        //el polimorfismo nos permite tener multiple formas

        Vehiculo vehiculo; //declaro sin inicializar la varible vehiculo (de tipo Vehiculo)

        vehiculo = new Motocicleta();//puedo hacer que vehiculo sea una MOtocicleta
        vehiculo.acelerar(70);//y puedo hacer que acelere a 70

        vehiculo = new Coche();
        vehiculo.acelerar(40);

        vehiculo =new Camion();
        vehiculo.acelerar(35);
//4. Clases Abstractas: NO se pueden instanciar, solo instancian (crear un objeto) las clases hijas
/**
 * ¿porque podría interesarnos esto? Por ejemplo para no poder crear Objetos de tipo Vehiculo
 * y que SOLO se creen objetos de tipo Coche, Motocicleta o Camion
 * Se declara así: "public abstract class Vehiculo"
  */
    }
}
