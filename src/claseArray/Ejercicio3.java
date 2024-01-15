package claseArray;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		// Número introducido por teclado
		int numero;

		// Tabla principal
		int tablaPrinc[] = new int[20];

		// Tabla de los 10 primeros numeros de la tabla principal
		int tabla1[] = new int[10];

		// Tabla de los 10 últimos numeros de la tabla principal
		int tabla2[] = new int[10];

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Bucle para rellenar la tabla principal
		for (int i = 0; i < tablaPrinc.length; i++) {
			System.out.println("Introduzca un número: ");
			numero = sc.nextInt();
			tablaPrinc[i] = numero;
		}

		// Copio los primeros 10 números y los introduzco en la tabla 1 y lo mismo con
		// los 10 siguientes en la tabla 2
		tabla1 = Arrays.copyOfRange(tablaPrinc, 0, 10);
		System.out.println(Arrays.toString(tabla1));
		
		tabla2 = Arrays.copyOfRange(tablaPrinc, 10, 20);
		System.out.println(Arrays.toString(tabla2));
		
		// Comparo ambos Arrays
		if(Arrays.equals(tabla1, tabla2)) {
			System.out.println("Las tablaws son iguales.");
		}else {
			System.out.println("Las tablas son diferentes.");
		}
	}

}
