package uax.poo.ejerciciosDeClase.polideportivo;
//Por cada recurso queremos saber:
//•	Código de identificación: identificador único del recurso (BOX01, BOX02, YOG03 …)
//•	Deporte: atletismo, natación, yoga, …
//•	Aforo máximo: número de personas máximo para hacer uso de este recurso


public class Recurso {
    //Atributos
    private String codigo;
    private String deporte;
    private int aforoMaximo;

    //Constructor
    public Recurso(String codigo, String deporte, int aforoMaximo) {
        this.codigo = codigo;
        this.deporte = deporte;
        this.aforoMaximo = aforoMaximo;
    }

    //Getters y Setters
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getDeporte() {
        return deporte;
    }
    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }
    public int getAforoMaximo() {
        return aforoMaximo;
    }
    public void setAforoMaximo(int aforoMaximo) {
        this.aforoMaximo = aforoMaximo;
    }

    //Métodos
    public void mostrarRecurso() {
        System.out.println("Código: " + codigo);
        System.out.println("Deporte: " + deporte);
        System.out.println("Aforo máximo: " + aforoMaximo);
    }

}
