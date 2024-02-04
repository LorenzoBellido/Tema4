package arraysBidimensionales;

public class Ejercicio8 {

	public static void main(String[] args) {

		// Creo una tabla bidimensional
		int tabla[][] = { { 1, 5 }, { 2, 1 } };

		// Condicion según el booleano que devuelve la funcion simetrica
		if (simetrica(tabla)) {
			System.out.println("Es simétrica");
		} else {
			System.out.println("No es simétrica");
		}
	}

	/**
	 * Funcion que devuelve si el Array bidimensional es simétrico o no recorriendo
	 * una tabla introducida por paarametros
	 * 
	 * @param t Tabla bidimensional
	 * @return
	 */
	public static boolean simetrica(int t[][]) {
		boolean simetrica = true;

		int tabla[][] = t;

		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				if (tabla[i][j] != tabla[j][i]) {
					simetrica = false;
					break;
				}

			}
		}
		return simetrica;
	}
}
