package sinArrays;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		// Variable donde guardar el número introducido por teclado
		int numero;
		
		// Variable para crear la tabla
		int tabla[] = new int[10];
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		// Bucle para introducir los números en cada posición 
		for(int i = 0; i < tabla.length; i++) {
			System.out.println("Introduzca un número:");
			numero = sc.nextInt();
			tabla[i] = numero;
		}
		// Bucle para imprimir los números en sentido inverso
		for(int i = 9; i >= 0; i--) {
			numero = tabla[i];
			System.out.println(numero);
		}

		// Cerramos el Scanner
		sc.close();
	}

}
