package funcionesArrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		// Tabla con números pares
		int tabla[];

		// Parametro de la longitud
		int longitud;

		// Parametro del maximo de los numeros randoms
		int maximo;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Pido al usuario la longitud y el maximo de los numeros randoms
		System.out.println("Introduce la longitud de la tabla: ");
		longitud = sc.nextInt();

		System.out.println("Introduc el numero maximo de los randoms");
		maximo = sc.nextInt();

		// Inicializo la nueva tabla
		tabla = rellenaPares(longitud, maximo);

		// Muestro la tabla
		System.out.println(Arrays.toString(tabla));

	}

	// Funcion que devuelva una tabla de pares con una longitud introducida por
	// parametros
	public static int[] rellenaPares(int longitud, int fin) {
		int tabla[] = new int[longitud];

		Random rand = new Random();

		for (int i = 0; i < longitud; i++) {
			tabla[i] = rand.nextInt(2, (fin + 1));
			if (tabla[i] % 2 != 0) {
				tabla[i] = rand.nextInt(2, (fin + 1));
			}
		}

		return tabla;
	}
}
