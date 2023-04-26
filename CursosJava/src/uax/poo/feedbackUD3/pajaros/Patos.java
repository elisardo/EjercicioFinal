package uax.poo.feedbackUD3.pajaros;

public class Patos extends Pajaros {
//atributos
    private boolean migrante;

    //constructores
    public Patos(){
    }

    public Patos(boolean migrante) {
        this.migrante = migrante;
    }

    public Patos(String especie, double peso, double envergadura, boolean volar, boolean nadar, boolean migrante) {
        super("Pato", peso, envergadura, volar, nadar);
        this.migrante = migrante;
    }
    //metodos

    public boolean isMigrante() {
        return migrante;
    }

    public void setMigrante(boolean migrante) {
        this.migrante = migrante;
    }

    @Override
    public String toString() {
        return "Patos{" +
                "migrante=" + migrante +
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

