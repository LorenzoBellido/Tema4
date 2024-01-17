package claseArray;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		// Tabla con los números premiados
		int primitiva[] = { 1, 7, 23, 33, 41, 45 };

		// Tabla con los numeros apostados
		int apuesta[] = new int[6];

		// Numeros acertados de la apuesta
		int aciertos = 0;
		
		//
		int indice = 0;
		
		//
		int valor = -1;

		while(indice < primitiva.length && valor != apuesta[indice]) {
			valor = (int) (1 + Math.random()*49);
			
		}
		
		
		
		// Muestro los numeros acertados
		System.out.println("Has acertado " + aciertos + " números");
	}

}
