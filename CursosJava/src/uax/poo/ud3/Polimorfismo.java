/**
 * la clase GregorianCalendar es una hija de Calendar, que es una clase abstract
 * porque tiene metodos declarado que son incompletos(no hay codigo que los implemente)
 * Una clase abstrac (no se puede instanciar)
 */

package uax.poo.ud3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Polimorfismo {
    public static void main(String[] args) {
        Calendar fecha1 = new GregorianCalendar();
        GregorianCalendar fecha2 = new GregorianCalendar();
        Calendar fecha3 = new Calendar() {
            @Override
            protected void computeTime() {

            }

            @Override
            protected void computeFields() {

            }

            @Override
            public void add(int field, int amount) {

            }

            @Override
            public void roll(int field, boolean up) {

            }

            @Override
            public int getMinimum(int field) {
                return 0;
            }

            @Override
            public int getMaximum(int field) {
                return 0;
            }

            @Override
            public int getGreatestMinimum(int field) {
                return 0;
            }

            @Override
            public int getLeastMaximum(int field) {
                return 0;
            }
        };//como es una clase abstract nos obliga a todos los metodos

    }
}
