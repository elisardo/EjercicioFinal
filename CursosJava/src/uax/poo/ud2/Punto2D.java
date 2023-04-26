package uax.poo.ud2;

public class Punto2D {
    private double coordenadaX;
    private double coordenadaY;
    private static Punto2D centroCoordenadas;
    static {
        centroCoordenadas = new Punto2D(0, 0);
    }
    public Punto2D(double x, double y) {
        this.coordenadaX = x;
        this.coordenadaY = y;
    }
    @Override
    public String toString() {
        return "Punto2D{" + "coordenadaX=" + getCoordenadaX() + ", coordenadaY=" + getCoordenadaY() + '}';
    }
    private double auxiliar(double a, double b) {
        return Math.pow(a - b, 2);
    }
    public double distancia(Punto2D p) {
        return Math.sqrt(auxiliar(this.getCoordenadaX(), p.getCoordenadaX())
                + auxiliar(this.getCoordenadaY(), p.getCoordenadaY()));
    }
    /**
     * @return the coordenadaX
     */
    public double getCoordenadaX() {
        return coordenadaX;
    }
    /**
     * @return the coordenadaY
     */
    public double getCoordenadaY() {
        return coordenadaY;
    }
    /**
     * @return the centroCoordenadas
     */
    public static Punto2D getCentroCoordenadas() {
        return centroCoordenadas;
    }

}

