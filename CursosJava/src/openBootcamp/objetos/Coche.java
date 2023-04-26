package openBootcamp.objetos;

/**
 * para crear objetos debemos definir siempre "atributos" (características del objeto),
 * "constructores"(nos permiten construir objetos apartir de esta clase)
 * y "comportamiento"(acciones que realiza el objeto)
 * ....opcionalmente, puede definirse "to String"
 */
public class Coche {

    //atributos (caracteristicas del objeto)
    String color;
    String fabricante;
    String modelo;
    Double peso;
    Double largo;
    Integer velocidad = 0;//se necesita para el "comportamiento" acelerar

    //constructores (metodos que nos permiten construir objetos apartir de esta clase)
    /*
    el metodo constructor recibe el mismo nobre que la clase. Los valores se reciben
    desde fuera de la clase y que se asignan al interior de la clase, a los objetos que
    se creen a partir de la clase
     */
    public Coche(String color, String fabricante, String modelo, Double peso, Double largo) {
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.largo = largo;
    }

    public Coche(){ //podemos tener constructores vacios

    }

    /*
    puede haber mas constructores sobrecargados
     */

    //comportamiento (acciones que realiza el objeto
    /*
    definimos una velocidad inicial de 0 para luego incrementarla.
    Para evitar pasar el limite 120, ponemos un if
     */
    public void acelerar(Integer cantidad){
        if(cantidad>0 && cantidad<=120){
            this.velocidad += cantidad;
        }
    }

    //Metodo toString (para imprimir el valor de las variables)
    //se auto-genera con el boton derecho Generate...

    @Override
    public String toString() {
        return "Coche{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}