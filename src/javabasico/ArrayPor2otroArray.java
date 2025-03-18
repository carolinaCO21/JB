package javabasico;

public class ArrayPor2otroArray {
	public static void main(String[] args) {
		int [] arrayOriginal = {1, 3, 5, 7};
		int [] arrayMultiplicar = new int [arrayOriginal.length];
		 
		 
		  for(int i= 0; i < arrayOriginal.length; i++){
		     arrayMultiplicar [i] = arrayOriginal [i] *2;
		  }
		  for(int num:arrayMultiplicar){
		      System.out.printf("%d ", num);
		  }

		  System.out.println();

		  int [] arrayRevertido = new int [arrayMultiplicar.length];

		  for(int i= 0; i < arrayMultiplicar.length; i++){
		      arrayRevertido [arrayRevertido.length-1-i]= arrayMultiplicar [i];
		  }
		  for(int num:arrayRevertido){
		      System.out.printf("%d ", num);
		  }

	}
}
