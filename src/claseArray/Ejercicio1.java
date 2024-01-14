package claseArray;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Variable para el tamaño de la tabla
		int tamaño;
		// Variable donde guardar el número de cada posicion de la tabla
		int numero;
		// Tabla de tipo entero
		int tabla[];
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		// Pido al usuario el tamaño y el numero por defecto en cada posición
		System.out.println("Introduzca el tamaño de la tabla: ");
		tamaño = sc.nextInt();
		tabla = new int[tamaño];
		
		System.out.println("Introduzca el número por defecto: ");
		numero = sc.nextInt();
		Arrays.fill(tabla, numero);
		
		// Muestro la tabla
		System.out.println(Arrays.toString(tabla));
		
		// Cierro el Scanner
		sc.close();

	}

}
