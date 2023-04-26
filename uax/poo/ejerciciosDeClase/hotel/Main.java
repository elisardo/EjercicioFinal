package uax.poo.ejerciciosDeClase.hotel;

import java.util.GregorianCalendar;

public class Main {

        public static void main(String[] args) {

                Hotel hotel = new Hotel("Hotel UAX POO",10);

                Habitacion hs1 = new HabitacionSimple(1,20,false,false);
                Habitacion hs2 = new HabitacionSimple(2,70,false,true);
                Habitacion hs3 = new HabitacionSimple(3,180,true,true);

                HabitacionDoble hd1 = new HabitacionDoble(4,100,true,2);
                HabitacionDoble hd2 = new HabitacionDoble(5,150,true,5);
                HabitacionDoble hd3 = new HabitacionDoble(6,200,true,4);

                HabitacionSuite hsuite1 = new HabitacionSuite(7,250,true,40);
                HabitacionSuite hsuite2 = new HabitacionSuite(8,500,true,200);

                hotel.anyadirHabitacion(hs1);
                hotel.anyadirHabitacion(hs2);
                hotel.anyadirHabitacion(hs3);
                hotel.anyadirHabitacion(hd1);
                hotel.anyadirHabitacion(hd2);
                hotel.anyadirHabitacion(hd3);
                hotel.anyadirHabitacion(hsuite1);
                hotel.anyadirHabitacion(hsuite2);

                GregorianCalendar fechaInicio = new GregorianCalendar();
                fechaInicio.set(GregorianCalendar.YEAR,2012);
                fechaInicio.set(GregorianCalendar.MONTH,12);
                fechaInicio.set(GregorianCalendar.DATE,21);

                GregorianCalendar fechaFin = new GregorianCalendar();
                fechaFin.set(GregorianCalendar.YEAR,2012);
                fechaFin.set(GregorianCalendar.MONTH,12);
                fechaFin.set(GregorianCalendar.DATE,24);

                try{
                    hotel.anyadirReserva(hs1,fechaInicio,fechaFin);
                }catch (HabitacionOcupadaException e){
                    System.out.println(e.getMessage());
                }

                fechaInicio.set(GregorianCalendar.YEAR,2012);
                fechaInicio.set(GregorianCalendar.MONTH,11);
                fechaInicio.set(GregorianCalendar.DATE,26);

                fechaFin.set(GregorianCalendar.YEAR,2012);
                fechaFin.set(GregorianCalendar.MONTH,11);
                fechaFin.set(GregorianCalendar.DATE,30);

                try{
                    hotel.anyadirReserva(hd1,fechaInicio,fechaFin);
                }catch (HabitacionOcupadaException e){
                    System.out.println(e.getMessage());
                }

                fechaInicio.set(GregorianCalendar.YEAR,2013);
                fechaInicio.set(GregorianCalendar.MONTH,0);
                fechaInicio.set(GregorianCalendar.DATE,1);

                fechaFin.set(GregorianCalendar.YEAR,2013);
                fechaFin.set(GregorianCalendar.MONTH,0);
                fechaFin.set(GregorianCalendar.DATE,3);

                try{
                    hotel.anyadirReserva(hsuite1,fechaInicio,fechaFin);
                }catch (HabitacionOcupadaException e){
                    System.out.println(e.getMessage());
                }

                fechaInicio.set(GregorianCalendar.YEAR,2013);
                fechaInicio.set(GregorianCalendar.MONTH,0);
                fechaInicio.set(GregorianCalendar.DATE,2);

                fechaFin.set(GregorianCalendar.YEAR,2013);
                fechaFin.set(GregorianCalendar.MONTH,0);
                fechaFin.set(GregorianCalendar.DATE,4);

                try{
                    hotel.anyadirReserva(hsuite1,fechaInicio,fechaFin);
                }catch (HabitacionOcupadaException e){
                    System.out.println(e.getMessage());

                }

                hotel.imprimirTodo();
                hotel.listarOcupacion();

        }
}
