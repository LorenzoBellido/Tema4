package arraysBidimensionales;

public class Ejercicio4 {

	public static final int TAMAÑO = 10;

	public static void main(String[] args) {

		// Variable que se incrementará para mostrar las tablas de multiplicar
		int contador = 1;

		// Creo la tabla bidimensional de 10x10
		int[][] tabla = new int[TAMAÑO][TAMAÑO];

		// Llamo a la función
		tabla = tablaMultiplicar();

		// Muestro la tabla que he recibido de la función
		for (int fila[] : tabla) {
			System.out.println("La tabla del " + contador);
			for (int valor : fila) {
				System.out.print("\t" + valor);

			}
			contador++;
			System.out.println();
		}
	}

	// Función que suma 1 a cada posicion de la tabla y la multiplica por i y j
	public static int[][] tablaMultiplicar() {
		int tabla[][] = new int[TAMAÑO][TAMAÑO];

		for (int i = 0; i < TAMAÑO; i++) {
			for (int j = 0; j < TAMAÑO; j++) {
				tabla[i][j] = (i + 1) * (j + 1);
			}
		}

		return tabla;
	}
}
