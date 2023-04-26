package ejercicio_3;

public class Ejercicio3 {

	private static int elegirTubo(final double[] v, final double p) {

		int indice, i;

		indice = 0;
		for (i = 1; i < v.length; i++) {
			if (v[i] > v[indice] && v[i] <= p)
				indice = i;
		}

		if (v[indice] <= p)
			return indice;

		return -1;

	}

	private static int[] calcularTubos(final double[] v, final int l) {

		int[] x = new int[v.length];
		double valorActual;
		int j;

		valorActual = 0;

		while (valorActual != l) {

			j = elegirTubo(v, l - valorActual);

			if (j == -1)
				return null;

			x[j] = (int) Math.floor((l - valorActual) / v[j]);
			valorActual += v[j] * x[j];

		}

		return x;

	}

	private static void pintarArray(final double[] v, final int[] tubos) {

		if (tubos == null)
			System.err.println("No existe solución para este problema.");
		
		else {

			for (int i = 0; i < v.length; i++)
				System.out.println("Necesitamos " + tubos[i] + "tubos de " + v[i] + "metros.");

		}

	}

	public static void main(String[] args) {

		final double[] v = { 1, 1.5, 4, 5 };

		pintarArray(v, calcularTubos(v, 20));

	}

}
