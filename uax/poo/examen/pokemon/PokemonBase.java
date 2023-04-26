package uax.poo.examen.pokemon;

import java.util.Random;

 abstract public class PokemonBase implements Impresion, Capturable{
    //atributos
    protected String nombre;
        protected int nivel;
        protected int ataque;
        protected int defensa;
        protected int experiencia;
        int puntosDeVida;

        //constructores
           public PokemonBase(String nombre){
                this.nombre = nombre;
                this.nivel = numeroAleatorio(2,100);
                this.ataque = numeroAleatorio(0,20);
                this.defensa = numeroAleatorio(0,50);
                this.experiencia = numeroAleatorio(0,100);
                this.puntosDeVida = 10+(nivel/100)*(2*ataque)+defensa;
            }

            //metodos
 public int numeroAleatorio(int min, int max){
  Random r = new Random();
  int valorDado = r.nextInt(max)+min;
  return valorDado;
  }

  //Crear un método abstracto llamado atacar (), que reciba como parámetro
    //un objeto de tipo PokemonBase
    abstract public void atacar(PokemonBase pokemon);


    public void ganarExperiencia(int experiencia){
        this.experiencia += experiencia;
        subirDeNivel();
    }


    public void subirDeNivel(){
        if(experiencia >= 50){
            experiencia -= 100;
            nivel += 1;
            ataque += 5;
            defensa += 5;
            puntosDeVida += 10;
            System.out.println(nombre + " ha subido al nivel " + nivel);
        }
    }
    public void capturar(){
        System.out.println(nombre + " ha sido capturado");
    }







 //getters y setters


 public String getNombre() {
  return nombre;
 }

 public void setNombre(String nombre) {
  this.nombre = nombre;
 }

 public int getNivel() {
  return nivel;
 }

 public void setNivel(int nivel) {
  this.nivel = nivel;
 }

 public int getAtaque() {
  return ataque;
 }

 public void setAtaque(int ataque) {
  this.ataque = ataque;
 }

 public int getDefensa() {
  return defensa;
 }

 public void setDefensa(int defensa) {
  this.defensa = defensa;
 }

 public int getExperiencia() {
  return experiencia;
 }

 public void setExperiencia(int experiencia) {
  this.experiencia = experiencia;
 }

 public int getPuntosDeVida() {
  return puntosDeVida;
 }

 public void setPuntosDeVida(int puntosDeVida) {
  this.puntosDeVida = puntosDeVida;
 }



}
