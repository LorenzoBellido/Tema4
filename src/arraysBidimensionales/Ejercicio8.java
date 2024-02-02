package arraysBidimensionales;

public class Ejercicio8 {

	public static void main(String[] args) {

		// Creo una tabla bidimensional
		int tabla[][] = {{5,2},{2,1}};
		
		if(simetrica(tabla)) {
			System.out.println("Es simétrica");
		}else {
			System.out.println("No es simétrica");
		}
	}

	public static boolean simetrica(int t[][]) {
		boolean simetrica = true;
		
		int tabla[][] = t;
		
		for(int i = 0; i < tabla.length; i++) {
			for(int j = 0; j < tabla[i].length; j++) {
				if(tabla[i][j] != tabla[j][i]) {
					simetrica = false;
					break;
				}
			
			}
		}		
		return simetrica;
	}
}
