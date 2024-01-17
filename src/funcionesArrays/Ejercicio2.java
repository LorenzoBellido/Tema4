package funcionesArrays;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// Tabla para buscar los números máximos
		int tabla[] = {3, 5, 1, 8, 4, 9};
		
		// Variable donde guardar el maximo
		int maximo;
		
		// Llamo a la funcion
		maximo = maximo(tabla);
		
		// Muestro el maximo
		System.out.println(maximo);

	}
	
	// Función para encontrar el valor maximo de una tabla
	public static int maximo(int tabla[]) {
		int maximo = Integer.MIN_VALUE;
		
		for(int valor : tabla) {
			if(valor > maximo) {
				maximo = valor;
			}
		}
		
		return maximo;
	}

}
