package uax.poo.feedbackUD5;

import static uax.poo.feedbackUD5.Fecha.diaSiguiente;
import static uax.poo.feedbackUD5.Fecha.isPosterior;

public class Main {
    private int dia;
    private int mes;
    private int anno;

    public static <siguiente> void main(String[] args) throws Exception {

        Fecha fecha1 = new Fecha(30, 1, 2023, 23, 59, 59);//fecha actual CORRECTA

        /***************PRUEBAS DE LAS RESTRICCIONES***************/

        Fecha fecha2 = new Fecha(30, 6, 2015, 23, 59, 60);//segundo intercalar CORRECTO
        Fecha fecha3 = new Fecha(29, 2, 2020, 23, 59, 59);//año bisiesto CORRECTO
        Fecha fecha4 = new Fecha(17, 6, 2023, 23, 59, 59);//fecha CORRECTA

        /***************PRUEBAS DE LAS EXCEPCIONES***************/
        /**         Al borrar los comentarios se pueden probar como saltan las EXCEPTION*/
      //fecha fecha6 = new fecha(15, 10, 1581, 23, 59, 59);//fecha anterior a 15/10/1582 INCORRECTO
    //  fecha fecha7 = new fecha(29, 2, 2023, 23, 59, 59);//año no bisiesto INCORRECTO
    //  fecha fecha9 = new fecha(31, 6, 2023, 23, 59, 59);//dia INCORRECTO
    //  fecha fecha10 = new fecha(30, 13, 2023, 23, 59, 59);//mes INCORRECTO
    //  fecha fecha11 = new fecha(30, 6, 2023, 24, 59, 59);//hora INCORRECTO
    //  fecha fecha12 = new fecha(30, 6, 2023, 23, 60, 59);//minuto INCORRECTO
    //  fecha fecha13 = new fecha(30, 6, 2023, 23, 59, 60);//segundo INCORRECTO
    //  fecha fecha14 = new fecha(-30, 6, 2023, 23, 59, 59);//dia NEGATIVO INCORRECTO

        /***************PRUEBAS DE LOS CONSTRUCTORES SOBRECARGADOS***************/
        Fecha fecha15 = new Fecha(30, 1, 2023);//fecha CORRECTA
        Fecha fecha5 = new Fecha(28, 2, 2023);//fecha CORRECTA

        /***************PRUEBAS DE LAS RESTRICCIONES***************/
        Fecha fecha16 = new Fecha(29, 2, 2020);//año bisiesto CORRECTO

        /***************PRUEBAS DE LAS EXCEPCIONES***************/

        // fecha fecha17 = new fecha(29, 2, 2023);//año no bisiesto INCORRECTO
        // fecha fecha18 = new fecha(14, 10, 1582);//fecha anterior a 15/10/1582 INCORRECTO
        // fecha fecha19 = new fecha(31, 6, 2023);//dia INCORRECTO
        //  fecha fecha20 = new fecha(30, 13, 2023);//mes INCORRECTO
        //  fecha fecha21 = new fecha(-30, 6, 2023);//dia NEGATIVO INCORRECTO



        /***************PRUEBAS DE LAS RESTRICCIONES FECHA STRING***************/

        Fecha fecha23 = new Fecha("30/1/2023");//fecha actual CORRECTA
        Fecha fecha24 = new Fecha("29/2/2020");//año bisiesto CORRECTO
        System.out.println("Imprimiendo " +fecha24);
        System.out.println("Imprimiendo " +fecha23);

        /***************PRUEBAS DE LAS EXCEPCIONES FECHA STRING***************/
        // fecha fecha25 = new fecha("17/6/2023/23/59/59");//longitud de fecha INCORRECTA


        /***************PRUEBAS isPosterior***************/

        boolean posterior= isPosterior(fecha24,fecha23); { //true si la segunda fecha es posterior a la primera
            System.out.println("Es " + posterior + " que la fecha " + fecha23 + " es posterior a la fecha " + fecha24);
        }



        /***************PRUEBAS diaSiguiente***************/
        Fecha siguiente= diaSiguiente(fecha23);
        {
            System.out.println("El dia siguiente a la fecha " + fecha23 + " es " + siguiente);
        }
        Fecha siguiente2= diaSiguiente(fecha24);
        {
            System.out.println("El dia siguiente a la fecha " + fecha24 + " es " + siguiente2);
        }

        /***************PRUEBAS equals***************/

        boolean sonIguales= fecha23.equals(fecha23); {
            if(sonIguales){
                System.out.println("Es " + sonIguales + " que la fecha " + fecha23 + " es igual a la fecha " + fecha23);
            }else{
                System.out.println("Es " + sonIguales + " que la fecha " + fecha23 + " es igual a la fecha " + fecha23);
            }
        }

        boolean sonIguales2= fecha23.equals(fecha24); {
            if(sonIguales2){
                System.out.println("Es " + sonIguales2 + " que la fecha " + fecha23 + " es igual a la fecha " + fecha24);
            }else {
                System.out.println("Es " + sonIguales2 + " que la fecha " + fecha23 + " es igual a la fecha " + fecha24);
            }
        }
    }


}


