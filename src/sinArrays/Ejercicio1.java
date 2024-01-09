package sinArrays;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio1 {

	public static void main(String[] args) {

		// Variable para crear la tabla
		int tabla[] = new int[10];
		// Variable donde guardar el número random
		int numero;

		// Objeto para crear números random
		Random rand = new Random();

		// Bucle for donde se recorren las posiciones de la tabla introduciendo un
		// número random
		for (int i = 0; i < tabla.length; i++) {
			numero = rand.nextInt(1, 101);
			tabla[i] = numero;
		}

		// Imprimo la tabla
		System.out.println(Arrays.toString(tabla));
	}
}
