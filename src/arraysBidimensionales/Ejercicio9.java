package arraysBidimensionales;

public class Ejercicio9 {

	public static void main(String[] args) {

		// Creaos la tabla bidimensional
		int tabla[][] = { { 2, 3, 1 }, { 3, 1, 2 }, { 1, 2, 4 } };

		// Llamamos a la función para comprobar si la tabla es mágica o no
		if (esMagica(tabla)) {
			System.out.println("La matriz es magica");
		} else {
			System.out.println("La matriz no es magica");
		}

	}

	/**
	 * Función que comprueba si la suma de alguna columna es igual a la suma de alguna fila
	 * @param t Tabla bidimensional de la cual sacar los valores de las filas y columnas
	 * @return Devuelve un booleano para saber si es mágica o no
	 */
	public static boolean esMagica(int t[][]) {
		// Variable booleana a devolver
		boolean magica = true;

		// Suma de la columna N de la tabla
		int sumaColumna = 0;
		// Suma de la fila N de la tabla
		int sumaFila = 0;
		// Auxiliar para comparar las sumas de las filas y columnas
		int auxiliar = 0;

		// Bucle que suma la primera fila y lo guarda en el auxiliar
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < t[i].length; j++) {
				sumaFila += t[i][j];
			}
			auxiliar = sumaFila;
		}

		// Bucle que compara las filas y columnas para ver si la tabla es mágica
		for (int i = 0; i < t.length; i++) {
			sumaColumna = 0;
			sumaFila = 0;
			for (int j = 0; j < t[i].length; j++) {
				sumaFila += t[i][j];
				sumaColumna += t[j][i];
			}
			if (auxiliar != sumaColumna) {
				magica = false;
			}
			if (auxiliar != sumaFila) {
				magica = false;
			}
		}

		return magica;
	}

}

	

	