package uax.poo.ud3;

public class Cuadrado extends  FiguraGeometricaColoreada{

    private int lado; //private para encapsularlo

    public Cuadrado(int lado, String colorRelleno, String colorBorde) {
        super(colorRelleno, colorBorde);
        this.lado = lado;
    }

    @Override
    public double area() {//metodo heredado de la superclase
        //podemos utilizar la lib Math para elevar el lado al cuadrado
        //Math.pow(lado,2)
        return lado*lado;
    }

    @Override
    public String toString() { //solamente para el lado del cuadrado
        return "Cuadrado{" +
                "lado=" + lado +
                '}';
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
}
