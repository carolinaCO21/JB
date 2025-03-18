package javabasico;

public class Edad {
	public static void main(String[] args) {
		int edad = 15;
	     String nombre = "Juan";
	       
	       System.out.printf("%s tiene %d años y es %s",nombre, edad, 
	    		   			edad < 18 ? "menor de edad": edad < 65? "mayor de edad": "pensionista");
	}
	 

}
