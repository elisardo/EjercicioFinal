package poo;

public class Coche {
    int ruedas;
    int largo;//en cm
    int ancho;//en cm
    int motor;//en cc
    int peso_plataforma;//en kg
    String color;
    int peso_total;
    boolean asientos_cuero, climatizador;

    //crear método constructor
    public Coche(){//construimos el estado inicial de la clase
        ruedas=4;
        largo=2000;
        ancho=300;
        motor=1600;
        peso_plataforma=500;
    }
    //Metodo constructor getter
    public String dime_datos_generales() {
        return "La plataforma del vehículo tiene " + ruedas + " ruedas, un largo de " + largo/1000 + " m, un ancho de " + ancho + " cm, un motor de " + motor + " cc y un peso de " + peso_plataforma + " kg";
    }
    //Metodo constructor setter
    public void establece_color(String color_coche){//void no devuelve parametros
        color=color_coche;
    }
    //Metodo constructor getter
    public String dime_color(){
        return "El color del coche es "+color;
    }




}
