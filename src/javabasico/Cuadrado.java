package javabasico;

public class Cuadrado {
	public static void main(String[] args) {
		int fila = 5;
        int columna = 5;
        
        for(int f = 0; f < fila; f++){
            for(int c = 0; c < columna; c++){
                System.out.print("*");
            }
            System.out.println();
        }
	}
}
