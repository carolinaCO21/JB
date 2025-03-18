package javabasico;

public class CuadradoHueco {
	public static void main(String[] args) {
		int fila = 5;
		int columna = 5;

		for (int f = 0; f < fila; f++) {
			for (int c = 0; c < columna; c++) {
				if (f == 0 || f == fila - 1 || c == 0 || c == columna - 1) {
					System.out.print("*");

				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
