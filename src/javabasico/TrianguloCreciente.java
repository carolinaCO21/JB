package javabasico;

public class TrianguloCreciente {
	public static void main(String[] args) {
		 int numFilas= 5;
		  
		   for(int f= 1; f <= numFilas; f++){
		       for(int asterisco = 1; asterisco <= f; asterisco++){
		           System.out.print("*");
		       }
		       System.out.println();
		   }
	}
}
