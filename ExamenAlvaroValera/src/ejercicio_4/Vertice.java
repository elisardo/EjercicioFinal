package ejercicio_4;

public class Vertice {

	private String nombre;

	public Vertice(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public boolean igual(Vertice v) {
		return nombre.equals(v.getNombre());
	}
}