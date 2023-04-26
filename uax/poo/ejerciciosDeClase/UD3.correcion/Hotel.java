package uax.poo.ejerciciosDeClase.UD3.correcion;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Hotel implements Impresion{

    private static final int MAX_RESERVAS = 200;

    private String nombre;
    private Habitacion[] habitaciones;
    private Reserva[] reservas;

    public Hotel(String nombre, int numeroHabitaciones) {
        this.nombre = nombre;
        this.habitaciones = new Habitacion[numeroHabitaciones];
        this.reservas = new Reserva[MAX_RESERVAS];
    }

    public void anaydirHabitacion(Habitacion habitacion){
        int aux = 0;
        while(habitaciones[aux] != null && aux<habitaciones.length){
            aux++;
            if(aux == habitaciones.length){
                System.out.println("No hay habitaciones libres");
            }else{
                habitaciones[aux] = habitacion;
            }
        }
    }

    public void anaydirReserva(Habitacion habitacion, GregorianCalendar fechaInicio,GregorianCalendar fechaFin) throws HabitacionOcupadaException {

        boolean existeHabitacion = false;
        boolean habitacionReservada = false;

        for (Habitacion h : habitaciones){
            if(h == habitacion){
                existeHabitacion = true;
            }
        }

        for (Reserva r : reservas){
            if(r!=null && r.getHabitacion()== habitacion && !r.getFechaInicio().after(fechaFin) && !fechaInicio.after(r.getFechaFin())){
                habitacionReservada = true;
            }
        }

        if(existeHabitacion && !habitacionReservada){
            Reserva reserva = new Reserva(habitacion,fechaInicio,fechaFin);
            int aux = 0;
            while(reservas[aux]!=null && aux<MAX_RESERVAS){
                aux++;
                if(aux == MAX_RESERVAS){
                    System.out.println("Todas las reservas ocupadas");
                }else{
                    reservas[aux] = reserva;
                }
            }
        }else{
            throw new HabitacionOcupadaException();
        }
    }

    public void listarOcupacion(){
        Calendar actual = Calendar.getInstance();
        for (Reserva r : reservas){
            if(r!=null && r.getFechaInicio().compareTo(actual)<0 && r.getFechaFin().compareTo(actual)>0 ){
                r.imprimirTodo();
            }
        }
    }

    @Override
    public void imprimirTodo() {
        System.out.println("Nombre del Hotel " + this.nombre);
    }
}
