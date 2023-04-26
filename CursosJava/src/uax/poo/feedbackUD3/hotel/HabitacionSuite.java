package uax.poo.feedbackUD3.hotel;

public class HabitacionSuite extends Habitacion implements Impresion{
    //atributos
    private double superficie;

    //constructores
    public HabitacionSuite (){
    }

    public HabitacionSuite(double superficie) {
        this.superficie = superficie;
    }

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
    public String toString() {
        return "HabitacionSuite{" +
                "superficie=" + superficie +
                '}';
    }

    @Override
    public void ImprimirTodo() {
        System.out.println("HabitacionSuite{" + "numero=" + numero +
                ", precio=" + precio + ", conWC=" + conWC +
                ", superficie=" + superficie +'}');
    }
}
