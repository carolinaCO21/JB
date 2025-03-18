package javabasico;

public class Saludar {
	public static void main(String[] args) {
		byte hora = 25;
		String nombre = "Juan";
		
    System.out.printf("%s %s%n", hora < 5? "Acuéstate": hora < 16? "Buenos días": 
    				  hora < 23? "Buenas tardes": "Buenas noches", nombre);

	}
}
