package uax.poo.ud3;

public class Triangulo extends FiguraGeometricaColoreada{

    private int base;
    private int altura;

    public Triangulo(String colorRelleno, String colorBorde, int base, int altura) {
        super(colorRelleno, colorBorde);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return (base*altura)/2;
    }
}
