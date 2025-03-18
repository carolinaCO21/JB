package javabasico;

public class ArrayRevertir {
	public static void main(String[] args) {
		int[] arrayOriginal = { 1, 2, 3, 4, 5 };
		int cajaTemporal = 0;

		for (int i = 0; i < arrayOriginal.length / 2; i++) {
			cajaTemporal = arrayOriginal[i];// almaceno el primer numero del array en una caja temporal(en la segunda
											// vuelta el segundo)

			arrayOriginal[i] = arrayOriginal[arrayOriginal.length - 1 - i];// muevo el último indice hacia el primer
																			// indice(en la segunda vuelta con el
																			// segundo)

			arrayOriginal[arrayOriginal.length - 1 - i] = cajaTemporal;// coloco el indice de la caja temporal en el
																		// array
		}
		for (int num : arrayOriginal) {
			System.out.printf("%d ", num);
		}
	}
}
