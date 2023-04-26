package openBootcamp.ejercicios.tema2;

public class TotalConIva {

    public static void main(String[] args) {
        calcularConIva(100, 21);

    }

    private static void calcularConIva(double precio, double iva) {
        double precioFinal = precio + (precio * (iva / 100d));
        System.out.println("El coste total de un precio de " + precio + " y un IVA de " + iva + "  es " + precioFinal);

    }
}
