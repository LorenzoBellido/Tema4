package arraysBidimensionales;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio6 {

	public static void main(String[] args) {

		// Creo la tabla bidimensional de 6x10
		int tabla[][] = new int[6][10];

		// Array con los valores minimo y maximo de la tabla bidimensional
		int maxMin[];

		// Clase random para rellenar la tabla
		Random rand = new Random();

		// Relleno la tabla bidimensional con valores randoms
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = rand.nextInt(0, 1001);
			}
		}

		// Muestro la tabla por pantall
		for (int fila[] : tabla) {
			for (int valor : fila) {
				System.out.print(valor + "\t");
			}
			System.out.println();
		}

		// Llamo a la función para sacar los valores maximos y minimos de la tabla
		maxMin = arrays(tabla);

		// Imprimo el valor maximo y miinimo
		System.out.println(Arrays.toString(maxMin));
	}

	/**
	 * Funcion que recibe por parametro una tabla bidimensional y devuelve una
	 * unidimensional de dos posiciones con el minimo y el maximo 
	 * @param t Tabla bidimensional del main
	 * @return Valores maximo y minimo
	 */
	public static int[] arrays(int t[][]) {
		int maximo = Integer.MIN_VALUE;
		int minimo = Integer.MAX_VALUE;
		int tabla[] = new int[2];
		for (int fila[] : t) {
			for (int valor : fila) {
				if (valor < minimo) {
					minimo = valor;
				}
				if (valor > maximo) {
					maximo = valor;
				}
			}
		}
		tabla[0] = minimo;
		tabla[1] = maximo;

		return tabla;
	}

}
