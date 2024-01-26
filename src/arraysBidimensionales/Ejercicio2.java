package arraysBidimensionales;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int tabla[][] = new int[4][5];
		
		int notas;
		
		int minima = Integer.MAX_VALUE;
				
		int maxima = Integer.MIN_VALUE;
		
		int media = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 4; i++) {
			System.out.println("Introduzca las notas de alumno " + (i + 1));
			for(int j = 0; j < 5; j++) {
				tabla[i][j] = sc.nextInt();
			}
		}
		for(int fila[] : tabla) {
			for(int valor : fila) {
				
				System.out.print(valor + "\t");
				if(minima > valor) {
					minima = valor;
				}
				if (maxima < valor) {
					maxima = valor;
				}
				media = media + valor;
			}
			media = media / 20;
			System.out.println();
		}
		System.out.println("La nota maxima fue: " + maxima);
		System.out.println("La nota mínima fue: " + minima);
		System.out.println("La media es: " + media);

	}

}
