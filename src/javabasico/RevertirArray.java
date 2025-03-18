package javabasico;

public class RevertirArray {
	public static void main(String[] args) {
		int[] arrayOriginal = { 1, 2, 3, 4, 5 };
		int[] arrayRevertido = new int[5];

		for (int i = 0; i < arrayOriginal.length; i++) {
			arrayRevertido[arrayRevertido.length - 1 - i] = arrayOriginal[i];
		}
		for (int num : arrayRevertido) {
			System.out.printf("%d ", num);
		}
	}
}
