package javabasico;

public class ArraySuma {
	public static void main(String[] args) {
		int [] arrayNumeros = {1, 2, 3, 4, 5};
		int suma = 0;
		        
		        for (int num:arrayNumeros){
		            suma+=num;
		        }
		        System.out.printf("%d ", suma);
		       
	}
}
