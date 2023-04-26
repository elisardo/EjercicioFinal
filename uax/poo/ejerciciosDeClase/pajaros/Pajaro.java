package uax.poo.ejerciciosDeClase.pajaros;

public class Pajaro {

       //atributos
    private boolean puedeVolar;
    private boolean puedeNadar;
    private boolean puedeBucear;
        private String especie;

        //constructor
        public Pajaro(String especie){
            this.especie = especie;
        }
        //metodos



    public String getEspecie(){
        return especie;
    }

    public void setEspecie(String especie){
        this.especie = especie;
    }

    public boolean getPuedeVolar(){
        return puedeVolar;
    }

    public void setPuedeVolar(boolean puedeVolar){
        this.puedeVolar = puedeVolar;
    }

    public boolean getPuedeNadar(){
        return puedeNadar;
    }

    public void setPuedeNadar(boolean puedeNadar){
        this.puedeNadar = puedeNadar;
    }

    public boolean getPuedeBucear(){
        return puedeBucear;
    }

    public void setPuedeBucear(boolean puedeBucear){
        this.puedeBucear = puedeBucear;
    }

}
