package openBootcamp.ejercicios.tema4;

public class SmartWath extends SmartDevice{

    //atributos
    boolean waterResistance;
    int batteryDuration;
    //constructores
    public SmartWath(){

    }

    public SmartWath(String fabricante, String modelo, int year, int batteryCapacity, boolean waterResistance, int batteryDuration) {
        super(fabricante, modelo, year, batteryCapacity);
        this.waterResistance = waterResistance;
        this.batteryDuration = batteryDuration;
    }

    //metodos


    @Override
    public String toString() {
        return "SmartWath{" +
                "waterResistance=" + waterResistance +
                ", batteryDuration=" + batteryDuration +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", year=" + year +
                ", batteryCapacity=" + batteryCapacity +
                '}';
    }
}
