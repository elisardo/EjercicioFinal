package ejercicio_2;

import java.util.Arrays;

public class Ejercicio2 {

	public static void main(String[] args) {

		final int SIZE = 10;
		
		for (int i = 0; i <= SIZE; i++)
			System.out.println(f_dinamica(i));
		
		
	}

	public static int f_dinamica(final int n) {

		final int[] tabla = new int[n + 1];

		Arrays.fill(tabla, -1);
		tabla[0] = 1;
		
		return f_dinamica(tabla, n);

	}

	public static int f_dinamica(final int[] tabla, final int n) {

		if (tabla[n] != -1)
			return tabla[n];

		if (n == 0)
			return 1;

		if (n > 0 && n < 3)
			return n * f_dinamica(tabla, n - 1);

		if (n >= 3 && n < 6)
			return 2 * n * f_dinamica(tabla, n - 2);

		if (n >= 6 && n <= 10)
			return 3 * n * f_dinamica(tabla, n - 3);

		return 4 * n * f_dinamica(tabla, n - 4);

	}
}
