package javabasico;

public class ArrayMayorValor {
	public static void main(String[] args) {
		 int [] arrayNuevo = {3, 5, 7, 2, 8};
	       
	       int max = arrayNuevo [0];
	       
	       for(int num:arrayNuevo){
	           if(num>max){
	               max=num;
	           }
	       }
	       System.out.printf("%d ", max);
	}
}
