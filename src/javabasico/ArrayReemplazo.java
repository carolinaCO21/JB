package javabasico;

public class ArrayReemplazo {
	public static void main(String[] args) {
		 int [] arrayNumeros = {2, -3, 4, -1, 6};
	       
		 System.out.printf("Una solución%n");
		 System.out.printf("------------%n");
	       for(int num:arrayNumeros){
	           if(num < 0){
	               num = 0;
	           }
	        
	        System.out.printf("%d ", num);
	       }
	       System.out.println();
	      
	    
	      System.out.printf("%nOtra solución");
	      System.out.printf("%n-------------%n");
	      int[] otrosElementos = {2, -3, 4, -1, 6};
	        for(int i = 0; i < otrosElementos.length; i++){
	         if(otrosElementos[i] < 0) {
	                otrosElementos[i] = 0;
	            }
	        }

	        for(int e: otrosElementos){
	            System.out.printf("%d ", e);
	        }
	        System.out.println();
	}
}
