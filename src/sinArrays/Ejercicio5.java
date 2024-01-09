package sinArrays;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		int numero;
		int suma;
		int maximo;
		int minimo;
		int tabla[] = new int[10];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < tabla.length; i++) {
			System.out.println("Introduzca un número: ");
			numero = sc.nextInt();
			tabla[i] = numero;
		}
		

	}

}
