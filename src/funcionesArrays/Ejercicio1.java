package funcionesArrays;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// Tabla de enteros
		int tabla[] = {1,5,2,7,4};
		
		// Resultado de la suma
		int resultado;

		// Llamo a la función y devuelvo la suma
		resultado = suma(tabla);
		
		// Muestro la suma
		System.out.println(resultado);
	}
	
	// Funcion para sumar todos los numeros de la tabla y devolver la suma
	public static int suma(int tabla[]) {
		int suma = 0;
		for(int valor : tabla) {
			suma = suma + valor;
		}
		return suma;
	}

}
