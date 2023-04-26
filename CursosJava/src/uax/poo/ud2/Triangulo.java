package uax.poo.ud2;

public class Triangulo {
    private Punto2D v1;
    private Punto2D v2;
    private Punto2D v3;
    public Triangulo(Punto2D v1, Punto2D v2, Punto2D v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    @Override
    public String toString() {
        return "Tri\u00e1ngulo{" + "v1=" + v1 + ", v2=" + v2 + ", v3=" + v3 + '}';
    }

    public double perimetro (){
        return v1.distancia(v2)+v2.distancia(v3)+v3.distancia(v1);
    }
    /**
     * @return the v1
     */
    public Punto2D getV1() {
        return v1;
    }
    /**
     * @param v1 the v1 to set
     */
    public void setV1(Punto2D v1) {
        this.v1 = v1;
    }
    /**
     * @return the v2
     */
    public Punto2D getV2() {
        return v2;
    }
    /**
     * @param v2 the v2 to set
     */
    public void setV2(Punto2D v2) {
        this.v2 = v2;
    }
    /**
     * @return the v3
     */
    public Punto2D getV3() {
        return v3;
    }
    /**
     * @param v3 the v3 to set
     */
    public void setV3(Punto2D v3) {
        this.v3 = v3;
    }
}
