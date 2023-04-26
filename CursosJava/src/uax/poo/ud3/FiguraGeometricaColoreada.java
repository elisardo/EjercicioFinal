/**
 * Una clase Abstracta puede tener atributos, constructores y métodos pero, si tiene
 * algún método declarado y no implemantado (abstract), ya es una clas abstracta
 */

package uax.poo.ud3;

public abstract class FiguraGeometricaColoreada {

    String colorRelleno;
    String colorBorde;

    public abstract double area();//metodo declarado pero NO implementado

    public FiguraGeometricaColoreada(String colorRelleno, String colorBorde) {
        this.colorRelleno = colorRelleno;
        this.colorBorde = colorBorde;
    }

    public void quitarBorde(){
        this.colorBorde = "Transparente";
    }

    public void quitarRelleno(){
        this.colorRelleno = "Transparente";
    }

    public void unificarColores(){
        this.colorBorde = this.colorRelleno;
    }

    @Override
    public String toString() {
        return "FiguraGeometricaColoreada{" +
                "colorRelleno='" + colorRelleno + '\'' +
                ", colorBorde='" + colorBorde + '\'' +
                '}';
    }

    public String getColorRelleno() {
        return colorRelleno;
    }

    public void setColorRelleno(String colorRelleno) {
        this.colorRelleno = colorRelleno;
    }

    public String getColorBorde() {
        return colorBorde;
    }

    public void setColorBorde(String colorBorde) {
        this.colorBorde = colorBorde;
    }
}
