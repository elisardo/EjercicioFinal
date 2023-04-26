package openBootcamp.poo.herencia;
/**
 * Clase derivada, Clase hija o subclase
 */

import openBootcamp.poo.clases.Motor;
import openBootcamp.poo.clases.Vehiculo;

public class Motocicleta  extends Vehiculo {
    //atributos
    boolean baul;

    //Generar constructor vacio
    public Motocicleta(){

    }

    //Generar Constructor

    /**
     * Hemos generado un constructur para la clase SUPER y añade el parametro local "baul/boolean"
     * @param fabricante
     * @param modelo
     * @param cc
     * @param year
     * @param sport
     * @param traction4
     * @param speed
     * @param motor
     * @param baul
     */
    public Motocicleta(String fabricante, String modelo, double cc, int year, boolean sport, boolean traction4, int speed, Motor motor, boolean baul) {
        super(fabricante, modelo, cc, year, sport, traction4, speed, motor);
        this.baul = baul;
    }
}
