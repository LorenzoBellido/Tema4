package sinArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		// Variable donde guardar un número introducido
		int numero;

		// Variable para crear la tabla
		int tabla[] = new int[8];

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Bucle que recorre cada posición de la tabla asignandole un valor
		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Introduzca un número: ");
			numero = sc.nextInt();
			tabla[i] = numero;
		}

		// Bucle que comprueba cuales números son pares e impares
		for (int valor : tabla) {
			if (valor % 2 == 0) {
				System.out.println("El número " + valor + " es par");
			}else {
				System.out.println("El número " + valor + " es impar");
			}
		}

		// Cierro el Scanner
		sc.close();

	}

}
