package arraysBidimensionales;

import java.util.Random;

public class Ejercicio5 {

	public static final int TAMAÑO = 4;

	public static void main(String[] args) {

		int sumaFila = 0;

		int sumaColumna = 0;
		
		int contador = 0;

		int tabla[][] = new int[TAMAÑO][TAMAÑO];

		tabla = sumatorio();

//		for(int fila[]:tabla) {
//			sumaFila = 0;
//			for(int valor:fila) {
//				System.out.print(valor + "\t");
//				sumaFila = sumaFila + valor;
//			}
//			System.out.print(sumaFila + "\t");
//			System.out.println();
//			
//		}

		for (int i = 0; i < TAMAÑO; i++) {
			sumaFila = 0;
			for (int j = 0; j < TAMAÑO; j++) {
				System.out.print(tabla[i][j] + "\t");
				sumaFila = sumaFila + tabla[i][j];
				System.out.print(sumaFila);
			}
			
			System.out.println();
		}
		
		for(int j = 0; j < tabla[0].length; j++) {
			sumaColumna = 0;
			for(int i = 0; i < tabla.length; i++) {
				sumaColumna = sumaColumna + tabla[i][j];
				System.out.print(sumaColumna + "\t");
			}
		}
		

	}

	public static int[][] sumatorio() {
		int tabla[][] = new int[TAMAÑO][TAMAÑO];

		Random rand = new Random();

		for (int i = 0; i < TAMAÑO; i++) {
			for (int j = 0; j < TAMAÑO; j++) {
				tabla[i][j] = rand.nextInt(100, 999);
			}
		}

		return tabla;
	}

}
