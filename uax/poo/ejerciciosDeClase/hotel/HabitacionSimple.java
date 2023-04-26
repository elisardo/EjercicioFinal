package uax.poo.ejerciciosDeClase.hotel;

public class HabitacionSimple extends Habitacion implements Cloneable, Impresion{

    //atributos
    private boolean TV;

    //constructores
    public HabitacionSimple(int numero, double precio, boolean conWC, boolean TV) {
        super(numero, precio, conWC);
        this.TV = TV;
    }

    //metodos
    public boolean isTV() {
        return TV;
    }

    public void setTV(boolean TV) {
        this.TV = TV;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return null;
    }

    @Override
    public void imprimirTodo() {
        System.out.println("Habitacion simple");
        System.out.println("TV: " + TV);

    }
}
