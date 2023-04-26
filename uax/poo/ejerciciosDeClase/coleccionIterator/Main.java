package uax.poo.ejerciciosDeClase.coleccionIterator;

public class Main {

    /*
    * Ejercicio:
Crear una clase "Agenda" que almacene los contactos de una persona.
Cada contacto debe tener los siguientes campos: nombre, teléfono y correo electrónico.
La clase Agenda debe tener un método "listarContactos()"
* que utilice un Iterator para recorrer y mostrar en pantalla los contactos almacenados en la agenda.
    * */

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.agregarContacto(new Contacto("juan","8888888","juan@mail.com"));
        agenda.agregarContacto(new Contacto("ruben","755464","maria@mail.com"));
        agenda.listarContactos();
    }

}
