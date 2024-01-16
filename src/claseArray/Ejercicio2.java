package claseArray;

import java.util.Arrays;

public class Ejercicio2 {

	public static void main(String[] args) {

		// Creacion de la tabla
		int tabla[] = new int[55];

		// Variable de la posición inicial en cada recorrido
		int inicio = 0;
		
		for (int i = 1; i <= 10; i++) {
			Arrays.fill(tabla, inicio, inicio + i, i);
			inicio = inicio + i;
		}
		System.out.println(Arrays.toString(tabla));
	}

}
