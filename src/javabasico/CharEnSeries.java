package javabasico;

public class CharEnSeries {
	public static void main(String[] args) {
		char inicio = '1';
		char fiNal = '9';

		for (int i = 1; i <= 3; i++) {
			for (int c = inicio; c <= fiNal; c++) {
				System.out.printf("%c", c);
			}
			if (i != 3) {
				System.out.print("-");
			}
		}
	}
}
