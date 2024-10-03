import java.util.Scanner;

public class LinkedListyArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de datos que se van a agregar en la secuencia: ");
		int n = scanner.nextInt();
		String[] sequence = new String[n];

		System.out.println("Ingrese la secuencia de datos (Separados por espacios): ");
		for(int i = 0; i < n; i++) {
			sequence[i] = scanner.next();
		}

		System.out.println("Ingrese el valor de T: ");
		int t = scanner.nextInt();
		scanner.close();

		for(int i = 1; i <= t; i++) {
			if(i%2 != 0)
				firstHalf(sequence, n);
			else
				secondHalf(sequence, n);
		}
		
		System.out.println(String.join(" ", sequence));
	}
	
	public static void firstHalf(String[] sequence, int n) {
		String temp = sequence[(n/2) - 1];
		
		for(int i = n/2 - 1; i > 0; i--) {
			sequence[i] = sequence[i-1];
		}
		sequence[0] = temp;
	}
	
	public static void secondHalf(String[] sequence, int n) {
		String temp = sequence[n - 1];
		
		for(int i = n - 1; i > n/2; i--) {
			
			sequence[i] = sequence[i-1];
		}
		sequence[n/2] = temp;
	}

}
