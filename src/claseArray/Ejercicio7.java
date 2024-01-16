package claseArray;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		int primitiva[] = { 1, 7, 23, 33, 41, 45 };

		int apuesta[] = new int[6];

		int aciertos = 0;

		for (int i = 0; i < primitiva.length; i++) {
			apuesta[i] = (int) (1 + Math.random() * 49);

			if (i > primitiva.length) {
				if (apuesta[i] == apuesta[i + 1]) {	
					Arrays.sort(apuesta);
					apuesta[i] = (int) (1 + Math.random() * 49);
				}
			}
				else if (i > 0) {
				if (apuesta[i] == apuesta[i - 1]) {
					apuesta[i] = (int) (1 + Math.random() * 49);
				}
			}
		}

		Arrays.sort(apuesta);
		for (int i = 0; i < primitiva.length; i++) {
			if (apuesta[i] == primitiva[i]) {
				aciertos++;
			}

		}

		System.out.println(Arrays.toString(apuesta));
		System.out.println(Arrays.toString(primitiva));
		System.out.println("Has acertado " + aciertos + " números");
	}

}
