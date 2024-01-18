package funcionesArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		// Tabla con numeros enteros
		int tabla[] = {1,4,3,4,6,5,2,4,8,5};
		
		// Tabla con los indices de la funcion
		int indices[];
		
		// Numero introducido por el usuario
		int numero;
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		// Pido un número al usuario
		System.out.println("Introduzca un valor: ");
		numero = sc.nextInt();
		
		// Llamo a la función que me devuelve una tabla
		indices = buscarTodos(tabla, numero);
		
		// Imprimo la tabla
		System.out.println(Arrays.toString(indices));

	}

	public static int[] buscarTodos(int t[], int valor) {
		int indices[];
		
		int index = 0;
		
		int tamanyo = 0;
		
		for(int numero : t) {
			if(numero == valor) {
				tamanyo++;
			}
		}
		indices = new int[tamanyo];
		
		for(int i = 0; i < t.length; i++) {
			if(t[i] == valor) {
				indices[index++] = i;
			}
		}
		
		return indices;
	}
}
