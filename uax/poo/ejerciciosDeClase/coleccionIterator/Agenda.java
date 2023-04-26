package uax.poo.ejerciciosDeClase.coleccionIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Agenda {

    private ArrayList<Contacto> contactos;

    public Agenda(){
        contactos = new ArrayList<Contacto>();
    }

    public void agregarContacto(Contacto contacto){
        contactos.add(contacto);
    }

    public void listarContactos(){

        Iterator<Contacto> iterator = contactos.iterator();

        while(iterator.hasNext()){
            Contacto contacto = iterator.next();
            System.out.println("---------------------");
            System.out.println("Nombre: " + contacto.getNombre());
            System.out.println("Telefono: " + contacto.getTelefono());
            System.out.println("Correo: " + contacto.getEmail());
            System.out.println("---------------------");
        }
    }

}
