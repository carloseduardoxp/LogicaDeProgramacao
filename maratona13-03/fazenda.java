import java.util.Scanner;

public class fazenda {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		long C = scanner.nextLong();
		long P = scanner.nextLong();
		// equação 1: x+y = C
		// isolando a variavel x: x = C - y
		// equação 2: 2x+4y = P
		// substituindo: 2(C - y) + 4y = P
		// substituindo: 2C - 2y + 4y = P
		// substituindo: 2C + 2y = P
		// isolando a variável y: y = (P - 2C) / 2
		long y = (P - (2*C) ) / 2;
		long x = C - y;
		System.out.println(x + " " + y);
		scanner.close();
	}

}
