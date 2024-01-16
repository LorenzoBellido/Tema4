package claseArray;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		// Tabla con los puntos de cada jugador
		int puntuacion[] = new int[8];
		
		// Tabla con el orden de la clasificacion
		int clasificacion[] = new int[8];
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		//Bucle para rellenar la tabla de puntuacion
		for(int i= 0; i < puntuacion.length; i++) {
			System.out.println("Introduce la puntuación:");
			puntuacion[i] = sc.nextInt();
		}
		// Ordenar la tabla de manera ascendente
		Arrays.sort(puntuacion);
		
		// Dar la vuelta al orden de la tabla clasificacion
		for(int i = 0; i < clasificacion.length; i++) {
			clasificacion[i] = puntuacion[(puntuacion.length - 1) - i];
		}
		
		// Imprimo la clasificacion
		System.out.println(Arrays.toString(clasificacion));

		// Cierro el Scanner
		sc.close();
	}

}
