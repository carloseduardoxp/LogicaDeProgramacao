import java.util.Scanner;

public class retangulo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		int D = scanner.nextInt();
		if (A == C && B == D) {
			System.out.println("E um retangulo");
		} else {
			System.out.println("Nao e um retangulo");
		}

	}

}
