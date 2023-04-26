package uax.poo.ud3;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Circulo extends FiguraGeometricaColoreada implements java.lang.Cloneable {

    private int radio;

    public Circulo(int radio, String colorRelleno, String colorBorde) {
        super(colorRelleno, colorBorde);
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radio,2) ;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                '}';
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public Object clone() {
        try{
            return super.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Circulo.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }
    }

}
