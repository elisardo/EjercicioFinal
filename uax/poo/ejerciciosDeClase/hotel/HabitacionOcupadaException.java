package uax.poo.ejerciciosDeClase.hotel;

public class HabitacionOcupadaException extends Throwable {
    public HabitacionOcupadaException() {
        super("La habitacion esta ocupada en esas fechas");
    }
}
