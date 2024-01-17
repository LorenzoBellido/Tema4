package funcionesArrays;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		// Tabla donde buscar el valor clave
		int tabla[] = {1,5,6,2,8,9,7,4,3};
		
		// Numero introducido por teclado
		int clave;
		
		// Posicions del numero en la tabla
		int posicion;
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		// Pido el numero clave al usuario
		System.out.println("Introduzca el número clave");
		clave = sc.nextInt();
		
		// Llamo a la función
		posicion = buscar(tabla, clave);
		
		// Si es -1 no esta en la tabla
		if(posicion < 0) {
			System.out.println("No está en la tabla");
		}else {
			System.out.println("Está en la tabla en la posicion " + posicion);
		}

	}
	
	 public static int buscar(int t[], int clave) {
		 int numero = -1;
		 for(int i = 0; i < t.length; i++) {
			 if(clave == t[i]) {
				 numero = i;
			 }
		 }
		 return numero;
	 }

}
