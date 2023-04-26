package uax.poo.feedbackFinal.ejercicio1;

public class Perfil {

    //atributos
    private int valor;
    private int carisma;
    private int suerte;

    //constructores
    public Perfil() {
    }

    public Perfil(int valor, int carisma, int suerte) {
        this.valor = valor;
        this.carisma = carisma;
        this.suerte = suerte;
    }


    //metodos

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getCarisma() {
        return carisma;
    }

    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }

    public int getSuerte() {
        return suerte;
    }

    public void setSuerte(int suerte) {
        this.suerte = suerte;
    }

    public int nivelPerfil(Jugador j){ //devuelve la suma de los tres atributos
        return valor+carisma+suerte;
    }

    @Override
    public String toString() {
        return "{" +
                "\nValor: " + valor +
                "\nCarisma: " + carisma +
                "\nSuerte: " + suerte+
                "\n}";
    }


}
