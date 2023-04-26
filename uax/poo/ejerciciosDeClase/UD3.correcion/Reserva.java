package uax.poo.ejerciciosDeClase.UD3.correcion;

import java.util.GregorianCalendar;

public class Reserva implements Impresion,Cloneable{

    private Habitacion habitacion;
    private GregorianCalendar fechaInicio;
    private GregorianCalendar fechaFin;


    public Reserva(Habitacion habitacion, GregorianCalendar fechaInicio, GregorianCalendar fechaFin) {
        if(!fechaInicio.before(fechaFin)){
            throw new IllegalArgumentException("La fecha de inicio no puede ser anterior a la de fin");
            //System.out.println("La fecha de inicio no puede ser anterior a la de fin");
        }
        this.habitacion = habitacion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public GregorianCalendar getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(GregorianCalendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public GregorianCalendar getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(GregorianCalendar fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public void imprimirTodo() {
        System.out.println("La Reserva es: ");
        System.out.println("INICIO: " + this.getFechaInicio());
        System.out.println("INICIO: " + this.getFechaFin());
        System.out.println(this.habitacion.getNumero());
        System.out.println(this.habitacion.getPrecio());
        System.out.println(this.habitacion.isConBanyo());

    }
}
