package uax.poo.ejerciciosDeClase.pajaros;

public class Avestruz extends Pajaro{
    //atributos

    //constructor
    public Avestruz(String especie){
        super(especie);
    }

    //metodos
    public void volar(){
        System.out.println("Las avestruces no pueden volar");
    }
    public void nadar(){
        System.out.println("Las avestruces no pueden nadar");
    }
    public void bucear(){
        System.out.println("Las avestruces no pueden bucear");
    }




}
