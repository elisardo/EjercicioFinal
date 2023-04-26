package openBootcamp.ejercicios.tema4;

public abstract class SmartDevice { //no deseamos que se creen objetos SmartDevice
    //atributos
    String fabricante;
    String modelo;
    int year;
    int batteryCapacity;

    //constructores
    public SmartDevice(){

    }

    public SmartDevice(String fabricante, String modelo, int year, int batteryCapacity) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.year = year;
        this.batteryCapacity = batteryCapacity;
    }

    //metodos

    @Override
    public String toString() {
        return "SmartDevice{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", year=" + year +
                ", batteryCapacity=" + batteryCapacity +
                '}';
    }
}

