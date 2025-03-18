package javabasico;

public class BucleContadorSuma {
	public static void main(String[] args) {
		   int inicio = 1;
		   int fiNAl= 1_000;
		   int suma = 0;
		   int contador = 0;

		   for(int i= inicio; i <= fiNAl; i+=100){
		      contador++;
		      suma +=i;
		   }
		    System.out.printf("La suma de los %d elementos pedidos es %d",contador, suma);

	}
}
