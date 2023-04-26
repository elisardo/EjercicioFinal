package uax.poo.ejerciciosDeClase.UD3.correcion;

public class HabitacionSimple extends Habitacion{

    private boolean tv;

    public HabitacionSimple(int numero, double precio, boolean conBanyo, boolean tv) {
        super(numero, precio, conBanyo);
        this.tv = tv;
    }

    public boolean isTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    @Override
    public void imprimirTodo() {
        System.out.println("Habitacion Simple");
        System.out.println("Numero " + getNumero());
        System.out.println("Precio" + getPrecio());
        System.out.println("Baño: " + isConBanyo());
        System.out.println("Tiene TV " + isTv());
    }


}
