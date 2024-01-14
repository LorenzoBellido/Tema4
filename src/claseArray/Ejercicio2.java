package claseArray;

import java.util.Arrays;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// Creacion de la tabla
		int tabla[] = new int[59];
		
		// Relleno los valores de la tabla
		Arrays.fill(tabla, 0,1,1);
		Arrays.fill(tabla, 1,3,2);
		Arrays.fill(tabla, 3,6,3);
		Arrays.fill(tabla, 6,10,4);
		Arrays.fill(tabla, 10,15,5);
		Arrays.fill(tabla, 15,21,6);
		Arrays.fill(tabla, 21,28,7);
		Arrays.fill(tabla, 29,37,8);
		Arrays.fill(tabla, 38,48,9);
		Arrays.fill(tabla, 48,59,10);
		
		// Imprimo la tabla
		System.out.println(Arrays.toString(tabla));

	}

}
