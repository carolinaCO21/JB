package javabasico;

public class ArrayMenorValor {
	public static void main(String[] args) {
		
		 int [] arrayNuevo = {3, 5, 7, 2, 8};
		 int min = arrayNuevo [0];

		    for(int num:arrayNuevo){
		        if(num < min){
		            min = num;
		        }
		    }

		    System.out.printf("%d ", min);

	}
}
