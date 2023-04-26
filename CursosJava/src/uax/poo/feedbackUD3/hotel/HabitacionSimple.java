package uax.poo.feedbackUD3.hotel;

public class HabitacionSimple extends Habitacion implements Impresion{
    //atributos
    private boolean tv;

    //constructores
    public HabitacionSimple(){}

    public HabitacionSimple(boolean tv) {
        this.tv = tv;
    }

    public HabitacionSimple(int numero, double precio, boolean conWC, boolean tv) {
        super(numero, precio, conWC);
        this.tv = tv;
    }

    public HabitacionSimple(int i, int i1, boolean b) {
    }
    //metodos


    public boolean isTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    @Override
    public String toString() {
        return "HabitacionSimple{" +
                "tv=" + tv +
                '}';
    }

    @Override
    public void ImprimirTodo() {
        System.out.println("HabitacionSimple{" + "numero=" + numero +
                ", precio=" + precio + ", conWC=" + conWC +
                ", tv=" + tv +'}');
    }
}
