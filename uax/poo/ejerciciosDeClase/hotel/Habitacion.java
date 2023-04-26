package uax.poo.ejerciciosDeClase.hotel;

public abstract class Habitacion implements Cloneable, Impresion{

    //atributos
    protected int numero;
    protected double precio;
    protected boolean conWC;


    //constructor
    public Habitacion(int numero, double precio, boolean conWC) {
        this.numero = numero;
        this.precio = precio;
        this.conWC = conWC;
    }

    //metodos
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isConWC() {
        return conWC;
    }

    public void setConWC(boolean conWC) {
        this.conWC = conWC;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return null;
    }


}
