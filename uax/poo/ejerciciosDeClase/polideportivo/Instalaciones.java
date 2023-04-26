package uax.poo.ejerciciosDeClase.polideportivo;


public class Instalaciones extends Recurso {
    //Atributos
    private String descripcion;
    private boolean estado;

    //Constructor
    public Instalaciones(String codigo, String deporte, int aforoMaximo, String descripcion, boolean estado) {
        super(codigo, deporte, aforoMaximo);
        this.descripcion = descripcion;
        this.estado = estado;
    }

    //Getters y Setters
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public boolean isEstado() {
        return estado;
    }
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    //Métodos
    public void mostrarEstado() {
        if (estado) {
            System.out.println("La instalación está disponible");
        } else {
            System.out.println("La instalación no está disponible");
        }
    }

}

