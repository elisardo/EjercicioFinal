package uax.poo.feedbackUD3.hotel;

import java.util.Arrays;
import java.util.GregorianCalendar;

public class Hotel implements Impresion {
    //atributos
    private String nombre;
    private Habitacion[] habitaciones;
    private Reserva[] reservas;

    //Constructores
    public Hotel() {
    }

    public Hotel(String nombre, Habitacion[] habitaciones, Reserva[] reservas) {
        this.nombre = nombre;
        this.habitaciones = habitaciones;
        this.reservas = new Reserva[200];
    }
//Metodos

    public void anadirHabitacion(Habitacion habitacion) {//añade una habitacion al array de habitaciones
        for (int i = 0; i < habitaciones.length; i++) {
            if (habitaciones[i] == null) {
                habitaciones[i] = habitacion;
                break;
            }
        }
    }
    public void anadirReserva(Habitacion habitacion,GregorianCalendar fechaInicio,
                              GregorianCalendar fechaFinal) throws Exception{
        if(!existeHabitacion(habitacion)) {
            throw new Exception("La habitación no existe");
        } else if (estaReservada(habitacion,fechaInicio,fechaFinal)){
            throw new Exception("La habitación esta reservada en esas fechas. Pruebe otras fechas");
        }else {
            for (int i = 0; i < reservas.length; i++) {
                if (reservas[i] == null) {
                    reservas[i] = new Reserva(habitacion, fechaInicio, fechaFinal);
                    break;
                }
            }
        }
    }
    private boolean existeHabitacion(Habitacion habitacion) {//comprueba si la habitacion existe
        return true;
    }
    private boolean estaReservada(Habitacion habitacion, GregorianCalendar fechaInicio, GregorianCalendar fechaFinal){
    return true;
    }
    public Object listarOcupacion(){
        GregorianCalendar fechaActual = new GregorianCalendar();
        for (int i = 0; i < reservas.length; i++) {
            if(reservas[i] != null){
                if(reservas[i].getFechaInicio().compareTo(fechaActual) <= 0 &&
                        reservas[i].getFechaFin().compareTo(fechaActual) >= 0){
                    System.out.println(reservas[i].getHabitacion().getNumero());
                }
            }
        }
        return null;
    }
    @Override
    public void ImprimirTodo() {
        System.out.println("Nombre del hotel: " + nombre);
        System.out.println("Habitaciones: " + Arrays.toString(habitaciones));
        System.out.println("Reservas: " + Arrays.toString(reservas));
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Habitacion[] getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(Habitacion[] habitaciones) {
        this.habitaciones = habitaciones;
    }

    public Reserva[] getReservas() {
        return reservas;
    }

    public void setReservas(Reserva[] reservas) {
        this.reservas = reservas;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "nombre='" + nombre + '\'' +
                ", habitaciones=" + Arrays.toString(habitaciones) +
                ", reservas=" + Arrays.toString(reservas) +
                '}';
    }
}




