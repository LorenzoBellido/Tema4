package funcionesArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		// Tabla de enteros
		int tabla[] = {3, 4, 1, 8, 5, 3, 9, 1};
		
		// Tabla con los indices
		int indices[];
		
		// Número introducido por teclado
		int numero;
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		// Pido un número
		System.out.println("Introduzca un número. ");
		numero = sc.nextInt();
		
		// Llamo a la funcion
		indices = buscarTodos(tabla, numero);
		
		// Imprimo la tabla con las posiciones
		System.out.println(Arrays.toString(indices));
		

	}

	public static int[] buscarTodos(int t[], int valor) {		
		int tamaño = 0;
		int indices[];
	
		for(int i = 0; i < t.length; i++) {
			if(t[i] == valor) {
				tamaño++;
			}
		}
		
		indices = new int[tamaño];
		
		
		return indices;                                                                                                                                                                                                                                         
	}
}
