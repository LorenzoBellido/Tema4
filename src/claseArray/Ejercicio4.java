package claseArray;

import java.util.Arrays;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Tabla de tamaño 30
		int tabla[] = new int[30];


		// Bucle para rellenar las posiciones con números random del 0 al 9
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = (int) (Math.random() * 10);
		}

		// Ordeno la tabla de menor a mayor
		Arrays.sort(tabla);

		// Imprimo la tabla
		System.out.println(Arrays.toString(tabla));

	}

}
