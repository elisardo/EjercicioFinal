package uax.poo.feedbackFinal.ejercicio5;

public class Persona {

    //atributos
    private String nombre;
    private float peso;
    private float altura;

    //constructores
    public Persona(){
    }

    public Persona(String nombre, float peso, float altura){
        this.nombre=nombre;
        this.peso=peso;
        this.altura=altura;
    }

    //metodos
    public String getNombre() {
        return nombre;
    }

    public Persona setNombre(String nombre) {
        this.nombre = nombre;
        return null;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
