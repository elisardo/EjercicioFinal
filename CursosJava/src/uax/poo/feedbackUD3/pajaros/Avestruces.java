package uax.poo.feedbackUD3.pajaros;

public class Avestruces extends Pajaros {
    //atributos
    private int maxVelocidad;

    //constructores
    public Avestruces(){
    }

    public Avestruces(int maxVelocidad) {
        this.maxVelocidad = maxVelocidad;
    }

    public Avestruces(String especie, double peso, double envergadura, int maxVelocidad) {
        super("Avestruz", peso, envergadura);
        this.maxVelocidad = maxVelocidad;
    }
    //metodos

    public int getMaxVelocidad() {
        return maxVelocidad;
    }

    public void setMaxVelocidad(int maxVelocidad) {
        this.maxVelocidad = maxVelocidad;
    }

    @Override
    public String toString() {
        return "Avestruces{" +
                "maxVelocidad=" + maxVelocidad +
                '}';
    }
    @Override
    public void puedeVolar() {
        if (isVolar()) {
            System.out.println("Soy un "+ super.getEspecie() + " y puedo volar");
        } else {
            System.out.println("Soy un "+ super.getEspecie() + " y no puedo volar");
        }
    }

    @Override
    public void puedeNadar() {
        if (isNadar()) {
            System.out.println("Soy un "+ super.getEspecie() + " y puedo nadar");
        } else {
            System.out.println("Soy un "+ super.getEspecie() + " y no puedo nadar");
        }
    }

    @Override
    public void puedeBucear() {
        if (isBucear()) {
            System.out.println("Soy un "+ super.getEspecie() + " y puedo bucear");
        } else {
            System.out.println("Soy un "+ super.getEspecie() + " y no puedo bucear");
        }
    }
}
