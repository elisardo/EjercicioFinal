package uax.poo.ejerciciosDeClase.UD3.correcion;

public abstract class Habitacion implements Impresion{
    protected int numero;
    protected double precio;
    protected boolean conBanyo;

    public Habitacion(int numero, double precio, boolean conBanyo) {
        this.numero = numero;
        this.precio = precio;
        this.conBanyo = conBanyo;
    }

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

    public boolean isConBanyo() {
        return conBanyo;
    }

    public void setConBanyo(boolean conBanyo) {
        this.conBanyo = conBanyo;
    }


}
