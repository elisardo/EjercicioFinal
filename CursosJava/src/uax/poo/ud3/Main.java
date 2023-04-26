package uax.poo.ud3;

public class Main {

    public static void main(String[] args) {

        Circulo circulo = new Circulo(10,"rojo","blanco");

        System.out.println(circulo.getColorBorde());
        circulo.setColorBorde("amarillo");
        System.out.println(circulo.getColorBorde());
    }
}
