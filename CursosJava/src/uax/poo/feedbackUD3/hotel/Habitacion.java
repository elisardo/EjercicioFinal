package uax.poo.feedbackUD3.hotel;

public abstract class Habitacion implements Impresion { //clase contenida

    //atributos
    protected int numero;//no pueden ser privados porque los necesitamos en las subclases
    protected double precio;
    protected boolean conWC;

    //constructores
    Habitacion() {
    }
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

    public boolean isConWC() {//por "convencion" se pone "is" en lugar de "get" para los boolean
        return conWC;//devuelve true or false
    }

    public void setConWC(boolean conWC) {
        this.conWC = conWC;
    }
    public void imprimirTodo() {
    }

    public void anadirReserva() {
    }
    public void anadirHabitacion() {
    }

}