package arraysBidimensionales;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Creo la tabla bidimensional n x m
		int tabla[][];

		// Variable n introducida por el teclado
		int n;

		// Variable m introducida por el teclado
		int m;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Pido al usuario que introduzca los valores n y m
		System.out.println("Introduce el valor n");
		n = sc.nextInt();
		System.out.println("introduce el valor m");
		m = sc.nextInt();

		// Creo la tabla con las medidas n y m
		tabla = new int[n][m];

		// Llamo a la función para rellenar con nuevos valores la tabla
		rellenar(tabla, n, m);

		// Muestro la tabla por pantalla
		for (int fila[] : tabla) {
			for (int valor : fila) {
				System.out.print(valor + "\t");
			}
			System.out.println();
		}
		
		// Cierro el scanner
		sc.close();
	}

	// Funcion que rellena cada posicion de la tabla con 10 * n + m
	public static void rellenar(int[][] tabla, int n, int m) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				tabla[i][j] = 10 * (i + 1) + (j + 1);
			}
		}
	}

}
