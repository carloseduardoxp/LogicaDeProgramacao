import java.util.Scanner;

public class URI1164 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int total = 0;
			for (int j = 1; j <= x / 2; j++) {
				if (x % j == 0) {
					total += j;
				}
			}
			if (total == x) {
				System.out.println(x+" eh perfeito");
			} else {
				System.out.println(x+" nao eh perfeito");
			}
		}

	}

}
