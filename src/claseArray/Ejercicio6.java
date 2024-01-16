package claseArray;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		// Tabla de tamaño 1000
		int tabla[] = new int[1000];
		
		// Numero introducido por teclado
		int numero;
		
		// Contador de numeros en el Array
		int contador = 0;
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		// Relleno la tabla con numeros random
		for(int i = 0; i < tabla.length; i++) {
			tabla[i] = (int) (Math.random()*100);
		}
		
		// Pido un número al usuario
		System.out.println("Introduzca un número: ");
		numero = sc.nextInt();
		
		//Ordeno la tabla
		Arrays.sort(tabla);
		
		// Compruebo si el número está en la tabla
		for(int valor : tabla) {
			if(numero == valor) {
				contador++;
				}
		}
		// Muestro el número y la cantidad que se repite
		System.out.println("Existe el número " + numero + " en la tabla " + contador + " veces");
		
		// Cierro el Scanner
		sc.close();
	
	}

}
