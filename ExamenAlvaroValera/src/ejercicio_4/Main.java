package ejercicio_4;

import java.util.Random;

public class Main {

	private static final Random R = new Random();
	private static final int V_SIZE = 2;
	private static final int PESO_MIN = 0;
	private static final int PESO_MAX = 2;
	
	public static void main(String[] args) {

		Grafo grafo = generate_random_graph();
		grafo.mostrarGradoVertices();
		
	}
	
	private static Grafo generate_random_graph() {

		final Grafo grafo = new Grafo(V_SIZE);
		add_aristas_random(grafo, add_nodos(grafo));

		return grafo;

	}

	private static Vertice[] add_nodos(Grafo grafo) {

		Vertice[] LISTA_NODOS = new Vertice[V_SIZE];
		int i;

		for (i = 0; i < V_SIZE; i++) {
			LISTA_NODOS[i] = new Vertice("Nodo_" + i);
			grafo.addVertice(LISTA_NODOS[i]);
		}

		return LISTA_NODOS;

	}

	private static Arista[] add_aristas_random(Grafo grafo, final Vertice[] LISTA_NODOS) {

		final int MAX_ARISTAS = V_SIZE * V_SIZE;
		final int NUM_ARISTAS = R.ints(V_SIZE, MAX_ARISTAS).findFirst().getAsInt();

		Arista[] lista_aristas = new Arista[NUM_ARISTAS];
		int i, n1, n2, peso;

		for (i = 0; i < lista_aristas.length; i++) {
			n1 = R.ints(0, V_SIZE).findFirst().getAsInt();
			n2 = R.ints(0, V_SIZE).findFirst().getAsInt();
			peso = R.ints(PESO_MIN, PESO_MAX).findFirst().getAsInt();
			lista_aristas[i] = new Arista(LISTA_NODOS[n1], LISTA_NODOS[n2], peso);
			grafo.addArista(lista_aristas[i]);
		}

		return lista_aristas;

	}
	
}
