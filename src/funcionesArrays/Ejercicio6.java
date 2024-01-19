package funcionesArrays;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
	
		// Tabla con números enteros
		int t[] = {10, 1, 5, 8, 9, 2};
		
		// Cantidad por la cual se va a agrupar la suma
		int agrupacion;
		
		
		int sumilla[];
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		sumilla = suma(t, 3);
		

	}

	
	public static int[] suma(int t[], int numElementos) {
		int suma[] = new int[t.length -(numElementos - 1)];
		
		int valor = 0;
		int sumilla=0;
		int contador = 1;
		
		for(int i = 0; i < t.length; i++) {
		
			for (int j = contador ; contador <= numElementos;j++) {
				if(contador < (t.length -(numElementos - 1))) {
				sumilla=sumilla+t[j];
				suma[i]=sumilla;}
			}
		}
		
		return suma;
		
	}
}
