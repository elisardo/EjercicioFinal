package openBootcamp.ejercicios.tema4;

public class SmartPhone extends SmartDevice{

    //atributos
    double screen;
    boolean coverage5G;
    boolean camara;

    //Constructores
    public SmartPhone(){

    }

    public SmartPhone(String fabricante, String modelo, int year, int batteryCapacity, double screen, boolean coverage5G, boolean camara) {
        super(fabricante, modelo, year, batteryCapacity);
        this.screen = screen;
        this.coverage5G = coverage5G;
        this.camara = camara;
    }
    //metodos


    @Override
    public String toString() {
        return "SmartPhone{" +
                "screen=" + screen +
                ", coverage5G=" + coverage5G +
                ", camara=" + camara +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", year=" + year +
                ", batteryCapacity=" + batteryCapacity +
                '}';
    }
}
