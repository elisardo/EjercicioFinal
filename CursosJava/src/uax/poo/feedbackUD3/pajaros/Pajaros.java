package uax.poo.feedbackUD3.pajaros;

public abstract class Pajaros {//abstract porque hay metodos sin implementar
    //atributos
    private String especie;
    private double peso;
    private double envergadura;
    private boolean volar;
    private boolean nadar;
    private boolean bucear;

    //constructores
    public Pajaros(){
    }

    public Pajaros(String especie, double peso, double envergadura, boolean volar, boolean nadar, boolean bucear) {
        this.peso = peso;
        this.envergadura = envergadura;
        this.volar = volar;
        this.nadar = nadar;
        this.bucear = bucear;
    }

    public Pajaros(String especie, double peso, double envergadura, boolean volar) {//para los murcielagos
    }

    public Pajaros(String especie, double peso, double envergadura, boolean volar, boolean nadar) {//para los patos
    }

    public Pajaros(String especie, double peso, double envergadura) {//para los avestruces
    }
    //metodos


    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEnvergadura() {
        return envergadura;
    }

    public void setEnvergadura(double envergadura) {
        this.envergadura = envergadura;
    }

    public boolean isVolar() {
        return volar;
    }

    public void setVolar(boolean volar) {
        this.volar = volar;
    }

    public boolean isNadar() {
        return nadar;
    }

    public void setNadar(boolean nadar) {
        this.nadar = nadar;
    }

    public boolean isBucear() {
        return bucear;
    }

    public void setBucear(boolean bucear) {
        this.bucear = bucear;
    }

    @Override
    public String toString() {
        return "Pajaros{" +
                "especie='" + especie + '\'' +
                ", peso=" + peso +
                ", envergadura=" + envergadura +
                ", volar=" + volar +
                ", nadar=" + nadar +
                ", bucear=" + bucear +
                '}';
    }

    public void puedeVolar(){

    }
    public void puedeNadar(){

    }
    public void puedeBucear(){

    }

}
