package javabasico;

public class ArraySuma2Resta2 {
	public static void main(String[] args) {

		System.out.printf("Con condicionales%n");
		System.out.printf("-----------------%n");
		int[] array = new int[10];

		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				array[i] = i + 2;
			} else {
				array[i] = i - 2;
			}
			System.out.printf("%d ", array[i]);
		}

		System.out.println();
		System.out.printf("%nCon ternarios%n");
		System.out.printf("-------------%n");
		int[] array1 = new int[10];

		for (int i = 0; i < array1.length; i++) {
			array1[i] = i % 2 == 0 ? i + 2 : i - 2;
			System.out.printf("%d ", array1[i]);
		}

	}
}
