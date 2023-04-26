package uax.poo.ejerciciosDeClase.hotel;


public class HabitacionDoble extends Habitacion implements Cloneable, Impresion{

    //atributos
    private int maxPersonas;

    //constructores
    public HabitacionDoble(int numero, double precio, boolean conWC, int maxPersonas) {
        super(numero, precio, conWC);
        this.maxPersonas = maxPersonas;
    }



    //metodos
    public int getMaxPersonas() {
        return maxPersonas;
    }

    public void setMaxPersonas(int maxPersonas) {
        this.maxPersonas = maxPersonas;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return null;
    }

    @Override
    public void imprimirTodo() {
        System.out.println("Habitacion doble");
        System.out.println("Maximo de personas: " + maxPersonas);

    }
}
