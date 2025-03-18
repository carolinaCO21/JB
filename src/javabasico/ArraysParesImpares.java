package javabasico;

public class ArraysParesImpares {
	public static void main(String[] args) {
		int[] arrayPares = new int[10];
		int[] arrayImpares = new int[5];

		for (int i = 0; i < arrayPares.length; i++) {
			arrayPares[i] = (i + 1) * 2;
		}
		for (int num : arrayPares) {
			System.out.printf("%d ", num);
		}
		System.out.println();

		for (int i = 0; i < arrayImpares.length; i++) {
			arrayImpares[i] = (i * 2) + 1;
		}

		for (int num : arrayImpares) {
			System.out.printf("%d ", num);
		}
		System.out.println();

		int[] arrayAmbos = new int[arrayPares.length + arrayImpares.length];

		for (int i = 0; i < arrayPares.length; i++) {
			arrayAmbos[i] = arrayPares[i];
		}

		for (int i = 0; i < arrayImpares.length; i++) {
			arrayAmbos[i + arrayPares.length] = arrayImpares[i];
		}
		for (int num : arrayAmbos) {
			System.out.printf("%d ", num);
		}
	}

}
