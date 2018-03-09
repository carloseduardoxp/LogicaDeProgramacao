import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		int i = 10 + 5;
		int j = 10 - 5;
		int k = 10 * 5;
		int l = 10 / 5;
		int m = 10 % 5;
		
		int n = 10 / (10 + (5 * 5));
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if (x % 2 == 0) {
			System.out.println(x+" eh par");
		} else {
			System.out.println(x+" eh impar");
		}
		if (x > 0) {
			System.out.println(x+" eh positivo");
		} else if (x == 0) {
			System.out.println(x+" vale 0");
		} else {
			System.out.println(x+" eh negativo");
		}
		
		if (x != 0) {
			System.out.println(x+ " eh diferentede 0");
		}
		
		if (x > 0 && x != 0) {
			
		}
		
		if (x > 0 || x != 0) {
			
		}
		
		if (x > 0 || (x < 0 && x == 0)) {
			
		}
		
		

	}

}
