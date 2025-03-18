package javabasico;

public class ArraysMultiplo5y10 {
	public static void main(String[] args) {
		int[] arrayMultiplos5 = new int[10];

		System.out.printf("Una forma%n");
		System.out.printf("---------%n");
		for (int i = 0; i < arrayMultiplos5.length; i++) {
			arrayMultiplos5[i] = (i + 1) * 5;
		}
		for (int num : arrayMultiplos5) {
			System.out.printf("%d ", num);
		}
		System.out.println();

		int contador = 0;

		for (int num : arrayMultiplos5) {
			if (num % 10 == 0) {
				contador++;
			}
		}
		System.out.printf("%d%n", contador);

		int[] arrayMultiplos10 = new int[contador];

		int posicion = 0;

		for (int num : arrayMultiplos5) {
			if (num % 10 == 0) {
				arrayMultiplos10[posicion++] = num;
			}
		}
		for (int num : arrayMultiplos10) {
			System.out.printf("%d ", num);
		}
		System.out.println();
		System.out.printf("%nOtra forma%n");
		System.out.printf("---------%n");

		int[] arrayMultiplosDe5 = new int[10];

		for (int i = 0; i < arrayMultiplosDe5.length; i++) {
			arrayMultiplosDe5[i] = (i + 1) * 5;
		}

		for (int num : arrayMultiplosDe5) {
			System.out.printf("%d ", num);
		}
		System.out.println();
		int contadorMultiplos10 = 0;

		for (int num : arrayMultiplosDe5) {
			if (num % 10 == 0) {
				contadorMultiplos10++;
			}
		}
		System.out.printf("%d ", contadorMultiplos10);
		System.out.println();

		int[] arrayMultiplosDe10 = new int[contadorMultiplos10];
		posicion = 0;

		for (int i = 0; i < arrayMultiplosDe5.length; i++) {
			if (arrayMultiplosDe5[i] % 10 == 0) {
				arrayMultiplosDe10[posicion++] = arrayMultiplosDe5[i];
			}
		}

		for (int num : arrayMultiplosDe10) {
			System.out.printf("%d ", num);
		}

	}
}
