package uax.poo.ud4.ej1ObrasArte;

public class Ciudad implements Comparable<Object>{//hay una interfaz Comparable en la Api de Java
    private String nombre;
    private String pais;
    private int numHabitantes;

    public Ciudad(String nombre, String pais, int numHabitantes) {
        this.nombre = nombre;
        this.pais = pais;
        this.numHabitantes = numHabitantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getNumHabitantes() {
        return numHabitantes;
    }

    public void setNumHabitantes(int numHabitantes) {
        this.numHabitantes = numHabitantes;
    }

    @Override
    public String toString() {
        return "Ciudad{" +
                "nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", numHabitantes=" + numHabitantes +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
