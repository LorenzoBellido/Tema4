package arraysBidimensionales;

import java.util.Arrays;

public class Ejercicio7 {
	
	// constante para el tamaño de las dos tablas
	public final static int TAMAÑO = 4;

	public static void main(String[] args) {
		
		// Tabla bidimensional inicial
		int tabla[][] = new int[TAMAÑO][TAMAÑO];
		
		// Tabla inicial cambiando las filas por columnas
		int tablaInversa[][];
		
		// contador para rellenar la tabla
		int contador = 1;
		
		// Relleno la tabla inicial
		for(int i = 0; i < tabla.length; i++) {
			for(int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = contador;
				contador++;
			}
		}
		
		// Muestro la tabla inicial
		for(int fila[]: tabla) {
			for(int valor:fila) {
				System.out.print(valor + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// Llamo a la funcion que invierte la tabla
		tablaInversa = inversa(tabla);
	
		// Muestro la tabla invertida
		for(int fila[]: tablaInversa) {
			for(int valor:fila) {
				System.out.print(valor + "\t");
			}
			System.out.println();
		}
	}

	/**
	 * Funcion que invierte la tabla inicial
	 * @param t tabla inicial
	 * @return tabla invertida
	 */
	public static int[][] inversa(int t[][]){
		int tabla[][] = new int[TAMAÑO][TAMAÑO];
		
		for(int j = 0; j<t[0].length; j++) {
			for(int i = 0; i < t.length; i++) {
				tabla[j][i] = t[i][j];
			}
		}
		
		return tabla;
	}
}
