package arraysBidimensionales;

import java.util.Random;

public class Ejercicio5 {

	public static void main(String[] args) {

		// Variable donde guardar la suma de cada fila
		int sumaFila = 0;

		// Variable donde guardar la suma de cada columna
		int sumaColumna = 0;
		
		// Variable donde guardar la suma total de los números
		int total = 0;

		// Creo la tabla con los valores recibidos de la funcion
		int tabla[][] = sumatorio();

		// Bucle que recorre cada valor por filas, los imprime y muestra la suma de cada fila
		for(int fila[]:tabla) {
			sumaFila = 0;
			for(int valor:fila) {
				System.out.print(valor + "\t");
				sumaFila += valor;
			}
			System.out.print(sumaFila + "\t");
			System.out.println();
		}

		// Bucle que recorre cada valor por columnas, los imprime y muestra la suma de cada columna
		for(int j = 0; j < tabla[0].length; j++) {
			sumaColumna = 0;
			for(int i = 0; i < tabla.length; i++) {
				sumaColumna += tabla[i][j];
			}
			total += sumaColumna;
			System.out.print(sumaColumna + "\t");
			
		}
		// Imprimo el valor total de la suma de todos los números
		System.out.println(total + "\t");
		

	}

	// Añado los valores a la tabla y la devuelvo
	public static int[][] sumatorio() {
		int tabla[][] = new int[4][5];

		Random rand = new Random();

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				tabla[i][j] = rand.nextInt(100, 1000);
			}
		}

		return tabla;
	}

}
