package uax.poo.feedbackUD3.hotel;

import java.util.GregorianCalendar;


public class Main implements Impresion {
    public static void main(String[] args) throws Exception {
        Hotel hotel = new Hotel();
        hotel.setNombre("Hotel UAX");
        HabitacionSimple h1 = new HabitacionSimple(101, 45, false, true);
        HabitacionDoble h2 = new HabitacionDoble(102, 90, true, 2);
        HabitacionSimple h3 = new HabitacionSimple(201, 50, true, true);
        HabitacionDoble h4 = new HabitacionDoble(202, 110, true, 3);
        HabitacionSimple h5 = new HabitacionSimple(301, 50, true, true);
        HabitacionDoble h6 = new HabitacionDoble(301, 110, true, 3);
        HabitacionSuite h7 = new HabitacionSuite(401, 300, true, 60);
        HabitacionSuite h8 = new HabitacionSuite(501, 300, true, 45);

        Habitacion[] habitaciones = new Habitacion[8];
        habitaciones[0] = h1;
        habitaciones[1] = h2;
        habitaciones[2] = h3;
        habitaciones[3] = h4;
        habitaciones[4] = h5;
        habitaciones[5] = h6;
        habitaciones[6] = h7;
        habitaciones[7] = h8;

        //Hacer reservas
        Reserva r1 = new Reserva(h1, new GregorianCalendar(2012, 12, 21),
                new GregorianCalendar(2012, 12, 24));
        Reserva r2 = new Reserva(h2, new GregorianCalendar(2012, 11, 26),
                new GregorianCalendar(2012, 11, 30));
        Reserva r3 = new Reserva(h7, new GregorianCalendar(2013, 1, 1),
                new GregorianCalendar(2013, 01, 3));
        Reserva r4 = new Reserva(h7, new GregorianCalendar(2013, 1, 2),
                new GregorianCalendar(2013, 01, 4));

        Reserva[] reservas = new Reserva[200];
        reservas[0] = r1;
        reservas[1] = r2;
        reservas[2] = r3;
        reservas[3] = r4;

        System.out.println(hotel.listarOcupacion());
        imprimirCompleto();
    }

    private static void imprimirCompleto() {
        System.out.println("El hotel está completo");
    }

    @Override
    public void ImprimirTodo() {

    }
}