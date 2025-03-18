package javabasico;

public class ArraysProducto {
	public static void main(String[] args) {
		int[] arrayImpares = { 1, 3, 5, 7 };
		int[] arrayPares = { 2, 4, 6, 8 };
		int[] arrayProductos = new int[arrayPares.length];

		for (int i = 0; i < arrayPares.length; i++) {
			arrayProductos[i] = arrayPares[i] * arrayImpares[i];
		}

		for (int num : arrayProductos) {
			System.out.printf("%d ", num);
		}
	}
}