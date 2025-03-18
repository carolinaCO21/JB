package javabasico;

public class AlfabetoInglesPar {
	public static void main(String[] args) {
		 char inicio = 'a';
	     char fiNal = 'z';
	     int sumaLetras = 0;
	      
	      for(int c = inicio; c <= fiNal; c++){
	          if(c % 2 == 0){
	             sumaLetras++;
	          }
	      }
	      System.out.printf("%d ", sumaLetras);
	}
	
}
