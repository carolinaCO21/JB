package javabasico;

public class BucleYarrayDel1al1000 {
	public static void main(String[] args) {
		 int inicio = 1;
	     int fiNal = 1_000;
	     int contador= 0;
	     
	     System.out.printf("Primera solución%n");
	     System.out.printf("----------------%n");
	      
	      for (int i = inicio; i <= fiNal; i+=100){
	          contador++;
	      }
	      System.out.printf("%d", contador);
	      
	      int [] array = new int [contador];
	      int posicion = 0;
	      
	      for(int i= inicio; i <= fiNal; i+=100){
	          array [posicion++]= i;
	      }
	      for (int num: array){
	          System.out.printf("%d ", num);
	      }
	          System.out.println();
	          
	      for(int i= array.length- 1; i >= 0; i--){
	          System.out.printf("%d", array [i]);
	          if( i != 0){
	              System.out.print("-");
	          }
	      }
	      
	      System.out.println();
	      System.out.printf("%nSegunda solución%n");
		  System.out.printf("----------------%n");
		  
		  contador = 0;
	        
	        for(int i = 1; i <= 1_000; i+=100){
	            contador++;
	        }
	        
	        int [] array2 = new int [contador];
	        
	        int posArray = 0;
	        
	        for(int i = 1; i <= 1_000; i+=100){
	            array2 [posArray++] = i;
	            System.out.printf("%d ", i);
	        }
	        System.out.println();
	        
	        for(int i = array2.length-1; i >= 0; i--){
	            if(i!=0){
	               System.out.printf("%d-", array2[i]);
	            }else{
	                System.out.printf("%d", array2[i]);
	            }
	            
	        }
	        
	     System.out.println();
	     System.out.printf("%nTercera solución%n");
		 System.out.printf("----------------%n");
	     // 1. Contar número de elementos que tendrá el array
	     int totalElementosArray = 0;
	     for(int num = 1; num <= 1_000; num += 100){
	         totalElementosArray++;
	     }
	     // 2. Crear el array
	     int[] array3 = new int[totalElementosArray];

	     // 3. Llenar el array
	     int posicionEnArray = 0;
	     for(int num = 1; num <= 1_000; num += 100){
	         array3[posicionEnArray] = num; 
	         posicionEnArray++;
	     }
	     // 4. Mostrar el array, pero al reves (empezando por el final)
	     for(int i = array3.length - 1; i >= 0; i--){
	         System.out.printf("%d", array3[i]);
	         
	         if(i!=0){
	             System.out.print("-");
	         } 
	     }
	        
	}
}
