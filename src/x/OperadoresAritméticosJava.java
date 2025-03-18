package x;

public class OperadoresAritméticosJava {

	public static void main(String[] args) {
		
		// utilizando println
		int a = 8, b = 3, c = -5;

		System.out.println("a) a + b + c = " + (a + b + c));
		System.out.println("b) 2 * b + 3 * (a - c) = " 
					+ (2 * b + 3 * (a - c)));
		System.out.println("c) a / b = " + (a / b));
		System.out.println("d) a % b = " + (a % b));
		System.out.println("e) a / c = " + (a / c));
		System.out.println("f) a % c = " + (a % c));
		System.out.println("g) a * b / c = " + (a * b / c));
		System.out.println(
					"h) a * (b / c) = " 
					+ (a * (b / c)));
		System.out.println(
					"i) (a * c) % b = " 
					+ ((a * c) % b));
		System.out.println(
					"j) a * (c % b) = " 
					+ (a * (c % b)));
		System.out.println(
					"k) (3 * a - 2 * b) % (2 * a - c) = "
					+ ((3 * a - 2 * b) % (2 * a - c)));
		System.out.println(
					"l) 2 * ( a / 5 + (4 - b * 3)) % (a + c - 2) = " 
		      + (2 * ( a / 5 + (4 - b * 3)) % (a + c - 2)));
		System.out.println(
					"m) (a - 3 * b) % (c + 2 * a) / (a - c) = " 
		      + ((a - 3 * b) % (c + 2 * a) / (a - c)));
		System.out.println(
					"n) a - b - c * 2 = " 
					+ (a - b - c * 2));	
		
		
		// utilizando printf

		System.out.println();
		System.out.printf("a) a + b + c = %d%n", a + b + c);
		System.out.printf("b) 2 * b + 3 * (a - c) = %d%n", 2 * b + 3 * (a - c));
		System.out.printf("c) a / b = %d%n", a / b);
		System.out.printf("d) a %% b = %d%n", a % b);
		System.out.printf("e) a / c = %d%n", a / c);
		System.out.printf("f) a %% c = %d%n", a % c);
		System.out.printf("g) a * b / c = %d%n", a * b / c);
		System.out.printf("h) a * (b / c) = %d%n", a * (b / c));
		System.out.printf("i) (a * c) %% b = %d%n", (a * c) % b);
		System.out.printf("j) a * (c %% b) = %d%n", a * (c % b));
		System.out.printf("k) (3 * a - 2 * b) %% (2 * a - c) = %d%n",
					(3 * a - 2 * b) % (2 * a - c));
		System.out.printf("l) 2 * ( a / 5 + (4 - b * 3)) %% (a + c - 2) = %d%n", 
					2 * ( a / 5 + (4 - b * 3)) % (a + c - 2));
		System.out.printf("m) (a - 3 * b) %% (c + 2 * a) / (a - c) = %d%n", 
					(a - 3 * b) % (c + 2 * a) / (a - c));
		System.out.printf("n) a - b - c * 2 = %d%n", a - b - c * 2);

		System.out.println();
		
		double x = 88, y = 3.5, z = -5.2;
		System.out.printf("a) x + y + z = %f%n", x + y + z);
		System.out.printf("b) 2 * y + 3 * (x - z) = %f%n", 2 * y + 3 * (x - z));
		System.out.printf("c) x / y = %f%n", x / y);
		System.out.printf("d) x %% y = %f%n", x % y);
		System.out.printf("e) x / (y + z) = %f%n", x / (y + z));
		System.out.printf("f) (x / y) + z = %f%n", (x / y) + z);
		System.out.printf("g) 2 * x / 3 * y = %f%n", 2 * x / 3 * y);
		System.out.printf("h) 2 * x / (3 * y) = %f%n", 2 * x / (3 * y));
		System.out.printf("i) x * y %% z = %f%n", x * y % z);
		System.out.printf("j) x * (y %% z) = %f%n", x * (y % z));
		System.out.printf("k) 3 * x - z - 2 * x = %f%n", 3 * x - z - 2 * x);
		System.out.printf("l) 2 * x / 5 %% y) = %f%n", 2 * x / 5 % y);
		System.out.printf("m) x - 100 %% y %% z = %f%n", x - 100 % y % z);
		System.out.printf("n) x - y - z * 2 = %f%n", x - y - z * 2);
		
		char c1 = 'E', c2 = '5', c3 = '?';
        
		System.out.println("a) c1 + 1 = " 
				+ (c1 + 1));
		System.out.println("b) c1 - c2 + c3 = " 
				+ (c1 - c2 + c3));
		System.out.println("c) c2 - 2 = " 
				+ (c2 - 2));
		System.out.println("d) c2 - '2' = " 
				+ (c2 - '2'));
		System.out.println("e) c3 + '#' = " 
				+ (c3 + '#'));
		System.out.println("f) c1 % c3 = " 
				+ (c1 % c3));
		System.out.println("g) '2' + '2' = " 
				+ ('2' + '2'));
		System.out.println("(c1 / c2) * c3 = " 
				+ ((c1 / c2) * c3));
		System.out.println("i) 3 * c2 = " 
				+ (3 * c2));
		System.out.println("j) '3' * c2 = " 
				+ ('3' * c2));
		
		
		System.out.println();
        
		System.out.println("a) c1 + 1 = " 
				+ (char)(c1 + 1));
		System.out.println("b) c1 - c2 + c3 = " 
				+ (char)(c1 - c2 + c3));
		System.out.println("c) c2 - 2 = " 
				+ (char)(c2 - 2));
		System.out.println("d) c2 - '2' = " 
				+ (char)(c2 - '2'));
		System.out.println("e) c3 + '#' = " 
				+ (char)(c3 + '#'));
		System.out.println("f) c1 % c3 = " 
				+ (char)(c1 % c3));
		System.out.println("g) '2' + '2' = " 
				+ (char)('2' + '2'));
		System.out.println("(c1 / c2) * c3 = " 
				+ (char)((c1 / c2) * c3));
		System.out.println("i) 3 * c2 = " 
				+ (char)(3 * c2));
		System.out.println("j) '3' * c2 = " 
				+ (char)('3' * c2));
		
	}
	
	
}
