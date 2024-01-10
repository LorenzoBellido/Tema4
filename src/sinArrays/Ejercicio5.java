package sinArrays;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		// Variable donde guardar un número introducido
		int numero;
		// Variable donde guardar la suma total del os números
		int suma = 0;
		// Variable donde guardar el número máximo
		int maximo = Integer.MIN_VALUE;
		// Variable donde guardar el número mínimo
		int minimo = Integer.MAX_VALUE;
		// Variable para crear la tabla
		int tabla[] = new int[10];

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Bucle que recorre las posiciones de la tabla asignando un valor introducido
		// por teclado
		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Introduzca un número: ");
			numero = sc.nextInt();
			tabla[i] = numero;
		}

		// Bucle que va sumando todos los números y calculando el máximo y el mínimo
		for (int i = 0; i < tabla.length; i++) {
			// Total de los números introducidos
			suma = suma + tabla[i];
			// Maximo y minimo de los números
			if (maximo <= tabla[i]) {
				maximo = tabla[i];
			}
			if (minimo >= tabla[i]) {
				minimo = tabla[i];
			}
		}

		// Muestra las operaciones de suma, máximo y míninmo
		System.out.println("La suma total es: " + suma);
		System.out.println("El número mayor es: " + maximo);
		System.out.println("El número menor es: " + minimo);

		// Cierro el Scanner
		sc.close();

	}

}
