package javabasico;

public class ArraySumaDobleElementos {
	public static void main(String[] args) {
		System.out.printf("Una solución%n");
		System.out.printf("------------%n");
		int[] array1 = { 10, 20, 30, 40, 50 };
		int suma = 0;

		for (int i = 0; i < array1.length; i++) {
			array1[i] *= 2;
		}

		for (int num : array1) {
			System.out.printf("%d ", num);
		}
		System.out.println();

		for (int num : array1) {
			suma += num;

		}
		System.out.printf("%d ", suma);

		System.out.println();
		System.out.printf("%nOtra Solución%n");
		System.out.printf("-------------%n");
		suma = 0;
		int[] array = { 10, 20, 30, 40, 50 };
		for (int i = 0; i < array.length; i++) {
			suma += array[i] * 2;
		}
		System.out.printf("%d", suma);

	}
}
