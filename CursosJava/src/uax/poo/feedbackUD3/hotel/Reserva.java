package uax.poo.feedbackUD3.hotel;

import java.util.GregorianCalendar;

public class Reserva extends Object implements Cloneable, Impresion{

    //atributos
    private Habitacion habitacion;
    //la habitacion es una de las del hotel

    private GregorianCalendar fechaInicio;
    private GregorianCalendar fechaFin;

    //constructores
    Reserva(){
    }

    public Reserva(Habitacion habitacion, GregorianCalendar fechaInicio, GregorianCalendar fechaFin) throws Exception{
        this.habitacion = habitacion;
        if(habitacion instanceof Habitacion);//la habitacion es una de las del hotel
        else throw new Exception("La habitacion no es una de las del hotel");
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        //IllegalArgumentException
        if(fechaInicio.compareTo(fechaFin) > 0) throw new IllegalArgumentException
                ("La fecha de inicio es posterior a la de fin");
    }

    //metodos

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
    public String toString() {
        return "Reserva{" +
                "habitacion=" + habitacion +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                '}';
    }

    @Override
    public void ImprimirTodo() {
        System.out.println("Reserva{" +
                "habitacion=" + habitacion +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                '}');
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        try{
            Reserva reserva = new Reserva();
            reserva.setHabitacion((Habitacion) this.habitacion.clone());//no se porqué da error
            reserva.setFechaInicio((GregorianCalendar) this.fechaInicio.clone());
            reserva.setFechaFin((GregorianCalendar) this.fechaFin.clone());
            return reserva;
        }catch(CloneNotSupportedException ex){
            return null;
        }
    }
}
