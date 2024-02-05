package arraysBidimensionales;

import java.util.Arrays;

public class Ejercicio10 {

	// constante para el tamaño de las dos tablas
	public final static int TAMAÑO = 4;

	public static void main(String[] args) {
		
		// Tabla bidimensional inicial
		int tablaInicial[][] = new int[TAMAÑO][TAMAÑO];
		
		// Tabla inicial cambiando las filas por columnas
		int tabla90[][];
		
		// contador para rellenar la tabla
		int contador = 1;
		
		// Relleno la tabla inicial
		for(int i = 0; i < tablaInicial.length; i++) {
			for(int j = 0; j < tablaInicial[i].length; j++) {
				tablaInicial[i][j] = contador;
				contador++;
			}
		}
		
		// Muestro la tabla inicial
		for(int fila[]: tablaInicial) {
			for(int valor:fila) {
				System.out.print(valor + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// Llamo a la funcion que invierte la tabla
		tabla90 = gira90(tablaInicial);
	
		// Muestro la tabla invertida
		for(int fila[]: tabla90) {
			for(int valor:fila) {
				System.out.print(valor + "\t");
			}
			System.out.println();
		}
	}

	/**
	 * Funcion que invierte la tabla inicial
	 * @param tablaInicial tabla inicial
	 * @return tabla invertida
	 */
	public static int[][] gira90(int tablaInicial[][]){
		// Tabla inicial girada 90 grados
		int tabla90[][] = new int[TAMAÑO][TAMAÑO];
		
		// Auxiliar para moverme por la tabla
		int auxiliar = TAMAÑO - 1;
		
		// Bucle para girar la tabla 90 grados
		for(int i = 0; i < tablaInicial.length; i++) {
			for(int j = 0; j < tablaInicial[i].length; j++) {
				tabla90[i][j] = tablaInicial[auxiliar][i];
				auxiliar--;		
				}
			auxiliar = TAMAÑO - 1;
		}
		
		return tabla90;
	}
}