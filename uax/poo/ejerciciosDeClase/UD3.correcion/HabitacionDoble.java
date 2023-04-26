package uax.poo.ejerciciosDeClase.UD3.correcion;

public class HabitacionDoble extends Habitacion{

    private int maxPersonas;

    public HabitacionDoble(int numero, double precio, boolean conBanyo, int maxPersonas) {
        super(numero, precio, conBanyo);
        this.maxPersonas = maxPersonas;
    }

    public int getMaxPersonas() {
        return maxPersonas;
    }

    public void setMaxPersonas(int maxPersonas) {
        this.maxPersonas = maxPersonas;
    }

    @Override
    public void imprimirTodo() {
        System.out.println("Habitacion Doble");
        System.out.println("Numero " + getNumero());
        System.out.println("Precio" + getPrecio());
        System.out.println("Baño: " + isConBanyo());
        System.out.println("Maximo Personas " + getMaxPersonas());
    }
}
