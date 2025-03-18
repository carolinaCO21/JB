package javabasico;

public class BucleContadorMultiplicacion {
	public static void main(String[] args) {
		 int contador = 0;
		 int multiplicacion = 1;

		 for(int i = 1; i <=1_000; i+=100){
		       contador++;
		       multiplicacion *= i;
		   }
		   System.out.printf("El producto de los %d elementos pedidos es %d.", contador, multiplicacion);

	}
}
