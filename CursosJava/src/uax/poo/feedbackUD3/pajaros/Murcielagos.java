package uax.poo.feedbackUD3.pajaros;

public class Murcielagos extends Pajaros {
    //atributos
    private boolean insectivoro;

    //constructores
    public Murcielagos(){
    }

    public Murcielagos(boolean insectivoro) {
        this.insectivoro = insectivoro;
    }

    public Murcielagos(String especie, double peso, double envergadura, boolean volar, boolean insectivoro) {
        super("Murcielago", peso, envergadura, volar);
        this.insectivoro = insectivoro;
    }

    //metodos

    public boolean isInsectivoro() {
        return insectivoro;
    }

    public void setInsectivoro(boolean insectivoro) {
        this.insectivoro = insectivoro;
    }

    @Override
    public String toString() {
        return "Murcielagos{" +
                "insectivoro=" + insectivoro +
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
