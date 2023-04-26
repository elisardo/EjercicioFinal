package uax.poo.ejerciciosDeClase.coleccionIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class EjemploIterator {


    //next()
    //hasNext()
    //remove()


    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<String>();

        nombres.add("Raul");
        nombres.add("Elisardo");
        nombres.add("Ruben");

        Iterator<String> iterator = nombres.iterator();

        while(iterator.hasNext()){
            String nombre = iterator.next();
            System.out.println("Nombre: " + nombre);
        }

        for (int i = 0; i < nombres.size(); i++) {
            String nombre = nombres.get(i);
            System.out.println("Nombre: " + nombre);
        }

    }



}
