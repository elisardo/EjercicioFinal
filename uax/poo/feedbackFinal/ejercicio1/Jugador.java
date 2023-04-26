package uax.poo.feedbackFinal.ejercicio1;

public class Jugador {

    //atributos
    private String nombre;
    private String personaje;
    private Perfil perfil;

    //constructores
    public Jugador() {
    }
  public Jugador(String nombre, String personaje, Perfil perfil) {
        this.nombre = nombre;
        this.personaje = personaje;
        this.perfil = perfil;
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPersonaje() {
        return personaje;
    }
    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }
    public Perfil getPerfil() {
        return perfil;
    }
    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    //métodos

    public void cambiarPerfil(int i, int i1, int i2) {
        perfil.setValor(i);
        perfil.setCarisma(i1);
        perfil.setSuerte(i2);
    }
    public  void intercambiaraPersonajes(Jugador j){
        String aux = this.personaje;
           this.personaje = j.personaje;
            j.personaje = aux;
    }


    public boolean ganaAJugador(Perfil p){//nivel perfil
        int aux= this.perfil.nivelPerfil(this);
        return (aux > p.nivelPerfil(this))?true:false;
    }



    public int ganaAJugador(Jugador j){//nivel perfil
        int aux= this.perfil.nivelPerfil(j);
        //this.perfil.nivelPerfil() = (aux > j.perfil.nivelPerfil(j))?aux:j.perfil.nivelPerfil(j);
        return aux;
    }


    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", personaje='" + personaje + '\'' +
                ", perfil=" + perfil +
                '}';
    }


}



