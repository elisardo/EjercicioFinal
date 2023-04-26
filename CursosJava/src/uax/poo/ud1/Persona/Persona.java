package uax.poo.ud1.Persona;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
    //atributos
    String nombre;
    String ciudad;
    LocalDate fechaNacimiento;
    Persona padre; // un padre tambien es una persona, por tanto, Clase Persona
    Persona madre;
    int numPersonas=0;

    //constructores
    public Persona(){

    }

    public Persona(String nombre) {
        this.nombre = nombre;
        numPersonas++;
    }

    public Persona(String nombre, String ciudad, LocalDate fechaNacimiento){
        this.nombre = nombre;
        this.ciudad= ciudad;
        this.fechaNacimiento=fechaNacimiento;
        numPersonas++;
    }

    //metodos
    //podemos hacerlo con ToString pero lo hacemos a mano
    public void dameInfoBasicaPersona(){
        System.out.println("NOMBRE: "+this.nombre);
        System.out.println("CIUDAD: "+this.ciudad);
        System.out.println("FECHA NACIMIENTO: "+this.fechaNacimiento);
    }

    public void dimeDiferenciaEdad(Persona persona){
        Period diferencia;

        if(persona.fechaNacimiento.isAfter(fechaNacimiento)){
            diferencia = Period.between(fechaNacimiento, persona.fechaNacimiento);
        }else{
            diferencia = Period.between(persona.fechaNacimiento, fechaNacimiento);
        }
        System.out.println("La diferencia en años es: "+ diferencia.getYears()) ;
    }

    public boolean iguales(Persona persona){
        if((nombre.equals(persona.nombre)) && (fechaNacimiento.equals(persona.fechaNacimiento))){
            return true;
        }else return false;
    }
}
