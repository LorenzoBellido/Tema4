package claseArray;

import java.util.Arrays;

public class Ejercicio2 {

	public static void main(String[] args) {

		// Creacion de la tabla
		int tabla[] = new int[55];

		// Variable de la posición inicial en cada recorrido
		int inicio = 0;

		// Se rellena la tabla con valores del 1 al 10 que se van repiteindo segun la
		// posicion de inicio y la posicion final del anterios
		for (int i = 1; i <= 10; i++) {
			Arrays.fill(tabla, inicio, inicio + i, i);
			inicio = inicio + i;
		}
		
		// Imprimo la tabla
		System.out.println(Arrays.toString(tabla));
	}

}
