package uax.poo.feedbackUD3.hotel;

public class HabitacionDoble extends Habitacion implements Impresion{
    //atributos
    private int maxPersonas;

    //constructores
    public HabitacionDoble (){
    }

    public HabitacionDoble(int maxPersonas) {
        this.maxPersonas = maxPersonas;
    }

    public HabitacionDoble(int numero, double precio, boolean conWC, int maxPersonas) {
        super(numero, precio, conWC);
        this.maxPersonas = maxPersonas;
    }

    public HabitacionDoble(int i, int i1, boolean b) {
    }
//metodos

    public int getMaxPersonas() {
        return maxPersonas;
    }

    public void setMaxPersonas(int maxPersonas) {
        this.maxPersonas = maxPersonas;
    }

    @Override
    public void ImprimirTodo() {

        System.out.println("HabitacionDoble{" + "numero=" + numero +
                ", precio=" + precio + ", conWC=" + conWC +
                ", maxPersonas=" + maxPersonas +'}');
    }

    @Override
    public String toString() {
        return "HabitacionDoble{" +
                "maxPersonas=" + maxPersonas +
                '}';
    }

}




