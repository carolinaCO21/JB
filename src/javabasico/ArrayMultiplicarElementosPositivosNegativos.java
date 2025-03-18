package javabasico;

public class ArrayMultiplicarElementosPositivosNegativos {
	public static void main(String[] args) {
		int[] arrayOriginal = { 1, -3, 5, -7, 10 };
		int[] arrayNuevo = new int[arrayOriginal.length];

		for (int i = 0; i < arrayOriginal.length; i++) {
			if (arrayOriginal[i] < 0) {
				arrayNuevo[i] = arrayOriginal[i] * 20;
			} else {
				arrayNuevo[i] = arrayOriginal[i] * 10;
			}
		}

		for (int num : arrayNuevo) {
			System.out.printf("%d ", num);
		}
	}
}
