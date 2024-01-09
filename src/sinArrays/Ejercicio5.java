package sinArrays;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		int numero;
		int suma = 0;
		int maximo = 0;
		int minimo = 100;
		int tabla[] = new int[10];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < tabla.length; i++) {
			System.out.println("Introduzca un número: ");
			numero = sc.nextInt();
			tabla[i] = numero;
			suma = suma + numero;
			if(maximo <= numero) {
				maximo = numero;
			}
			if(minimo >= numero) {
				minimo = numero;
			}
		}
		
		System.out.println(suma);
		System.out.println(maximo);
		System.out.println(minimo);

	}

}
