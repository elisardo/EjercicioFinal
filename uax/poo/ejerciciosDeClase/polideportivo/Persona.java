package uax.poo.ejerciciosDeClase.polideportivo;


public class Persona {
    //Atributos
    private String dni;
    private String nombre;

    //Constructor
    public Persona(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    //Getters y Setters
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
