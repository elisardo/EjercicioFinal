package uax.poo.ejerciciosDeClase.hotel;
//Hereda de Habitacion
//Tendra un constructor con todos sus atributos
//tendra metodos get y set para todos sus atributos
public class HabitacionSuite extends Habitacion implements Cloneable, Impresion{

    //atributos
    private double superficie;

    //constructores
    public HabitacionSuite(int numero, double precio, boolean conWC, double superficie) {
        super(numero, precio, conWC);
        this.superficie = superficie;
    }

    //metodos
    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return null;
    }

    @Override
    public void imprimirTodo() {
        System.out.println("Habitacion suite");
        System.out.println("Superficie: " + superficie);

    }
}
