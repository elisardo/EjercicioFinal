package uax.poo.ejerciciosDeClase.polideportivo;


import java.util.Arrays;

public class Cursos extends Recurso {
    //Atributos
    private String nivel;
    private String fechaInicio;
    private String fechaFin;
    private double precioMensual;
    private Persona[] personasInscritas;

    //Constructor
    public Cursos(String codigo, String deporte, int aforoMaximo, String nivel, String fechaInicio, String fechaFin, double precioMensual, Persona[] personasInscritas) {
        super(codigo, deporte, aforoMaximo);
        this.nivel = nivel;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precioMensual = precioMensual;
        this.personasInscritas = personasInscritas;
    }

    //Getters y Setters
    public String getNivel() {
        return nivel;
    }
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    public String getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public String getFechaFin() {
        return fechaFin;
    }
    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }
    public double getPrecioMensual() {
        return precioMensual;
    }
    public void setPrecioMensual(double precioMensual) {
        this.precioMensual = precioMensual;
    }
    public Persona[] getPersonasInscritas() {
        return personasInscritas;
    }
    public void setPersonasInscritas(Persona[] personasInscritas) {
        this.personasInscritas = personasInscritas;
    }

    //Métodos
    public void inscribirPersona(Persona persona) {
//TODO

    }

    public void desinscribirPersona(Persona persona) {
        //TODO
    }

    public void mostrarPersonasInscritas() {
        //TODO
    }

    public void mostrarPersonasInscritasPorDeporte(String deporte) {
        //TODO
    }

    public void mostrarPersonasInscritasPorNivel(String nivel) {
        //TODO
    }

    @Override
    public String toString() {
        return "Cursos{" +
                "nivel='" + nivel + '\'' +
                ", fechaInicio='" + fechaInicio + '\'' +
                ", fechaFin='" + fechaFin + '\'' +
                ", precioMensual=" + precioMensual +
                ", personasInscritas=" + Arrays.toString(personasInscritas) +
                '}';
    }
}
