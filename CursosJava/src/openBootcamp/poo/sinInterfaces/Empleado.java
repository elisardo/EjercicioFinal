package openBootcamp.poo.sinInterfaces;

public class Empleado {

    //atributos
    String nombre;
    int edad;
    double salario;
    boolean alta;

    //constructores
    public Empleado() {

    }

    public Empleado(String nombre, int edad, double salario, boolean alta) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.alta = alta;
    }

    //metodos

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                ", alta=" + alta +
                '}';
    }
}

