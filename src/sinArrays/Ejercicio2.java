package sinArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		// Variable donde guardar el número introducido por teclado
		double numeroDec;

		// Variable para crear la tabla
		double tabla[] = new double[5];

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Bucle que pide un número decimal y lo almacena en una posición de la tabla
		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Introduzca un número decimal: ");
			numeroDec = sc.nextDouble();
			tabla[i] = numeroDec;
		}

		// Imprimo la tabla
		System.out.println(Arrays.toString(tabla));

		// Bucle que recorre cada posición de la tabla imprimiendo el número de la
		// posicion en la que está
		for (double numero : tabla) {
			System.out.print(numero + "\t");
		}
		
		// Cierro el Scanner
		sc.close();

	}

}
