package javabasico;

public class ForWhileDoWhile {
	public static void main(String[] args) {
		int multipoDe = 17;
		int numInicial = 315;
		int numFinal = 9_100_000;

		int contador = 0;

		for(int i = numInicial; i <= numFinal; i++) {
			if(i % multipoDe == 0) {
				contador++;
			}
		}
		System.out.printf("BUCLE FOR%n");
		System.out.printf("---------%n");
		System.out.printf("Entre %d y %d hay %d múltiplos de %d.%n",
				numInicial, numFinal, contador, multipoDe);

		int i = numInicial;
		contador = 0;
		while(i <= numFinal) {
			if(i % multipoDe == 0) {
				contador++;				
			}
			i++;
		}
		System.out.printf("%nBUCLE WHILE%n");
		System.out.printf("-----------%n");
		System.out.printf("Entre %d y %d hay %d múltiplos de %d.%n",
				numInicial, numFinal, contador, multipoDe);

		int j = numInicial;
		contador = 0;

		do {
			if(j % multipoDe == 0) {
				contador++;		
			}
			j++;
		} while(j <= numFinal);
		System.out.printf("%nBUCLE DO WHILE%n");
		System.out.printf("--------------%n");
		System.out.printf("Entre %d y %d hay %d múltiplos de %d.%n",
				numInicial, numFinal, contador, multipoDe);
	}
}
