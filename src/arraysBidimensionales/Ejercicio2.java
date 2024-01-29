package arraysBidimensionales;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		// Creo la tabla donde voy a guardar las notas de cada alumno
		int tabla[][] = new int[4][5];

		// Variable donde guardar las notas
		int notas;

		// Variable donde guardar la nota minima
		int minima = Integer.MAX_VALUE;

		// Variable donde guardar la nota maxima
		int maxima = Integer.MIN_VALUE;

		// Variable donde guardar la media
		float media = 0;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Función para rellenar la tabla con valores por teclado
		rellenar(tabla, sc);

		// Buvle para realizar la media, la minima y la maxima de cada alumno con los
		// datos anteriores
		for (int fila[] : tabla) {
			media = 0;
			minima = Integer.MAX_VALUE;
			maxima = Integer.MIN_VALUE;
			for (int valor : fila) {
				System.out.print(valor + "\t");
				if (minima > valor) {
					minima = valor;
				}
				if (maxima < valor) {
					maxima = valor;
				}
				media = media + valor;
			}
			media = media / 5;
			System.out.println();
			// Muestro los resultados de cada alumno
			System.out.println("La minima es: " + minima);
			System.out.println("La maxima es: " + maxima);
			System.out.println("La media es: " + media);

			System.out.println();
		}

		// Cierro el Scanner
		sc.close();

	}

	public static void rellenar(int[][] tabla, Scanner sc) {
		for (int i = 0; i < 4; i++) {
			System.out.println("Introduzca las notas de alumno " + (i + 1));
			for (int j = 0; j < 5; j++) {
				tabla[i][j] = sc.nextInt();
			}
		}
	}

}
