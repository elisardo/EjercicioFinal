package ejercicio_4;

import java.util.Arrays;

public class Grafo {
	// ATRIBUTOS.
	private Vertice[] lista_Vertices = null;
	private int matriz_adyacencias[][] = null;
	private int numero_vertices_intro = 0;
	private int numero_Vertices = 0;

	// CONSTRUCTORES Y METODOS RELACIONADOS.
	public Grafo(int numero_Vertices, int numero_vertices_intro, int[][] matriz_adyacencias, Vertice[] lista_Vertices) {

		this.numero_Vertices = numero_Vertices;
		this.numero_vertices_intro = numero_vertices_intro;
		this.matriz_adyacencias = matriz_adyacencias;
		this.lista_Vertices = lista_Vertices;

	}

	public Grafo(int numero_Vertices) {
		this.numero_Vertices = numero_Vertices;
		matriz_adyacencias = new int[numero_Vertices][numero_Vertices];
		lista_Vertices = new Vertice[numero_Vertices];

		inicializar_matriz_Vertices();

	}

	private void inicializar_matriz_Vertices() {
		int i, j;
		for (i = 0; i < matriz_adyacencias.length; i++) {
			for (j = 0; j < matriz_adyacencias[i].length; j++)
				matriz_adyacencias[i][j] = 0;
		}
	}

	private int grado_vertice(final int pos) {

		int i, grado;

		grado = 0;

		for (i = 0; i < numero_vertices_intro; i++) {
			if (matriz_adyacencias[pos][i] != 0 || matriz_adyacencias[i][pos] != 0)
				grado++;
		}

		return grado;

	}

	public int[] obtener_grado_vertices() {

		int[] gradoVertices = new int[numero_vertices_intro];
		int i;

		Arrays.fill(gradoVertices, -1);

		for (i = 0; i < numero_vertices_intro; i++)
			gradoVertices[i] = grado_vertice(i);

		return gradoVertices;

	}

	public void mostrarGradoVertices() {

		int[] gradoVertices = obtener_grado_vertices();

		for (int i = 0; i < gradoVertices.length; i++) {
			if (GradoDivisible3(gradoVertices[i]) == 0)
				System.out.println("El vertice " + i + " es divisible entre 3.");
		}
	}

	public int GradoDivisible3(final int grado) {

		return grado % 3;

	}

	// METODOS PRE-DEFINIDOS.
	public boolean addVertice(Vertice Vertice) {

		if (numero_vertices_intro == numero_Vertices || posicionVertice(Vertice) != -1)
			return false;

		lista_Vertices[numero_vertices_intro++] = Vertice;
		return true;

	}

	public boolean addArista(Arista arista) {

		final int v1 = posicionVertice(arista.getV1());
		final int v2 = posicionVertice(arista.getV2());
		final int peso = arista.getPeso();

		if ((v1 < 0) || (v2 < 0))
			return false;

		matriz_adyacencias[v1][v2] = peso;
		return true;
	}

	private int posicionVertice(Vertice Vertice) {

		int i;

		for (i = 0; i < numero_Vertices; i++) {
			if (lista_Vertices[i] != null && Vertice.igual(lista_Vertices[i]))
				return i;
		}

		return -1;
	}

	public boolean eliminarVertice(Vertice Vertice) {

		final int pos = posicionVertice(Vertice);
		if (pos < 0)
			return false;

		mover_matriz_arriba(pos);
		mover_matriz_izquierda(pos);
		eliminar_Vertice_lista_Vertices(pos);
		numero_vertices_intro--;

		return true;

	}

	private void mover_matriz_arriba(final int pos) {

		int i, j;

		for (i = pos + 1; i < numero_vertices_intro; i++) {
			for (j = 0; j < numero_vertices_intro; j++)
				matriz_adyacencias[i - 1][j] = matriz_adyacencias[i][j];
		}

	}

	private void mover_matriz_izquierda(final int pos) {

		int i, j;

		for (i = 0; i < numero_vertices_intro - 1; i++) {
			for (j = pos + 1; j < numero_vertices_intro; j++)
				matriz_adyacencias[i][j - 1] = matriz_adyacencias[i][j];
		}

	}

	private void eliminar_Vertice_lista_Vertices(final int pos) {

		for (int i = pos + 1; i < numero_vertices_intro; i++)
			lista_Vertices[i - 1] = lista_Vertices[i];

	}

	public boolean eliminarArista(Arista arista) {

		final int v1 = posicionVertice(arista.getV1());
		final int v2 = posicionVertice(arista.getV2());

		if ((v1 < 0) || (v2 < 0) || (matriz_adyacencias[v1][v2] == 0))
			return false;

		matriz_adyacencias[v1][v2] = 0;

		return true;

	}

	public Vertice[] lista_Vertices() {

		Vertice[] Vertices = new Vertice[numero_vertices_intro];

		for (int i = 0; i < numero_vertices_intro; i++)
			Vertices[i] = lista_Vertices[i];

		return Vertices;

	}

	public Arista[] listaAristas() {

		Arista[] lista = new Arista[this.numeroDeAristas()];
		int i, j, numArista = 0;

		for (i = 0; i < numero_vertices_intro; i++) {
			for (j = 0; j < numero_vertices_intro; j++) {
				if (matriz_adyacencias[i][j] > 0) {
					Arista a = new Arista(lista_Vertices[i], lista_Vertices[j], matriz_adyacencias[i][j]);
					lista[numArista++] = a;
				}
			}
		}

		return lista;

	}

	private int numeroDeAristas() {

		int i, j, num = 0;

		for (i = 0; i < numero_vertices_intro; i++) {
			for (j = 0; j < numero_vertices_intro; j++) {
				if (matriz_adyacencias[i][j] > 0)
					num++;
			}
		}

		return num;

	}

	public int numeroDeVertices() {
		return numero_vertices_intro;
	}

	@Override
	public String toString() {

		String matriz_adyacencias_str = "";
		int i, j;

		for (i = 0; i < numero_vertices_intro; i++) {
			matriz_adyacencias_str += "[ ";
			for (j = 0; j < numero_vertices_intro; j++) {
				matriz_adyacencias_str += (matriz_adyacencias[i][j] + " ");
			}
			matriz_adyacencias_str += "]\n";
		}

		return matriz_adyacencias_str;

	}

}
