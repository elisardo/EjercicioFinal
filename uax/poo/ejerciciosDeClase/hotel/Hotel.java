package uax.poo.ejerciciosDeClase.hotel;


import java.util.GregorianCalendar;


public class Hotel implements Impresion {

    //atributos
    private String nombre;
    private Habitacion[] habitaciones;
    private Reserva[] reservas;

    //constructor
    public Hotel(String nombre, int numeroHabitaciones) {
        this.nombre = nombre;
        this.habitaciones = new Habitacion[numeroHabitaciones];
        this.reservas = new Reserva[200];
    }

    //metodos
    public void anyadirHabitacion(Habitacion habitacion) {
        for (int i = 0; i < habitaciones.length; i++) {
            if (habitaciones[i] == null) {
                habitaciones[i] = habitacion;
                break;
            }
        }
    }

    public void anyadirReserva(Habitacion habitacion, GregorianCalendar fechaInicio, GregorianCalendar fechaFin) throws HabitacionOcupadaException {
        for (int i = 0; i < reservas.length; i++) {
            if (reservas[i] == null) {
                reservas[i] = new Reserva(habitacion, fechaInicio, fechaFin);
                break;
            }
        }


    }








    public void listarOcupacion() {
        for (int i = 0; i < reservas.length; i++) {//recorro el array de reservas
            if (reservas[i] != null) {//si la posicion del array no esta vacia
                if (reservas[i].getFechaInicio().compareTo(new GregorianCalendar()) < 0 && reservas[i].getFechaFin().compareTo(new GregorianCalendar()) > 0) {//compruebo que la fecha de inicio y fin no este ocupada
                    System.out.println(reservas[i]);//si no esta ocupada imprimo la reserva
                }
            }
        }
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

    public Hotel() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void imprimirTodo() {
        System.out.println("Hotel: " + nombre);
        System.out.println("Habitaciones: ");
        for (int i = 0; i < habitaciones.length; i++) {
            if (habitaciones[i] != null) {
                System.out.println(habitaciones[i]);
            }
        }
        System.out.println("Reservas: ");
        for (int i = 0; i < reservas.length; i++) {
            if (reservas[i] != null) {
                System.out.println(reservas[i]);
            }
        }
    }
}
