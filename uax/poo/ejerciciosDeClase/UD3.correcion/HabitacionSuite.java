package uax.poo.ejerciciosDeClase.UD3.correcion;

public class HabitacionSuite extends Habitacion{

    private double superficie;

    public HabitacionSuite(int numero, double precio, boolean conBanyo, double superficie) {
        super(numero, precio, conBanyo);
        this.superficie = superficie;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    @Override
    public void imprimirTodo() {
        System.out.println("Habitacion Suite");
        System.out.println("Numero " + getNumero());
        System.out.println("Precio" + getPrecio());
        System.out.println("Baño: " + isConBanyo());
        System.out.println("Superficie " + getSuperficie());
    }
}
