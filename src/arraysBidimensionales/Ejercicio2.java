package arraysBidimensionales;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int tabla[][] = new int[4][5];
		
		int notas;
		
		int minima = Integer.MAX_VALUE;
				
		int maxima = Integer.MIN_VALUE;
		
		float media = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 4; i++) {
			System.out.println("Introduzca las notas de alumno " + (i + 1));
			for(int j = 0; j < 5; j++) {
				tabla[i][j] = sc.nextInt();
			}
		}
		
		for(int fila[] : tabla) {
			media = 0;
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
			System.out.println(minima);
			System.out.println(maxima);
			System.out.println(media);
			media = media / 5;
			System.out.println();
		}

	}

}
