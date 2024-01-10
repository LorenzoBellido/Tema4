package sinArrays;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		// Variable para guardar un número introducido
		int numero;
		
		// Variable para crear la tabla
		int tabla[] = new int[100];
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		// Bucle para asignar un numero random a cada posición de la tabla
		for(int i = 0; i < tabla.length; i++) {
			tabla[i] = (int) (1 + Math.random()*10);
		}
		
		// Pido un número al usuario
		System.out.println("Introduzca un número: ");
		numero = sc.nextInt();
		
		// Bucle para comprobar en que posición está el número introducido
		for(int i = 0; i < tabla.length; i++) {
			if(tabla[i] == numero) {
				System.out.print(i + ",");
			}
		}
		
		// Cierro el Scanner
		sc.close();

	}

}
