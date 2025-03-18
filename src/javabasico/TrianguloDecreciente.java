package javabasico;

public class TrianguloDecreciente {
	public static void main(String[] args) {
		int numFilas= 5;
		  
		   for(int f= numFilas; f >= 1; f--){
		           for(int numAsteriscos = f; numAsteriscos >= 1; numAsteriscos--){
		               System.out.print("*");
		           }
		           System.out.println();
		       }
	}
}
