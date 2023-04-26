package uax.poo.ud3;

public class Esfera implements Medible{

    double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double superficie() {
        return 4*Math.PI*radio*radio;
    }

    @Override
    public double volumen() {
        return 4*Math.PI*radio*radio*radio;
    }
}
