package sinArrays;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		// Variable donde guardar la temperatura
		int temperatura;

		// Variable para crear la tabla de la temperatura
		int tabla[] = new int[12];

		// Variable para crear la tabla de los meses
		String meses[] = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Bucle que recorre cada posición de la tabla asignando un valor
		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Introduzca la temperatura: ");
			temperatura = sc.nextInt();
			tabla[i] = temperatura;
		}

		// Bucle para dibujar un diagrama de la temperatura en cada mes
		for(int i = 0; i < tabla.length; i++) {
			System.out.print(meses[i]);
		
		
			for (int j = 1; j <= tabla[i]; j++) {
				System.out.print(" #");
			
			
		}System.out.println("");
}
		// Cierro el Scanner
		sc.close();

	}

}
