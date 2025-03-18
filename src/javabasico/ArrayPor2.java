package javabasico;

public class ArrayPor2 {
	public static void main(String[] args) {
		int [] arrayDado = {1, 3, 5, 7};
		int [] arrayMultiplicaciones = new int [arrayDado.length];
		    
		   for (int i = 0; i < arrayDado.length; i++){
		          arrayMultiplicaciones [i] = arrayDado [i] *2;
		      }
		   for (int num: arrayMultiplicaciones){
		          System.out.printf("%d ", num);
		      }
	}
}
