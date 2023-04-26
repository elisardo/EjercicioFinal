package openBootcamp.poo.clases;

/**
 * Esta es la Clase Base, Clase Padre o SuperClase
 */
public class Vehiculo {


    //atributos (caracteristicas del objeto)
    /**
     * pueden ser: publicos (accedemos desde fuera de la clase)
     * protected (accedemos desde fuera de la clase)
     * private (accedemos solo desde dentro de la clase o
     * desde fuera de la clase con Getters y Setters). Es lo mas habitual
     */
    public String fabricante;
    public String modelo;
    double cc;
    int year;
    boolean sport;
    boolean traction4;
    public int speed=0; //se declara para poder usarlo en los METODOS
    Motor motor;//podemos crear atributos que sean objetos (Clase Motor)

    //constructores (metodos/funciones que nos permiten construir objetos apartir de esta clase)
    /**
     * 1-los constructores por convencion se declaran publicos (accesibles desde fuera de la clase)
     * 2- recibe el mismo nombre de la clase
     * 3- los parametro que le pasamos al constructor puden ser, NINGUNO, ALGUNO o TODOS los indicados en
     * los atributos (no da error por el concepto de SOBRECARGA)
     * 4- con el boton derecho podemos generar los CONSTRUCTORES
     */

    public Vehiculo(){
//en este constructor NO le pasamos atributos
    }

    public Vehiculo(String fabricante){
        //estos valores que estamos recibiendo hay que asignarlos al objeto que creemos, mediante THIS
        this.fabricante = fabricante;//this.fabricante hace referencia a la variable de los atributos
    }

    public Vehiculo(String fabricante, String modelo, double cc, int year, boolean sport, boolean traction4){

        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cc = cc;
        this.year = year;
        this.sport = sport;
        this.traction4=traction4;
    }
//vamos a crear un constructor que contenga objetos. Recibe el atributo Objeto Motor.
    public Vehiculo(String fabricante, String modelo, double cc, int year, boolean sport, boolean traction4, int speed, Motor motor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cc = cc;
        this.year = year;
        this.sport = sport;
        this.traction4 = traction4;
        this.speed = speed;
        this.motor = motor;
    }
//Metodos (comportamiento o acciones que realiza el objeto)

    public void acelerar (int quantity) {// sumar una vantidad a la velocidad que tenga el vehiculo
        this.speed += quantity;
    }

    //Metodos Getter y Setter
}
