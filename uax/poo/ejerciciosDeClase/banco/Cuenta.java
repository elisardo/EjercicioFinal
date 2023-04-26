package uax.poo.ejerciciosDeClase.banco;

public class Cuenta {
    private String numCuenta;
    private Cliente titular;
    private float capital;
    private float interes;

    public Cuenta(String numCuenta, Cliente titular, float capital, float interes) {
        this.numCuenta = numCuenta;
        this.titular = titular;
        this.capital = capital;
        this.interes = interes;
    }

    public float getCapital() {
        return capital;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        if(numCuenta.length()==14)
            this.numCuenta = numCuenta;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public void setCapital(float capital) {
        this.capital = capital;
    }

    public float getInteres() {
        return interes;
    }

    public void setInteres(float interes) {

        this.interes = interes;
    }

    void ingresar(float capital){
        this.capital += capital;
    }
    void retirar(float capital){
        this.capital -= capital;
    }
   float calcularInteres(){
       return capital * interes;
   }
}
